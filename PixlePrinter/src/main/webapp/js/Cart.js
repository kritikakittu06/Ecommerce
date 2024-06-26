const products = [
    {
        id: 0,
        image: 'https://pasalnepal.com/assets/images/products/782115880-canon-pixma-ts6370-aio-3-in-1-wireless-inkjet-colour-printer.jpg',
        title: 'Canon Printer',
        price: 40000
    },
    {
        id: 1,
        image: 'https://mediaserver.goepson.com/ImConvServlet/imconv/63d65bfb325dadd89dd438c9482febd02112c15d/1200Wx1200H?use=banner&hybrisId=B2C&assetDescr=L5590-%282%29',
        title: 'EPSON Printer',
        price: 20000
    },
    {
        id: 2,
        image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYjEz6gWTbxBvPr9keah7AV5vsKXoeuXRxHoIPzmWtww&s',
        title: 'HP Printer',
        price: 30000
    }
];

let cart = [];
let totalAmount = 0;

function addToCart(id) {
    const product = products.find(p => p.id === id);
    if (product) {
        const cartItem = cart.find(item => item.id === id);
        if (cartItem) {
            cartItem.quantity++;
        } else {
            cart.push({ ...product, quantity: 1 });
        }
        updateCartUI();
    }
}

function removeFromCart(id) {
    const index = cart.findIndex(item => item.id === id);
    if (index !== -1) {
        cart.splice(index, 1);
        updateCartUI();
    }
}

function updateQuantity(id, newQuantity) {
    const cartItem = cart.find(item => item.id === id);
    if (cartItem && newQuantity > 0) {
        cartItem.quantity = parseInt(newQuantity);
        updateCartUI();
    }
}

function updateCartUI() {
    const cartElement = document.getElementById('cartItem');
    const countElement = document.getElementById('count');
    const totalElement = document.getElementById('total');

    if (cart.length === 0) {
        cartElement.innerHTML = "Your cart is empty";
        countElement.textContent = '0';
        totalAmount = 0;
    } else {
        let cartHTML = '';
        totalAmount = 0;

        cart.forEach(item => {
            const { id, image, title, price, quantity } = item;
            totalAmount += price * quantity;
            cartHTML += `
                <div class='cart-item'>
                    <div class='row-img'>
                        <img class='rowing' src='${image}' alt='${title}' />
                    </div>
                    <div>
                        <p>${title}</p>
                        <p>$${price}.00</p>
                        <input type="number" min="1" value="${quantity}" onchange="updateQuantity(${id}, this.value)">
                        <button onclick="removeFromCart(${id})">Remove</button>
                    </div>
                </div>
            `;
        });

        cartElement.innerHTML = cartHTML;
        countElement.textContent = cart.reduce((total, item) => total + item.quantity, 0);
    }

    totalElement.textContent = `$${totalAmount.toFixed(2)}`;
}

document.getElementById('root').innerHTML = products.map(product => {
    const { id, image, title, price } = product;
    return `
        <div class='box'>
            <div class='img-box'>
                <img class='images' src='${image}' alt='${title}' />
            </div>
            <div class='bottom'>
                <p>${title}</p>
                <p>$${price}.00</p>
            </div>
        </div>
    `;
}).join('');

updateCartUI(); // Display initial cart content on page load

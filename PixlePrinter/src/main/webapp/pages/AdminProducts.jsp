<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Product Management</title>
  <style>
    :root {
      --color-primary: cornflowerblue; /* #7380ec */
      --color-danger: coral; /* #ff7782 */
      --color-dark: midnightblue; /* #363949 */
      --color-background: gainsboro; /* #f6f6f9 */
      --color-white: white; /* #fff */
    }

    body {
      background-color: var(--color-background);
      color: var(--color-dark);
      font-family: Arial, sans-serif;
    }

    .container {
      max-width: 800px;
      margin: 20px auto;
      padding: 20px;
      background-color: var(--color-white);
      border-radius: 8px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-bottom: 20px;
    }

    th, td {
      padding: 10px;
      border-bottom: 1px solid var(--color-background);
      vertical-align: middle;
    }

    th {
      background-color: var(--color-primary);
      color: var(--color-white);
      text-align: left;
    }

    td {
      text-align: left;
    }

    .btn-edit,
    .btn-delete {
      padding: 6px 12px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      display: inline-block;
    }

    .btn-edit {
      background-color: var(--color-primary);
      color: var(--color-white);
    }

    .btn-delete {
      background-color: var(--color-danger);
      color: var(--color-white);
    }

    td,img{
        height: 100px;
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>Product Management</h2>
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Photo</th>
          <th>Name</th>
          <th>Description</th>
          <th>Price</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td>
          <td><img src="https://www.iec.com.np/uploads/thumbnails/147eea35e9314cca929e45ac8d0aec6b_CISS_CM_AS_FR_cl-362x320.png" alt="Product 1"></td>
          <td>Product 1</td>
          <td>Description 1</td>
          <td>$19.99</td>
          <td>
            <button class="btn-edit">Edit</button>
            <button class="btn-delete">Delete</button>
          </td>
        </tr>
        <tr>
          <td>2</td>
          <td><img src="data:image/jpeg;base64,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" alt="Product 2"></td>
          <td>Product 2</td>
          <td>Description 2</td>
          <td>$29.99</td>
          <td>
            <button class="btn-edit">Edit</button>
            <button class="btn-delete">Delete</button>
          </td>
        </tr>
        <!-- Add more rows as needed -->
      </tbody>
    </table>
  </div>
</body>
</html>

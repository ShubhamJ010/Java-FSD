const express = require("express");

const app = express();

const connectDB = require("./db/connect");
const PORT = process.env.PORT || 5051;

const pr = require("./routes/products");
app.get("/", (req, res) => {
  res.send("hi im live");
});

app.use("/api/products", pr);
const start = async () => {
  try {
    await connectDB();
    app.listen(PORT, () => {
      console.log(`${PORT} YWS im connected`);
    });
  } catch (error) {
    console.log(error);
  }
};

start();

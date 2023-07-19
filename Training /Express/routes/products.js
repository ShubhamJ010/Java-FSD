const express = require("express");
const router = express.Router();

const { getallpro, getallprotest } = require("../controller/products");

router.route("/").get(getallpro);
router.route("/test").get(getallprotest);

module.exports = router;

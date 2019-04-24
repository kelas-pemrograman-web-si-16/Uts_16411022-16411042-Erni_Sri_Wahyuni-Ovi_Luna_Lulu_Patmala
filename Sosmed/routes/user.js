var express = require('express');

var router = express.Router();

router.get('/register', function(req, res, next) {
    res.render('register')
})
router.get('/login', function(req, res, next) {
    res.render('login')
})
router.get('/home', function(req, res, next) {
    res.render('home')
})
router.get('/Chat', function(req, res, next) {
    res.render('Chat')
})
router.get('/Status', function(req, res, next) {
    res.render('Status')
})
router.get('/Panggilan', function(req, res, next) {
    res.render('Panggilan')
})

module.exports = router;
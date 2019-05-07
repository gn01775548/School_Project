var path = require('path');
 
module.exports = {
    mode: 'production',
    entry: './add.js',
    output: {
        filename: 'add.bundle.js',
        path: path.resolve(__dirname, './'),
    },
    
    module: {
        rules: [
            {
                test: /\.css$/, 
                use: [
                    'style-loader',  
                    'css-loader' 
                ]
            }
        ]
    }
};
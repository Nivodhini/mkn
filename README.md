# mkn
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Simple EMC Share Folder">
    <meta name="author" content="Aravindh S">
    <link rel="icon" href="https://opengameart.org/sites/default/files/Flat%20Folder%20icon.png">
    <meta property="og:image" content="https://opengameart.org/sites/default/files/Flat%20Folder%20icon.png">
    <meta property="og:image:type" content="image/png">
    <meta property="og:image:width" content="1200">
    <meta name="theme-color" content="#FFFF00">


    <title>Ksrce Aptitude</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css?family=Comfortaa" rel="stylesheet">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <!-- Custom styles for this template -->
    <style type="text/css">
        * {
            font-family: 'Comfortaa', cursive;
        }
        body {
            padding-top: 5rem;
        }
        li {
            cursor: pointer;
            list-style: inside;
            margin: 16px 0;
            font-size: 20px;
            padding: 1px;
        }
        a:hover {
            text-decoration: none;
            transition-duration: 1s;
        }
        #light {
            height: 30px;
            width: 30px;
            border: 2px solid #fff;
            border-radius: 50%;
            display: inline-block;
        }
        #light:hover {
            background: #000;
            border: 2px solid #fff;
            transition-duration: 0.7s;
        }
        #dark {
            height: 30px;
            width: 30px;
            border: 2px solid #000;
            border-radius: 50%;
            display: inline-block;
        }
        #dark:hover {
            border: 2px solid #fff;
            transition-duration: 0.7s;
        }
        .bb {
            border-bottom: 1px solid black;
            background-color: #fff;
        }
        .home {
            background: #fff;
            padding: 20px;
            border-radius: 10px;
        }
        body {
            background: url(https://images.unsplash.com/photo-1539639087565-41c59f40f3d7?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b42ea8a85b535e29424c78d8d128e83f&auto=format&fit=crop&w=1350&q=80) no-repeat center center fixed;
        }
        kbd {
            font-size: 16px;
        }
        kbd:hover {
            background-color: white;
            color: #000;
            transition-duration: 0.3s;
            border: 2px solid black;
        }
        @media only screen and (max-width: 770px) {
            * {
                font-size: 12px;
                line-height: 10px;
            }
            .home {
                width: 90%;
            }
            kbd {
                font-size: 12px;
            }
        }
        @media only screen and (max-width: 500px) {
            * {
                font-size: 12px;
            }
            kbd {
                font-size: 12px;
            }
        }
        @media only screen and (max-width: 435px) {
            * {
                font-size: 10px;
                line-height:20px;
            }
            kbd {
                font-size: 12px;
            }
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myList li").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
</head>


<body>

    <nav class="navbar navbar-expand-md navbar-light bg-light fixed-top">
        <strong><a class="navbar-brand" href="#">Ksrce Aptitude Folder</a></strong>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search" id="myInput" style="border:1px solid black;">
            </form>
        </div>
    </nav>
    <main role="main" class="container home">
        <ul id="myList">
            <u>
                <h3 style="padding-bottom: 10px;">Aptitude Test: </h3>
            </u>
            <li><a href="assets/numberseries.pdf" target="_blank"> TEST 1: Number series </kbd></a></li>
            <li><a href="assets/divisibility.pdf" target="_blank"> TEST 2: Divisibility </kbd></a></li>
            <li><a href="assets/unitdigit.pdf" target="_blank"> TEST 3: Unit Digits </kbd></a></li>
            <li><a href="assets/bloodrelationtest.pdf" target="_blank"> TEST 4: Blood Relation </kbd></a></li>
            <li><a href="assets/Averagetest.pdf" target="_blank"> TEST 5: Average Test </kbd></a></li>
            <li><a href="assets/coding.pdf" target="_blank"> TEST 6: Coding and Decoding </kbd></a></li>
            <li><a href="assets/timeandworktest.pdf" target="_blank"> TEST 7: Time and Work </kbd></a></li>
            <li><a href="assets/remainder.pdf" target="_blank">Remainder Theorem </kbd></a></li>   
            
            <u>
                <h3 style="padding-bottom: 10px;">Aptitude Practice set: </h3>
            </u>
            <li><a href="assets/averagepractice.pdf" target="_blank">Average <kbd>(29/01/2019)</kbd></a></li>
            <li><a href="assets/timeandwork.pdf" target="_blank">Time and Work <kbd>(13/02/2019)</kbd></a></li>
            <li><a href="assets/pipesandcistern.pdf" target="_blank">Pipes and Cistern <kbd>(20/02/2019)</kbd></a></li>
            <li><a href="assets/profitandloss.pdf" target="_blank">Profit and Loss <kbd>(21/02/2019)</kbd></a></li>
            <u>
                <h3 style="padding-bottom: 10px;">Reasoning Practice set: </h3>
            </u>
            <li><a href="assets/bloodrelation.pdf" target="_blank">Blood Relation <kbd>(22/02/2019)</kbd></a></li>
            <li><a href="assets/codedinequality.pdf" target="_blank">Coded Inequality <kbd>(02/03/2019)</kbd></a></li>
            <u>
                <h3 style="padding-bottom: 10px;">Practice Problems : </h3>
            </u>
            <li><a href="assets/tcs.pdf" target="_blank">TCS problem (kth Largest Factor of N) <kbd>(03/10/2018)</kbd></a></li>
            <li><a href="assets/problemc.pdf" target="_blank">10 Basic Problems <kbd>(4/10/2018)</kbd></a></li>
        </ul>
    </main>
</body>

</html>

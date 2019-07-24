// This is main method which return another inbuild function known as MyApp()
// MyApp(Widget app) function required single parameter which is basically yopur root app widget
// In this case MyApp is our base/root widget so we are passing MyApp class constructor as a parameter
import 'package:flutter/material.dart';

main() => runApp(MyApp());

// MyApp is Stateless Widget which is root widget of our application
class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('App Bar'),
        ),
        body: Container(
          height: 160.0,
          margin: EdgeInsets.all(8.0),
          child: Row(
            children: <Widget>[
              // First child
              Expanded(
                child: Container(
                  color: Colors.grey,
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: <Widget>[
                      // First child
                      Text(
                        'Heading',
                        style: TextStyle(
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                      SizedBox(height: 8.0), // For padding
                      // Second child
                      Text('Sub heading'),
                      SizedBox(height: 8.0), // For padding
                      // Third child
                      Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: <Widget>[
                          // First five child
                          Icon(Icons.star),
                          Icon(Icons.star),
                          Icon(Icons.star),
                          Icon(Icons.star),
                          Icon(Icons.star),
                          SizedBox(width: 24.0), // For padding
                          // Sixth child
                          Text('170Reviews'),
                        ],
                      ),
                      SizedBox(height: 16.0), // For padding
                      // Fourth child
                      Row(
                        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                        children: <Widget>[
                          // First child
                          Column(
                            children: <Widget>[
                              // First child
                              Icon(Icons.menu),
                              // Second child
                              Text('prep.'),
                              // Third child
                              Text('25 min'),
                            ],
                          ),
                          // Second child
                          Column(
                            children: <Widget>[
                              // First child
                              Icon(Icons.accessible),
                              // Second child
                              Text('cook.'),
                              // Third child
                              Text('1 hr'),
                            ],
                          ),
                          // Third child
                          Column(
                            children: <Widget>[
                              // First child
                              Icon(Icons.accessible_forward),
                              // Second child
                              Text('feeds.'),
                              // Third child
                              Text('4-6'),
                            ],
                          ),
                        ],
                      ),
                    ],
                  ),
                ),
              ),
              // Second child
              Container(
                width: 150.0,
                height: 150.0,
                color: Colors.blue,
              ),
            ],
          ),
        ),
      ),
    );
  }
}

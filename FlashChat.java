import 'package:flutter/material.dart';
import 'package:flash_chat_dart/screens/welcome_screen.dart';
import 'package:flash_chat_dart/screens/login_screen.dart';
import 'package:flash_chat_dart/screens/registration_screen.dart';
import 'package:flash_chat_dart/screens/chat_screen.dart';

void main() => runApp(FlashChat());

class FlashChat extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData.dark().copyWith(
        textTheme: TextTheme(
          body1: TextStyle(color: Colors.black54),
        ),
      ),
      home: WelcomeScreen(),
    );
  }
}
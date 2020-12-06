# Adder back

This is the back application for the Environment UE.  
2020 - 2021

The front-end is located at https://github.com/kryffin/adder-front.git

## How to use

First, clone this repository :
```shell script
$ git clone https://github.com/kryffin/adder-back.git
```

Then you will need to open the project using IntelliJ to make sure it works as it is supposed to.

To run the Adder service, run the *AdderApplication* class.

When it is fully launched and the front-end is running too (follow the REAMDE instructions available in the front-end repository), you can launch the *AdderIntegrationTests* and watch as you web browser gets interacted with.

There is also the *AdderApplicationTests*, which does not require the service nor the front-end to be running, made of the previously done JUnit tests.

Once you're finished, you can delete the repository from your computer with the following command :

```shell script
$ cd ..
$ rm -rf adder-back
```

## Notes

I used floats with only two decimals to ease the pain of complex divisions.

There is no test for dividing by zero since my front-end disables the *Diviser* button when trying to divide by zero.

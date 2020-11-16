Feature: Dell Sign in form velidetion 
@Sanity
Scenario: User can creat new account

Given Launch "<url>"
Then Expect Sign In option
Then I can Necigate Creat an Account Page
Then I Expect to wright First Name
Then I Expect to wright Last Name
Then I Expect to wright Email Address
Then I Expect I can create Password
And  Verify I can see Show passord button 
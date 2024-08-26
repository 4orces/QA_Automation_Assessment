describe("Workspace website automation", () => {
  it("Valid login", () => {
    // input the website
      cy.visit("https://www.workspacemanager.co/")
    // click login button
      cy.get(".chakra-button.css-10jop5m").click()
    // input valid email address  
      cy.get(".chakra-input.css-1kp110w").type("kadridamilola2@gmail.com")
    // input valid password  
      cy.get(".chakra-input.css-9u6owi").type("Awesomeman@12")
    // click login  
      cy.get(".chakra-button.css-m9shni").click()
    // verify that user successfully login  
      cy.url().should('include', '/dashboard')
  })
  it("Invalid login", () => {
  // input the website link  
    cy.visit("https://www.workspacemanager.co/login")
  // input invalid email address  
    cy.get(".chakra-input.css-1kp110w").type("kadrijunior@yahoo.com")
  // input invalid password  
    cy.get(".chakra-input.css-9u6owi").type("Awesome@12")
  // click login  
    cy.get(".chakra-button.css-m9shni").click()
  // verify that the alert message pops-up  
    cy.on('window:alert', (t) => {
      expect(t).to.contains('Invalid email')
    })
  })
})
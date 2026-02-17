# GitHub Search App (Technical Exercise)

## Specification

Build a screen that allows the user to type a search query into a text box, and then displays the search results from the GitHub API in a list.

The app has a base plate which contains a `Retrofit` API client, and the associated data models for the search results. The design of the app should resemble to following wiremock.

<img width="429" height="867" alt="Screenshot 2026-02-17 at 10 28 30" src="https://github.com/user-attachments/assets/f3642310-28c5-434b-855d-485a1faa9577" />


### Functional Requirements
* The search results should be displayed as you type
* Loader should show when searching is being performed
* Errors should be presented either on screen, or as Toasts

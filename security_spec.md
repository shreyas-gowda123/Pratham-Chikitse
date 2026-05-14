# Security Specification

## Data Invariants
- A user document must have a UID matching the document ID.
- The `email` field must match the user's authenticated email.
- `createdAt` is immutable.
- `updatedAt` must be set to the server timestamp on every update.

## The Dirty Dozen Payloads (Failed Attempts)
1. Creating a user document with a different UID than `request.auth.uid`.
2. Updating `email` to something other than the authenticated email.
3. Updating `createdAt` field.
4. Setting a massive username (>100 chars).
5. Setting a non-string username.
6. Deleting another user's document.
7. Reading all users without authentication.
8. Writing to `/users/some-other-id`.
9. Using a document ID with junk characters.
10. Creating a document without a `username`.
11. Updating `updatedAt` with a client-side timestamp.
12. Creating a document with extra shadow fields.

## Test Runner
(I'll focus on the rules first as I don't have a test runner environment setup easily here, but the instruction says output a test runner file if possible.)

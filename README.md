# schedule

Schedule is a very small schedule backend.

## Stories

**Story:** A User add an Event

As a user<br/>
I want to add an Event to the Schedule<br/>
So I can look at it when I need to be reminded about it<br/>

**Scenario:** Add Event to Schedule<br/>
**Given** the Schedule exists<br/>
**When** a User add an Event<br/>
**Then** the Event is added to the Schedule<br/>


**Story:** A User retrieves Events from Schedule<br/>

As a user<br/>
I want to fetch all available Events from the Schedule<br/>
So I can be reminded of them<br/>

**Scenario 1:** Fetch all Events from empty Schedule<br/>
**Given** the Schedule is empty<br/>
**When** a User fetches all Events from the Schedule<br/>
**Then** no Events are returned<br/>

**Scenario 2:** Fetch all Events from Schedule with one Event<br/>
**Given** the Schedule contains Event A<br/>
**When** a User fetches all Events from the Schedule<br/>
**Then** Event A is returned from the Schedule<br/>

**Scenario 3:** Fetch all Events from Schedule with multiple Events<br/>
**Given** the Schedule contains Event A, B and C<br/>
**When** a User fetches all Events from the Schedule<br/>
**Then** Event A, B and C are returned from the Schedule<br/>


**Story:** A User deletes an Event<br/>

As a user<br/>
I want to delete an Event to the Schedule<br/>
So I can remove Events that are no longer of interest<br/>

**Scenario:** Delete Event from Schedule<br/>
**Given** the Schedule contains Event A<br/>
**When** a User delete Event A from the Schedule<br/>
**Then** the Event is deleted from the Schedule<br/>

(ns schedule.core)

(defn create-schedule 
	"Creates a new schedule"
	([id events] {:id id :events events})
	([id] (create-schedule id [])))

(defn create-event 
	"Creates a new event"
	[id description]
	{:id id :description "test"})

(defn add-event 
	"Adds an event to a schedule" 
	[schedule event]	
	(create-schedule 
		(schedule :id)
		(conj (schedule :events) event)))

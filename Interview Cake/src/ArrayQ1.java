import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//problem 1 -array

class Meeting {
	private int startTime;
	private int endTime;
	
	public Meeting(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public int getStartTime() {
		return this.startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
		
	}
	//write a method mergeRanges() that takes a list of multiple meeting time ranges
	//and returns a list of condensed ranges
	
}
public class ArrayQ1 {
	public static void main(String[] args) {
		
	}
	public static List<Meeting> mergeRanges(List<Meeting> meetings) {
		//make a new list and copy the input so we don't change the original 
		List<Meeting> sortedList = new ArrayList<>();
		for(Meeting meeting: meetings) {
			Meeting copy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
			sortedList.add(copy);
		}
		//sort by start time
		Collections.sort(sortedList, new Comparator<Meeting>() {

			@Override
			public int compare(Meeting o1, Meeting o2) {
				// TODO Auto-generated method stub
				return o1.getStartTime() - o2.getStartTime();
			}
			
		});
		
		//if the current overlaps with the last, 
		//use latter end time 
		List<Meeting> mergedMeetings = new ArrayList<>();
		mergedMeetings.add(sortedList.get(0));

		for(Meeting currentMeeting: sortedList) {
			Meeting prevMeeting = mergedMeetings.get(mergedMeetings.size()-1);
			if(currentMeeting.getStartTime() < prevMeeting.getEndTime()) {
				prevMeeting.setEndTime(Math.max(prevMeeting.getEndTime(), currentMeeting.getEndTime()));
			}
			else {
				mergedMeetings.add(currentMeeting);
			}
		}
		return mergedMeetings;
	}
	
}

//complexity
//O(n lg n) time and O(n) space. 
//because it sorts all the meetings first it has runtime of O(nlgn)
//if input were sorted it's O(n) because we walk through our list
//we create a new list of merged meeting times, in the worst case none of the meeting overlap giving us 
//a list identical to the input list. We have a worst case space cost of O(n) 




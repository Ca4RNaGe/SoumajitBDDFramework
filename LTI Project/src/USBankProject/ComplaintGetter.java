package USBankProject;
import java.util.HashMap;
import java.util.*;


public class ComplaintGetter {
	DatabaseRead bankfileR= new DatabaseRead();
	Scanner sc=new Scanner(System.in);

	void loadData()
	{
		bankfileR.fileLoader();
	}

	void complaintsBasedOnYear(String year)
	{
		Set<String>st=new HashSet<String>();
		for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
		{
			if(entry.getValue().dateReceived.contains(year))
				  { 
				st.add(entry.getValue().issue);
			  		//System.out.println(entry.getValue().issue);
				  }
		}
		for(String i:st) {
			System.out.println(i);
		}
	}
		

		
		
		
	void complaintsBasedOnCompany(String u_company)
	{
		Set<String>st=new HashSet<String>();
		for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet())
	 
	{
	  if(entry.getValue().company.equalsIgnoreCase(u_company))
	  {
		  st.add(entry.getValue().issue + " "+ u_company);
		  //System.out.println(entry.getValue().issue + " "+ u_company);
	  }

	}
		  for(String i:st) {
			  System.out.println(i);
		  }
	}

	void complaintsBasedOnComplaintID(String id)
	{
		
	for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
	{
	  if(bankfileR.GetMapBankobjcompdet().containsKey(id))
	  {
		  System.out.println(entry.getValue().id+entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
	  }
	  else
	  {
		  	System.out.println("Complaint ID does not exists.");
		  
	  }
	}
	}

	void NoOfDaysTOCloseComplaint(String compid)
	{
		/*
		int noOfDays=0;
	    int n1 = dt1.y * 365 + dt1.d;
	    for (int i = 0; i < dt1.m - 1; i++) 
	    {
	        n1 += monthDays[i];
	    }
	    n1 += countLeapYears(dt1);
	    int n2 = dt2.y * 365 + dt2.d;
	    for (int i = 0; i < dt2.m - 1; i++)
	    {
	        n2 += monthDays[i];
	    }
	    n2 += countLeapYears(dt2);
	    noOfDays=n2 - n1;
	  */
	}


	void complaintsClosed(String uid)
	{
	for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
	{
		String compResp=entry.getValue().companyResponseToConsumer;
		
	  if(compResp.equalsIgnoreCase("Closed") || compResp.equalsIgnoreCase("Closed with explanation"))
	  {
		  System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
	  }
	  else
	  {
		  	System.out.println("Complaint ID does not exists.");
		  
	  }
	}

	}


	void complaintsReceivingTimelyResponse(String timely_compidid)
	{
	for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
	{
		if(entry.getValue().timelyResponse.equals("Yes"))
		{
			System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
		}
	}
	}

	public ComplaintGetter() {
		super();
	}
	}



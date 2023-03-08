package groceriesshopinvoicingsystem;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;



public class invoicingsystem {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;" +
				"databaseName=invoisingsystem;" +
				"encrypt=true;" + "trustServerCertificate=true";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter user");
				String user = scanner.nextLine();
				System.out.println("enter pass");
				String pass = scanner.nextLine();
				if (user.equals(user) && pass.equals(pass)) {}else {
					 System.out.println("worng username and password ");
					 }
				Connection con = null;
				System.out.println("System is in prograss:");
				
		
				try {
					
					
			
					
					
				// create a new table
				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				DriverManager.registerDriver(driver);
				con = DriverManager.getConnection(url, user, pass);
				Statement st = con.createStatement();
				


				String product = "CREATE TABLE product (" +
						"id INTEGER Primary Key, " +
						" product_name TEXT, " +
						" unit_price FLOAT , " +
						"quantity INTEGER, " +
						"quantityAmount FLOAT  "+")";
				
				String shop = "CREATE TABLE shop (" +
						" tel TEXT, " +
						" fax TEXT, " +
						"email TEXT, " +
						"website TEXT, " +
						"shopName TEXT "+")";
				
				String Invoice = "CREATE TABLE Invoice (" +

						" Date TEXT, " +
						" customer_Name TEXT, " +
						"Phone_No INTEGER, " +
						"number_Of_Items INTEGER, " +
						"total_Amount FLOAT , " +
				        "paid_Amount FLOAT , " +
				        "balance FLOAT "+")";
				
			// st.execute(product);
               // st.execute(shop);			
	              //  st.execute(Invoice);
			      
			        System.out.println("execute completed:");
			        shop Shop=new shop();
			    	
			        Shop.setTel("95498938");
			        Shop.setFax("111");			
			        Shop.setEmail("rosenet@gmail.com");
			        Shop.setWebsite("www.rosenet");
			        Shop.setShopName("rosenet");
					
					
					System.out.println(" * Invoice  * ");
					System.out.println(" Shop Name:  " + Shop.getShopName() + "/" + " Tel: " + Shop.getTel() + "/" + " Email: "
							+ Shop.getEmail() + "/" + " Fax: " + Shop.getFax());
					
					String shop1 = "insert into shop values ('"+Shop.getTel()+"','"+Shop.getFax()+
				    		  "','"+Shop.getEmail()+"','"+Shop.getWebsite()+"','"+Shop.getShopName()+"')";
				      
				      st.execute(shop1);

					System.out.println("                         _____________________________ ");
					
					
					
					
				
			
				//ResultSet rs = st.executeQuery("SELECT option_name FROM menu_options ORDER BY option_id");
				

				
		       
//		        while (rs.next()) {
//		            String optionName = rs.getString("option_name");
//		            System.out.println(optionName);
//		        }
		        
		      
		    	
		        boolean Mainflag=true;
		          Product productS = new Product();
		        
		        while(Mainflag) {
		        	  showMenu();
		        	  
		        	  System.out.println("Enter your choice:");
				        String choice = scanner.nextLine();
		        if (choice.equalsIgnoreCase("a")) {
		         	boolean addItemFlag=true;
		        	  while(addItemFlag){
		        		  
		            System.out.println("Enter Product ID:");
		            int ID = scanner.nextInt();
		            scanner.nextLine();
                    productS.setID(ID);
		            
		            
		            
		            System.out.println("Enter Product name:");
		            String produtcname = scanner.nextLine();
		            productS.setName(produtcname);
		            
		            
		            System.out.println("Enter unit_price:");
		            String productunit_price = scanner.nextLine();
		            productS.setUnitPrice(0);
		            
		            
		            System.out.println("Enter quantity:");
		            int productquantity = scanner.nextInt();
		            productS.setQuantity(productquantity);
		            
		            
		            System.out.println("Enter quantityAmount:");
		            int productquantityAmount = scanner.nextInt();
		            productS.setQuantityAmount(productquantityAmount);
		            scanner.nextLine();
		            
		      String products = "insert into product values ("+productS.getID()+",'"+productS.getName()+
		    		  "',"+productS.getUnitPrice()+","+productS.getQuantity()+","+productS.getQuantityAmount()+")";
		      
		      
		      st.execute(products);
		      System.out.println("do you want to add new item ?");
		      
				if(scanner.nextLine().equals("yes")) {
				  addItemFlag=true;
				}
				else {
			
					
					System.out.println("you have done adding items");
					addItemFlag=false;
					 
					  
					  
				}
				
		        	  }
		        	  
		        
		        
		        }
		       
//					System.out.println("Enter your choice from the menu:");
//					
//			        String choice1 = scanner.nextLine();
			        
			        if (choice.equalsIgnoreCase("b")) {
			        	ResultSet rs = st.executeQuery("SELECT * FROM product");
			            
			            if (!rs.isBeforeFirst()) {
			                // If there are no items in the database
			                System.out.println("No items found.");
			            } else {
			                // If there are items in the database
			                while (rs.next()) {
			                    System.out.println("Product ID: " + rs.getInt("id"));
			                    System.out.println("Product Name: " + rs.getString("product_name"));
			                    System.out.println("Product Price: " + rs.getDouble("unit_price"));
			                    System.out.println("Product Quantity : " + rs.getInt("quantity"));
			                    System.out.println("Product Quantity : " + rs.getInt("quantityAmount"));
			                    System.out.println();
			                }
			            }
			        }
        
		        
			 if (choice.equalsIgnoreCase("c")) {
		        boolean invo = true;
				while (invo) {
					Invoice invoice = new Invoice();
					System.out.println("Enter Date: ");
					String Date = scanner.nextLine();
					invoice.setDate(Date);

					System.out.println("Enter customer_Name: ");
					String Name = scanner.nextLine();
					invoice.setCustomerName(Name);

					System.out.println("Enter Phone_No: ");
					Integer Number = scanner.nextInt();
					invoice.setPhoneNumber(Number);
					scanner.nextLine();
					  
					System.out.println("Enter number_Of_Items: ");
					Integer Num = scanner.nextInt();
					invoice.setNumberOfItems(Num);
					scanner.nextLine();
					
					
					
					System.out.println("Enter total_Amount");
					float Total = scanner.nextInt();
					scanner.nextLine();
					invoice.setTotalAmount(Total);

					System.out.println("Enter paid_Amount");
					float Paid = scanner.nextInt();
					scanner.nextLine();
					invoice.setPaidAmount(Paid);
					
					float Balance = (float) (invoice.getPaidAmount() - invoice.getTotalAmount());

					invoice.setBalance(Balance);

					System.out.println("balance is\t:" + invoice.getBalance());
					
//				  
					
				  String invoiceS = "insert into invoice values ('"+invoice.getDate()+"','"+invoice.getCustomerName()+
						  "',"+invoice.getPhoneNumber()+","+invoice.getNumberOfItems()+","+invoice.getTotalAmount()+","
						   +invoice.getPaidAmount()+","+invoice.getBalance()+")";
				
				  st.execute(invoiceS);
				
				  System.out.println("invoice created:");
					
				  System.out.println("do you want to add new invoice ?");
					if(scanner.nextLine().equals("yes")) {
						
					}
					else {
						invo=false;
						System.out.println("you have done adding invoice");
					}
				}
				
			 }
//                    System.out.println("Enter your choice from the menu:");
//					
//			        String choice11 = scanner.nextLine();
		        
			   
			        
			        if (choice.equalsIgnoreCase("d")) {
			        	
			       
			        	ResultSet rs = st.executeQuery("SELECT * FROM invoice");
			        	
			        
						
			        	
			        	
			            if (!rs.isBeforeFirst()) {
			                // If there are no items in the database
			                System.out.println("No invoice found.");
			            } else {
			                // If there are items in the database
			                while (rs.next()) {
			                    System.out.println("invoice date: " + rs.getString("Date"));
			                    System.out.println("invoice customer_Name: " + rs.getString("customer_Name"));
			                    System.out.println("invoice Phone_No: " + rs.getInt("Phone_No"));
			                    System.out.println("invoice number_Of_Items : " + rs.getInt("number_Of_Items"));
			                    System.out.println("invoice total_Amount : " + rs.getFloat("total_Amount"));
			                    System.out.println("invoice paid_Amount : " + rs.getFloat("paid_Amount"));
			                    System.out.println("invoice balance : " + rs.getFloat("balance"));
			                    System.out.println();
			                    
			             
			                    //String choice1 = scanner.nextLine();

			                    
			                        
			                    }
			                //search invoice by phone No
			            	System.out.println("search invoice by phone number ?: ");
				        	if(scanner.nextLine().equals("yes")) {
				        	 	System.out.println("enter the phone number you want to show his/her invoice details : ");
				        int phoneNo= scanner.nextInt();
				        scanner.nextLine();
				         	ResultSet f = st.executeQuery("SELECT * FROM invoice where Phone_No =" +phoneNo);
				         
				         	System.out.println("\n the invoice you searched for is :\n");
				         	
				         	
				         	 while (f.next()) {
				                    System.out.println("invoice date: " + f.getString("Date"));
				                    System.out.println("invoice customer_Name: " + f.getString("customer_Name"));
				                    System.out.println("invoice Phone_No: " + f.getInt("Phone_No"));
				                    System.out.println("invoice number_Of_Items : " + f.getInt("number_Of_Items"));
				                    System.out.println("invoice total_Amount : " + f.getFloat("total_Amount"));
				                    System.out.println("invoice paid_Amount : " + f.getFloat("paid_Amount"));
				                    System.out.println("invoice balance : " + f.getFloat("balance"));
				                    System.out.println();
				                    
				             
				                    //String choice1 = scanner.nextLine();

				                    
				                        
				                    }
							}
			            
			                    
			                }
			            
			        }
			        if (choice.equals("x")) {
		                System.out.println("Exiting program...see you soon");	
		                Mainflag=false;
	                    	
	                        
	                        
	                    } 
		        
			            
			        
		        }

				
				
		            
				
		        //st.execute(menu);
		   


			    st.close();
				con.close();
				} catch (Exception ex) {
				System.err.println(ex);
				}
					}
	static void showMenu() {
		System.out.println("\t\t*-Shop Settings  ");
		System.out.println("a. add data  ");
        System.out.println("b. Load Data (Items and invoices)");
        System.out.println("c. create invoice");
        System.out.println("d. load invoice");
        System.out.println("x. exit");
	}
	
	
		}


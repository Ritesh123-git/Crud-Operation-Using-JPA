package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository= context.getBean(UserRepository.class);
		
	//	User user = new User();
	
//		user.setName("Ritesh Kumar Dwivedi");
//		user.setCity("Delhi");
//		user.setStatus("I am java developer");
//		
//		
//		User user1=userRepository.save(user);
//		System.out.println(user1);
		
//		User user1= new User();
//		user1.setName("Sam");
//		user1.setCity("Mumbai");
//		user1.setStatus("Python programmer");
//		
//		User user2= new User();
//		user2.setName("Karan shergill");
//		user2.setCity("Punjab");
//		user2.setStatus("Captain");
		
//		User user3= new User();
//    	user3.setName("abhinav");
//		user3.setCity("benglaru");
//		user3.setStatus("lieteunant");
//		
		
		// Saving single user
//		User resultUser=userRepository.save(user1);
//		System.out.println("saved user "+resultUser);
//		
		
		
		
//		List<User> users=List.of(user1,user3);
//		Iterable<User>result=userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
		// update the user of id 52
//		Optional<User> optional=userRepository.findById(52);
//		User user=optional.get();
//		System.out.println(user);
		
//		user.setName("Viraj Sehgal");
//		User result=userRepository.save(user);
//		
//		userRepository.save(result);
		
//		Iterable<User> itr= userRepository.findAll();
//		Iterator<User>iterator=itr.iterator();
		
//		while(iterator.hasNext()) {
//			
//			User user= iterator.next();
//			System.out.println(user);
//		}
		
		
//		itr.forEach(new Consumer<User>(){
//			
//			@Override
//			public void accept(User t) {
//				
//				System.out.println(t);
//				
//			}
//		});
		
//		itr.forEach(user->System.out.println(user));
		
		// deleting the user
		
//		userRepository.deleteById(53);
		
//		List<User> users=userRepository.findByName("Sam");
//		users.forEach(e->System.out.println(e));
		
		
//		List<User> users= userRepository.findByNameAndCity("Karan Shergill", "Punjab");
//		users.forEach(e->System.out.println(e));
		
//		List<User> allUser=userRepository.getAllUser();
//		allUser.forEach(e->{
//			System.out.println(e);
//		});
		
		List<User> userByName= userRepository.getUserByName("Sam");
		userByName.forEach(e->{
			System.out.println(e);
		});
		
	}

}

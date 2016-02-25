package service;

import java.util.List;

import model.Notification;
import dao.NotificationDao;

public class NotificationService {
	private NotificationDao notificationDao;
	
	public List<Notification> getNotifications() throws Exception {
		return notificationDao.getNotifications();
	}
}

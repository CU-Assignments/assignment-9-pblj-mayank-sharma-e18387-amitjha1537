import org.hibernate.Session;
import org.hibernate.Transaction;

public class BankServiceImpl implements BankService {

    @Override
    public void transfer(int fromId, int toId, double amount) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            // Fetch accounts, update balances, and save Transaction
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
}
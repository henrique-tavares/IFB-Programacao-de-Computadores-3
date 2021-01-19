package pc3.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pc3.model.Empregado;
import pc3.util.HibernateUtil;

public class EmpregadoDAOImp implements EmpregadoDAO {

    private Session session;

    @Override
    public void incluir(Empregado empregado) {
        session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(empregado);
            session.getTransaction().commit();

        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void alterar(Empregado empregado) {
        session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(empregado);
            session.getTransaction().commit();

        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void excluir(Empregado empregado) {
        session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(empregado);
            session.getTransaction().commit();

        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Empregado> listarTodos() {
        session = null;
        List<Empregado> lista = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();

            lista = session.createQuery("from Empregado", Empregado.class).list();

            session.getTransaction().commit();
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();

            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return lista;
    }

    @Override
    public Empregado buscarPorCPF(String cpf) {
        session = null;
        Empregado empregado = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();

            empregado = session.load(Empregado.class, cpf);

            session.getTransaction().commit();
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();

            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return empregado;
    }

}

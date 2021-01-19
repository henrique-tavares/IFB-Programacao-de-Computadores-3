package pc3.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pc3.model.Dependente;
import pc3.model.Empregado;
import pc3.util.HibernateUtil;

public class DependenteDAOImp implements DependenteDAO {

    private Session session;

    @Override
    public void incluir(Dependente dependente) {
        session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(dependente);
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
    public void alterar(Dependente dependente) {
        session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(dependente);
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
    public void excluir(Dependente dependente) {
        session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(dependente);
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
    public List<Dependente> listarTodos() {
        session = null;
        List<Dependente> lista = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();

            lista = session.createQuery("from Dependente", Dependente.class).list();

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
    public Dependente buscarPorCodigo(Integer codigo) {
        session = null;
        Dependente dependente = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();

            dependente = session.load(Dependente.class, codigo);

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

        return dependente;
    }

    @Override
    public List<Dependente> buscarPorEmpregado(Empregado empregado) {
        session = null;
        List<Dependente> lista = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            session.beginTransaction();

            lista = session.createQuery("from Dependente where cpf = :cpf", Dependente.class)
                    .setParameter("cpf", empregado.getCpf()).list();

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

}

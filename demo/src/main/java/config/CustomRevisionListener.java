package config;
import org.hibernate.envers.RevisionListener;
import entidades.audit.Revision;
public class CustomRevisionListener implements RevisionListener{
    public void newRevision(Object revisionEntity) { @SuppressWarnings("unused")
	final Revision revision = (Revision) revisionEntity;}
    }

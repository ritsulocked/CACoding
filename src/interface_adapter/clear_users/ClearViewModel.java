package interface_adapter.clear_users;

// TODO Check

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    public final String TITLE_LABEL = "Clear View";
    public final String USERNAME_LABEL = "Enter username";
    public final String PASSWORD_LABEL = "Enter password";
    public static final String CLEAR_BUTTON_LABEL = "Clear all users";
    public static final String CANCEL_BUTTON_LABEL = "Cancel";
    private ClearState state = new ClearState();

    public ClearViewModel() { super("clear"); }

    public void setState(ClearState state) { this.state = state; }

    public ClearState getState() { return state; }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    public void firePropertyChanged() { support.firePropertyChange("state", null, this.state); }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}

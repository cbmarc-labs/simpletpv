/**
 * 
 */
package cbmarc.simpletpv.client.mvp;

import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.place.Place;
import cbmarc.framework.client.mvp.AbstractPresenter;

import com.google.inject.Inject;

/**
 * @author MCOSTA
 *
 */
public class TopPresenter extends AbstractPresenter<TopPresenter.Display> {
	public interface Display extends AbstractPresenter.Display {
	}

	public static final Place PLACE = new Place("Top");

	@Inject
	public TopPresenter(final Display display, final EventBus eventBus) {
		super(display, eventBus);
		bind();
	}

	@Override
	public Place getPlace() {
		return PLACE;
	}

	@Override
	protected void onBind() {
	}
}
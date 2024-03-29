package cbmarc.simpletpv.client.gin;

import cbmarc.framework.client.mvp.LoadingPresenter;
import cbmarc.framework.client.mvp.LoadingView;
import cbmarc.simpletpv.client.mvp.AppPresenter;
import cbmarc.simpletpv.client.mvp.BottomPresenter;
import cbmarc.simpletpv.client.mvp.BottomView;
import cbmarc.simpletpv.client.mvp.MainPresenter;
import cbmarc.simpletpv.client.mvp.MainView;
import cbmarc.simpletpv.client.mvp.TopPresenter;
import cbmarc.simpletpv.client.mvp.TopView;
import cbmarc.simpletpv.client.mvp.article.ArticleFormPresenter;
import cbmarc.simpletpv.client.mvp.article.ArticleFormView;
import cbmarc.simpletpv.client.mvp.article.ArticleListPresenter;
import cbmarc.simpletpv.client.mvp.article.ArticleListView;

import com.google.inject.Singleton;

import net.customware.gwt.presenter.client.DefaultEventBus;
import net.customware.gwt.presenter.client.Display;
import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.Presenter;
import net.customware.gwt.presenter.client.gin.AbstractPresenterModule;
import net.customware.gwt.presenter.client.place.PlaceManager;

public class AppClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {		
		bind(EventBus.class).to(DefaultEventBus.class).in(Singleton.class);
		bind(PlaceManager.class).in(Singleton.class);
		
		bindEagerPresenter(LoadingPresenter.class, LoadingPresenter.Display.class, LoadingView.class);
		
		bindPresenter(TopPresenter.class, TopPresenter.Display.class, TopView.class);
		bindPresenter(MainPresenter.class, MainPresenter.Display.class, MainView.class);
		bindPresenter(BottomPresenter.class, BottomPresenter.Display.class, BottomView.class);
		
		bindPresenter(ArticleFormPresenter.class, ArticleFormPresenter.Display.class, ArticleFormView.class);
		bindPresenter(ArticleListPresenter.class, ArticleListPresenter.Display.class, ArticleListView.class);
		
		bind(AppPresenter.class).in(Singleton.class);
	}
	
	protected <D extends Display> void bindEagerPresenter(
			final Class<? extends Presenter> presenter,
			final Class<D> display,
			final Class<? extends D> displayImpl ) {
		bind(presenter).asEagerSingleton();
		bindDisplay(display, displayImpl);
	}
}
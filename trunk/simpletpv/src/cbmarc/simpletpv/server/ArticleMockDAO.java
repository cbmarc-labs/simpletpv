/**
 * 
 */
package cbmarc.simpletpv.server;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.customware.gwt.dispatch.shared.ActionException;
import cbmarc.simpletpv.shared.entity.Article;

/**
 * @author mcosta
 *
 */
public class ArticleMockDAO implements ArticleDAO {
	Map<String, Article> map = new LinkedHashMap<String, Article>();
	
	{
		//map.put("a", new Article());
		//map.put("b", new Article());
		//map.put("c", new Article());
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Article article) throws ActionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Article article) throws ActionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Article> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Article article) throws ActionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article selectOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

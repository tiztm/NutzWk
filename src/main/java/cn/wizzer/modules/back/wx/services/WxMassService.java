package cn.wizzer.modules.back.wx.services;

import cn.wizzer.common.base.Service;
import cn.wizzer.modules.back.wx.models.Wx_mass;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by wizzer on 2016/7/2.
 */
@IocBean(args = {"refer:dao"})
public class WxMassService extends Service<Wx_mass> {
    public WxMassService(Dao dao) {
        super(dao);
    }

}

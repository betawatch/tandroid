// default package

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xdb implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;

    public xdb(g27 g27Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = g27Var;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                Method method = (Method) this.c;
                boolean z = false;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        z = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        z = true;
                    }
                } catch (Exception e) {
                    rjb.m(e);
                }
                return z;
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((g27) this.c).f(menuItem));
        }
    }

    public /* synthetic */ xdb() {
    }
}

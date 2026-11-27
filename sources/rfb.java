// default package

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rfb implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;

    public rfb(n27 n27Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = n27Var;
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
                    grb.m(e);
                }
                return z;
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((n27) this.c).f(menuItem));
        }
    }

    public /* synthetic */ rfb() {
    }
}

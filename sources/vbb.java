// default package

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vbb implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;

    public vbb(g07 g07Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = g07Var;
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
                    sdb.b(e);
                }
                return z;
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((g07) this.c).f(menuItem));
        }
    }

    public /* synthetic */ vbb() {
    }
}

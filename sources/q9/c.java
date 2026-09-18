package q9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements pa.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // pa.b
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new m(a4.a.p("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e7) {
                    throw new m(a4.a.p("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e10) {
                    throw new m(p6.i("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new m(p6.i("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new ra.c((k9.h) this.b);
        }
    }
}

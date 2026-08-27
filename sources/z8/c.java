package z8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements y9.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // y9.b
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e9) {
                    throw new l(a9.p.m("Could not instantiate ", str, "."), e9);
                } catch (InstantiationException e10) {
                    throw new l(a9.p.m("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new l(s3.c.e("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new l(s3.c.e("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new aa.c((t8.h) this.b);
        }
    }
}

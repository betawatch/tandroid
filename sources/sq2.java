// default package

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class sq2 implements vw8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sq2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // vw8
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new cs5("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new cs5(qd4.y("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new cs5(qd4.y("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new cs5(c00.i("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new cs5(c00.i("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new dm5((ji4) obj);
        }
    }
}

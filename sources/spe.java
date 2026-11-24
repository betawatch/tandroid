// default package

import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class spe {
    public static int a(String str) {
        try {
            Map map = ResourceProvider.a;
            Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
            if (num != null) {
                return num.intValue();
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return 0;
    }
}

package v7;

import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class x6 {
    public static int a(String str) {
        Integer num;
        try {
            Map map = ResourceProvider.a;
            num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}

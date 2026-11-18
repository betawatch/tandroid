package pc;

import java.util.logging.Logger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class c {
    public static c a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            String simpleName = cls.getSimpleName();
            a aVar = new a(0);
            aVar.b = simpleName;
            return aVar;
        }
        String simpleName2 = cls.getSimpleName();
        a aVar2 = new a(1);
        aVar2.b = Logger.getLogger(simpleName2);
        return aVar2;
    }

    public abstract void b(String str);
}

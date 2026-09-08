package qc;

import java.util.logging.Logger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

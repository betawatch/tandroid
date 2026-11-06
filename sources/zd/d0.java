package zd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static final g0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [ae.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [zd.c0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [zd.g0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [zd.c0] */
    static {
        String str;
        ?? r02;
        int i7 = ee.t.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            ge.e eVar = j0.a;
            r02 = ee.n.a;
            ae.e eVar2 = r02.e;
            if (!(r02 != 0)) {
                r02 = c0.s;
            }
        } else {
            r02 = c0.s;
        }
        a = r02;
    }
}

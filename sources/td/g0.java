package td;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final j0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [ud.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [td.f0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [td.j0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [td.f0] */
    static {
        String str;
        ?? r02;
        int i10 = yd.v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            ae.e eVar = m0.a;
            r02 = yd.o.a;
            ud.d dVar = r02.e;
            if (!(r02 != 0)) {
                r02 = f0.s;
            }
        } else {
            r02 = f0.s;
        }
        a = r02;
    }
}

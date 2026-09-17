package zd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final j0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [ae.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [zd.f0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [zd.j0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [zd.f0] */
    static {
        String str;
        ?? r02;
        int i10 = ee.v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            ge.e eVar = m0.a;
            r02 = ee.o.a;
            ae.e eVar2 = r02.e;
            if (!(r02 != 0)) {
                r02 = f0.s;
            }
        } else {
            r02 = f0.s;
        }
        a = r02;
    }
}

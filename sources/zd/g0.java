package zd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        int i10 = ee.w.a;
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

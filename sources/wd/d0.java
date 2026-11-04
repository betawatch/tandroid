package wd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static final g0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [xd.c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [wd.c0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [wd.g0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [wd.c0] */
    static {
        String str;
        ?? r02;
        int i3 = be.u.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            de.e eVar = j0.a;
            r02 = be.n.a;
            xd.c cVar = r02.e;
            if (!(r02 != 0)) {
                r02 = c0.s;
            }
        } else {
            r02 = c0.s;
        }
        a = r02;
    }
}

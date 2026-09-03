package ud;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class i {
    public static final o3.c b;
    public static final o3.c c;
    public static final o3.c d;
    public static final o3.c e;
    public static final int a = qd.a.j(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final int f = qd.a.j(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i10 = 14;
        b = new o3.c("PERMIT", i10);
        c = new o3.c("TAKEN", i10);
        d = new o3.c("BROKEN", i10);
        e = new o3.c("CANCELLED", i10);
    }
}

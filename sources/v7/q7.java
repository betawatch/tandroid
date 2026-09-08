package v7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class q7 {
    public static void a(long j3, String str) {
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j3 + ") must be >= 0");
    }
}

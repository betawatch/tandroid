package v7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class r7 {
    public static void a(long j3, String str) {
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j3 + ") must be >= 0");
    }
}

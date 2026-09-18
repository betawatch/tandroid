package w7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class s6 {
    public static int a(long j3) {
        if (j3 > 2147483647L || j3 < -2147483648L) {
            throw new RuntimeException(org.telegram.ui.Cells.p6.h(j3, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j3;
    }
}

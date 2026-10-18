package w7;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class k6 {
    public static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int b(int i10, int i11, boolean z10) {
        return z10 ? i10 | i11 : i10 & (~i11);
    }
}

package v7;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class a8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder k10 = com.google.android.gms.internal.vision.e2.k("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            k10.append(i12);
            throw new IndexOutOfBoundsException(k10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a4.a.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}

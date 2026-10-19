package v7;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class s8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder m10 = i2.e.m("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            m10.append(i12);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a1.g.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}

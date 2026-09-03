package tb;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public enum d {
    c(new int[]{0, 0, 0}, 0),
    d(new int[]{10, 12, 14}, 1),
    e(new int[]{9, 11, 13}, 2),
    f(new int[]{0, 0, 0}, 3),
    h(new int[]{8, 16, 16}, 4),
    n(new int[]{0, 0, 0}, 7),
    r(new int[]{8, 10, 12}, 8),
    s(new int[]{0, 0, 0}, 5),
    v(new int[]{0, 0, 0}, 9),
    w(new int[]{8, 10, 12}, 13);

    public final int[] a;
    public final int b;

    d(int[] iArr, int i10) {
        this.a = iArr;
        this.b = i10;
    }

    public final int a(e eVar) {
        int i10 = eVar.a;
        return this.a[i10 <= 9 ? (char) 0 : i10 <= 26 ? (char) 1 : (char) 2];
    }
}

package rg;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class e0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public e0(int i10, int i11, int i12, String str, String str2) {
        this.a = i10;
        this.b = i11;
        this.c = str;
        this.d = str2;
        this.e = i12;
    }

    public static e0 a(int i10, int i11) {
        return new e0(i10, i11, -1, null, null);
    }

    public static e0 b(int i10, int i11, String str) {
        return new e0(i10, -1, i11, null, str);
    }
}

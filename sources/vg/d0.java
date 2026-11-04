package vg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class d0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public d0(int i3, int i10, int i11, String str, String str2) {
        this.a = i3;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.e = i11;
    }

    public static d0 a(int i3, int i10) {
        return new d0(i3, i10, -1, null, null);
    }

    public static d0 b(int i3, int i10, String str) {
        return new d0(i3, -1, i10, null, str);
    }
}

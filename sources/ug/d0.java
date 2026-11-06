package ug;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class d0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public d0(int i7, int i10, int i11, String str, String str2) {
        this.a = i7;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.e = i11;
    }

    public static d0 a(int i7, int i10) {
        return new d0(i7, i10, -1, null, null);
    }

    public static d0 b(int i7, int i10, String str) {
        return new d0(i7, -1, i10, null, str);
    }
}

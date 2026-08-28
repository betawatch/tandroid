package zf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class e0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public e0(int i9, int i10, int i11, String str, String str2) {
        this.a = i9;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.e = i11;
    }

    public static e0 a(int i9, int i10) {
        return new e0(i9, i10, -1, null, null);
    }

    public static e0 b(int i9, int i10, String str) {
        return new e0(i9, -1, i10, null, str);
    }
}

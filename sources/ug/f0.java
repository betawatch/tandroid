package ug;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class f0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public f0(int i7, int i10, int i11, String str, String str2) {
        this.a = i7;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.e = i11;
    }

    public static f0 a(int i7, int i10) {
        return new f0(i7, i10, -1, null, null);
    }

    public static f0 b(int i7, int i10, String str) {
        return new f0(i7, -1, i10, null, str);
    }
}

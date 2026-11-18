package ug;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class g0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public g0(int i7, int i10, int i11, String str, String str2) {
        this.a = i7;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.e = i11;
    }

    public static g0 a(int i7, int i10) {
        return new g0(i7, i10, -1, null, null);
    }

    public static g0 b(int i7, int i10, String str) {
        return new g0(i7, -1, i10, null, str);
    }
}

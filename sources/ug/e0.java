package ug;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class e0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public e0(int i7, int i10, int i11, String str, String str2) {
        this.a = i7;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.e = i11;
    }

    public static e0 a(int i7, int i10) {
        return new e0(i7, i10, -1, null, null);
    }

    public static e0 b(int i7, int i10, String str) {
        return new e0(i7, -1, i10, null, str);
    }
}

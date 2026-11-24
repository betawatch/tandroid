// default package

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u54 implements lf7 {
    public static final go4 g;
    public static final go4 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        fo4 fo4Var = new fo4();
        fo4Var.s = wf7.n("application/id3");
        g = new go4(fo4Var);
        fo4 fo4Var2 = new fo4();
        fo4Var2.s = wf7.n("application/x-scte35");
        h = new go4(fo4Var2);
    }

    public u54(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // lf7
    public final go4 a() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // lf7
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u54.class != obj.getClass()) {
            return false;
        }
        u54 u54Var = (u54) obj;
        return this.c == u54Var.c && this.d == u54Var.d && Objects.equals(this.a, u54Var.a) && this.b.equals(u54Var.b) && Arrays.equals(this.e, u54Var.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int j = ts2.j((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
        long j2 = this.c;
        int i2 = (j + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int hashCode = Arrays.hashCode(this.e) + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        this.f = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}

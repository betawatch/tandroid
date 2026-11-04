package p3;

import d2.p0;
import d2.r0;
import d2.u;
import d2.u0;
import d2.v;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements r0 {
    public static final v g;
    public static final v h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        u uVar = new u();
        uVar.r = u0.n("application/id3");
        g = new v(uVar);
        u uVar2 = new u();
        uVar2.r = u0.n("application/x-scte35");
        h = new v(uVar2);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j10;
        this.d = j11;
        this.e = bArr;
    }

    @Override // d2.r0
    public final v b() {
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

    @Override // d2.r0
    public final byte[] c() {
        if (b() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.c == aVar.c && this.d == aVar.d && Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.c;
            int i3 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i3 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // d2.r0
    public final /* synthetic */ void a(p0 p0Var) {
    }
}

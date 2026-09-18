package w3;

import e2.d0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class s {
    public final p a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public s(p pVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
        e2.d.b(iArr.length == jArr2.length);
        e2.d.b(jArr.length == jArr2.length);
        e2.d.b(iArr2.length == jArr2.length);
        this.a = pVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i10;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j3;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | TLObject.FLAG_29;
        }
    }

    public final int a(long j3) {
        long[] jArr = this.f;
        for (int a2 = d0.a(jArr, j3, true); a2 < jArr.length; a2++) {
            if ((this.g[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }
}

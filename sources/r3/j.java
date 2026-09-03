package r3;

import j3.n0;
import java.io.EOFException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j implements v {
    public final byte[] a = new byte[4096];

    @Override // r3.v
    public final void a(int i10, h5.w wVar) {
        wVar.G(i10);
    }

    @Override // r3.v
    public final void d(int i10, h5.w wVar) {
        wVar.G(i10);
    }

    @Override // r3.v
    public final int e(g5.j jVar, int i10, boolean z4) {
        byte[] bArr = this.a;
        int read = jVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read != -1) {
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // r3.v
    public final void b(n0 n0Var) {
    }

    @Override // r3.v
    public final void c(long j10, int i10, int i11, int i12, u uVar) {
    }
}

package r3;

import j3.n0;
import java.io.EOFException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

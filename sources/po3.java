// default package

import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class po3 implements x1c {
    public final byte[] a = new byte[TLObject.FLAG_12];

    @Override // x1c
    public final void b(ey7 ey7Var, int i, int i2) {
        ey7Var.O(i);
    }

    @Override // x1c
    public final int c(z63 z63Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = z63Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // x1c
    public final /* synthetic */ void e(int i, ey7 ey7Var) {
        xnb.b(this, ey7Var, i);
    }

    @Override // x1c
    public final int f(z63 z63Var, int i, boolean z) {
        return c(z63Var, i, z);
    }

    @Override // x1c
    public final void d(long j) {
    }

    @Override // x1c
    public final void g(ko4 ko4Var) {
    }

    @Override // x1c
    public final void a(long j, int i, int i2, int i3, w1c w1cVar) {
    }
}

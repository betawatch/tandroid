// default package

import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yn3 implements wxb {
    public final byte[] a = new byte[TLObject.FLAG_12];

    @Override // wxb
    public final void b(xu7 xu7Var, int i, int i2) {
        xu7Var.O(i);
    }

    @Override // wxb
    public final int c(g63 g63Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = g63Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // wxb
    public final /* synthetic */ void e(int i, xu7 xu7Var) {
        yjb.b(this, xu7Var, i);
    }

    @Override // wxb
    public final int f(g63 g63Var, int i, boolean z) {
        return c(g63Var, i, z);
    }

    @Override // wxb
    public final void d(long j) {
    }

    @Override // wxb
    public final void g(fm4 fm4Var) {
    }

    @Override // wxb
    public final void a(long j, int i, int i2, int i3, vxb vxbVar) {
    }
}

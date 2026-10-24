package u2;

import android.net.Uri;
import java.util.Map;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class u implements g2.h {
    public final g2.h a;
    public final int b;
    public final v0 c;
    public final byte[] d;
    public int e;

    public u(g2.h hVar, int i10, v0 v0Var) {
        u6.g(i10 > 0);
        this.a = hVar;
        this.b = i10;
        this.c = v0Var;
        this.d = new byte[1];
        this.e = i10;
    }

    @Override // g2.h
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        this.a.addTransferListener(c0Var);
    }

    @Override // g2.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // g2.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // g2.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // g2.h
    public final long open(g2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // b2.o
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.e;
        g2.h hVar = this.a;
        if (i12 == 0) {
            byte[] bArr2 = this.d;
            int i13 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int read = hVar.read(bArr3, i13, i15);
                        if (read != -1) {
                            i13 += read;
                            i15 -= read;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        e2.x xVar = new e2.x(bArr3, i14);
                        v0 v0Var = this.c;
                        long max = !v0Var.w ? v0Var.r : Math.max(v0Var.x.m(true), v0Var.r);
                        int a2 = xVar.a();
                        c3.l0 l0Var = v0Var.v;
                        l0Var.getClass();
                        l0Var.d(a2, xVar);
                        l0Var.c(max, 1, a2, 0, null);
                        v0Var.w = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i10, Math.min(this.e, i11));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}

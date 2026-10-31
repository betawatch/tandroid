package u2;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.zs;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t implements g2.h {
    public final g2.h a;
    public final int b;
    public final t0 c;
    public final byte[] d;
    public int e;

    public t(g2.h hVar, int i10, t0 t0Var) {
        t6.f(i10 > 0);
        this.a = hVar;
        this.b = i10;
        this.c = t0Var;
        this.d = new byte[1];
        this.e = i10;
    }

    @Override // g2.h
    public final void addTransferListener(g2.d0 d0Var) {
        d0Var.getClass();
        this.a.addTransferListener(d0Var);
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
    public final long open(g2.n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override // b2.p
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.e;
        g2.h hVar = this.a;
        if (i12 == 0) {
            byte[] bArr2 = this.d;
            int i13 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & zs.e4) << 4;
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
                        t0 t0Var = this.c;
                        long max = !t0Var.x ? t0Var.r : Math.max(t0Var.y.r(true), t0Var.r);
                        int a2 = xVar.a();
                        c3.k0 k0Var = t0Var.w;
                        k0Var.getClass();
                        k0Var.d(a2, xVar);
                        k0Var.c(max, 1, a2, 0, null);
                        t0Var.x = true;
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

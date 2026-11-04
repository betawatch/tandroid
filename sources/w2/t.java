package w2;

import android.net.Uri;
import b8.zb;
import java.util.Map;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements i2.h {
    public final i2.h a;
    public final int b;
    public final t0 c;
    public final byte[] d;
    public int e;

    public t(i2.h hVar, int i3, t0 t0Var) {
        zb.f(i3 > 0);
        this.a = hVar;
        this.b = i3;
        this.c = t0Var;
        this.d = new byte[1];
        this.e = i3;
    }

    @Override // i2.h
    public final void addTransferListener(i2.d0 d0Var) {
        d0Var.getClass();
        this.a.addTransferListener(d0Var);
    }

    @Override // i2.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // i2.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // i2.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // i2.h
    public final long open(i2.n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override // d2.o
    public final int read(byte[] bArr, int i3, int i10) {
        int i11 = this.e;
        i2.h hVar = this.a;
        if (i11 == 0) {
            byte[] bArr2 = this.d;
            int i12 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & hs.e4) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int read = hVar.read(bArr3, i12, i14);
                        if (read != -1) {
                            i12 += read;
                            i14 -= read;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        g2.y yVar = new g2.y(bArr3, i13);
                        t0 t0Var = this.c;
                        long max = !t0Var.x ? t0Var.r : Math.max(t0Var.y.u(true), t0Var.r);
                        int a10 = yVar.a();
                        e3.i0 i0Var = t0Var.w;
                        i0Var.getClass();
                        i0Var.e(a10, yVar);
                        i0Var.d(max, 1, a10, 0, null);
                        t0Var.x = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i3, Math.min(this.e, i10));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}

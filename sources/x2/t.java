package x2;

import a8.ia;
import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class t implements j2.h {
    public final j2.h a;
    public final int b;
    public final t0 c;
    public final byte[] d;
    public int e;

    public t(j2.h hVar, int i7, t0 t0Var) {
        ia.f(i7 > 0);
        this.a = hVar;
        this.b = i7;
        this.c = t0Var;
        this.d = new byte[1];
        this.e = i7;
    }

    @Override // j2.h
    public final void addTransferListener(j2.d0 d0Var) {
        d0Var.getClass();
        this.a.addTransferListener(d0Var);
    }

    @Override // j2.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j2.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // j2.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // j2.h
    public final long open(j2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // e2.n
    public final int read(byte[] bArr, int i7, int i10) {
        int i11 = this.e;
        j2.h hVar = this.a;
        if (i11 == 0) {
            byte[] bArr2 = this.d;
            int i12 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & qs.e4) << 4;
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
                        h2.x xVar = new h2.x(bArr3, i13);
                        t0 t0Var = this.c;
                        long max = !t0Var.x ? t0Var.r : Math.max(t0Var.y.s(true), t0Var.r);
                        int a10 = xVar.a();
                        f3.j0 j0Var = t0Var.w;
                        j0Var.getClass();
                        j0Var.b(a10, xVar);
                        j0Var.c(max, 1, a10, 0, null);
                        t0Var.x = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i7, Math.min(this.e, i10));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}

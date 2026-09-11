package u2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class s implements g2.h {
    public final g2.h a;
    public final int b;
    public final r0 c;
    public final byte[] d;
    public int e;

    public s(g2.h hVar, int i10, r0 r0Var) {
        e2.d.b(i10 > 0);
        this.a = hVar;
        this.b = i10;
        this.c = r0Var;
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

    @Override // b2.k
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
                        e2.v vVar = new e2.v(bArr3, i14);
                        r0 r0Var = this.c;
                        long max = !r0Var.w ? r0Var.r : Math.max(r0Var.x.m(true), r0Var.r);
                        int a2 = vVar.a();
                        c3.h0 h0Var = r0Var.v;
                        h0Var.getClass();
                        h0Var.d(a2, vVar);
                        h0Var.c(max, 1, a2, 0, null);
                        r0Var.w = true;
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

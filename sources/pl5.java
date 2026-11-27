// default package

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pl5 implements h73 {
    public final h73 a;
    public final int b;
    public final zv8 c;
    public final byte[] d;
    public int e;

    public pl5(h73 h73Var, int i, zv8 zv8Var) {
        yve.f(i > 0);
        this.a = h73Var;
        this.b = i;
        this.c = zv8Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // h73
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
        this.a.addTransferListener(v2cVar);
    }

    @Override // h73
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // h73
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // h73
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // h73
    public final long open(n73 n73Var) {
        throw new UnsupportedOperationException();
    }

    @Override // z63
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        h73 h73Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (h73Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & jn7.d4) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = h73Var.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (true) {
                        if (i5 <= 0) {
                            break;
                        }
                        if (bArr3[i5 - 1] == 0) {
                            i5--;
                        } else {
                            ey7 ey7Var = new ey7(i5, bArr3);
                            zv8 zv8Var = this.c;
                            long max = !zv8Var.y ? zv8Var.s : Math.max(zv8Var.E.k(true), zv8Var.s);
                            int a = ey7Var.a();
                            x1c x1cVar = zv8Var.x;
                            x1cVar.getClass();
                            x1cVar.e(a, ey7Var);
                            x1cVar.a(max, 1, a, 0, null);
                            zv8Var.y = true;
                        }
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int read2 = h73Var.read(bArr, i, Math.min(i3, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}

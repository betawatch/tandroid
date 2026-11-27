// default package

import android.util.SparseArray;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rx8 implements e84 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public dk4 i;
    public g84 j;
    public boolean k;
    public final usb a = new usb(0);
    public final ey7 c = new ey7(TLObject.FLAG_12);
    public final SparseArray b = new SparseArray();
    public final px8 d = new px8((byte) 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // e84
    public final int b(f84 f84Var, v11 v11Var) {
        long j;
        ?? r3;
        ?? r2;
        long j2;
        av3 av3Var;
        px8 px8Var = this.d;
        usb usbVar = px8Var.b;
        this.j.getClass();
        long j3 = ((cb3) f84Var).c;
        long j4 = -9223372036854775807L;
        if (j3 != -1 && !px8Var.d) {
            ey7 ey7Var = px8Var.c;
            if (!px8Var.f) {
                cb3 cb3Var = (cb3) f84Var;
                long j5 = cb3Var.c;
                int min = (int) Math.min(20000L, j5);
                long j6 = j5 - min;
                if (cb3Var.d != j6) {
                    v11Var.a = j6;
                    return 1;
                }
                ey7Var.K(min);
                cb3Var.f = 0;
                cb3Var.d(ey7Var.a, 0, min, false);
                int i = ey7Var.b;
                int i2 = ey7Var.c - 4;
                while (true) {
                    if (i2 < i) {
                        break;
                    }
                    if (px8.b(i2, ey7Var.a) == 442) {
                        ey7Var.N(i2 + 4);
                        long c = px8.c(ey7Var);
                        if (c != -9223372036854775807L) {
                            j4 = c;
                            break;
                        }
                    }
                    i2--;
                }
                px8Var.h = j4;
                px8Var.f = true;
                return 0;
            }
            if (px8Var.h == -9223372036854775807L) {
                px8Var.a((cb3) f84Var);
                return 0;
            }
            if (px8Var.e) {
                long j7 = px8Var.g;
                if (j7 == -9223372036854775807L) {
                    px8Var.a((cb3) f84Var);
                    return 0;
                }
                px8Var.i = usbVar.c(px8Var.h) - usbVar.b(j7);
                px8Var.a((cb3) f84Var);
                return 0;
            }
            cb3 cb3Var2 = (cb3) f84Var;
            int min2 = (int) Math.min(20000L, cb3Var2.c);
            if (cb3Var2.d != 0) {
                v11Var.a = 0L;
                return 1;
            }
            ey7Var.K(min2);
            cb3Var2.f = 0;
            cb3Var2.d(ey7Var.a, 0, min2, false);
            int i3 = ey7Var.b;
            int i4 = ey7Var.c;
            while (true) {
                if (i3 >= i4 - 3) {
                    break;
                }
                if (px8.b(i3, ey7Var.a) == 442) {
                    ey7Var.N(i3 + 4);
                    long c2 = px8.c(ey7Var);
                    if (c2 != -9223372036854775807L) {
                        j4 = c2;
                        break;
                    }
                }
                i3++;
            }
            px8Var.g = j4;
            px8Var.e = true;
            return 0;
        }
        if (this.k) {
            j = 0;
            r3 = 1;
            r2 = 0;
        } else {
            this.k = true;
            long j8 = px8Var.i;
            if (j8 != -9223372036854775807L) {
                j = 0;
                r3 = 1;
                r2 = 0;
                dk4 dk4Var = new dk4(new sae(), new ym4(usbVar), j8, 1 + j8, 0L, j3, 188L, 1000);
                this.i = dk4Var;
                this.j.m0(dk4Var.a);
            } else {
                r3 = 1;
                r2 = 0;
                j = 0;
                this.j.m0(new qc0(j8));
            }
        }
        dk4 dk4Var2 = this.i;
        if (dk4Var2 != null && dk4Var2.c != null) {
            return dk4Var2.a((cb3) f84Var, v11Var);
        }
        cb3 cb3Var3 = (cb3) f84Var;
        cb3Var3.f = r2;
        long e = j3 != -1 ? j3 - cb3Var3.e() : -1L;
        if (e != -1 && e < 4) {
            g();
            return -1;
        }
        ey7 ey7Var2 = this.c;
        if (!cb3Var3.d(ey7Var2.a, r2, 4, r3)) {
            g();
            return -1;
        }
        ey7Var2.N(r2);
        int m = ey7Var2.m();
        if (m == 441) {
            g();
            return -1;
        }
        if (m == 442) {
            cb3Var3.d(ey7Var2.a, r2, 10, r2);
            ey7Var2.N(9);
            cb3Var3.l((ey7Var2.A() & 7) + 14, r2);
            return r2;
        }
        if (m == 443) {
            cb3Var3.d(ey7Var2.a, r2, 2, r2);
            ey7Var2.N(r2);
            cb3Var3.l(ey7Var2.H() + 6, r2);
            return r2;
        }
        if (((m & (-256)) >> 8) != r3) {
            cb3Var3.l(r3, r2);
            return r2;
        }
        int i5 = m & jn7.d4;
        SparseArray sparseArray = this.b;
        qx8 qx8Var = (qx8) sparseArray.get(i5);
        if (!this.e) {
            if (qx8Var == null) {
                if (i5 == 189) {
                    av3Var = new g4("video/mp2p");
                    this.f = r3;
                    this.h = cb3Var3.d;
                } else if ((m & jn7.A3) == 192) {
                    av3Var = new bi7(null, r2, "video/mp2p");
                    this.f = r3;
                    this.h = cb3Var3.d;
                } else if ((m & jn7.O3) == 224) {
                    av3Var = new zd5(null, "video/mp2p");
                    this.g = r3;
                    this.h = cb3Var3.d;
                } else {
                    av3Var = null;
                }
                if (av3Var != null) {
                    av3Var.h(this.j, new l6c(i5, 256));
                    qx8Var = new qx8(av3Var, this.a);
                    sparseArray.put(i5, qx8Var);
                }
            }
            if (cb3Var3.d > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = r3;
                this.j.D();
            }
        }
        cb3Var3.d(ey7Var2.a, r2, 2, r2);
        ey7Var2.N(r2);
        int H = ey7Var2.H() + 6;
        if (qx8Var == null) {
            cb3Var3.l(H, r2);
            return r2;
        }
        ey7Var2.K(H);
        cb3Var3.c(ey7Var2.a, r2, H, r2);
        ey7Var2.N(6);
        av3 av3Var2 = qx8Var.a;
        zd1 zd1Var = qx8Var.c;
        ey7Var2.k(r2, 3, zd1Var.b);
        zd1Var.l(r2);
        zd1Var.n(8);
        qx8Var.d = zd1Var.e();
        qx8Var.e = zd1Var.e();
        zd1Var.n(6);
        ey7Var2.k(r2, zd1Var.f(8), zd1Var.b);
        zd1Var.l(r2);
        usb usbVar2 = qx8Var.b;
        if (qx8Var.d) {
            zd1Var.n(4);
            zd1Var.n(r3);
            zd1Var.n(r3);
            long f = (zd1Var.f(3) << 30) | (zd1Var.f(15) << 15) | zd1Var.f(15);
            zd1Var.n(r3);
            if (!qx8Var.f && qx8Var.e) {
                zd1Var.n(4);
                zd1Var.n(r3);
                zd1Var.n(r3);
                zd1Var.n(r3);
                usbVar2.b((zd1Var.f(3) << 30) | (zd1Var.f(15) << 15) | zd1Var.f(15));
                qx8Var.f = r3;
            }
            j2 = usbVar2.b(f);
        } else {
            j2 = j;
        }
        av3Var2.g(4, j2);
        av3Var2.b(ey7Var2);
        av3Var2.e();
        ey7Var2.M(ey7Var2.a.length);
        return r2;
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        byte[] bArr = new byte[14];
        cb3 cb3Var = (cb3) f84Var;
        cb3Var.d(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            cb3Var.a(bArr[13] & 7, false);
            cb3Var.d(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // e84
    public final void d(long j, long j2) {
        usb usbVar = this.a;
        boolean z = usbVar.e() == -9223372036854775807L;
        if (!z) {
            long d = usbVar.d();
            z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
        }
        if (z) {
            usbVar.g(j2);
        }
        dk4 dk4Var = this.i;
        if (dk4Var != null) {
            dk4Var.d(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            qx8 qx8Var = (qx8) sparseArray.valueAt(i);
            qx8Var.f = false;
            qx8Var.a.d();
            i++;
        }
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.j = g84Var;
    }

    public final void g() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((qx8) sparseArray.valueAt(i)).a.f();
            i++;
        }
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}

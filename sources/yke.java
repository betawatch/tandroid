// default package

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class yke implements Closeable {
    public final ByteArrayInputStream a;
    public wdc b;
    public final byte[] c = new byte[8];
    public final oqd d;

    public yke(ByteArrayInputStream byteArrayInputStream) {
        oqd oqdVar = new oqd();
        oqdVar.a = new ArrayDeque(16);
        this.d = oqdVar;
        this.a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f = f();
        if (f < 0) {
            qyc.c("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (f > 0) {
            ((ArrayDeque) this.d.a).push(Long.valueOf(f));
        }
        return f;
    }

    public final long b() {
        boolean z;
        d();
        byte b = this.b.a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                grb.i(uh9.k((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long f = f();
        if (f >= 0) {
            return z ? f : ~f;
        }
        qyc.c("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long c() {
        h((byte) -96);
        g();
        long f = f();
        if (f < 0 || f > 4611686018427387903L) {
            qyc.c("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (f > 0) {
            ((ArrayDeque) this.d.a).push(Long.valueOf(f << 1));
        }
        return f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
    
        if (r2 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wdc d() {
        oqd oqdVar = this.d;
        ArrayDeque arrayDeque = (ArrayDeque) oqdVar.a;
        if (this.b == null) {
            int read = this.a.read();
            if (read == -1) {
                oqdVar.a();
                return null;
            }
            wdc wdcVar = new wdc(read);
            this.b = wdcVar;
            long j = -2;
            byte b = wdcVar.a;
            if (b != Byte.MIN_VALUE && b != -96 && b != -64) {
                if (b != -32) {
                    if (b != 0 && b != 32) {
                        if (b == 64) {
                            oqdVar.c(-1L);
                        } else {
                            if (b != 96) {
                                grb.i(uh9.k((b >> 5) & 7, "invalid major type: "));
                                return null;
                            }
                            oqdVar.c(-2L);
                        }
                        long d = oqdVar.d();
                        if (d == 1) {
                            arrayDeque.pop();
                        } else if (d > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(d - 1));
                        } else if (d == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (d == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (wdcVar.b == 31) {
                    long d2 = oqdVar.d();
                    if (d2 >= 0) {
                        su3.e(qu6.n(d2, "expected indefinite length scope but found "));
                        return null;
                    }
                    if (d2 == -5) {
                        su3.e("expected a value for dangling key in indefinite-length map");
                        return null;
                    }
                    arrayDeque.pop();
                }
            }
            long d3 = oqdVar.d();
            if (d3 == -1) {
                j = d3;
            }
            su3.e(qu6.n(j, "expected non-string scope but found "));
            return null;
        }
        return this.b;
    }

    public final boolean e() {
        h((byte) -32);
        if (this.b.b > 24) {
            grb.i("expected simple value");
            return false;
        }
        int f = (int) f();
        if (f == 20) {
            return false;
        }
        if (f == 21) {
            return true;
        }
        grb.i("expected FALSE or TRUE");
        return false;
    }

    public final long f() {
        wdc wdcVar = this.b;
        byte b = wdcVar.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        }
        if (b == 24) {
            int read = this.a.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.b = null;
            return read & 255;
        }
        byte[] bArr = this.c;
        if (b == 25) {
            i(2, bArr);
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (b == 26) {
            i(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b != 27) {
            su3.e(c00.h(b, (wdcVar.a >> 5) & 7, "invalid additional information ", " for major type "));
            return 0L;
        }
        i(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public final void g() {
        d();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        grb.i(uh9.k(b, "expected definite length but found "));
    }

    public final void h(byte b) {
        d();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        grb.i(c00.h((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
    }

    public final void i(int i, byte[] bArr) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.a.read(bArr, i2, i - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
        this.b = null;
    }

    public final byte[] j() {
        g();
        long f = f();
        if (f < 0 || f > 2147483647L) {
            qyc.c("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.a.available() < f) {
            throw new EOFException();
        }
        int i = (int) f;
        byte[] bArr = new byte[i];
        i(i, bArr);
        return bArr;
    }
}

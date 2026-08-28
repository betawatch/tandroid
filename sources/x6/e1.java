package x6;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e1 implements Closeable {
    public final ByteArrayInputStream a;
    public d1 b;
    public final byte[] c = new byte[8];
    public final n5.a0 d = new n5.a0(20);

    public e1(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f10 = f();
        if (f10 < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (f10 > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(f10));
        }
        return f10;
    }

    public final long b() {
        boolean z10;
        d();
        byte b10 = this.b.a;
        if (b10 == 0) {
            z10 = true;
        } else {
            if (b10 != 32) {
                throw new IllegalStateException(j3.r0.l((this.b.a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z10 = false;
        }
        long f10 = f();
        if (f10 >= 0) {
            return z10 ? f10 : ~f10;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() {
        h((byte) -96);
        g();
        long f10 = f();
        if (f10 < 0 || f10 > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (f10 > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(f10 + f10));
        }
        return f10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.d.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d1 d() {
        if (this.b == null) {
            int read = this.a.read();
            n5.a0 a0Var = this.d;
            if (read == -1) {
                a0Var.k();
                return null;
            }
            d1 d1Var = new d1(read);
            this.b = d1Var;
            long j10 = -2;
            byte b10 = d1Var.a;
            if (b10 != Byte.MIN_VALUE && b10 != -96 && b10 != -64) {
                if (b10 != -32) {
                    if (b10 != 0 && b10 != 32) {
                        if (b10 == 64) {
                            a0Var.l(-1L);
                        } else {
                            if (b10 != 96) {
                                throw new IllegalStateException(j3.r0.l((this.b.a >> 5) & 7, "invalid major type: "));
                            }
                            a0Var.l(-2L);
                        }
                        long m10 = a0Var.m();
                        ArrayDeque arrayDeque = (ArrayDeque) a0Var.b;
                        if (m10 == 1) {
                            arrayDeque.pop();
                        } else if (m10 > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(m10 - 1));
                        } else if (m10 == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (m10 == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (d1Var.b == 31) {
                    long m11 = a0Var.m();
                    if (m11 >= 0) {
                        throw new IOException(aa.d.m(m11, "expected indefinite length scope but found "));
                    }
                    if (m11 == -5) {
                        throw new IOException("expected a value for dangling key in indefinite-length map");
                    }
                    ((ArrayDeque) a0Var.b).pop();
                }
            }
            long m12 = a0Var.m();
            if (m12 == -1) {
                j10 = m12;
            }
            throw new IOException(aa.d.m(j10, "expected non-string scope but found "));
        }
        return this.b;
    }

    public final boolean e() {
        h((byte) -32);
        if (this.b.b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int f10 = (int) f();
        if (f10 == 20) {
            return false;
        }
        if (f10 == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long f() {
        byte b10 = this.b.b;
        if (b10 < 24) {
            long j10 = b10;
            this.b = null;
            return j10;
        }
        if (b10 == 24) {
            int read = this.a.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.b = null;
            return read & 255;
        }
        byte[] bArr = this.c;
        if (b10 == 25) {
            i(2, bArr);
            return ((bArr[0] & 255) << 8) | (255 & bArr[1]);
        }
        if (b10 == 26) {
            i(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b10 != 27) {
            d1 d1Var = this.b;
            throw new IOException(aa.d.k(d1Var.b, (d1Var.a >> 5) & 7, "invalid additional information ", " for major type "));
        }
        i(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public final void g() {
        d();
        if (this.b.b == 31) {
            throw new IllegalStateException(j3.r0.l(this.b.b, "expected definite length but found "));
        }
    }

    public final void h(byte b10) {
        d();
        if (this.b.a != b10) {
            throw new IllegalStateException(aa.d.k((b10 >> 5) & 7, (this.b.a >> 5) & 7, "expected major type ", " but found "));
        }
    }

    public final void i(int i9, byte[] bArr) {
        int i10 = 0;
        while (i10 != i9) {
            int read = this.a.read(bArr, i10, i9 - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
        this.b = null;
    }

    public final byte[] j() {
        g();
        long f10 = f();
        if (f10 < 0 || f10 > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.a.available() < f10) {
            throw new EOFException();
        }
        int i9 = (int) f10;
        byte[] bArr = new byte[i9];
        i(i9, bArr);
        return bArr;
    }
}

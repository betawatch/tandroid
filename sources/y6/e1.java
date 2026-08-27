package y6;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e1 implements Closeable {
    public final ByteArrayInputStream a;
    public d1 b;
    public final byte[] c = new byte[8];
    public final o0.b d = new o0.b(21);

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
                throw new IllegalStateException(i0.a.k((this.b.a >> 5) & 7, "expected major type 0 or 1 but found "));
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
        this.d.l();
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
            o0.b bVar = this.d;
            if (read == -1) {
                bVar.l();
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
                            bVar.m(-1L);
                        } else {
                            if (b10 != 96) {
                                throw new IllegalStateException(i0.a.k((this.b.a >> 5) & 7, "invalid major type: "));
                            }
                            bVar.m(-2L);
                        }
                        long p6 = bVar.p();
                        ArrayDeque arrayDeque = (ArrayDeque) bVar.b;
                        if (p6 == 1) {
                            arrayDeque.pop();
                        } else if (p6 > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(p6 - 1));
                        } else if (p6 == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (p6 == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (d1Var.b == 31) {
                    long p9 = bVar.p();
                    if (p9 >= 0) {
                        throw new IOException(a9.p.l(p9, "expected indefinite length scope but found "));
                    }
                    if (p9 == -5) {
                        throw new IOException("expected a value for dangling key in indefinite-length map");
                    }
                    ((ArrayDeque) bVar.b).pop();
                }
            }
            long p10 = bVar.p();
            if (p10 == -1) {
                j10 = p10;
            }
            throw new IOException(a9.p.l(j10, "expected non-string scope but found "));
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
            throw new IOException(a9.p.j(d1Var.b, (d1Var.a >> 5) & 7, "invalid additional information ", " for major type "));
        }
        i(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public final void g() {
        d();
        if (this.b.b == 31) {
            throw new IllegalStateException(i0.a.k(this.b.b, "expected definite length but found "));
        }
    }

    public final void h(byte b10) {
        d();
        if (this.b.a != b10) {
            throw new IllegalStateException(a9.p.j((b10 >> 5) & 7, (this.b.a >> 5) & 7, "expected major type ", " but found "));
        }
    }

    public final void i(int i10, byte[] bArr) {
        int i11 = 0;
        while (i11 != i10) {
            int read = this.a.read(bArr, i11, i10 - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 += read;
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
        int i10 = (int) f10;
        byte[] bArr = new byte[i10];
        i(i10, bArr);
        return bArr;
    }
}

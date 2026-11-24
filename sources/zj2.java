// default package

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zj2 extends ak2 {
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public zj2(FileInputStream fileInputStream) {
        Charset charset = mp5.a;
        this.c = fileInputStream;
        this.d = new byte[TLObject.FLAG_12];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    public final byte[] A(int i) {
        if (i == 0) {
            return mp5.b;
        }
        if (i < 0) {
            throw zp5.d();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - ConnectionsManager.DEFAULT_DATACENTER_ID > 0) {
            throw new zp5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            J((i5 - i2) - i3);
            throw zp5.e();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.c;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (zp5 e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            try {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw zp5.e();
                }
                this.i += read;
                i6 += read;
            } catch (zp5 e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, TLObject.FLAG_12);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.c.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw zp5.e();
                }
                this.i += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i = this.g;
        if (this.e - i < 4) {
            I(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final long D() {
        int i = this.g;
        if (this.e - i < 8) {
            I(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r3[r2] < 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int E() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i2 + 4;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i5] < 0) {
                                        i5 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i5] < 0) {
                                                i5 = i2 + 10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) G();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long F() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i2 + 3;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j4 = i8 ^ 16256;
                    } else {
                        i5 = i2 + 4;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i2 + 5;
                            long j5 = i9 ^ (bArr[i5] << 28);
                            if (j5 < 0) {
                                i5 = i2 + 6;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i7 = i2 + 7;
                                    j5 = j6 ^ (bArr[i5] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 >= 0) {
                                            long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            i5 = j7 < 0 ? i2 + 10 : i2 + 9;
                                            j = j7;
                                            this.g = i5;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                                j = j2 ^ j6;
                                this.g = i5;
                                return j;
                            }
                            j3 = 266354560;
                            j4 = j3 ^ j5;
                        }
                    }
                    i5 = i7;
                    j = j4;
                    this.g = i5;
                    return j;
                }
                i = i6 ^ (-128);
                j = i;
                this.g = i5;
                return j;
            }
        }
        return G();
    }

    public final long G() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                I(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.d[i2] & 128) == 0) {
                return j;
            }
        }
        throw zp5.c();
    }

    public final void H() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void I(int i) {
        if (K(i)) {
            return;
        }
        if (i <= (ConnectionsManager.DEFAULT_DATACENTER_ID - this.i) - this.g) {
            throw zp5.e();
        }
        throw new zp5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i) {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i < 0) {
            throw zp5.d();
        }
        int i5 = this.i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.j;
        if (i7 > i8) {
            J((i8 - i5) - i3);
            throw zp5.e();
        }
        this.i = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip >= 0 && skip <= j) {
                        if (skip == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } else {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (zp5 e) {
                    e.a = true;
                    throw e;
                }
            } finally {
                this.i += i4;
                H();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        I(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                I(1);
            }
        }
    }

    public final boolean K(int i) {
        FileInputStream fileInputStream = this.c;
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            sc8.j(tb4.n(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.i;
        if (i <= (ConnectionsManager.DEFAULT_DATACENTER_ID - i5) - i2 && i5 + i2 + i <= this.j) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.i + i2;
                this.i = i5;
                i4 = this.e - i2;
                this.e = i4;
                this.g = 0;
            }
            try {
                int read = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (ConnectionsManager.DEFAULT_DATACENTER_ID - i5) - i4));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.e += read;
                    H();
                    if (this.e >= i) {
                        return true;
                    }
                    return K(i);
                }
            } catch (zp5 e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // ak2
    public final void a(int i) {
        if (this.h != i) {
            throw new zp5("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // ak2
    public final int b() {
        return this.i + this.g;
    }

    @Override // ak2
    public final boolean c() {
        return this.g == this.e && !K(1);
    }

    @Override // ak2
    public final void d(int i) {
        this.j = i;
        H();
    }

    @Override // ak2
    public final int e(int i) {
        if (i < 0) {
            throw zp5.d();
        }
        int i2 = this.i + this.g + i;
        if (i2 < 0) {
            throw new zp5("Failed to parse the message.");
        }
        int i3 = this.j;
        if (i2 > i3) {
            throw zp5.e();
        }
        this.j = i2;
        H();
        return i3;
    }

    @Override // ak2
    public final boolean f() {
        return F() != 0;
    }

    @Override // ak2
    public final f51 g() {
        int E = E();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (E <= i3 && E > 0) {
            f51 j = f51.j(i2, E, bArr);
            this.g += E;
            return j;
        }
        if (E == 0) {
            return f51.c;
        }
        if (E < 0) {
            throw zp5.d();
        }
        byte[] A = A(E);
        if (A != null) {
            return f51.j(0, A.length, A);
        }
        int i4 = this.g;
        int i5 = this.e;
        int i6 = i5 - i4;
        this.i += i5;
        this.g = 0;
        this.e = 0;
        ArrayList B = B(E - i6);
        byte[] bArr2 = new byte[E];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = B.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = B.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        f51 f51Var = f51.c;
        return new f51(bArr2);
    }

    @Override // ak2
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // ak2
    public final int i() {
        return E();
    }

    @Override // ak2
    public final int j() {
        return C();
    }

    @Override // ak2
    public final long k() {
        return D();
    }

    @Override // ak2
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // ak2
    public final int m() {
        return E();
    }

    @Override // ak2
    public final long n() {
        return F();
    }

    @Override // ak2
    public final int o() {
        return C();
    }

    @Override // ak2
    public final long p() {
        return D();
    }

    @Override // ak2
    public final int q() {
        int E = E();
        return (E >>> 1) ^ (-(E & 1));
    }

    @Override // ak2
    public final long r() {
        long F = F();
        return (F >>> 1) ^ (-(F & 1));
    }

    @Override // ak2
    public final String s() {
        int E = E();
        byte[] bArr = this.d;
        if (E > 0) {
            int i = this.e;
            int i2 = this.g;
            if (E <= i - i2) {
                String str = new String(bArr, i2, E, mp5.a);
                this.g += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E < 0) {
            throw zp5.d();
        }
        if (E > this.e) {
            return new String(z(E), mp5.a);
        }
        I(E);
        String str2 = new String(bArr, this.g, E, mp5.a);
        this.g += E;
        return str2;
    }

    @Override // ak2
    public final String t() {
        int E = E();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArr = this.d;
        if (E <= i3 && E > 0) {
            this.g = i + E;
        } else {
            if (E == 0) {
                return "";
            }
            if (E < 0) {
                throw zp5.d();
            }
            i = 0;
            if (E <= i2) {
                I(E);
                this.g = E;
            } else {
                bArr = z(E);
            }
        }
        return f8c.a.a(i, E, bArr);
    }

    @Override // ak2
    public final int u() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int E = E();
        this.h = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        throw new zp5("Protocol message contained an invalid tag (zero).");
    }

    @Override // ak2
    public final int v() {
        return E();
    }

    @Override // ak2
    public final long w() {
        return F();
    }

    @Override // ak2
    public final boolean x(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                J(8);
                return true;
            }
            if (i2 == 2) {
                J(E());
                return true;
            }
            if (i2 == 3) {
                y();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zp5.b();
            }
            J(4);
            return true;
        }
        int i4 = this.e - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw zp5.c();
        }
        while (i3 < 10) {
            if (this.g == this.e) {
                I(1);
            }
            int i6 = this.g;
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw zp5.c();
        return true;
    }

    public final byte[] z(int i) {
        byte[] A = A(i);
        if (A != null) {
            return A;
        }
        int i2 = this.g;
        int i3 = this.e;
        int i4 = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList B = B(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, i4);
        int size = B.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = B.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }
}

// default package

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class tk2 extends vk2 {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public tk2(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    public final long A() {
        int i = this.f;
        if (this.d - i < 8) {
            throw bs5.e();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r3[r2] < 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int B() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                this.f = i5;
                return i;
            }
        }
        return (int) D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long C() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                                            this.f = i5;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                                j = j2 ^ j6;
                                this.f = i5;
                                return j;
                            }
                            j3 = 266354560;
                            j4 = j3 ^ j5;
                        }
                    }
                    i5 = i7;
                    j = j4;
                    this.f = i5;
                    return j;
                }
                i = i6 ^ (-128);
                j = i;
                this.f = i5;
                return j;
            }
        }
        return D();
    }

    public final long D() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw bs5.e();
            }
            this.f = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.c[i2] & 128) == 0) {
                return j;
            }
        }
        throw bs5.c();
    }

    public final void E() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.i;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    public final void F(int i) {
        if (i < 0) {
            throw bs5.d();
        }
        int i2 = this.d;
        int i3 = this.f;
        if (i > i2 - i3) {
            throw bs5.e();
        }
        this.f = i3 + i;
    }

    @Override // vk2
    public final void a(int i) {
        if (this.h != i) {
            throw new bs5("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // vk2
    public final int b() {
        return this.f - this.g;
    }

    @Override // vk2
    public final boolean c() {
        return this.f == this.d;
    }

    @Override // vk2
    public final void d(int i) {
        this.i = i;
        E();
    }

    @Override // vk2
    public final int e(int i) {
        if (i < 0) {
            throw bs5.d();
        }
        int b = b() + i;
        if (b < 0) {
            throw new bs5("Failed to parse the message.");
        }
        int i2 = this.i;
        if (b > i2) {
            throw bs5.e();
        }
        this.i = b;
        E();
        return i2;
    }

    @Override // vk2
    public final boolean f() {
        return C() != 0;
    }

    @Override // vk2
    public final n51 g() {
        byte[] bArr;
        int B = B();
        byte[] bArr2 = this.c;
        if (B > 0) {
            int i = this.d;
            int i2 = this.f;
            if (B <= i - i2) {
                n51 j = n51.j(i2, B, bArr2);
                this.f += B;
                return j;
            }
        }
        if (B == 0) {
            return n51.c;
        }
        if (B > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (B > i3 - i4) {
                throw bs5.e();
            }
            int i5 = B + i4;
            this.f = i5;
            bArr = Arrays.copyOfRange(bArr2, i4, i5);
        } else {
            if (B != 0) {
                throw bs5.d();
            }
            bArr = pr5.b;
        }
        n51 n51Var = n51.c;
        return new n51(bArr);
    }

    @Override // vk2
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // vk2
    public final int i() {
        return B();
    }

    @Override // vk2
    public final int j() {
        return z();
    }

    @Override // vk2
    public final long k() {
        return A();
    }

    @Override // vk2
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // vk2
    public final int m() {
        return B();
    }

    @Override // vk2
    public final long n() {
        return C();
    }

    @Override // vk2
    public final int o() {
        return z();
    }

    @Override // vk2
    public final long p() {
        return A();
    }

    @Override // vk2
    public final int q() {
        int B = B();
        return (B >>> 1) ^ (-(B & 1));
    }

    @Override // vk2
    public final long r() {
        long C = C();
        return (C >>> 1) ^ (-(C & 1));
    }

    @Override // vk2
    public final String s() {
        int B = B();
        if (B > 0) {
            int i = this.d;
            int i2 = this.f;
            if (B <= i - i2) {
                String str = new String(this.c, i2, B, pr5.a);
                this.f += B;
                return str;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B < 0) {
            throw bs5.d();
        }
        throw bs5.e();
    }

    @Override // vk2
    public final String t() {
        int B = B();
        if (B > 0) {
            int i = this.d;
            int i2 = this.f;
            if (B <= i - i2) {
                String a = fcc.a.a(i2, B, this.c);
                this.f += B;
                return a;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B <= 0) {
            throw bs5.d();
        }
        throw bs5.e();
    }

    @Override // vk2
    public final int u() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int B = B();
        this.h = B;
        if ((B >>> 3) != 0) {
            return B;
        }
        throw new bs5("Protocol message contained an invalid tag (zero).");
    }

    @Override // vk2
    public final int v() {
        return B();
    }

    @Override // vk2
    public final long w() {
        return C();
    }

    @Override // vk2
    public final boolean x(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                F(8);
                return true;
            }
            if (i2 == 2) {
                F(B());
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
                throw bs5.b();
            }
            F(4);
            return true;
        }
        int i4 = this.d - this.f;
        byte[] bArr = this.c;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f;
                this.f = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw bs5.c();
        }
        while (i3 < 10) {
            int i6 = this.f;
            if (i6 == this.d) {
                throw bs5.e();
            }
            this.f = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw bs5.c();
        return true;
    }

    public final int z() {
        int i = this.f;
        if (this.d - i < 4) {
            throw bs5.e();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }
}

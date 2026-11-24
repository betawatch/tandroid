// default package

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class utc implements s84 {
    public u84 a;
    public yzb b;
    public byte c;
    public long d;
    public stc e;
    public int f;
    public long g;

    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0240  */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
        byte[] bArr;
        int i;
        int i2;
        byte[] bArr2;
        int F;
        int i3;
        this.b.getClass();
        String str = hac.a;
        byte b = this.c;
        if (b == 0) {
            jte.p(((vb3) t84Var).d == 0);
            int i4 = this.f;
            if (i4 != -1) {
                ((vb3) t84Var).m(i4, false);
                this.c = (byte) 4;
                return 0;
            }
            vb3 vb3Var = (vb3) t84Var;
            if (!nfd.a(vb3Var)) {
                throw bx7.a("Unsupported or unrecognized wav file type.", null);
            }
            vb3Var.m((int) (vb3Var.f() - vb3Var.d), false);
            this.c = (byte) 1;
            return 0;
        }
        long j = -1;
        if (b == 1) {
            yw7 yw7Var = new yw7(8);
            vtc a = vtc.a((vb3) t84Var, yw7Var);
            if (a.a != 1685272116) {
                ((vb3) t84Var).f = 0;
            } else {
                vb3 vb3Var2 = (vb3) t84Var;
                vb3Var2.a(8, false);
                yw7Var.N(0);
                vb3Var2.d(yw7Var.a, 0, 8, false);
                j = yw7Var.p();
                vb3Var2.m(((int) a.b) + 8, false);
            }
            this.d = j;
            this.c = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b != 3) {
                if (b != 4) {
                    rjb.h();
                    return 0;
                }
                jte.p(this.g != -1);
                long j2 = this.g - ((vb3) t84Var).d;
                stc stcVar = this.e;
                stcVar.getClass();
                return stcVar.a((vb3) t84Var, j2) ? -1 : 0;
            }
            ((vb3) t84Var).f = 0;
            vb3 vb3Var3 = (vb3) t84Var;
            vtc b2 = nfd.b(1684108385, vb3Var3, new yw7(8));
            vb3Var3.m(8, false);
            Pair create = Pair.create(Long.valueOf(vb3Var3.d), Long.valueOf(b2.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j3 = this.d;
            if (j3 != -1 && longValue == 4294967295L) {
                longValue = j3;
            }
            long j4 = this.f + longValue;
            this.g = j4;
            long j5 = vb3Var3.c;
            if (j5 != -1 && j4 > j5) {
                ncd.f("WavExtractor", "Data exceeds input length: " + this.g + ", " + j5);
                this.g = j5;
            }
            stc stcVar2 = this.e;
            stcVar2.getClass();
            stcVar2.c(this.f, this.g);
            this.c = (byte) 4;
            return 0;
        }
        yw7 yw7Var2 = new yw7(16);
        long j6 = nfd.b(1718449184, (vb3) t84Var, yw7Var2).b;
        jte.p(j6 >= 16);
        vb3 vb3Var4 = (vb3) t84Var;
        vb3Var4.d(yw7Var2.a, 0, 16, false);
        yw7Var2.N(0);
        int t = yw7Var2.t();
        int t2 = yw7Var2.t();
        int s = yw7Var2.s();
        yw7Var2.s();
        int t3 = yw7Var2.t();
        int t4 = yw7Var2.t();
        int i5 = ((int) j6) - 16;
        if (i5 > 0) {
            bArr = new byte[i5];
            vb3Var4.d(bArr, 0, i5, false);
            if (t == 65534 && i5 == 24) {
                yw7 yw7Var3 = new yw7(bArr);
                yw7Var3.t();
                int t5 = yw7Var3.t();
                if (t5 != 0 && t5 != t4) {
                    throw bx7.d("validBits ( " + t5 + ")  != bitsPerSample( " + t4 + ") are not supported");
                }
                int s2 = yw7Var3.s();
                if ((s2 >> 18) != 0 || (s2 != 0 && Integer.bitCount(s2) != t2)) {
                    throw bx7.d("Channel mask " + s2 + " is invalid or does not match channel count " + t2);
                }
                int t6 = yw7Var3.t();
                byte[] bArr3 = new byte[14];
                yw7Var3.k(0, 14, bArr3);
                if (!Arrays.equals(bArr3, nfd.a) && !Arrays.equals(bArr3, nfd.b)) {
                    throw bx7.d("invalid wav format extension guid");
                }
                i2 = s2;
                bArr2 = bArr;
                i = t6;
                vb3Var4.m((int) (vb3Var4.f() - vb3Var4.d), false);
                tm9 tm9Var = new tm9(i, t2, s, t3, t4, i2, bArr2);
                if (i != 17) {
                    this.e = new rtc(this.a, this.b, tm9Var);
                } else if (i == 6) {
                    this.e = new ttc(this.a, this.b, tm9Var, "audio/g711-alaw", -1);
                } else if (i == 7) {
                    this.e = new ttc(this.a, this.b, tm9Var, "audio/g711-mlaw", -1);
                } else {
                    if (i != 1) {
                        if (i == 3) {
                            F = hac.C(t4, ByteOrder.LITTLE_ENDIAN);
                            i3 = F;
                            if (i3 == 0) {
                            }
                        } else if (i != 65534) {
                            i3 = 0;
                            if (i3 == 0) {
                                throw bx7.d("Unsupported WAV format type: " + i);
                            }
                            this.e = new ttc(this.a, this.b, tm9Var, "audio/raw", i3);
                        }
                    }
                    F = hac.F(t4, ByteOrder.LITTLE_ENDIAN);
                    i3 = F;
                    if (i3 == 0) {
                    }
                }
                this.c = (byte) 3;
                return 0;
            }
        } else {
            bArr = hac.b;
        }
        i = t;
        i2 = 0;
        bArr2 = bArr;
        vb3Var4.m((int) (vb3Var4.f() - vb3Var4.d), false);
        tm9 tm9Var2 = new tm9(i, t2, s, t3, t4, i2, bArr2);
        if (i != 17) {
        }
        this.c = (byte) 3;
        return 0;
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        return nfd.a((vb3) t84Var);
    }

    @Override // s84
    public final void d(long j, long j2) {
        this.c = j == 0 ? (byte) 0 : (byte) 4;
        stc stcVar = this.e;
        if (stcVar != null) {
            stcVar.b(j2);
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.a = u84Var;
        this.b = u84Var.c0(0, 1);
        u84Var.B();
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}

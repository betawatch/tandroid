// default package

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class src implements j74 {
    public l74 a;
    public wxb b;
    public byte c;
    public long d;
    public qrc e;
    public int f;
    public long g;

    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0240  */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        byte[] bArr;
        int i;
        int i2;
        byte[] bArr2;
        int F;
        int i3;
        this.b.getClass();
        String str = g8c.a;
        byte b = this.c;
        if (b == 0) {
            gre.p(((ja3) k74Var).d == 0);
            int i4 = this.f;
            if (i4 != -1) {
                ((ja3) k74Var).l(i4, false);
                this.c = (byte) 4;
                return 0;
            }
            ja3 ja3Var = (ja3) k74Var;
            if (!ldd.a(ja3Var)) {
                throw av7.a("Unsupported or unrecognized wav file type.", null);
            }
            ja3Var.l((int) (ja3Var.f() - ja3Var.d), false);
            this.c = (byte) 1;
            return 0;
        }
        long j = -1;
        if (b == 1) {
            xu7 xu7Var = new xu7(8);
            trc a = trc.a((ja3) k74Var, xu7Var);
            if (a.a != 1685272116) {
                ((ja3) k74Var).f = 0;
            } else {
                ja3 ja3Var2 = (ja3) k74Var;
                ja3Var2.a(8, false);
                xu7Var.N(0);
                ja3Var2.d(xu7Var.a, 0, 8, false);
                j = xu7Var.p();
                ja3Var2.l(((int) a.b) + 8, false);
            }
            this.d = j;
            this.c = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b != 3) {
                if (b != 4) {
                    sdb.a();
                    return 0;
                }
                gre.p(this.g != -1);
                long j2 = this.g - ((ja3) k74Var).d;
                qrc qrcVar = this.e;
                qrcVar.getClass();
                return qrcVar.a((ja3) k74Var, j2) ? -1 : 0;
            }
            ((ja3) k74Var).f = 0;
            ja3 ja3Var3 = (ja3) k74Var;
            trc b2 = ldd.b(1684108385, ja3Var3, new xu7(8));
            ja3Var3.l(8, false);
            Pair create = Pair.create(Long.valueOf(ja3Var3.d), Long.valueOf(b2.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j3 = this.d;
            if (j3 != -1 && longValue == 4294967295L) {
                longValue = j3;
            }
            long j4 = this.f + longValue;
            this.g = j4;
            long j5 = ja3Var3.c;
            if (j5 != -1 && j4 > j5) {
                lad.f("WavExtractor", "Data exceeds input length: " + this.g + ", " + j5);
                this.g = j5;
            }
            qrc qrcVar2 = this.e;
            qrcVar2.getClass();
            qrcVar2.c(this.f, this.g);
            this.c = (byte) 4;
            return 0;
        }
        xu7 xu7Var2 = new xu7(16);
        long j6 = ldd.b(1718449184, (ja3) k74Var, xu7Var2).b;
        gre.p(j6 >= 16);
        ja3 ja3Var4 = (ja3) k74Var;
        ja3Var4.d(xu7Var2.a, 0, 16, false);
        xu7Var2.N(0);
        int t = xu7Var2.t();
        int t2 = xu7Var2.t();
        int s = xu7Var2.s();
        xu7Var2.s();
        int t3 = xu7Var2.t();
        int t4 = xu7Var2.t();
        int i5 = ((int) j6) - 16;
        if (i5 > 0) {
            bArr = new byte[i5];
            ja3Var4.d(bArr, 0, i5, false);
            if (t == 65534 && i5 == 24) {
                xu7 xu7Var3 = new xu7(bArr);
                xu7Var3.t();
                int t5 = xu7Var3.t();
                if (t5 != 0 && t5 != t4) {
                    throw av7.d("validBits ( " + t5 + ")  != bitsPerSample( " + t4 + ") are not supported");
                }
                int s2 = xu7Var3.s();
                if ((s2 >> 18) != 0 || (s2 != 0 && Integer.bitCount(s2) != t2)) {
                    throw av7.d("Channel mask " + s2 + " is invalid or does not match channel count " + t2);
                }
                int t6 = xu7Var3.t();
                byte[] bArr3 = new byte[14];
                xu7Var3.k(0, 14, bArr3);
                if (!Arrays.equals(bArr3, ldd.a) && !Arrays.equals(bArr3, ldd.b)) {
                    throw av7.d("invalid wav format extension guid");
                }
                i2 = s2;
                bArr2 = bArr;
                i = t6;
                ja3Var4.l((int) (ja3Var4.f() - ja3Var4.d), false);
                sk9 sk9Var = new sk9(i, t2, s, t3, t4, i2, bArr2);
                if (i != 17) {
                    this.e = new prc(this.a, this.b, sk9Var);
                } else if (i == 6) {
                    this.e = new rrc(this.a, this.b, sk9Var, "audio/g711-alaw", -1);
                } else if (i == 7) {
                    this.e = new rrc(this.a, this.b, sk9Var, "audio/g711-mlaw", -1);
                } else {
                    if (i != 1) {
                        if (i == 3) {
                            F = g8c.C(t4, ByteOrder.LITTLE_ENDIAN);
                            i3 = F;
                            if (i3 == 0) {
                            }
                        } else if (i != 65534) {
                            i3 = 0;
                            if (i3 == 0) {
                                throw av7.d("Unsupported WAV format type: " + i);
                            }
                            this.e = new rrc(this.a, this.b, sk9Var, "audio/raw", i3);
                        }
                    }
                    F = g8c.F(t4, ByteOrder.LITTLE_ENDIAN);
                    i3 = F;
                    if (i3 == 0) {
                    }
                }
                this.c = (byte) 3;
                return 0;
            }
        } else {
            bArr = g8c.b;
        }
        i = t;
        i2 = 0;
        bArr2 = bArr;
        ja3Var4.l((int) (ja3Var4.f() - ja3Var4.d), false);
        sk9 sk9Var2 = new sk9(i, t2, s, t3, t4, i2, bArr2);
        if (i != 17) {
        }
        this.c = (byte) 3;
        return 0;
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        return ldd.a((ja3) k74Var);
    }

    @Override // j74
    public final void d(long j, long j2) {
        this.c = j == 0 ? (byte) 0 : (byte) 4;
        qrc qrcVar = this.e;
        if (qrcVar != null) {
            qrcVar.b(j2);
        }
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.a = l74Var;
        this.b = l74Var.S(0, 1);
        l74Var.z();
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}

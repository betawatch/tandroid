package s3;

import f5.v;
import f5.w;
import j3.s0;
import j3.t0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l4.l1;
import o3.h;
import o3.j;
import o3.k;
import o3.l;
import o3.m;
import o3.n;
import o3.o;
import o3.r;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements k {
    public final w a = new w(4);
    public final w b = new w(9);
    public final w c = new w(11);
    public final w d = new w();
    public final c e;
    public m f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public d p;

    public b() {
        c cVar = new c(new j());
        cVar.b = -9223372036854775807L;
        cVar.c = new long[0];
        cVar.d = new long[0];
        this.e = cVar;
        this.g = 1;
    }

    public final w a(l lVar) {
        int i10 = this.l;
        w wVar = this.d;
        byte[] bArr = wVar.a;
        if (i10 > bArr.length) {
            wVar.A(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            wVar.C(0);
        }
        wVar.B(this.l);
        lVar.readFully(wVar.a, 0, this.l);
        return wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0384 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x039c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0007 A[SYNTHETIC] */
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(l lVar, n nVar) {
        long j10;
        long j11;
        int i10;
        long j12;
        int i11;
        boolean z10;
        boolean z11;
        f5.a.j(this.f);
        while (true) {
            int i12 = this.g;
            if (i12 == 1) {
                w wVar = this.b;
                if (!((h) lVar).c(wVar.a, 0, 9, true)) {
                    return -1;
                }
                wVar.C(0);
                wVar.D(4);
                int r6 = wVar.r();
                boolean z12 = (r6 & 4) != 0;
                boolean z13 = (r6 & 1) != 0;
                if (z12 && this.o == null) {
                    this.o = new a(this.f.Z1(8, 1));
                }
                if (z13 && this.p == null) {
                    this.p = new d(this.f.Z1(9, 2));
                }
                this.f.e1();
                this.j = wVar.e() - 5;
                this.g = 2;
            } else if (i12 == 2) {
                ((h) lVar).t(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i12 == 3) {
                w wVar2 = this.c;
                if (!((h) lVar).c(wVar2.a, 0, 11, true)) {
                    return -1;
                }
                wVar2.C(0);
                this.k = wVar2.r();
                this.l = wVar2.t();
                this.m = wVar2.t();
                this.m = ((wVar2.r() << 24) | this.m) * 1000;
                wVar2.D(3);
                this.g = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                boolean z14 = this.h;
                c cVar = this.e;
                if (z14) {
                    j10 = this.i + this.m;
                } else if (cVar.b == -9223372036854775807L) {
                    j11 = 0;
                    i10 = this.k;
                    if (i10 != 8 && this.o != null) {
                        if (!this.n) {
                            this.f.D1(new o(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        w a2 = a(lVar);
                        o3.w wVar3 = (o3.w) aVar.a;
                        if (aVar.b) {
                            a2.D(1);
                        } else {
                            int r9 = a2.r();
                            int i13 = (r9 >> 4) & 15;
                            aVar.d = i13;
                            if (i13 == 2) {
                                int i14 = a.e[(r9 >> 2) & 3];
                                s0 s0Var = new s0();
                                s0Var.o = "audio/mpeg";
                                s0Var.B = 1;
                                s0Var.C = i14;
                                wVar3.b(new t0(s0Var));
                                aVar.c = true;
                            } else if (i13 == 7 || i13 == 8) {
                                String str = i13 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                s0 s0Var2 = new s0();
                                s0Var2.o = str;
                                s0Var2.B = 1;
                                s0Var2.C = 8000;
                                wVar3.b(new t0(s0Var2));
                                aVar.c = true;
                            } else if (i13 != 10) {
                                throw new l1("Audio format not supported: " + aVar.d);
                            }
                            aVar.b = true;
                        }
                        o3.w wVar4 = (o3.w) aVar.a;
                        z11 = true;
                        if (aVar.d == 2) {
                            int a10 = a2.a();
                            wVar4.e(a10, a2);
                            ((o3.w) aVar.a).c(j11, 1, a10, 0, null);
                        } else {
                            int r10 = a2.r();
                            if (r10 == 0 && !aVar.c) {
                                int a11 = a2.a();
                                byte[] bArr = new byte[a11];
                                a2.c(0, a11, bArr);
                                l3.a h = l3.b.h(new v(bArr, a11), false);
                                s0 s0Var3 = new s0();
                                s0Var3.o = MediaController.AUDIO_MIME_TYPE;
                                s0Var3.h = h.c;
                                s0Var3.B = h.b;
                                s0Var3.C = h.a;
                                s0Var3.q = Collections.singletonList(bArr);
                                wVar4.b(new t0(s0Var3));
                                aVar.c = true;
                            } else if (aVar.d != 10 || r10 == 1) {
                                int a12 = a2.a();
                                wVar4.e(a12, a2);
                                ((o3.w) aVar.a).c(j11, 1, a12, 0, null);
                            }
                            z11 = false;
                        }
                        j12 = -9223372036854775807L;
                        i11 = 0;
                    } else if (i10 == 9 || this.p == null) {
                        j12 = -9223372036854775807L;
                        i11 = 0;
                        if (i10 == 18 || this.n) {
                            ((h) lVar).t(this.l);
                            z10 = false;
                        } else {
                            w a13 = a(lVar);
                            cVar.getClass();
                            cVar.getClass();
                            if (a13.r() == 2 && "onMetaData".equals(c.S(a13)) && a13.a() != 0 && a13.r() == 8) {
                                HashMap R = c.R(a13);
                                Object obj = R.get("duration");
                                double d = 1000000.0d;
                                if (obj instanceof Double) {
                                    double doubleValue = ((Double) obj).doubleValue();
                                    if (doubleValue > 0.0d) {
                                        cVar.b = (long) (doubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = R.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        cVar.c = new long[size];
                                        cVar.d = new long[size];
                                        int i15 = 0;
                                        while (i15 < size) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                cVar.c = new long[0];
                                                cVar.d = new long[0];
                                                break;
                                            }
                                            double d10 = d;
                                            cVar.c[i15] = (long) (((Double) obj6).doubleValue() * d10);
                                            cVar.d[i15] = ((Double) obj5).longValue();
                                            i15++;
                                            d = d10;
                                        }
                                    }
                                }
                            }
                            long j13 = cVar.b;
                            if (j13 != -9223372036854775807L) {
                                this.f.D1(new r(j13, cVar.d, cVar.c));
                                this.n = true;
                            }
                            z10 = true;
                        }
                        z11 = false;
                        if (!this.h && z11) {
                            this.h = true;
                            this.i = cVar.b != j12 ? -this.m : 0L;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (z10) {
                            return i11;
                        }
                    } else {
                        if (!this.n) {
                            this.f.D1(new o(-9223372036854775807L));
                            this.n = true;
                        }
                        d dVar = this.p;
                        w a14 = a(lVar);
                        dVar.getClass();
                        int r11 = a14.r();
                        int i16 = (r11 >> 4) & 15;
                        int i17 = r11 & 15;
                        if (i17 != 7) {
                            throw new l1(j7.l1.k(i17, "Video format not supported: "));
                        }
                        dVar.g = i16;
                        if (i16 != 5) {
                            w wVar5 = dVar.b;
                            o3.w wVar6 = (o3.w) dVar.a;
                            w wVar7 = dVar.c;
                            int r12 = a14.r();
                            byte[] bArr2 = a14.a;
                            j12 = -9223372036854775807L;
                            int i18 = a14.b;
                            int i19 = i18 + 1;
                            a14.b = i19;
                            int i20 = ((bArr2[i18] & 255) << 24) >> 8;
                            i11 = 0;
                            a14.b = i18 + 2;
                            int i21 = ((bArr2[i19] & 255) << 8) | i20;
                            a14.b = i18 + 3;
                            long j14 = (((bArr2[r7] & 255) | i21) * 1000) + j11;
                            boolean z15 = false;
                            if (r12 == 0 && !dVar.e) {
                                byte[] bArr3 = new byte[a14.a()];
                                w wVar8 = new w(bArr3);
                                a14.c(0, a14.a(), bArr3);
                                g5.a a15 = g5.a.a(wVar8);
                                dVar.d = a15.b;
                                s0 s0Var4 = new s0();
                                s0Var4.o = MediaController.VIDEO_MIME_TYPE;
                                s0Var4.h = a15.f;
                                s0Var4.t = a15.c;
                                s0Var4.u = a15.d;
                                s0Var4.x = a15.e;
                                s0Var4.q = a15.a;
                                wVar6.b(new t0(s0Var4));
                                dVar.e = true;
                            } else if (r12 == 1 && dVar.e) {
                                int i22 = dVar.g == 1 ? 1 : 0;
                                if (dVar.f || i22 != 0) {
                                    byte[] bArr4 = wVar7.a;
                                    bArr4[0] = 0;
                                    bArr4[1] = 0;
                                    bArr4[2] = 0;
                                    int i23 = 4 - dVar.d;
                                    int i24 = 0;
                                    while (a14.a() > 0) {
                                        a14.c(i23, dVar.d, wVar7.a);
                                        wVar7.C(0);
                                        int u10 = wVar7.u();
                                        wVar5.C(0);
                                        wVar6.e(4, wVar5);
                                        wVar6.e(u10, a14);
                                        i24 = i24 + 4 + u10;
                                    }
                                    ((o3.w) dVar.a).c(j14, i22, i24, 0, null);
                                    dVar.f = true;
                                    z15 = true;
                                }
                            }
                            if (z15) {
                                z11 = true;
                            }
                        } else {
                            j12 = -9223372036854775807L;
                            i11 = 0;
                        }
                        z11 = false;
                    }
                    z10 = true;
                    if (!this.h) {
                        this.h = true;
                        this.i = cVar.b != j12 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z10) {
                    }
                } else {
                    j10 = this.m;
                }
                j11 = j10;
                i10 = this.k;
                if (i10 != 8) {
                }
                if (i10 == 9) {
                }
                j12 = -9223372036854775807L;
                i11 = 0;
                if (i10 == 18) {
                }
                ((h) lVar).t(this.l);
                z10 = false;
                z11 = false;
                if (!this.h) {
                }
                this.j = 4;
                this.g = 2;
                if (z10) {
                }
            }
        }
    }

    @Override // o3.k
    public final boolean e(l lVar) {
        w wVar = this.a;
        h hVar = (h) lVar;
        hVar.f(wVar.a, 0, 3, false);
        wVar.C(0);
        if (wVar.t() == 4607062) {
            hVar.f(wVar.a, 0, 2, false);
            wVar.C(0);
            if ((wVar.w() & MediaDataController.MAX_LINKS_COUNT) == 0) {
                hVar.f(wVar.a, 0, 4, false);
                wVar.C(0);
                int e10 = wVar.e();
                hVar.f = 0;
                hVar.b(e10, false);
                hVar.f(wVar.a, 0, 4, false);
                wVar.C(0);
                if (wVar.e() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // o3.k
    public final void i(m mVar) {
        this.f = mVar;
    }

    @Override // o3.k
    public final void release() {
    }
}

package v3;

import h5.w;
import j3.m0;
import j3.n0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kh.a2;
import l3.p0;
import o4.u0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.jb;
import r3.h;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.q;
import r3.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            wVar.D(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            wVar.F(0);
        }
        wVar.E(this.l);
        lVar.readFully(wVar.a, 0, this.l);
        return wVar;
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // r3.k
    public final void e(m mVar) {
        this.f = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0386 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0007 A[SYNTHETIC] */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(l lVar, jb jbVar) {
        long j10;
        long j11;
        int i10;
        long j12;
        int i11;
        boolean z4;
        boolean z10;
        h5.a.j(this.f);
        while (true) {
            int i12 = this.g;
            if (i12 == 1) {
                w wVar = this.b;
                if (!((h) lVar).d(wVar.a, 0, 9, true)) {
                    return -1;
                }
                wVar.F(0);
                wVar.G(4);
                int u10 = wVar.u();
                boolean z11 = (u10 & 4) != 0;
                boolean z12 = (u10 & 1) != 0;
                if (z11 && this.o == null) {
                    this.o = new a(this.f.c2(8, 1));
                }
                if (z12 && this.p == null) {
                    this.p = new d(this.f.c2(9, 2));
                }
                this.f.f1();
                this.j = wVar.g() - 5;
                this.g = 2;
            } else if (i12 == 2) {
                ((h) lVar).u(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i12 == 3) {
                w wVar2 = this.c;
                if (!((h) lVar).d(wVar2.a, 0, 11, true)) {
                    return -1;
                }
                wVar2.F(0);
                this.k = wVar2.u();
                this.l = wVar2.w();
                this.m = wVar2.w();
                this.m = ((wVar2.u() << 24) | this.m) * 1000;
                wVar2.G(3);
                this.g = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                boolean z13 = this.h;
                c cVar = this.e;
                if (z13) {
                    j10 = this.i + this.m;
                } else if (cVar.b == -9223372036854775807L) {
                    j11 = 0;
                    i10 = this.k;
                    if (i10 != 8 && this.o != null) {
                        if (!this.n) {
                            this.f.g2(new n(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        w a2 = a(lVar);
                        v vVar = (v) aVar.a;
                        if (aVar.b) {
                            a2.G(1);
                        } else {
                            int u11 = a2.u();
                            int i13 = (u11 >> 4) & 15;
                            aVar.d = i13;
                            if (i13 == 2) {
                                int i14 = a.e[(u11 >> 2) & 3];
                                m0 m0Var = new m0();
                                m0Var.o = "audio/mpeg";
                                m0Var.B = 1;
                                m0Var.C = i14;
                                vVar.b(new n0(m0Var));
                                aVar.c = true;
                            } else if (i13 == 7 || i13 == 8) {
                                String str = i13 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                m0 m0Var2 = new m0();
                                m0Var2.o = str;
                                m0Var2.B = 1;
                                m0Var2.C = 8000;
                                vVar.b(new n0(m0Var2));
                                aVar.c = true;
                            } else if (i13 != 10) {
                                throw new u0("Audio format not supported: " + aVar.d);
                            }
                            aVar.b = true;
                        }
                        v vVar2 = (v) aVar.a;
                        z10 = true;
                        if (aVar.d == 2) {
                            int a10 = a2.a();
                            vVar2.d(a10, a2);
                            ((v) aVar.a).c(j11, 1, a10, 0, null);
                        } else {
                            int u12 = a2.u();
                            if (u12 == 0 && !aVar.c) {
                                int a11 = a2.a();
                                byte[] bArr = new byte[a11];
                                a2.e(0, a11, bArr);
                                p0 h = l3.a.h(new h5.v(bArr, a11), false);
                                m0 m0Var3 = new m0();
                                m0Var3.o = MediaController.AUDIO_MIME_TYPE;
                                m0Var3.h = (String) h.c;
                                m0Var3.B = h.b;
                                m0Var3.C = h.a;
                                m0Var3.q = Collections.singletonList(bArr);
                                vVar2.b(new n0(m0Var3));
                                aVar.c = true;
                            } else if (aVar.d != 10 || u12 == 1) {
                                int a12 = a2.a();
                                vVar2.d(a12, a2);
                                ((v) aVar.a).c(j11, 1, a12, 0, null);
                            }
                            z10 = false;
                        }
                        j12 = -9223372036854775807L;
                        i11 = 0;
                    } else if (i10 == 9 || this.p == null) {
                        j12 = -9223372036854775807L;
                        i11 = 0;
                        if (i10 == 18 || this.n) {
                            ((h) lVar).u(this.l);
                            z4 = false;
                        } else {
                            w a13 = a(lVar);
                            cVar.getClass();
                            cVar.getClass();
                            if (a13.u() == 2 && "onMetaData".equals(c.N(a13)) && a13.a() != 0 && a13.u() == 8) {
                                HashMap M = c.M(a13);
                                Object obj = M.get("duration");
                                double d = 1000000.0d;
                                if (obj instanceof Double) {
                                    double doubleValue = ((Double) obj).doubleValue();
                                    if (doubleValue > 0.0d) {
                                        cVar.b = (long) (doubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = M.get("keyframes");
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
                                this.f.g2(new q(j13, cVar.d, cVar.c));
                                this.n = true;
                            }
                            z4 = true;
                        }
                        z10 = false;
                        if (!this.h && z10) {
                            this.h = true;
                            this.i = cVar.b != j12 ? -this.m : 0L;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (z4) {
                            return i11;
                        }
                    } else {
                        if (!this.n) {
                            this.f.g2(new n(-9223372036854775807L));
                            this.n = true;
                        }
                        d dVar = this.p;
                        w a14 = a(lVar);
                        dVar.getClass();
                        int u13 = a14.u();
                        int i16 = (u13 >> 4) & 15;
                        int i17 = u13 & 15;
                        if (i17 != 7) {
                            throw new u0(a2.j(i17, "Video format not supported: "));
                        }
                        dVar.g = i16;
                        if (i16 != 5) {
                            w wVar3 = dVar.b;
                            v vVar3 = (v) dVar.a;
                            w wVar4 = dVar.c;
                            int u14 = a14.u();
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
                            boolean z14 = false;
                            if (u14 == 0 && !dVar.e) {
                                byte[] bArr3 = new byte[a14.a()];
                                w wVar5 = new w(bArr3);
                                a14.e(0, a14.a(), bArr3);
                                i5.a a15 = i5.a.a(wVar5);
                                dVar.d = a15.b;
                                m0 m0Var4 = new m0();
                                m0Var4.o = MediaController.VIDEO_MIME_TYPE;
                                m0Var4.h = a15.i;
                                m0Var4.t = a15.c;
                                m0Var4.u = a15.d;
                                m0Var4.x = a15.h;
                                m0Var4.q = a15.a;
                                vVar3.b(new n0(m0Var4));
                                dVar.e = true;
                            } else if (u14 == 1 && dVar.e) {
                                int i22 = dVar.g == 1 ? 1 : 0;
                                if (dVar.f || i22 != 0) {
                                    byte[] bArr4 = wVar4.a;
                                    bArr4[0] = 0;
                                    bArr4[1] = 0;
                                    bArr4[2] = 0;
                                    int i23 = 4 - dVar.d;
                                    int i24 = 0;
                                    while (a14.a() > 0) {
                                        a14.e(i23, dVar.d, wVar4.a);
                                        wVar4.F(0);
                                        int x10 = wVar4.x();
                                        wVar3.F(0);
                                        vVar3.d(4, wVar3);
                                        vVar3.d(x10, a14);
                                        i24 = i24 + 4 + x10;
                                    }
                                    ((v) dVar.a).c(j14, i22, i24, 0, null);
                                    dVar.f = true;
                                    z14 = true;
                                }
                            }
                            if (z14) {
                                z10 = true;
                            }
                        } else {
                            j12 = -9223372036854775807L;
                            i11 = 0;
                        }
                        z10 = false;
                    }
                    z4 = true;
                    if (!this.h) {
                        this.h = true;
                        this.i = cVar.b != j12 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z4) {
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
                ((h) lVar).u(this.l);
                z4 = false;
                z10 = false;
                if (!this.h) {
                }
                this.j = 4;
                this.g = 2;
                if (z4) {
                }
            }
        }
    }

    @Override // r3.k
    public final boolean i(l lVar) {
        w wVar = this.a;
        h hVar = (h) lVar;
        hVar.h(wVar.a, 0, 3, false);
        wVar.F(0);
        if (wVar.w() == 4607062) {
            hVar.h(wVar.a, 0, 2, false);
            wVar.F(0);
            if ((wVar.z() & MediaDataController.MAX_LINKS_COUNT) == 0) {
                hVar.h(wVar.a, 0, 4, false);
                wVar.F(0);
                int g10 = wVar.g();
                hVar.f = 0;
                hVar.a(g10, false);
                hVar.h(wVar.a, 0, 4, false);
                wVar.F(0);
                if (wVar.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // r3.k
    public final void release() {
    }
}

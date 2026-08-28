package q3;

import d5.x;
import d5.y;
import h3.s0;
import h3.t0;
import j3.r0;
import j4.k1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m3.h;
import m3.j;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.r;
import m3.w;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements k {
    public final y a = new y(4);
    public final y b = new y(9);
    public final y c = new y(11);
    public final y d = new y();
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

    public final y a(l lVar) {
        int i9 = this.l;
        y yVar = this.d;
        byte[] bArr = yVar.a;
        if (i9 > bArr.length) {
            yVar.A(0, new byte[Math.max(bArr.length * 2, i9)]);
        } else {
            yVar.C(0);
        }
        yVar.B(this.l);
        lVar.readFully(yVar.a, 0, this.l);
        return yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0384 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x039c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0007 A[SYNTHETIC] */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        long j10;
        long j11;
        int i9;
        long j12;
        int i10;
        boolean z10;
        boolean z11;
        d5.a.j(this.f);
        while (true) {
            int i11 = this.g;
            if (i11 == 1) {
                y yVar = this.b;
                if (!((h) lVar).d(yVar.a, 0, 9, true)) {
                    return -1;
                }
                yVar.C(0);
                yVar.D(4);
                int r10 = yVar.r();
                boolean z12 = (r10 & 4) != 0;
                boolean z13 = (r10 & 1) != 0;
                if (z12 && this.o == null) {
                    this.o = new a(this.f.I(8, 1));
                }
                if (z13 && this.p == null) {
                    this.p = new d(this.f.I(9, 2));
                }
                this.f.B();
                this.j = yVar.e() - 5;
                this.g = 2;
            } else if (i11 == 2) {
                ((h) lVar).u(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i11 == 3) {
                y yVar2 = this.c;
                if (!((h) lVar).d(yVar2.a, 0, 11, true)) {
                    return -1;
                }
                yVar2.C(0);
                this.k = yVar2.r();
                this.l = yVar2.t();
                this.m = yVar2.t();
                this.m = ((yVar2.r() << 24) | this.m) * 1000;
                yVar2.D(3);
                this.g = 4;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                boolean z14 = this.h;
                c cVar = this.e;
                if (z14) {
                    j10 = this.i + this.m;
                } else if (cVar.b == -9223372036854775807L) {
                    j11 = 0;
                    i9 = this.k;
                    if (i9 != 8 && this.o != null) {
                        if (!this.n) {
                            this.f.y(new o(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        y a2 = a(lVar);
                        w wVar = (w) aVar.a;
                        if (aVar.b) {
                            a2.D(1);
                        } else {
                            int r11 = a2.r();
                            int i12 = (r11 >> 4) & 15;
                            aVar.d = i12;
                            if (i12 == 2) {
                                int i13 = a.e[(r11 >> 2) & 3];
                                s0 s0Var = new s0();
                                s0Var.o = "audio/mpeg";
                                s0Var.B = 1;
                                s0Var.C = i13;
                                wVar.c(new t0(s0Var));
                                aVar.c = true;
                            } else if (i12 == 7 || i12 == 8) {
                                String str = i12 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                s0 s0Var2 = new s0();
                                s0Var2.o = str;
                                s0Var2.B = 1;
                                s0Var2.C = 8000;
                                wVar.c(new t0(s0Var2));
                                aVar.c = true;
                            } else if (i12 != 10) {
                                throw new k1("Audio format not supported: " + aVar.d);
                            }
                            aVar.b = true;
                        }
                        w wVar2 = (w) aVar.a;
                        z11 = true;
                        if (aVar.d == 2) {
                            int a3 = a2.a();
                            wVar2.a(a3, a2);
                            ((w) aVar.a).e(j11, 1, a3, 0, null);
                        } else {
                            int r12 = a2.r();
                            if (r12 == 0 && !aVar.c) {
                                int a10 = a2.a();
                                byte[] bArr = new byte[a10];
                                a2.c(0, a10, bArr);
                                j3.a h = j3.b.h(new x(bArr, a10), false);
                                s0 s0Var3 = new s0();
                                s0Var3.o = MediaController.AUDIO_MIME_TYPE;
                                s0Var3.h = h.c;
                                s0Var3.B = h.b;
                                s0Var3.C = h.a;
                                s0Var3.q = Collections.singletonList(bArr);
                                wVar2.c(new t0(s0Var3));
                                aVar.c = true;
                            } else if (aVar.d != 10 || r12 == 1) {
                                int a11 = a2.a();
                                wVar2.a(a11, a2);
                                ((w) aVar.a).e(j11, 1, a11, 0, null);
                            }
                            z11 = false;
                        }
                        j12 = -9223372036854775807L;
                        i10 = 0;
                    } else if (i9 == 9 || this.p == null) {
                        j12 = -9223372036854775807L;
                        i10 = 0;
                        if (i9 == 18 || this.n) {
                            ((h) lVar).u(this.l);
                            z10 = false;
                        } else {
                            y a12 = a(lVar);
                            cVar.getClass();
                            cVar.getClass();
                            if (a12.r() == 2 && "onMetaData".equals(c.S(a12)) && a12.a() != 0 && a12.r() == 8) {
                                HashMap R = c.R(a12);
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
                                        int i14 = 0;
                                        while (i14 < size) {
                                            Object obj5 = list.get(i14);
                                            Object obj6 = list2.get(i14);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                cVar.c = new long[0];
                                                cVar.d = new long[0];
                                                break;
                                            }
                                            double d9 = d;
                                            cVar.c[i14] = (long) (((Double) obj6).doubleValue() * d9);
                                            cVar.d[i14] = ((Double) obj5).longValue();
                                            i14++;
                                            d = d9;
                                        }
                                    }
                                }
                            }
                            long j13 = cVar.b;
                            if (j13 != -9223372036854775807L) {
                                this.f.y(new r(j13, cVar.d, cVar.c));
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
                            return i10;
                        }
                    } else {
                        if (!this.n) {
                            this.f.y(new o(-9223372036854775807L));
                            this.n = true;
                        }
                        d dVar = this.p;
                        y a13 = a(lVar);
                        dVar.getClass();
                        int r13 = a13.r();
                        int i15 = (r13 >> 4) & 15;
                        int i16 = r13 & 15;
                        if (i16 != 7) {
                            throw new k1(r0.l(i16, "Video format not supported: "));
                        }
                        dVar.g = i15;
                        if (i15 != 5) {
                            y yVar3 = dVar.b;
                            w wVar3 = (w) dVar.a;
                            y yVar4 = dVar.c;
                            int r14 = a13.r();
                            byte[] bArr2 = a13.a;
                            j12 = -9223372036854775807L;
                            int i17 = a13.b;
                            int i18 = i17 + 1;
                            a13.b = i18;
                            int i19 = ((bArr2[i17] & 255) << 24) >> 8;
                            i10 = 0;
                            a13.b = i17 + 2;
                            int i20 = ((bArr2[i18] & 255) << 8) | i19;
                            a13.b = i17 + 3;
                            long j14 = (((bArr2[r7] & 255) | i20) * 1000) + j11;
                            boolean z15 = false;
                            if (r14 == 0 && !dVar.e) {
                                byte[] bArr3 = new byte[a13.a()];
                                y yVar5 = new y(bArr3);
                                a13.c(0, a13.a(), bArr3);
                                e5.a a14 = e5.a.a(yVar5);
                                dVar.d = a14.b;
                                s0 s0Var4 = new s0();
                                s0Var4.o = MediaController.VIDEO_MIME_TYPE;
                                s0Var4.h = a14.f;
                                s0Var4.t = a14.c;
                                s0Var4.u = a14.d;
                                s0Var4.x = a14.e;
                                s0Var4.q = a14.a;
                                wVar3.c(new t0(s0Var4));
                                dVar.e = true;
                            } else if (r14 == 1 && dVar.e) {
                                int i21 = dVar.g == 1 ? 1 : 0;
                                if (dVar.f || i21 != 0) {
                                    byte[] bArr4 = yVar4.a;
                                    bArr4[0] = 0;
                                    bArr4[1] = 0;
                                    bArr4[2] = 0;
                                    int i22 = 4 - dVar.d;
                                    int i23 = 0;
                                    while (a13.a() > 0) {
                                        a13.c(i22, dVar.d, yVar4.a);
                                        yVar4.C(0);
                                        int u10 = yVar4.u();
                                        yVar3.C(0);
                                        wVar3.a(4, yVar3);
                                        wVar3.a(u10, a13);
                                        i23 = i23 + 4 + u10;
                                    }
                                    ((w) dVar.a).e(j14, i21, i23, 0, null);
                                    dVar.f = true;
                                    z15 = true;
                                }
                            }
                            if (z15) {
                                z11 = true;
                            }
                        } else {
                            j12 = -9223372036854775807L;
                            i10 = 0;
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
                i9 = this.k;
                if (i9 != 8) {
                }
                if (i9 == 9) {
                }
                j12 = -9223372036854775807L;
                i10 = 0;
                if (i9 == 18) {
                }
                ((h) lVar).u(this.l);
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

    @Override // m3.k
    public final void c(m mVar) {
        this.f = mVar;
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        y yVar = this.a;
        h hVar = (h) lVar;
        hVar.g(yVar.a, 0, 3, false);
        yVar.C(0);
        if (yVar.t() == 4607062) {
            hVar.g(yVar.a, 0, 2, false);
            yVar.C(0);
            if ((yVar.w() & MediaDataController.MAX_LINKS_COUNT) == 0) {
                hVar.g(yVar.a, 0, 4, false);
                yVar.C(0);
                int e10 = yVar.e();
                hVar.f = 0;
                hVar.a(e10, false);
                hVar.g(yVar.a, 0, 4, false);
                yVar.C(0);
                if (yVar.e() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // m3.k
    public final void release() {
    }
}

package r3;

import d5.y;
import h3.s0;
import h3.t0;
import h3.t1;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.w;
import o8.l0;
import org.xmlpull.v1.XmlPullParserException;
import u3.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements k {
    public m b;
    public int c;
    public int d;
    public int e;
    public f4.b g;
    public l h;
    public f2.d i;
    public u3.l j;
    public final y a = new y(6);
    public long f = -1;

    public final void a() {
        d(new z3.b[0]);
        m mVar = this.b;
        mVar.getClass();
        mVar.B();
        this.b.y(new o(-9223372036854775807L));
        this.c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        String m10;
        f2.d dVar;
        l0 l0Var;
        int i9;
        f4.b bVar;
        long j10;
        int i10 = this.c;
        y yVar = this.a;
        if (i10 == 0) {
            yVar.z(2);
            ((h) lVar).d(yVar.a, 0, 2, false);
            int w8 = yVar.w();
            this.d = w8;
            if (w8 == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((w8 < 65488 || w8 > 65497) && w8 != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            yVar.z(2);
            ((h) lVar).d(yVar.a, 0, 2, false);
            this.e = yVar.w() - 2;
            this.c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || lVar != this.h) {
                    this.h = lVar;
                    this.i = new f2.d(lVar, this.f);
                }
                u3.l lVar2 = this.j;
                lVar2.getClass();
                int b10 = lVar2.b(this.i, nVar);
                if (b10 == 1) {
                    nVar.a += this.f;
                }
                return b10;
            }
            long j11 = ((h) lVar).d;
            long j12 = this.f;
            if (j11 != j12) {
                nVar.a = j12;
                return 1;
            }
            h hVar = (h) lVar;
            if (!hVar.g(yVar.a, 0, 1, true)) {
                a();
                return 0;
            }
            hVar.f = 0;
            if (this.j == null) {
                this.j = new u3.l(0);
            }
            f2.d dVar2 = new f2.d(lVar, this.f);
            this.i = dVar2;
            this.j.getClass();
            if (!j.i(dVar2, false, false)) {
                a();
                return 0;
            }
            u3.l lVar3 = this.j;
            long j13 = this.f;
            m mVar = this.b;
            mVar.getClass();
            lVar3.q = new f2.d(j13, mVar, 11);
            f4.b bVar2 = this.g;
            bVar2.getClass();
            d(bVar2);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            y yVar2 = new y(this.e);
            ((h) lVar).d(yVar2.a, 0, this.e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar2.m()) && (m10 = yVar2.m()) != null) {
                long j14 = ((h) lVar).c;
                if (j14 != -1) {
                    try {
                        dVar = d.a(m10);
                    } catch (t1 | NumberFormatException | XmlPullParserException e10) {
                        d5.a.L("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata", e10);
                        dVar = null;
                    }
                    if (dVar != null && (i9 = (l0Var = (l0) dVar.c).d) >= 2) {
                        int i11 = i9 - 1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        long j18 = -1;
                        boolean z10 = false;
                        while (i11 >= 0) {
                            b bVar3 = (b) l0Var.get(i11);
                            boolean equals = "video/mp4".equals(bVar3.a) | z10;
                            if (i11 == 0) {
                                j14 -= bVar3.d;
                                j10 = 0;
                            } else {
                                j10 = j14 - bVar3.c;
                            }
                            long j19 = j10;
                            long j20 = j14;
                            j14 = j19;
                            if (equals && j14 != j20) {
                                j18 = j20 - j14;
                                j17 = j14;
                                equals = false;
                            }
                            if (i11 == 0) {
                                j15 = j14;
                                j16 = j20;
                            }
                            i11--;
                            z10 = equals;
                        }
                        if (j17 != -1 && j18 != -1 && j15 != -1 && j16 != -1) {
                            bVar = new f4.b(j15, j16, dVar.b, j17, j18);
                            this.g = bVar;
                            if (bVar != null) {
                                this.f = bVar.d;
                            }
                        }
                    }
                }
                bVar = null;
                this.g = bVar;
                if (bVar != null) {
                }
            }
        } else {
            ((h) lVar).u(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.b = mVar;
    }

    public final void d(z3.b... bVarArr) {
        m mVar = this.b;
        mVar.getClass();
        w I = mVar.I(1024, 4);
        s0 s0Var = new s0();
        s0Var.n = "image/jpeg";
        s0Var.i = new z3.c(bVarArr);
        I.c(new t0(s0Var));
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        h hVar = (h) lVar;
        y yVar = this.a;
        yVar.z(2);
        hVar.g(yVar.a, 0, 2, false);
        if (yVar.w() == 65496) {
            yVar.z(2);
            hVar.g(yVar.a, 0, 2, false);
            int w8 = yVar.w();
            this.d = w8;
            if (w8 == 65504) {
                yVar.z(2);
                hVar.g(yVar.a, 0, 2, false);
                hVar.a(yVar.w() - 2, false);
                yVar.z(2);
                hVar.g(yVar.a, 0, 2, false);
                this.d = yVar.w();
            }
            if (this.d == 65505) {
                hVar.a(2, false);
                yVar.z(6);
                hVar.g(yVar.a, 0, 6, false);
                if (yVar.s() == 1165519206 && yVar.w() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            u3.l lVar = this.j;
            lVar.getClass();
            lVar.g(j10, j11);
        }
    }

    @Override // m3.k
    public final void release() {
        u3.l lVar = this.j;
        if (lVar != null) {
            lVar.getClass();
        }
    }
}

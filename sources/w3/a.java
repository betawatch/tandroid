package w3;

import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import org.telegram.ui.Components.jb;
import org.xmlpull.v1.XmlPullParserException;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.v;
import s8.i0;
import z3.j;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a implements k {
    public m b;
    public int c;
    public int d;
    public int e;
    public k4.b g;
    public l h;
    public f2.c i;
    public z3.m j;
    public final w a = new w(6);
    public long f = -1;

    public final void a() {
        b(new e4.b[0]);
        m mVar = this.b;
        mVar.getClass();
        mVar.f1();
        this.b.g2(new n(-9223372036854775807L));
        this.c = 6;
    }

    public final void b(e4.b... bVarArr) {
        m mVar = this.b;
        mVar.getClass();
        v c22 = mVar.c2(1024, 4);
        m0 m0Var = new m0();
        m0Var.n = "image/jpeg";
        m0Var.i = new e4.c(bVarArr);
        c22.b(new n0(m0Var));
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            z3.m mVar = this.j;
            mVar.getClass();
            mVar.d(j10, j11);
        }
    }

    @Override // r3.k
    public final void e(m mVar) {
        this.b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(l lVar, jb jbVar) {
        String p10;
        f2.c cVar;
        i0 i0Var;
        int i10;
        k4.b bVar;
        long j10;
        int i11 = this.c;
        w wVar = this.a;
        if (i11 == 0) {
            wVar.C(2);
            ((h) lVar).d(wVar.a, 0, 2, false);
            int z4 = wVar.z();
            this.d = z4;
            if (z4 == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((z4 < 65488 || z4 > 65497) && z4 != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i11 == 1) {
            wVar.C(2);
            ((h) lVar).d(wVar.a, 0, 2, false);
            this.e = wVar.z() - 2;
            this.c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || lVar != this.h) {
                    this.h = lVar;
                    this.i = new f2.c(lVar, this.f);
                }
                z3.m mVar = this.j;
                mVar.getClass();
                int h = mVar.h(this.i, jbVar);
                if (h == 1) {
                    jbVar.a += this.f;
                }
                return h;
            }
            long j11 = ((h) lVar).d;
            long j12 = this.f;
            if (j11 != j12) {
                jbVar.a = j12;
                return 1;
            }
            h hVar = (h) lVar;
            if (!hVar.h(wVar.a, 0, 1, true)) {
                a();
                return 0;
            }
            hVar.f = 0;
            if (this.j == null) {
                this.j = new z3.m(0);
            }
            f2.c cVar2 = new f2.c(lVar, this.f);
            this.i = cVar2;
            this.j.getClass();
            if (!j.j(cVar2, false, false)) {
                a();
                return 0;
            }
            z3.m mVar2 = this.j;
            long j13 = this.f;
            m mVar3 = this.b;
            mVar3.getClass();
            mVar2.q = new f2.c(j13, mVar3, 12);
            k4.b bVar2 = this.g;
            bVar2.getClass();
            b(bVar2);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            w wVar2 = new w(this.e);
            ((h) lVar).d(wVar2.a, 0, this.e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(wVar2.p()) && (p10 = wVar2.p()) != null) {
                long j14 = ((h) lVar).c;
                if (j14 != -1) {
                    try {
                        cVar = d.a(p10);
                    } catch (r1 | NumberFormatException | XmlPullParserException e) {
                        h5.a.L("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata", e);
                        cVar = null;
                    }
                    if (cVar != null && (i10 = (i0Var = (i0) cVar.c).d) >= 2) {
                        int i12 = i10 - 1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        long j18 = -1;
                        boolean z10 = false;
                        while (i12 >= 0) {
                            b bVar3 = (b) i0Var.get(i12);
                            boolean equals = "video/mp4".equals(bVar3.a) | z10;
                            if (i12 == 0) {
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
                            if (i12 == 0) {
                                j15 = j14;
                                j16 = j20;
                            }
                            i12--;
                            z10 = equals;
                        }
                        if (j17 != -1 && j18 != -1 && j15 != -1 && j16 != -1) {
                            bVar = new k4.b(j15, j16, cVar.b, j17, j18);
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

    @Override // r3.k
    public final boolean i(l lVar) {
        h hVar = (h) lVar;
        w wVar = this.a;
        wVar.C(2);
        hVar.h(wVar.a, 0, 2, false);
        if (wVar.z() == 65496) {
            wVar.C(2);
            hVar.h(wVar.a, 0, 2, false);
            int z4 = wVar.z();
            this.d = z4;
            if (z4 == 65504) {
                wVar.C(2);
                hVar.h(wVar.a, 0, 2, false);
                hVar.a(wVar.z() - 2, false);
                wVar.C(2);
                hVar.h(wVar.a, 0, 2, false);
                this.d = wVar.z();
            }
            if (this.d == 65505) {
                hVar.a(2, false);
                wVar.C(6);
                hVar.h(wVar.a, 0, 6, false);
                if (wVar.v() == 1165519206 && wVar.z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // r3.k
    public final void release() {
        z3.m mVar = this.j;
        if (mVar != null) {
            mVar.getClass();
        }
    }
}

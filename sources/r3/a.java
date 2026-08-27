package r3;

import d5.z;
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
import org.xmlpull.v1.XmlPullParserException;
import p8.l0;
import u3.j;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements k {
    public m b;
    public int c;
    public int d;
    public int e;
    public f4.b g;
    public l h;
    public f2.c i;
    public u3.m j;
    public final z a = new z(6);
    public long f = -1;

    public final void a() {
        d(new z3.b[0]);
        m mVar = this.b;
        mVar.getClass();
        mVar.A();
        this.b.n(new o(-9223372036854775807L));
        this.c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        String m10;
        f2.c cVar;
        l0 l0Var;
        int i10;
        f4.b bVar;
        long j10;
        int i11 = this.c;
        z zVar = this.a;
        if (i11 == 0) {
            zVar.z(2);
            ((h) lVar).d(zVar.a, 0, 2, false);
            int w10 = zVar.w();
            this.d = w10;
            if (w10 == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((w10 < 65488 || w10 > 65497) && w10 != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i11 == 1) {
            zVar.z(2);
            ((h) lVar).d(zVar.a, 0, 2, false);
            this.e = zVar.w() - 2;
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
                u3.m mVar = this.j;
                mVar.getClass();
                int b10 = mVar.b(this.i, nVar);
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
            if (!hVar.g(zVar.a, 0, 1, true)) {
                a();
                return 0;
            }
            hVar.f = 0;
            if (this.j == null) {
                this.j = new u3.m(0);
            }
            f2.c cVar2 = new f2.c(lVar, this.f);
            this.i = cVar2;
            this.j.getClass();
            if (!j.i(cVar2, false, false)) {
                a();
                return 0;
            }
            u3.m mVar2 = this.j;
            long j13 = this.f;
            m mVar3 = this.b;
            mVar3.getClass();
            mVar2.q = new f2.c(j13, mVar3, 11);
            f4.b bVar2 = this.g;
            bVar2.getClass();
            d(bVar2);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            z zVar2 = new z(this.e);
            ((h) lVar).d(zVar2.a, 0, this.e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(zVar2.m()) && (m10 = zVar2.m()) != null) {
                long j14 = ((h) lVar).c;
                if (j14 != -1) {
                    try {
                        cVar = d.a(m10);
                    } catch (t1 | NumberFormatException | XmlPullParserException e9) {
                        d5.a.L("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata", e9);
                        cVar = null;
                    }
                    if (cVar != null && (i10 = (l0Var = (l0) cVar.c).d) >= 2) {
                        int i12 = i10 - 1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        long j18 = -1;
                        boolean z10 = false;
                        while (i12 >= 0) {
                            b bVar3 = (b) l0Var.get(i12);
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
                            bVar = new f4.b(j15, j16, cVar.b, j17, j18);
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
            ((h) lVar).t(this.e);
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
        w C = mVar.C(1024, 4);
        s0 s0Var = new s0();
        s0Var.n = "image/jpeg";
        s0Var.i = new z3.c(bVarArr);
        C.c(new t0(s0Var));
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        h hVar = (h) lVar;
        z zVar = this.a;
        zVar.z(2);
        hVar.g(zVar.a, 0, 2, false);
        if (zVar.w() == 65496) {
            zVar.z(2);
            hVar.g(zVar.a, 0, 2, false);
            int w10 = zVar.w();
            this.d = w10;
            if (w10 == 65504) {
                zVar.z(2);
                hVar.g(zVar.a, 0, 2, false);
                hVar.a(zVar.w() - 2, false);
                zVar.z(2);
                hVar.g(zVar.a, 0, 2, false);
                this.d = zVar.w();
            }
            if (this.d == 65505) {
                hVar.a(2, false);
                zVar.z(6);
                hVar.g(zVar.a, 0, 6, false);
                if (zVar.s() == 1165519206 && zVar.w() == 0) {
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
            u3.m mVar = this.j;
            mVar.getClass();
            mVar.g(j10, j11);
        }
    }

    @Override // m3.k
    public final void release() {
        u3.m mVar = this.j;
        if (mVar != null) {
            mVar.getClass();
        }
    }
}

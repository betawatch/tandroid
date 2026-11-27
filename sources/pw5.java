// default package

import j$.util.Objects;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class pw5 implements e84 {
    public g84 b;
    public byte c;
    public int d;
    public int e;
    public nh7 g;
    public cb3 h;
    public zg2 i;
    public yh7 j;
    public final ey7 a = new ey7(2);
    public long f = -1;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
        String v;
        zg2 zg2Var;
        j99 j99Var;
        int i;
        nh7 nh7Var;
        long j;
        byte b = this.c;
        long j2 = -1;
        ey7 ey7Var = this.a;
        if (b == 0) {
            ey7Var.K(2);
            ((cb3) f84Var).c(ey7Var.a, 0, 2, false);
            int H = ey7Var.H();
            this.d = H;
            if (H == 65498) {
                if (this.f != -1) {
                    this.c = (byte) 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((H < 65488 || H > 65497) && H != 65281) {
                this.c = (byte) 1;
            }
            return 0;
        }
        if (b == 1) {
            ey7Var.K(2);
            ((cb3) f84Var).d(ey7Var.a, 0, 2, false);
            this.e = ey7Var.H() - 2;
            ((cb3) f84Var).l(2, false);
            this.c = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b != 4) {
                if (b != 5) {
                    if (b == 6) {
                        return -1;
                    }
                    grb.g();
                    return 0;
                }
                if (this.i == null || f84Var != this.h) {
                    cb3 cb3Var = (cb3) f84Var;
                    this.h = cb3Var;
                    this.i = new zg2(cb3Var, this.f);
                }
                yh7 yh7Var = this.j;
                yh7Var.getClass();
                int b2 = yh7Var.b(this.i, v11Var);
                if (b2 == 1) {
                    v11Var.a += this.f;
                }
                return b2;
            }
            long j3 = ((cb3) f84Var).d;
            long j4 = this.f;
            if (j3 != j4) {
                v11Var.a = j4;
                return 1;
            }
            cb3 cb3Var2 = (cb3) f84Var;
            if (!cb3Var2.d(ey7Var.a, 0, 1, true)) {
                g();
                return 0;
            }
            cb3Var2.f = 0;
            if (this.j == null) {
                this.j = new yh7(peb.B, 8);
            }
            zg2 zg2Var2 = new zg2(cb3Var2, this.f);
            this.i = zg2Var2;
            if (!this.j.c(zg2Var2)) {
                g();
                return 0;
            }
            yh7 yh7Var2 = this.j;
            long j5 = this.f;
            g84 g84Var = this.b;
            g84Var.getClass();
            yh7Var2.f(new zg2(j5, g84Var, (byte) 8));
            nh7 nh7Var2 = this.g;
            nh7Var2.getClass();
            g84 g84Var2 = this.b;
            g84Var2.getClass();
            x1c e0 = g84Var2.e0(1024, 4);
            jo4 jo4Var = new jo4();
            jo4Var.r = dg7.n("image/jpeg");
            jo4Var.l = new uf7(nh7Var2);
            xnb.v(jo4Var, e0);
            this.c = (byte) 5;
            return 0;
        }
        if (this.d == 65505) {
            ey7 ey7Var2 = new ey7(this.e);
            ((cb3) f84Var).c(ey7Var2.a, 0, this.e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(ey7Var2.v()) && (v = ey7Var2.v()) != null) {
                long j6 = ((cb3) f84Var).c;
                if (j6 != -1) {
                    try {
                        zg2Var = jid.a(v);
                    } catch (hy7 | NumberFormatException | XmlPullParserException unused) {
                        efd.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        zg2Var = null;
                    }
                    if (zg2Var != null && (i = (j99Var = (j99) zg2Var.c).d) >= 2) {
                        int i2 = i - 1;
                        long j7 = -1;
                        long j8 = -1;
                        long j9 = -1;
                        long j10 = -1;
                        while (i2 >= 0) {
                            mh7 mh7Var = (mh7) j99Var.get(i2);
                            String str = mh7Var.a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            long j11 = j2;
                            if (i2 == 0) {
                                j6 -= mh7Var.d;
                                j = 0;
                            } else {
                                j = j6 - mh7Var.c;
                            }
                            long j12 = j6;
                            j6 = j;
                            if (z && j6 != j12) {
                                j10 = j12 - j6;
                                j9 = j6;
                            }
                            if (i2 == 0) {
                                j8 = j12;
                                j7 = j6;
                            }
                            i2--;
                            j2 = j11;
                        }
                        long j13 = j2;
                        if (j9 != j13 && j10 != j13 && j7 != j13 && j8 != j13) {
                            nh7Var = new nh7(j7, j8, zg2Var.b, j9, j10);
                            this.g = nh7Var;
                            if (nh7Var != null) {
                                this.f = nh7Var.d;
                            }
                        }
                    }
                }
                nh7Var = null;
                this.g = nh7Var;
                if (nh7Var != null) {
                }
            }
        } else {
            ((cb3) f84Var).l(this.e, false);
        }
        this.c = (byte) 0;
        return 0;
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        String v;
        ey7 ey7Var = this.a;
        ey7Var.K(2);
        ((cb3) f84Var).d(ey7Var.a, 0, 2, false);
        if (ey7Var.H() == 65496) {
            while (true) {
                cb3 cb3Var = (cb3) f84Var;
                ey7Var.K(2);
                cb3Var.d(ey7Var.a, 0, 2, false);
                int H = ey7Var.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                ey7Var.K(2);
                cb3Var.d(ey7Var.a, 0, 2, false);
                int H2 = ey7Var.H() - 2;
                if (H2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    cb3Var.a(H2, false);
                } else {
                    ey7Var.K(H2);
                    cb3Var.d(ey7Var.a, 0, H2, false);
                    if (Objects.equals(ey7Var.v(), "http://ns.adobe.com/xap/1.0/") && (v = ey7Var.v()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (v.contains(jid.a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // e84
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = (byte) 0;
            this.j = null;
        } else if (this.c == 5) {
            yh7 yh7Var = this.j;
            yh7Var.getClass();
            yh7Var.d(j, j2);
        }
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.b = g84Var;
    }

    public final void g() {
        g84 g84Var = this.b;
        g84Var.getClass();
        g84Var.D();
        this.b.m0(new qc0(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override // e84
    public final void release() {
        yh7 yh7Var = this.j;
        if (yh7Var != null) {
            yh7Var.getClass();
        }
    }

    @Override // e84
    public final e84 a() {
        return this;
    }
}

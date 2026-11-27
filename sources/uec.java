// default package

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class uec {
    public final bn6 a;
    public final zec b;
    public final short c;
    public boolean d;
    public long g;
    public boolean i;
    public boolean l;
    public boolean m;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public vgb k = vgb.a;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public uec(Context context, bn6 bn6Var, long j) {
        this.a = bn6Var;
        this.c = (int) j;
        this.b = new zec(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ac, code lost:
    
        if (r18 > 100000) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00b7, code lost:
    
        if (r31 >= r35) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5, long j6, ry0 ry0Var) {
        long j7;
        boolean z3;
        long j8;
        long j9;
        long j10;
        long j11;
        float f;
        float f2;
        ry0Var.a = -9223372036854775807L;
        ry0Var.b = -9223372036854775807L;
        boolean z4 = this.d;
        if (z4 && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        long j12 = (long) ((j - j2) / this.j);
        if (z4) {
            this.k.getClass();
            j12 -= gcc.T(SystemClock.elapsedRealtime()) - j3;
        }
        ry0Var.a = j12;
        if (!z || z2) {
            if (this.l) {
                if (this.h == -9223372036854775807L || this.i) {
                    int i = this.e;
                    if (i != 0) {
                        if (i == 1) {
                            j7 = -9223372036854775807L;
                        } else if (i == 2) {
                            j7 = -9223372036854775807L;
                        } else {
                            if (i != 3) {
                                grb.g();
                                return 0;
                            }
                            this.k.getClass();
                            j7 = -9223372036854775807L;
                            long T = gcc.T(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j13 = this.f;
                                if (j13 != -9223372036854775807L) {
                                    if (j13 != j2) {
                                        if (j12 < -30000) {
                                        }
                                    }
                                }
                            }
                            z3 = false;
                        }
                        z3 = true;
                    } else {
                        j7 = -9223372036854775807L;
                        z3 = this.d;
                    }
                } else {
                    z3 = false;
                    j7 = -9223372036854775807L;
                }
                if (z3) {
                    return 0;
                }
                if (!this.d || j2 == this.f) {
                    return 5;
                }
                this.k.getClass();
                long nanoTime = System.nanoTime();
                zec zecVar = this.b;
                long j14 = (ry0Var.a * 1000) + nanoTime;
                long j15 = zecVar.n;
                if (j != j15) {
                    zecVar.o = zecVar.l;
                    zecVar.p = zecVar.m;
                    zecVar.q = j15;
                    zecVar.j = zecVar.k;
                }
                long j16 = zecVar.o;
                if (j16 != -1) {
                    if (j5 != j7) {
                        f = (j6 - j16) * j5;
                        f2 = zecVar.h;
                    } else {
                        f = (j - zecVar.q) * 1000;
                        f2 = zecVar.h;
                    }
                    long j17 = zecVar.p + ((long) (f / f2));
                    if (Math.abs(j14 - j17) <= 20000000) {
                        j14 = j17;
                    } else {
                        zecVar.b();
                    }
                }
                zecVar.l = j6;
                zecVar.m = j14;
                zecVar.n = j;
                wec wecVar = zecVar.c;
                if (wecVar != null) {
                    long j18 = wecVar.c;
                    long j19 = zecVar.c.d;
                    if (j18 != j7 && j19 != j7) {
                        long j20 = (((j14 - j18) / j19) * j19) + j18;
                        if (j14 <= j20) {
                            j8 = j20 - j19;
                        } else {
                            j20 += j19;
                            j8 = j20;
                        }
                        long j21 = j20 - j14;
                        long j22 = j14 - j8;
                        long abs = Math.abs(j21 - j22);
                        if (abs < j19 / 2) {
                            j10 = j19;
                            long j23 = j10 / 4;
                            j9 = j8;
                            if (abs < j23) {
                                j11 = zecVar.j;
                                if (j11 != 0) {
                                    zecVar.k = j11;
                                } else {
                                    if (j21 < j22) {
                                        j23 = -j23;
                                    }
                                    zecVar.k = j23;
                                    j11 = j23;
                                }
                            } else {
                                j11 = 0;
                                zecVar.k = 0L;
                            }
                        } else {
                            j9 = j8;
                            j10 = j19;
                            j11 = zecVar.j;
                            zecVar.k = j11;
                        }
                        if (j21 + j11 >= j22) {
                            j20 = j9;
                        }
                        j14 = j20 - ((j10 * 80) / 100);
                    }
                }
                ry0Var.b = j14;
                long j24 = (j14 - nanoTime) / 1000;
                ry0Var.a = j24;
                boolean z5 = (this.h == j7 || this.i) ? false : true;
                if (this.a.U0(j24, j2, z2, z5)) {
                    return 4;
                }
                long j25 = ry0Var.a;
                return (j25 >= -30000 || z2) ? j25 <= 50000 ? 1 : 5 : z5 ? 3 : 2;
            }
            if (this.a.U0(j12, j2, z2, true)) {
                return 4;
            }
            if (!this.d || ry0Var.a >= 30000) {
                this.m = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.m && !this.l))) {
            this.h = -9223372036854775807L;
            return true;
        }
        if (this.h == -9223372036854775807L) {
            return false;
        }
        this.k.getClass();
        if (SystemClock.elapsedRealtime() < this.h) {
            return true;
        }
        this.h = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long j;
        this.i = z;
        long j2 = this.c;
        if (j2 > 0) {
            this.k.getClass();
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.h = j;
    }

    public final void d() {
        this.d = true;
        this.k.getClass();
        this.g = gcc.T(SystemClock.elapsedRealtime());
        zec zecVar = this.b;
        zecVar.d = true;
        zecVar.b();
        if (!zecVar.b) {
            DisplayManager displayManager = (DisplayManager) zecVar.a.getSystemService("display");
            wec wecVar = null;
            if (displayManager != null) {
                try {
                    Choreographer choreographer = Choreographer.getInstance();
                    wecVar = Build.VERSION.SDK_INT >= 33 ? new yec(choreographer, displayManager) : new xec(choreographer, displayManager);
                } catch (RuntimeException e) {
                    efd.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            zecVar.c = wecVar;
            zecVar.b = true;
        }
        wec wecVar2 = zecVar.c;
        if (wecVar2 != null) {
            wecVar2.a();
        }
        zecVar.c(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                grb.g();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(Surface surface) {
        this.l = surface != null;
        this.m = false;
        zec zecVar = this.b;
        if (zecVar.e != surface) {
            zecVar.a();
            zecVar.e = surface;
            zecVar.c(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void g(float f) {
        yve.f(f > 0.0f);
        if (f == this.j) {
            return;
        }
        this.j = f;
        zec zecVar = this.b;
        zecVar.h = f;
        zecVar.c(false);
    }
}

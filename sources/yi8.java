// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yi8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zi8 b;

    public /* synthetic */ yi8(zi8 zi8Var, byte b) {
        this.a = b;
        this.b = zi8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        zi8 zi8Var = this.b;
        switch (b) {
            case 0:
            case 1:
                zi8Var.r();
                break;
            case 2:
                zi8Var.m(0L);
                break;
            case 3:
                yi8 yi8Var = zi8Var.L;
                lbc lbcVar = zi8Var.e;
                if (lbcVar != null && zi8Var.G != null) {
                    long S = lbcVar.S();
                    if (zi8Var.getDuration() > 1) {
                        float duration = S / zi8Var.getDuration();
                        if (!zi8Var.G.n1) {
                            f4b f4bVar = zi8Var.d;
                            if ((duration < f4bVar.Z || duration > f4bVar.a0) && System.currentTimeMillis() - zi8Var.K > 500) {
                                zi8Var.K = System.currentTimeMillis();
                                lbc lbcVar2 = zi8Var.e;
                                S = (long) (zi8Var.d.Z * zi8Var.getDuration());
                                lbcVar2.p0(S, false);
                                zi8Var.w(true);
                                zi8Var.y(true);
                                zi8Var.G.setProgress(zi8Var.e.S());
                            }
                        }
                        zi8Var.w(S < zi8Var.J);
                        zi8Var.y(S < zi8Var.J);
                        zi8Var.G.setProgress(zi8Var.e.S());
                    } else {
                        zi8Var.G.setProgress(zi8Var.e.S());
                    }
                    if (zi8Var.e.c0()) {
                        gl.r(yi8Var);
                        gl.e3(yi8Var, (long) (1000.0f / gl.r));
                    }
                    zi8Var.J = S;
                    break;
                }
                break;
            case 4:
                yi8 yi8Var2 = zi8Var.M;
                if (zi8Var.E != null && zi8Var.e == null && zi8Var.y == null && zi8Var.G != null && !zi8Var.i()) {
                    long S2 = zi8Var.E.S();
                    f4b f4bVar2 = zi8Var.d;
                    if (f4bVar2 != null) {
                        float f = S2;
                        float f2 = f4bVar2.E;
                        float f3 = f4bVar2.C;
                        if ((f < f2 * f3 || f > f4bVar2.F * f3) && System.currentTimeMillis() - zi8Var.K > 500) {
                            zi8Var.K = System.currentTimeMillis();
                            lbc lbcVar3 = zi8Var.E;
                            S2 = (long) (zi8Var.d.E * r3.C);
                            lbcVar3.p0(S2, false);
                        }
                    }
                    zi8Var.G.setProgress(S2);
                    if (zi8Var.E.c0()) {
                        gl.r(yi8Var2);
                        gl.e3(yi8Var2, (long) (1000.0f / gl.r));
                        break;
                    }
                }
                break;
            case 5:
                yi8 yi8Var3 = zi8Var.N;
                if (zi8Var.y != null && zi8Var.e == null && !zi8Var.i() && zi8Var.G != null) {
                    long S3 = zi8Var.y.S();
                    f4b f4bVar3 = zi8Var.d;
                    if (f4bVar3 != null) {
                        float f4 = S3;
                        float f5 = f4bVar3.s0;
                        float f6 = f4bVar3.q0;
                        if ((f4 < f5 * f6 || f4 > f4bVar3.t0 * f6) && System.currentTimeMillis() - zi8Var.K > 500) {
                            zi8Var.K = System.currentTimeMillis();
                            lbc lbcVar4 = zi8Var.y;
                            S3 = (long) (zi8Var.d.s0 * r4.q0);
                            lbcVar4.p0(S3, false);
                            zi8Var.w(true);
                        }
                    }
                    zi8Var.G.setProgress(S3);
                    if (zi8Var.y.c0()) {
                        gl.r(yi8Var3);
                        gl.e3(yi8Var3, (long) (1000.0f / gl.r));
                        break;
                    }
                }
                break;
            default:
                kac kacVar = zi8Var.n;
                if (kacVar != null) {
                    td4 td4Var = kacVar.b;
                    if (td4Var != null) {
                        td4Var.postRunnable(new rd4(td4Var, b2));
                    }
                    kacVar.a = null;
                    zi8Var.removeView(zi8Var.n);
                    zi8Var.n = null;
                    break;
                }
                break;
        }
    }
}

// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qkc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hmc b;

    public /* synthetic */ qkc(hmc hmcVar, byte b) {
        this.a = b;
        this.b = hmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t05 t05Var;
        byte b = this.a;
        hmc hmcVar = this.b;
        switch (b) {
            case 0:
                koc kocVar = hmcVar.k0;
                if (kocVar != null && (t05Var = hmcVar.H0) != null) {
                    kocVar.Y(t05Var);
                }
                t05 t05Var2 = hmcVar.H0;
                boolean z = (t05Var2 == null || t05Var2.a.isEmpty()) ? false : true;
                if (hmcVar.g0 != z) {
                    hmcVar.O0(z);
                }
                if (z && hmcVar.I0) {
                    zoc zocVar = hmcVar.j0;
                    if (zocVar != null) {
                        zocVar.b(false);
                    }
                    if (hmcVar.g0) {
                        hmcVar.I0 = false;
                        hmcVar.f0 = 1;
                        vq1 vq1Var = hmcVar.s0;
                        if (vq1Var != null) {
                            vq1Var.setPosition(1);
                        }
                    } else {
                        hmcVar.I0 = true;
                    }
                }
                va vaVar = hmcVar.a;
                if (vaVar != null && vaVar.g3 != null) {
                    hmcVar.b1(true);
                    break;
                }
                break;
            case 1:
                hmcVar.h0(false);
                break;
            case 2:
                hmcVar.G0();
                break;
            case 3:
                hmcVar.F0();
                break;
            case 4:
                if (hmcVar.S.isAttachedToWindow()) {
                    if (!hmcVar.a.canScrollVertically(-1)) {
                        hmcVar.a.f3.g1(0, 0);
                    }
                    hmcVar.S.requestLayout();
                    break;
                }
                break;
            case 5:
                hmcVar.i0();
                break;
            case 6:
                hmcVar.X0();
                break;
            case 7:
                hmcVar.Q0 = null;
                break;
            case 8:
                hmcVar.S.post(new qkc(hmcVar, (byte) 4));
                break;
            case 9:
                u21.b0(hmcVar).N(k96.M0(2131745669, null), k96.M0(2131751093, null)).j();
                break;
            case 10:
                hmcVar.y0();
                break;
            case 11:
                hmcVar.presentFragment(new toc());
                break;
            case 12:
                hmcVar.presentFragment(new ydb());
                break;
            case 13:
                hmcVar.F0();
                break;
            default:
                hmcVar.F0();
                break;
        }
    }
}

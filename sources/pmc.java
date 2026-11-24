// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class pmc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goc b;

    public /* synthetic */ pmc(goc gocVar, byte b) {
        this.a = b;
        this.b = gocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t25 t25Var;
        byte b = this.a;
        goc gocVar = this.b;
        switch (b) {
            case 0:
                mqc mqcVar = gocVar.k0;
                if (mqcVar != null && (t25Var = gocVar.H0) != null) {
                    mqcVar.Y(t25Var);
                }
                t25 t25Var2 = gocVar.H0;
                boolean z = (t25Var2 == null || t25Var2.a.isEmpty()) ? false : true;
                if (gocVar.g0 != z) {
                    gocVar.P0(z);
                }
                if (z && gocVar.I0) {
                    brc brcVar = gocVar.j0;
                    if (brcVar != null) {
                        brcVar.b(false);
                    }
                    if (gocVar.g0) {
                        gocVar.I0 = false;
                        gocVar.f0 = 1;
                        hs1 hs1Var = gocVar.s0;
                        if (hs1Var != null) {
                            hs1Var.setPosition(1);
                        }
                    } else {
                        gocVar.I0 = true;
                    }
                }
                va vaVar = gocVar.a;
                if (vaVar != null && vaVar.g3 != null) {
                    gocVar.c1(true);
                    break;
                }
                break;
            case 1:
                gocVar.i0(false);
                break;
            case 2:
                gocVar.H0();
                break;
            case 3:
                gocVar.G0();
                break;
            case 4:
                if (gocVar.S.isAttachedToWindow()) {
                    if (!gocVar.a.canScrollVertically(-1)) {
                        gocVar.a.f3.g1(0, 0);
                    }
                    gocVar.S.requestLayout();
                    break;
                }
                break;
            case 5:
                gocVar.j0();
                break;
            case 6:
                gocVar.Y0();
                break;
            case 7:
                gocVar.Q0 = null;
                break;
            case 8:
                gocVar.S.post(new pmc(gocVar, (byte) 4));
                break;
            case 9:
                c41.b0(gocVar).N(jb6.M0(2131745595, null), jb6.M0(2131751042, null)).j();
                break;
            case 10:
                gocVar.z0();
                break;
            case 11:
                gocVar.presentFragment(new vqc());
                break;
            case 12:
                gocVar.presentFragment(new yfb());
                break;
            case 13:
                gocVar.G0();
                break;
            default:
                gocVar.G0();
                break;
        }
    }
}

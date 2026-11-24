// default package

import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yu extends kxe {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ yu(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // kxe
    public final void a(boolean z) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                if (z) {
                    oVar.i0.h(false);
                    break;
                }
                break;
            default:
                my0 my0Var = oVar.J;
                if (my0Var != null) {
                    my0Var.E0 = z;
                    break;
                }
                break;
        }
    }

    @Override // kxe
    public final void b() {
        switch (this.a) {
            case 0:
                if (gm.C3()) {
                    new c41(this.b.h0, null).i(jb6.M0(2131743879, null)).j();
                    break;
                }
                break;
        }
    }
}

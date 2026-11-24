// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xba extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tca b;

    public /* synthetic */ xba(tca tcaVar, byte b) {
        this.a = b;
        this.b = tcaVar;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        y21 y21Var;
        byte b = this.a;
        tca tcaVar = this.b;
        switch (b) {
            case 0:
                if (i2 != 0) {
                    tcaVar.U0();
                    tcaVar.l2 = tcaVar.k2;
                }
                u31 u31Var = u31.x;
                if (u31Var != null && (y21Var = u31Var.e) != null && (y21Var.getParent() instanceof View) && ((View) u31.x.e.getParent()).getParent() == tcaVar.w1) {
                    u31.e();
                    break;
                }
                break;
            case 1:
                if (i2 != 0) {
                    tcaVar.U0();
                    tcaVar.l2 = tcaVar.k2;
                    break;
                }
                break;
            default:
                if (i2 != 0) {
                    tcaVar.U0();
                    tcaVar.l2 = tcaVar.k2;
                    break;
                }
                break;
        }
    }
}

// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y91 extends FragmentContextView {
    public final /* synthetic */ byte X0 = 0;
    public final /* synthetic */ d Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(sxb sxbVar, Context context, sxb sxbVar2) {
        super(context, sxbVar2, null, false, null);
        this.Y0 = sxbVar;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        byte b = this.X0;
        d dVar = this.Y0;
        switch (b) {
            case 0:
                ia1 ia1Var = (ia1) dVar;
                ia1Var.I.j(ia1Var.J, i == 0, true);
                break;
            default:
                sxb sxbVar = (sxb) dVar;
                sxbVar.V0.j(sxbVar.G0, i == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(ia1 ia1Var, Context context, ia1 ia1Var2, w91 w91Var, ylb ylbVar) {
        super(context, ia1Var2, w91Var, false, ylbVar);
        this.Y0 = ia1Var;
    }
}

// default package

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x95 extends t95 {
    public final /* synthetic */ aa5 h;

    public x95(aa5 aa5Var) {
        this.h = aa5Var;
        this.e = -1;
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        s95 s95Var = new s95(viewGroup.getContext());
        s95Var.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
        r95 r95Var = new r95(s95Var);
        aa5 aa5Var = this.h;
        View view = aa5Var.X0;
        RenderNode renderNode = aa5Var.V0;
        float f = aa5Var.W0;
        s95 s95Var2 = r95Var.v;
        s95Var2.H = view;
        s95Var2.F = renderNode;
        s95Var2.G = f;
        s95Var2.setDelegate(aa5Var.Z0);
        return r95Var;
    }
}

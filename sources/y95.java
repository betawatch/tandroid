// default package

import android.view.View;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y95 extends sc3 {
    public final /* synthetic */ aa5 F;

    public y95(aa5 aa5Var) {
        this.F = aa5Var;
    }

    @Override // sc3
    public final float A(View view) {
        return 0.6f;
    }

    @Override // jka
    public final void w(u69 u69Var) {
        k39 k39Var;
        z95 z95Var;
        aa5 aa5Var = this.F;
        x95 x95Var = aa5Var.T0;
        int b = u69Var.b();
        List list = x95Var.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b >= 0 && b < list.size()) {
            groupCallMessage = (GroupCallMessage) x95Var.c.get(b);
        }
        if (groupCallMessage == null || (k39Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = u69Var.a;
        if (!(view instanceof s95) || (z95Var = aa5Var.Y0) == null) {
            return;
        }
        g95 g95Var = ((j75) z95Var).a;
        g39 g39Var = new g39(g95Var.getContext(), null, g95Var.D1, (s95) view, null, 0.0f, 0.0f, k39Var, g95Var.a, 1, false);
        g39.B = g39Var;
        d39 d39Var = g39Var.i;
        d39Var.setTag(R.id.parent_tag, 1);
        g95Var.c.addView(d39Var);
        g39Var.s = true;
        g39Var.y = System.currentTimeMillis();
    }
}

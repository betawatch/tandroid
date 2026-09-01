package zg;

import android.content.Context;
import android.view.View;
import f2.l;
import f2.m1;
import java.util.List;
import ng.m0;
import ng.q0;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.c40;
import org.telegram.ui.d60;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f extends l {
    public final /* synthetic */ h F;

    public f(h hVar) {
        this.F = hVar;
    }

    @Override // f2.l
    public final float A(View view) {
        return 0.6f;
    }

    @Override // f2.p1
    public final void w(m1 m1Var) {
        q0 q0Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.R0;
        int b10 = m1Var.b();
        List list = eVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.c.get(b10);
        }
        if (groupCallMessage == null || (q0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = m1Var.a;
        if (!(view instanceof c) || (gVar = hVar.W0) == null) {
            return;
        }
        d60 d60Var = ((c40) gVar).a;
        Context context = d60Var.getContext();
        rk0 rk0Var = d60Var.H;
        i10 = ((h3) d60Var).currentAccount;
        m0 m0Var = new m0(context, null, rk0Var, (c) view, null, 0.0f, 0.0f, q0Var, i10, 1, false);
        m0.B = m0Var;
        m0Var.i.setTag(R.id.parent_tag, 1);
        d60Var.container.addView(m0Var.i);
        m0Var.s = true;
        m0Var.y = System.currentTimeMillis();
    }
}

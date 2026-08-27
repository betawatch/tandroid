package ug;

import android.content.Context;
import android.view.View;
import f2.l;
import f2.o1;
import ig.m0;
import ig.q0;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.p30;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g extends l {
    public final /* synthetic */ i F;

    public g(i iVar) {
        this.F = iVar;
    }

    @Override // f2.l
    public final float A(View view) {
        return 0.6f;
    }

    @Override // f2.r1
    public final void w(o1 o1Var) {
        q0 q0Var;
        h hVar;
        int i10;
        i iVar = this.F;
        f fVar = iVar.Q0;
        int b10 = o1Var.b();
        List list = fVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) fVar.c.get(b10);
        }
        if (groupCallMessage == null || (q0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = o1Var.a;
        if (!(view instanceof d) || (hVar = iVar.V0) == null) {
            return;
        }
        s50 s50Var = ((p30) hVar).a;
        Context context = s50Var.getContext();
        wj0 wj0Var = s50Var.G;
        i10 = ((e3) s50Var).currentAccount;
        m0 m0Var = new m0(context, null, wj0Var, (d) view, null, 0.0f, 0.0f, q0Var, i10, 1, false);
        m0.B = m0Var;
        m0Var.i.setTag(R.id.parent_tag, 1);
        s50Var.container.addView(m0Var.i);
        m0Var.s = true;
        m0Var.y = System.currentTimeMillis();
    }
}

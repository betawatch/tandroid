package wg;

import android.content.Context;
import android.view.View;
import f2.l;
import f2.n1;
import java.util.List;
import kg.m0;
import kg.q0;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.p30;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // f2.q1
    public final void w(n1 n1Var) {
        q0 q0Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.Q0;
        int b10 = n1Var.b();
        List list = eVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.c.get(b10);
        }
        if (groupCallMessage == null || (q0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = n1Var.a;
        if (!(view instanceof c) || (gVar = hVar.V0) == null) {
            return;
        }
        r50 r50Var = ((p30) gVar).a;
        Context context = r50Var.getContext();
        fk0 fk0Var = r50Var.G;
        i10 = ((f3) r50Var).currentAccount;
        m0 m0Var = new m0(context, null, fk0Var, (c) view, null, 0.0f, 0.0f, q0Var, i10, 1, false);
        m0.B = m0Var;
        m0Var.i.setTag(R.id.parent_tag, 1);
        r50Var.container.addView(m0Var.i);
        m0Var.s = true;
        m0Var.y = System.currentTimeMillis();
    }
}

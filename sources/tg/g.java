package tg;

import android.content.Context;
import android.view.View;
import f2.n;
import f2.q1;
import hg.n0;
import hg.r0;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.m30;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends n {
    public final /* synthetic */ i F;

    public g(i iVar) {
        this.F = iVar;
    }

    @Override // f2.n
    public final float A(View view) {
        return 0.6f;
    }

    @Override // f2.t1
    public final void w(q1 q1Var) {
        r0 r0Var;
        h hVar;
        int i9;
        i iVar = this.F;
        f fVar = iVar.Q0;
        int b10 = q1Var.b();
        List list = fVar.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) fVar.c.get(b10);
        }
        if (groupCallMessage == null || (r0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = q1Var.a;
        if (!(view instanceof d) || (hVar = iVar.V0) == null) {
            return;
        }
        o50 o50Var = ((m30) hVar).a;
        Context context = o50Var.getContext();
        uj0 uj0Var = o50Var.G;
        i9 = ((f3) o50Var).currentAccount;
        n0 n0Var = new n0(context, null, uj0Var, (d) view, null, 0.0f, 0.0f, r0Var, i9, 1, false);
        n0.B = n0Var;
        n0Var.i.setTag(R.id.parent_tag, 1);
        o50Var.container.addView(n0Var.i);
        n0Var.s = true;
        n0Var.y = System.currentTimeMillis();
    }
}

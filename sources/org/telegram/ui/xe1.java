package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xe1 extends s4.v {
    public boolean d;
    public final /* synthetic */ ye1 e;

    public xe1(ye1 ye1Var) {
        this.e = ye1Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = b1Var.b();
        if (b10 >= 0) {
            ye1 ye1Var = this.e;
            if (b10 < ye1Var.b.size() && ((oe1) ye1Var.b.get(b10)).c != null && ChatObject.canManageTopics(ye1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((oe1) ye1Var.b.get(b10)).c;
                if (ye1Var.a0.isEmpty()) {
                    View view = b1Var.a;
                    if ((view instanceof ue1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((ue1) view).setSliding(true);
                        return s4.v.l(0, 4);
                    }
                }
                return !tL_forumTopic.pinned ? l4 : s4.v.l(3, 0);
            }
        }
        return l4;
    }

    @Override // s4.v
    public final boolean k() {
        return !this.e.a0.isEmpty();
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10;
        ye1 ye1Var = this.e;
        ArrayList arrayList = ye1Var.b;
        if (b1Var.f != b1Var2.f || (b10 = b1Var2.b()) < 0 || b10 >= arrayList.size() || ((oe1) arrayList.get(b10)).c == null || !((oe1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        me1 me1Var = ye1Var.r;
        int b11 = b1Var.b();
        int b12 = b1Var2.b();
        ye1 ye1Var2 = me1Var.d;
        ArrayList arrayList2 = ye1Var2.b;
        arrayList2.add(b12, (oe1) arrayList2.remove(b11));
        s4.l0 itemAnimator = ye1Var2.N.getItemAnimator();
        ke1 ke1Var = ye1Var2.I0;
        if (itemAnimator != ke1Var) {
            ye1Var2.N.setItemAnimator(ke1Var);
        }
        me1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        ye1 ye1Var = this.e;
        if (i10 != 0) {
            ye1Var.N.I0(false);
            b1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = ye1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((oe1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        ye1Var.getMessagesController().getTopicsController().reorderPinnedTopics(ye1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
        if (b1Var != null) {
            ue1 ue1Var = (ue1) b1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = ue1Var.N;
            ye1 ye1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = ye1Var.getMessagesController().getTopicsController();
                long j10 = ye1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = ue1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            ye1Var.c1 = ue1Var;
            ie1 ie1Var = ye1Var.N;
            boolean z10 = !ue1Var.N.hidden;
            int i10 = we1.i3;
            ie1Var.F1(z10, ue1Var);
            ye1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = ue1Var.c5;
            if (tL_forumTopic3 != null) {
                ue1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

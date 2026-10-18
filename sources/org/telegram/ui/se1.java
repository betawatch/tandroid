package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class se1 extends s4.v {
    public boolean d;
    public final /* synthetic */ te1 e;

    public se1(te1 te1Var) {
        this.e = te1Var;
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
            te1 te1Var = this.e;
            if (b10 < te1Var.b.size() && ((ke1) te1Var.b.get(b10)).c != null && ChatObject.canManageTopics(te1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ke1) te1Var.b.get(b10)).c;
                if (te1Var.a0.isEmpty()) {
                    View view = b1Var.a;
                    if ((view instanceof qe1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((qe1) view).setSliding(true);
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
        te1 te1Var = this.e;
        ArrayList arrayList = te1Var.b;
        if (b1Var.f != b1Var2.f || (b10 = b1Var2.b()) < 0 || b10 >= arrayList.size() || ((ke1) arrayList.get(b10)).c == null || !((ke1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        ie1 ie1Var = te1Var.r;
        int b11 = b1Var.b();
        int b12 = b1Var2.b();
        te1 te1Var2 = ie1Var.d;
        ArrayList arrayList2 = te1Var2.b;
        arrayList2.add(b12, (ke1) arrayList2.remove(b11));
        s4.l0 itemAnimator = te1Var2.N.getItemAnimator();
        ge1 ge1Var = te1Var2.I0;
        if (itemAnimator != ge1Var) {
            te1Var2.N.setItemAnimator(ge1Var);
        }
        ie1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        te1 te1Var = this.e;
        if (i10 != 0) {
            te1Var.N.I0(false);
            b1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = te1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ke1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        te1Var.getMessagesController().getTopicsController().reorderPinnedTopics(te1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
        if (b1Var != null) {
            qe1 qe1Var = (qe1) b1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = qe1Var.N;
            te1 te1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = te1Var.getMessagesController().getTopicsController();
                long j10 = te1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = qe1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            te1Var.b1 = qe1Var;
            ee1 ee1Var = te1Var.N;
            boolean z10 = !qe1Var.N.hidden;
            int i10 = re1.f3;
            ee1Var.A1(z10, qe1Var);
            te1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = qe1Var.c5;
            if (tL_forumTopic3 != null) {
                qe1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

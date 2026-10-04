package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class xf1 extends s4.v {
    public boolean d;
    public final /* synthetic */ yf1 e;

    public xf1(yf1 yf1Var) {
        this.e = yf1Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0) {
            yf1 yf1Var = this.e;
            if (b10 < yf1Var.b.size() && ((pf1) yf1Var.b.get(b10)).c != null && ChatObject.canManageTopics(yf1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((pf1) yf1Var.b.get(b10)).c;
                if (yf1Var.a0.isEmpty()) {
                    View view = c1Var.a;
                    if ((view instanceof vf1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((vf1) view).setSliding(true);
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
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        yf1 yf1Var = this.e;
        ArrayList arrayList = yf1Var.b;
        if (c1Var.f != c1Var2.f || (b10 = c1Var2.b()) < 0 || b10 >= arrayList.size() || ((pf1) arrayList.get(b10)).c == null || !((pf1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        nf1 nf1Var = yf1Var.r;
        int b11 = c1Var.b();
        int b12 = c1Var2.b();
        yf1 yf1Var2 = nf1Var.d;
        ArrayList arrayList2 = yf1Var2.b;
        arrayList2.add(b12, (pf1) arrayList2.remove(b11));
        s4.m0 itemAnimator = yf1Var2.N.getItemAnimator();
        lf1 lf1Var = yf1Var2.I0;
        if (itemAnimator != lf1Var) {
            yf1Var2.N.setItemAnimator(lf1Var);
        }
        nf1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        yf1 yf1Var = this.e;
        if (i10 != 0) {
            yf1Var.N.J0(false);
            c1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = yf1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((pf1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        yf1Var.getMessagesController().getTopicsController().reorderPinnedTopics(yf1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            vf1 vf1Var = (vf1) c1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = vf1Var.N;
            yf1 yf1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = yf1Var.getMessagesController().getTopicsController();
                long j3 = yf1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = vf1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            yf1Var.b1 = vf1Var;
            jf1 jf1Var = yf1Var.N;
            boolean z10 = !vf1Var.N.hidden;
            int i10 = wf1.o3;
            jf1Var.B1(z10, vf1Var);
            yf1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = vf1Var.Y4;
            if (tL_forumTopic3 != null) {
                vf1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

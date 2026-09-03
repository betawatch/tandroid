package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rf1 extends f2.b0 {
    public boolean d;
    public final /* synthetic */ sf1 e;

    public rf1(sf1 sf1Var) {
        this.e = sf1Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        int l10 = f2.b0.l(0, 0);
        int b10 = m1Var.b();
        if (b10 >= 0) {
            sf1 sf1Var = this.e;
            if (b10 < sf1Var.b.size() && ((jf1) sf1Var.b.get(b10)).c != null && ChatObject.canManageTopics(sf1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((jf1) sf1Var.b.get(b10)).c;
                if (sf1Var.X.isEmpty()) {
                    View view = m1Var.a;
                    if ((view instanceof pf1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((pf1) view).setSliding(true);
                        return f2.b0.l(0, 4);
                    }
                }
                return !tL_forumTopic.pinned ? l10 : f2.b0.l(3, 0);
            }
        }
        return l10;
    }

    @Override // f2.b0
    public final boolean k() {
        return !this.e.X.isEmpty();
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int b10;
        sf1 sf1Var = this.e;
        ArrayList arrayList = sf1Var.b;
        if (m1Var.f != m1Var2.f || (b10 = m1Var2.b()) < 0 || b10 >= arrayList.size() || ((jf1) arrayList.get(b10)).c == null || !((jf1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        hf1 hf1Var = sf1Var.r;
        int b11 = m1Var.b();
        int b12 = m1Var2.b();
        sf1 sf1Var2 = hf1Var.d;
        ArrayList arrayList2 = sf1Var2.b;
        arrayList2.add(b12, (jf1) arrayList2.remove(b11));
        f2.u0 itemAnimator = sf1Var2.K.getItemAnimator();
        ff1 ff1Var = sf1Var2.F0;
        if (itemAnimator != ff1Var) {
            sf1Var2.K.setItemAnimator(ff1Var);
        }
        hf1Var.p(b11, b12);
        return true;
    }

    @Override // f2.b0
    public final void p(f2.m1 m1Var, int i10) {
        sf1 sf1Var = this.e;
        if (i10 != 0) {
            sf1Var.K.I0(false);
            m1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = sf1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((jf1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        sf1Var.getMessagesController().getTopicsController().reorderPinnedTopics(sf1Var.a, arrayList2);
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
        if (m1Var != null) {
            pf1 pf1Var = (pf1) m1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = pf1Var.K;
            sf1 sf1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = sf1Var.getMessagesController().getTopicsController();
                long j10 = sf1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = pf1Var.K;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            sf1Var.Y0 = pf1Var;
            df1 df1Var = sf1Var.K;
            boolean z4 = !pf1Var.K.hidden;
            int i10 = qf1.e3;
            df1Var.y1(z4, pf1Var);
            sf1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = pf1Var.V4;
            if (tL_forumTopic3 != null) {
                pf1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

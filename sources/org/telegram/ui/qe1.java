package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class qe1 extends s4.v {
    public boolean d;
    public final /* synthetic */ re1 e;

    public qe1(re1 re1Var) {
        this.e = re1Var;
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
            re1 re1Var = this.e;
            if (b10 < re1Var.b.size() && ((ie1) re1Var.b.get(b10)).c != null && ChatObject.canManageTopics(re1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ie1) re1Var.b.get(b10)).c;
                if (re1Var.a0.isEmpty()) {
                    View view = b1Var.a;
                    if ((view instanceof oe1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((oe1) view).setSliding(true);
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
        re1 re1Var = this.e;
        ArrayList arrayList = re1Var.b;
        if (b1Var.f != b1Var2.f || (b10 = b1Var2.b()) < 0 || b10 >= arrayList.size() || ((ie1) arrayList.get(b10)).c == null || !((ie1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        ge1 ge1Var = re1Var.r;
        int b11 = b1Var.b();
        int b12 = b1Var2.b();
        re1 re1Var2 = ge1Var.d;
        ArrayList arrayList2 = re1Var2.b;
        arrayList2.add(b12, (ie1) arrayList2.remove(b11));
        s4.l0 itemAnimator = re1Var2.N.getItemAnimator();
        ee1 ee1Var = re1Var2.I0;
        if (itemAnimator != ee1Var) {
            re1Var2.N.setItemAnimator(ee1Var);
        }
        ge1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        re1 re1Var = this.e;
        if (i10 != 0) {
            re1Var.N.I0(false);
            b1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = re1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ie1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        re1Var.getMessagesController().getTopicsController().reorderPinnedTopics(re1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
        if (b1Var != null) {
            oe1 oe1Var = (oe1) b1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = oe1Var.N;
            re1 re1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = re1Var.getMessagesController().getTopicsController();
                long j10 = re1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = oe1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            re1Var.b1 = oe1Var;
            ce1 ce1Var = re1Var.N;
            boolean z10 = !oe1Var.N.hidden;
            int i10 = pe1.f3;
            ce1Var.A1(z10, oe1Var);
            re1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = oe1Var.c5;
            if (tL_forumTopic3 != null) {
                oe1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

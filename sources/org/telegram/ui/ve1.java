package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ve1 extends f2.c0 {
    public boolean d;
    public final /* synthetic */ we1 e;

    public ve1(we1 we1Var) {
        this.e = we1Var;
    }

    @Override // f2.c0
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.a.setPressed(false);
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        int l10 = f2.c0.l(0, 0);
        int b10 = o1Var.b();
        if (b10 >= 0) {
            we1 we1Var = this.e;
            if (b10 < we1Var.b.size() && ((ne1) we1Var.b.get(b10)).c != null && ChatObject.canManageTopics(we1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ne1) we1Var.b.get(b10)).c;
                if (we1Var.W.isEmpty()) {
                    View view = o1Var.a;
                    if ((view instanceof te1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((te1) view).setSliding(true);
                        return f2.c0.l(0, 4);
                    }
                }
                return !tL_forumTopic.pinned ? l10 : f2.c0.l(3, 0);
            }
        }
        return l10;
    }

    @Override // f2.c0
    public final boolean k() {
        return !this.e.W.isEmpty();
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int b10;
        we1 we1Var = this.e;
        ArrayList arrayList = we1Var.b;
        if (o1Var.f != o1Var2.f || (b10 = o1Var2.b()) < 0 || b10 >= arrayList.size() || ((ne1) arrayList.get(b10)).c == null || !((ne1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        le1 le1Var = we1Var.r;
        int b11 = o1Var.b();
        int b12 = o1Var2.b();
        we1 we1Var2 = le1Var.d;
        ArrayList arrayList2 = we1Var2.b;
        arrayList2.add(b12, (ne1) arrayList2.remove(b11));
        f2.v0 itemAnimator = we1Var2.J.getItemAnimator();
        je1 je1Var = we1Var2.E0;
        if (itemAnimator != je1Var) {
            we1Var2.J.setItemAnimator(je1Var);
        }
        le1Var.p(b11, b12);
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        we1 we1Var = this.e;
        if (i10 != 0) {
            we1Var.J.I0(false);
            o1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = we1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ne1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        we1Var.getMessagesController().getTopicsController().reorderPinnedTopics(we1Var.a, arrayList2);
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
        if (o1Var != null) {
            te1 te1Var = (te1) o1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = te1Var.J;
            we1 we1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = we1Var.getMessagesController().getTopicsController();
                long j10 = we1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = te1Var.J;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            we1Var.X0 = te1Var;
            he1 he1Var = we1Var.J;
            boolean z10 = !te1Var.J.hidden;
            int i10 = ue1.d3;
            he1Var.z1(z10, te1Var);
            we1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = te1Var.U4;
            if (tL_forumTopic3 != null) {
                te1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

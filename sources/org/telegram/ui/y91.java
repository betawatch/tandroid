package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y91 extends v4.v {
    public boolean d;
    public final /* synthetic */ z91 e;

    public y91(z91 z91Var) {
        this.e = z91Var;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        z91 z91Var = this.e;
        ArrayList arrayList = z91Var.b;
        int l10 = v4.v.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((r91) arrayList.get(b10)).c != null && org.telegram.messenger.t3.y(15, z91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((r91) arrayList.get(b10)).c;
            if (z91Var.a0.isEmpty()) {
                View view = d1Var.a;
                if ((view instanceof w91) && tL_forumTopic.id == 1) {
                    this.d = true;
                    ((w91) view).setSliding(true);
                    return v4.v.l(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return v4.v.l(3, 0);
            }
        }
        return l10;
    }

    @Override // v4.v
    public final boolean k() {
        return !this.e.a0.isEmpty();
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int b10;
        z91 z91Var = this.e;
        ArrayList arrayList = z91Var.b;
        if (d1Var.f != d1Var2.f || (b10 = d1Var2.b()) < 0 || b10 >= arrayList.size() || ((r91) arrayList.get(b10)).c == null || !((r91) arrayList.get(b10)).c.pinned) {
            return false;
        }
        q91 q91Var = z91Var.r;
        int b11 = d1Var.b();
        int b12 = d1Var2.b();
        z91 z91Var2 = q91Var.d;
        ArrayList arrayList2 = z91Var2.b;
        arrayList2.add(b12, (r91) arrayList2.remove(b11));
        v4.l0 itemAnimator = z91Var2.N.getItemAnimator();
        n91 n91Var = z91Var2.I0;
        if (itemAnimator != n91Var) {
            z91Var2.N.setItemAnimator(n91Var);
        }
        q91Var.j(b11, b12);
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        z91 z91Var = this.e;
        if (i7 != 0) {
            z91Var.N.I0(false);
            d1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = z91Var.b;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((r91) arrayList.get(i10)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        z91Var.getMessagesController().q7.w(arrayList2, z91Var.a);
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
        if (d1Var != null) {
            w91 w91Var = (w91) d1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = w91Var.N;
            z91 z91Var = this.e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.k00 k00Var = z91Var.getMessagesController().q7;
                long j3 = z91Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = w91Var.N;
                k00Var.A(tL_forumTopic2.id, j3, tL_forumTopic2.hidden);
            }
            z91Var.c1 = w91Var;
            l91 l91Var = z91Var.N;
            boolean z9 = !w91Var.N.hidden;
            int i7 = x91.n3;
            l91Var.B1(z9, w91Var);
            z91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = w91Var.c5;
            if (tL_forumTopic3 != null) {
                w91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

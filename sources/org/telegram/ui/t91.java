package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t91 extends v4.v {
    public boolean d;
    public final /* synthetic */ u91 e;

    public t91(u91 u91Var) {
        this.e = u91Var;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        u91 u91Var = this.e;
        ArrayList arrayList = u91Var.b;
        int l10 = v4.v.l(0, 0);
        int b10 = e1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((m91) arrayList.get(b10)).c != null && org.telegram.messenger.t3.y(15, u91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((m91) arrayList.get(b10)).c;
            if (u91Var.b0.isEmpty()) {
                View view = e1Var.a;
                if ((view instanceof r91) && tL_forumTopic.id == 1) {
                    this.d = true;
                    ((r91) view).setSliding(true);
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
        return !this.e.b0.isEmpty();
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        int b10;
        u91 u91Var = this.e;
        ArrayList arrayList = u91Var.b;
        if (e1Var.f != e1Var2.f || (b10 = e1Var2.b()) < 0 || b10 >= arrayList.size() || ((m91) arrayList.get(b10)).c == null || !((m91) arrayList.get(b10)).c.pinned) {
            return false;
        }
        l91 l91Var = u91Var.r;
        int b11 = e1Var.b();
        int b12 = e1Var2.b();
        u91 u91Var2 = l91Var.d;
        ArrayList arrayList2 = u91Var2.b;
        arrayList2.add(b12, (m91) arrayList2.remove(b11));
        v4.m0 itemAnimator = u91Var2.O.getItemAnimator();
        i91 i91Var = u91Var2.J0;
        if (itemAnimator != i91Var) {
            u91Var2.O.setItemAnimator(i91Var);
        }
        l91Var.j(b11, b12);
        return true;
    }

    @Override // v4.v
    public final void p(v4.e1 e1Var, int i7) {
        u91 u91Var = this.e;
        if (i7 != 0) {
            u91Var.O.I0(false);
            e1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = u91Var.b;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((m91) arrayList.get(i10)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        u91Var.getMessagesController().r7.w(arrayList2, u91Var.a);
    }

    @Override // v4.v
    public final void q(v4.e1 e1Var) {
        if (e1Var != null) {
            r91 r91Var = (r91) e1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = r91Var.O;
            u91 u91Var = this.e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.h00 h00Var = u91Var.getMessagesController().r7;
                long j3 = u91Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = r91Var.O;
                h00Var.A(tL_forumTopic2.id, j3, tL_forumTopic2.hidden);
            }
            u91Var.d1 = r91Var;
            g91 g91Var = u91Var.O;
            boolean z10 = !r91Var.O.hidden;
            int i7 = s91.o3;
            g91Var.B1(z10, r91Var);
            u91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = r91Var.d5;
            if (tL_forumTopic3 != null) {
                r91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v91 extends v4.v {
    public boolean d;
    public final /* synthetic */ w91 e;

    public v91(w91 w91Var) {
        this.e = w91Var;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        w91 w91Var = this.e;
        ArrayList arrayList = w91Var.b;
        int l10 = v4.v.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((o91) arrayList.get(b10)).c != null && org.telegram.messenger.t3.y(15, w91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((o91) arrayList.get(b10)).c;
            if (w91Var.a0.isEmpty()) {
                View view = d1Var.a;
                if ((view instanceof t91) && tL_forumTopic.id == 1) {
                    this.d = true;
                    ((t91) view).setSliding(true);
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
        w91 w91Var = this.e;
        ArrayList arrayList = w91Var.b;
        if (d1Var.f != d1Var2.f || (b10 = d1Var2.b()) < 0 || b10 >= arrayList.size() || ((o91) arrayList.get(b10)).c == null || !((o91) arrayList.get(b10)).c.pinned) {
            return false;
        }
        n91 n91Var = w91Var.r;
        int b11 = d1Var.b();
        int b12 = d1Var2.b();
        w91 w91Var2 = n91Var.d;
        ArrayList arrayList2 = w91Var2.b;
        arrayList2.add(b12, (o91) arrayList2.remove(b11));
        v4.l0 itemAnimator = w91Var2.N.getItemAnimator();
        l91 l91Var = w91Var2.I0;
        if (itemAnimator != l91Var) {
            w91Var2.N.setItemAnimator(l91Var);
        }
        n91Var.j(b11, b12);
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        w91 w91Var = this.e;
        if (i7 != 0) {
            w91Var.N.I0(false);
            d1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = w91Var.b;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((o91) arrayList.get(i10)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        w91Var.getMessagesController().q7.w(arrayList2, w91Var.a);
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
        if (d1Var != null) {
            t91 t91Var = (t91) d1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = t91Var.N;
            w91 w91Var = this.e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.k00 k00Var = w91Var.getMessagesController().q7;
                long j3 = w91Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = t91Var.N;
                k00Var.A(tL_forumTopic2.id, j3, tL_forumTopic2.hidden);
            }
            w91Var.c1 = t91Var;
            j91 j91Var = w91Var.N;
            boolean z9 = !t91Var.N.hidden;
            int i7 = u91.n3;
            j91Var.B1(z9, t91Var);
            w91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = t91Var.c5;
            if (tL_forumTopic3 != null) {
                t91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

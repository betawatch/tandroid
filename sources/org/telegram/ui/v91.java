package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v91 extends v4.w {
    public boolean d;
    public final /* synthetic */ w91 e;

    public v91(w91 w91Var) {
        this.e = w91Var;
    }

    @Override // v4.w
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.a.setPressed(false);
    }

    @Override // v4.w
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        w91 w91Var = this.e;
        ArrayList arrayList = w91Var.b;
        int l10 = v4.w.l(0, 0);
        int b10 = f1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((o91) arrayList.get(b10)).c != null && org.telegram.messenger.v3.y(15, w91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((o91) arrayList.get(b10)).c;
            if (w91Var.b0.isEmpty()) {
                View view = f1Var.a;
                if ((view instanceof t91) && tL_forumTopic.id == 1) {
                    this.d = true;
                    ((t91) view).setSliding(true);
                    return v4.w.l(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return v4.w.l(3, 0);
            }
        }
        return l10;
    }

    @Override // v4.w
    public final boolean k() {
        return !this.e.b0.isEmpty();
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        int b10;
        w91 w91Var = this.e;
        ArrayList arrayList = w91Var.b;
        if (f1Var.f != f1Var2.f || (b10 = f1Var2.b()) < 0 || b10 >= arrayList.size() || ((o91) arrayList.get(b10)).c == null || !((o91) arrayList.get(b10)).c.pinned) {
            return false;
        }
        n91 n91Var = w91Var.r;
        int b11 = f1Var.b();
        int b12 = f1Var2.b();
        w91 w91Var2 = n91Var.d;
        ArrayList arrayList2 = w91Var2.b;
        arrayList2.add(b12, (o91) arrayList2.remove(b11));
        v4.n0 itemAnimator = w91Var2.O.getItemAnimator();
        k91 k91Var = w91Var2.J0;
        if (itemAnimator != k91Var) {
            w91Var2.O.setItemAnimator(k91Var);
        }
        n91Var.j(b11, b12);
        return true;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        w91 w91Var = this.e;
        if (i7 != 0) {
            w91Var.O.I0(false);
            f1Var.a.setPressed(true);
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
        w91Var.getMessagesController().t7.w(arrayList2, w91Var.a);
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
        if (f1Var != null) {
            t91 t91Var = (t91) f1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = t91Var.O;
            w91 w91Var = this.e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.d00 d00Var = w91Var.getMessagesController().t7;
                long j3 = w91Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = t91Var.O;
                d00Var.A(tL_forumTopic2.id, j3, tL_forumTopic2.hidden);
            }
            w91Var.d1 = t91Var;
            i91 i91Var = w91Var.O;
            boolean z10 = !t91Var.O.hidden;
            int i7 = u91.o3;
            i91Var.B1(z10, t91Var);
            w91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = t91Var.d5;
            if (tL_forumTopic3 != null) {
                t91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tb1 extends hg.c {
    public final /* synthetic */ vb1 d;

    public tb1(vb1 vb1Var) {
        this.d = vb1Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.d.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((ub1) this.d.d.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        String L0;
        vb1 vb1Var = this.d;
        ArrayList arrayList = vb1Var.d;
        if (((ub1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) c1Var.a;
            long j10 = vb1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ub1) arrayList.get(i10)).c;
            org.telegram.ui.Components.g9 g9Var = iaVar.b;
            gg.e.p(g9Var, tL_forumTopic, false, false, null);
            if (g9Var != null && g9Var.getImageReceiver() != null && (g9Var.getImageReceiver().t() instanceof gg.d)) {
                ((gg.d) g9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.c9, false));
            }
            iaVar.c.setText(tL_forumTopic.title);
            TextView textView = iaVar.d;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0);
            long j11 = tL_forumTopic.id;
            if (r12.getMessagesController().q2(j10, j11, null)) {
                int i11 = r12.e7.getInt("notifyuntil_" + org.telegram.messenger.ot.v(j10, j11, false), 0);
                L0 = i11 >= r12.getConnectionsManager().getCurrentTime() ? org.telegram.messenger.cd.a0("NotificationsMutedForHint", null, 2131747916, org.telegram.messenger.cd.c0(i11)) : org.telegram.messenger.cd.L0(2131747917, null);
            } else {
                L0 = org.telegram.messenger.cd.L0(2131747872, null);
            }
            textView.setText(L0);
            iaVar.a = i10 == arrayList.size() - 1 || ((ub1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
            p8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.cd.L0(2131747939, null), true);
            p8Var.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, null);
            view = p8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context);
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            iaVar.b = g9Var;
            iaVar.addView(g9Var, w7.b6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            iaVar.c = textView;
            org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.G6, null, 1, 16.0f);
            textView.setMaxLines(1);
            iaVar.addView(textView, w7.b6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            iaVar.d = textView2;
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.y6, null);
            textView2.setTextSize(1, 14.0f);
            iaVar.addView(textView2, w7.b6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, iaVar, null);
            view = iaVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                    p8Var2.k(org.telegram.messenger.cd.L0(2131747931, null), false);
                    p8Var2.g(-1, org.telegram.ui.ActionBar.t6.p7);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var2, null);
                    view = p8Var2;
                }
                return sc.e.o(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
        }
        view2 = view;
        return sc.e.o(view2, view2, -1, -2);
    }
}

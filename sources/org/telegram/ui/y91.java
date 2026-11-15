package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y91 extends rg.b {
    public final /* synthetic */ aa1 d;

    public y91(aa1 aa1Var) {
        this.d = aa1Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 1 || i7 == 2 || i7 == 4;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.d.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((z91) this.d.d.get(i7)).a;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        String M0;
        aa1 aa1Var = this.d;
        ArrayList arrayList = aa1Var.d;
        if (((z91) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) e1Var.a;
            long j3 = aa1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((z91) arrayList.get(i7)).c;
            org.telegram.ui.Components.i9 i9Var = iaVar.b;
            qg.c.p(i9Var, tL_forumTopic, false, false, null);
            if (i9Var != null && i9Var.getImageReceiver() != null && (i9Var.getImageReceiver().t() instanceof qg.b)) {
                ((qg.b) i9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.c9, false));
            }
            iaVar.c.setText(tL_forumTopic.title);
            TextView textView = iaVar.d;
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0);
            long j10 = tL_forumTopic.id;
            if (s12.getMessagesController().r2(j3, j10, null)) {
                int i10 = s12.e7.getInt("notifyuntil_" + org.telegram.messenger.at.v(j3, j10, false), 0);
                M0 = i10 >= s12.getConnectionsManager().getCurrentTime() ? org.telegram.messenger.hd.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.hd.c0(i10)) : org.telegram.messenger.hd.M0(2131747901, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131747856, null);
            }
            textView.setText(M0);
            iaVar.a = i7 == arrayList.size() - 1 || ((z91) arrayList.get(i7 + 1)).a == 2;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2 = null;
        if (i7 == 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
            l8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.hd.M0(2131747923, null), true);
            l8Var.g(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l8Var, null);
            view = l8Var;
        } else if (i7 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context);
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            iaVar.b = i9Var;
            iaVar.addView(i9Var, c8.ja.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            iaVar.c = textView;
            org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.G6, null, 1, 16.0f);
            textView.setMaxLines(1);
            iaVar.addView(textView, c8.ja.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            iaVar.d = textView2;
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.y6, null);
            textView2.setTextSize(1, 14.0f);
            iaVar.addView(textView2, c8.ja.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, iaVar, null);
            view = iaVar;
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                    l8Var2.k(org.telegram.messenger.hd.M0(2131747915, null), false);
                    l8Var2.g(-1, org.telegram.ui.ActionBar.j6.p7);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l8Var2, null);
                    view = l8Var2;
                }
                return i5.c.q(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.y0) null);
        }
        view2 = view;
        return i5.c.q(view2, view2, -1, -2);
    }
}

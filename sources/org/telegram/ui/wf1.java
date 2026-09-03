package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wf1 extends bg.c {
    public final /* synthetic */ yf1 d;

    public wf1(yf1 yf1Var) {
        this.d = yf1Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((xf1) this.d.d.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        yf1 yf1Var = this.d;
        ArrayList arrayList = yf1Var.d;
        if (((xf1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) l1Var.a;
            long j10 = yf1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((xf1) arrayList.get(i10)).c;
            org.telegram.ui.Components.p9 p9Var = maVar.b;
            ag.f.p(p9Var, tL_forumTopic, false, false, null);
            if (p9Var != null && p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().getDrawable() instanceof ag.e)) {
                ((ag.e) p9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.c9, false));
            }
            maVar.c.setText(tL_forumTopic.title);
            maVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            maVar.a = i10 == arrayList.size() - 1 || ((xf1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
            n8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            n8Var.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = n8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ma maVar = new org.telegram.ui.Cells.ma(context);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            maVar.b = p9Var;
            maVar.addView(p9Var, k7.b6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            maVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            maVar.addView(textView, k7.b6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            maVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
            textView2.setTextSize(1, 14.0f);
            maVar.addView(textView2, k7.b6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            maVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = maVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                    n8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    n8Var2.e(-1, org.telegram.ui.ActionBar.j6.p7);
                    n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = n8Var2;
                }
                return ai.n(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (b) null);
        }
        view2 = view;
        return ai.n(view2, view2, -1, -2);
    }
}

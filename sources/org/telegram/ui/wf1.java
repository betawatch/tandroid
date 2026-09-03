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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wf1 extends cg.c {
    public final /* synthetic */ yf1 d;

    public wf1(yf1 yf1Var) {
        this.d = yf1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((xf1) this.d.d.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        yf1 yf1Var = this.d;
        ArrayList arrayList = yf1Var.d;
        if (((xf1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.na naVar = (org.telegram.ui.Cells.na) m1Var.a;
            long j10 = yf1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((xf1) arrayList.get(i10)).c;
            org.telegram.ui.Components.p9 p9Var = naVar.b;
            bg.e.p(p9Var, tL_forumTopic, false, false, null);
            if (p9Var != null && p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().getDrawable() instanceof bg.d)) {
                ((bg.d) p9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.c9, false));
            }
            naVar.c.setText(tL_forumTopic.title);
            naVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            naVar.a = i10 == arrayList.size() - 1 || ((xf1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(viewGroup.getContext());
            o8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            o8Var.e(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            o8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            view = o8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.na naVar = new org.telegram.ui.Cells.na(context);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            naVar.b = p9Var;
            naVar.addView(p9Var, k7.c6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            naVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            naVar.addView(textView, k7.c6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            naVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y6, false));
            textView2.setTextSize(1, 14.0f);
            naVar.addView(textView2, k7.c6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            naVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            view = naVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                    o8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    o8Var2.e(-1, org.telegram.ui.ActionBar.k6.p7);
                    o8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    view = o8Var2;
                }
                return yh.o(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
        }
        view2 = view;
        return yh.o(view2, view2, -1, -2);
    }
}

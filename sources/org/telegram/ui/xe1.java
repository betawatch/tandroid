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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xe1 extends pg.b {
    public final /* synthetic */ ze1 d;

    public xe1(ze1 ze1Var) {
        this.d = ze1Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((ye1) this.d.d.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        ze1 ze1Var = this.d;
        ArrayList arrayList = ze1Var.d;
        if (((ye1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) b1Var.a;
            long j10 = ze1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ye1) arrayList.get(i10)).c;
            org.telegram.ui.Components.w9 w9Var = oaVar.b;
            og.d.p(w9Var, tL_forumTopic, false, false, null);
            if (w9Var != null && w9Var.getImageReceiver() != null && (w9Var.getImageReceiver().getDrawable() instanceof og.c)) {
                ((og.c) w9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.c9, false));
            }
            oaVar.c.setText(tL_forumTopic.title);
            oaVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            oaVar.a = i10 == arrayList.size() - 1 || ((ye1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
            q8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            q8Var.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
            q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            view = q8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.oa oaVar = new org.telegram.ui.Cells.oa(context);
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            oaVar.b = w9Var;
            oaVar.addView(w9Var, w7.z5.a(30.0f, 20.0f, 0.0f, 0.0f, 0.0f, 30, 16));
            TextView textView = new TextView(context);
            oaVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            oaVar.addView(textView, w7.z5.a(-2.0f, 72.0f, 8.0f, 12.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(context);
            oaVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.y6, false));
            textView2.setTextSize(1, 14.0f);
            oaVar.addView(textView2, w7.z5.a(-2.0f, 72.0f, 32.0f, 12.0f, 0.0f, -1, 0));
            oaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            view = oaVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                    q8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    q8Var2.e(-1, org.telegram.ui.ActionBar.h6.p7);
                    q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    view = q8Var2;
                }
                return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
        }
        view2 = view;
        return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
    }
}

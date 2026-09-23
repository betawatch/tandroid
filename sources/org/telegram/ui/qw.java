package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qw implements org.telegram.ui.Components.f00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ry b;

    public qw(Context context, ry ryVar) {
        this.b = ryVar;
        this.a = context;
    }

    public final int a(int i10) {
        ry ryVar = this.b;
        if (ryVar.R0 == 3) {
            return 0;
        }
        if (i10 == ryVar.z0.getDefaultTabId()) {
            return ryVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = ryVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return ryVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f7) {
        ry ryVar = this.b;
        if (f7 != 1.0f || ryVar.e0[1].getVisibility() == 0 || ryVar.j2) {
            if (ryVar.h3) {
                ryVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                ryVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * ryVar.e0[0].getMeasuredWidth()));
            } else {
                ryVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                ryVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - ryVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                qy[] qyVarArr = ryVar.e0;
                qy qyVar = qyVarArr[0];
                qyVarArr[0] = qyVarArr[1];
                qyVarArr[1] = qyVar;
                qyVar.setVisibility(8);
                ry.f1(ryVar, true);
                ryVar.T4(false);
                ryVar.z0.O = false;
                ryVar.r3(ryVar.e0[0]);
                ryVar.e0[0].d.getClass();
                ryVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.h00 h00Var, boolean z10) {
        int i10;
        int i11;
        ry ryVar = this.b;
        int i12 = ryVar.e0[0].h;
        int i13 = h00Var.a;
        if (i12 == i13) {
            return;
        }
        if (h00Var.f) {
            ryVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
            ryVar.showDialog(new rg.j0(3, i11, this.a, ryVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = ryVar.getMessagesController().getDialogFilters();
        if (h00Var.e || ((i10 = h00Var.a) >= 0 && i10 < dialogFilters.size())) {
            qy qyVar = ryVar.e0[1];
            qyVar.h = h00Var.a;
            qyVar.setVisibility(0);
            ryVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            ry.f1(ryVar, false);
            ryVar.R4(true);
            ryVar.h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        ry ryVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.d10.T(ryVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ryVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.b3(29, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        ryVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }
}

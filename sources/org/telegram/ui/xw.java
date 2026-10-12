package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xw implements org.telegram.ui.Components.q00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yy b;

    public xw(Context context, yy yyVar) {
        this.b = yyVar;
        this.a = context;
    }

    public final int a(int i10) {
        yy yyVar = this.b;
        if (yyVar.R0 == 3) {
            return 0;
        }
        if (i10 == yyVar.z0.getDefaultTabId()) {
            return yyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = yyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return yyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f7) {
        yy yyVar = this.b;
        if (f7 != 1.0f || yyVar.e0[1].getVisibility() == 0 || yyVar.j2) {
            if (yyVar.h3) {
                yyVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                yyVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * yyVar.e0[0].getMeasuredWidth()));
            } else {
                yyVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                yyVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - yyVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                xy[] xyVarArr = yyVar.e0;
                xy xyVar = xyVarArr[0];
                xyVarArr[0] = xyVarArr[1];
                xyVarArr[1] = xyVar;
                xyVar.setVisibility(8);
                yy.c1(yyVar, true);
                yyVar.Q4(false);
                yyVar.z0.O = false;
                yyVar.o3(yyVar.e0[0]);
                yyVar.e0[0].d.getClass();
                yyVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.s00 s00Var, boolean z10) {
        int i10;
        int i11;
        yy yyVar = this.b;
        int i12 = yyVar.e0[0].h;
        int i13 = s00Var.a;
        if (i12 == i13) {
            return;
        }
        if (s00Var.f) {
            yyVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            yyVar.showDialog(new sg.j0(3, i11, this.a, yyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = yyVar.getMessagesController().getDialogFilters();
        if (s00Var.e || ((i10 = s00Var.a) >= 0 && i10 < dialogFilters.size())) {
            xy xyVar = yyVar.e0[1];
            xyVar.h = s00Var.a;
            xyVar.setVisibility(0);
            yyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            yy.c1(yyVar, false);
            yyVar.O4(true);
            yyVar.h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        yy yyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.o10.U(yyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gw(3, this, dialogFilter));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        yyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vw implements org.telegram.ui.Components.e00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wy b;

    public vw(Context context, wy wyVar) {
        this.b = wyVar;
        this.a = context;
    }

    public final int a(int i10) {
        wy wyVar = this.b;
        if (wyVar.R0 == 3) {
            return 0;
        }
        if (i10 == wyVar.z0.getDefaultTabId()) {
            return wyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = wyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return wyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f7) {
        wy wyVar = this.b;
        if (f7 != 1.0f || wyVar.e0[1].getVisibility() == 0 || wyVar.j2) {
            if (wyVar.h3) {
                wyVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                wyVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * wyVar.e0[0].getMeasuredWidth()));
            } else {
                wyVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                wyVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - wyVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                vy[] vyVarArr = wyVar.e0;
                vy vyVar = vyVarArr[0];
                vyVarArr[0] = vyVarArr[1];
                vyVarArr[1] = vyVar;
                vyVar.setVisibility(8);
                wy.f1(wyVar, true);
                wyVar.T4(false);
                wyVar.z0.O = false;
                wyVar.r3(wyVar.e0[0]);
                wyVar.e0[0].d.getClass();
                wyVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.g00 g00Var, boolean z10) {
        int i10;
        int i11;
        wy wyVar = this.b;
        int i12 = wyVar.e0[0].h;
        int i13 = g00Var.a;
        if (i12 == i13) {
            return;
        }
        if (g00Var.f) {
            wyVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
            wyVar.showDialog(new rg.j0(3, i11, this.a, wyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = wyVar.getMessagesController().getDialogFilters();
        if (g00Var.e || ((i10 = g00Var.a) >= 0 && i10 < dialogFilters.size())) {
            vy vyVar = wyVar.e0[1];
            vyVar.h = g00Var.a;
            vyVar.setVisibility(0);
            wyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            wy.f1(wyVar, false);
            wyVar.R4(true);
            wyVar.h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        wy wyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.c10.T(wyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.mf(28, this, dialogFilter));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        wyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }
}

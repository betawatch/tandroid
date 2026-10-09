package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tw extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ty a;

    public tw(ty tyVar) {
        this.a = tyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        dy dyVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ty tyVar = this.a;
        ArrayList arrayList3 = tyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (dyVar = tyVar.C0) != null) {
            HashMap hashMap = dyVar.z0;
            ty tyVar2 = dyVar.J0;
            if (i10 == 202) {
                if (tyVar2 == null || tyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar2.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.T = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.fe0(8));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.y2(15, dyVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (dyVar.N()) {
                    tyVar2.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) tyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                dyVar.d((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    ty tyVar3 = new ty(org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true));
                    tyVar3.C2 = new org.telegram.ui.Components.bw(dyVar, 18);
                    tyVar2.presentFragment(tyVar3);
                    return;
                }
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            nx nxVar = tyVar.F3;
            if (nxVar != null && nxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                if (!kVar2.t()) {
                    tyVar.F3.a();
                    dy dyVar2 = tyVar.C0;
                    if (dyVar2 != null) {
                        dyVar2.R();
                        return;
                    }
                    return;
                }
                dy dyVar3 = tyVar.C0;
                if (dyVar3 != null && dyVar3.getVisibility() == 0) {
                    dy dyVar4 = tyVar.C0;
                    if (dyVar4.y0) {
                        dyVar4.Q(false);
                        return;
                    }
                }
                tyVar.Y3(true);
                return;
            }
            qw qwVar = tyVar.z0;
            if (qwVar != null && qwVar.n) {
                qwVar.setIsEditing(false);
                tyVar.F4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            if (!kVar.t()) {
                if (!tyVar.l2 && tyVar.V2 == 0 && tyVar.X2 == 0) {
                    return;
                }
                tyVar.finishFragment();
                return;
            }
            dy dyVar5 = tyVar.C0;
            if (dyVar5 != null && dyVar5.getVisibility() == 0) {
                dy dyVar6 = tyVar.C0;
                if (dyVar6.y0) {
                    dyVar6.Q(false);
                    return;
                }
            }
            tyVar.Y3(true);
            return;
        }
        if (i10 == 1) {
            if (tyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            tyVar.f0.getLocationInWindow(iArr);
            ((LaunchActivity) tyVar.getParentActivity()).G0(false, true, (tyVar.f0.getMeasuredWidth() / 2) + iArr[0], (tyVar.f0.getMeasuredHeight() / 2) + iArr[1], new cj(this, 25));
            tyVar.getNotificationsController().showNotifications();
            tyVar.v3();
            return;
        }
        if (i10 == 3) {
            tyVar.L4(true, true, true, false);
            tyVar.Y.b(true);
            return;
        }
        if (i10 == 11) {
            tyVar.m4(tyVar.D1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.d10 d10Var = new org.telegram.ui.Components.d10(tyVar, arrayList3);
            d10Var.r = new gu(this, 4);
            tyVar.showDialog(d10Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                tyVar.o4(tyVar.I2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = tyVar.getMessagesController().getDialogFilters().get(tyVar.e0[0].h);
        ArrayList J = org.telegram.ui.Components.d10.J(tyVar, dialogFilter2, arrayList3, false, false);
        if (J.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            tyVar.showDialog(org.telegram.ui.Components.g5.M(tyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (J.isEmpty()) {
            arrayList = J;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(J);
            for (int i12 = 0; i12 < J.size(); i12++) {
                Long l4 = (Long) J.get(i12);
                dialogFilter2.alwaysShow.remove(l4);
                dialogFilter2.pinnedDialogs.delete(l4.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = J;
            i11 = 1;
            f10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, tyVar, null);
        }
        if (arrayList.size() == i11) {
            arrayList2 = arrayList;
            z10 = false;
            j3 = ((Long) arrayList2.get(0)).longValue();
        } else {
            arrayList2 = arrayList;
            z10 = false;
        }
        long j10 = j3;
        UndoView V3 = tyVar.V3();
        if (V3 != null) {
            V3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        tyVar.Y3(z10);
    }
}

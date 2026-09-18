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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ww extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ wy a;

    public ww(wy wyVar) {
        this.a = wyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        gy gyVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wy wyVar = this.a;
        ArrayList arrayList3 = wyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (gyVar = wyVar.C0) != null) {
            HashMap hashMap = gyVar.A0;
            wy wyVar2 = gyVar.K0;
            if (i10 == 202) {
                if (wyVar2 == null || wyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar2.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.T = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.bn0(1));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.mf(13, gyVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (gyVar.O()) {
                    wyVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) wyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                gyVar.d((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    wy wyVar3 = new wy(org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true));
                    wyVar3.C2 = new org.telegram.ui.Components.lv(gyVar, 17);
                    wyVar2.presentFragment(wyVar3);
                    return;
                }
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            qx qxVar = wyVar.F3;
            if (qxVar != null && qxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                if (!kVar2.s()) {
                    wyVar.F3.a();
                    gy gyVar2 = wyVar.C0;
                    if (gyVar2 != null) {
                        gyVar2.S();
                        return;
                    }
                    return;
                }
                gy gyVar3 = wyVar.C0;
                if (gyVar3 != null && gyVar3.getVisibility() == 0) {
                    gy gyVar4 = wyVar.C0;
                    if (gyVar4.z0) {
                        gyVar4.R(false);
                        return;
                    }
                }
                wyVar.b4(true);
                return;
            }
            uw uwVar = wyVar.z0;
            if (uwVar != null && uwVar.n) {
                uwVar.setIsEditing(false);
                wyVar.I4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
            if (!kVar.s()) {
                if (!wyVar.l2 && wyVar.V2 == 0 && wyVar.X2 == 0) {
                    return;
                }
                wyVar.finishFragment();
                return;
            }
            gy gyVar5 = wyVar.C0;
            if (gyVar5 != null && gyVar5.getVisibility() == 0) {
                gy gyVar6 = wyVar.C0;
                if (gyVar6.z0) {
                    gyVar6.R(false);
                    return;
                }
            }
            wyVar.b4(true);
            return;
        }
        if (i10 == 1) {
            if (wyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            wyVar.f0.getLocationInWindow(iArr);
            ((LaunchActivity) wyVar.getParentActivity()).G0(false, true, (wyVar.f0.getMeasuredWidth() / 2) + iArr[0], (wyVar.f0.getMeasuredHeight() / 2) + iArr[1], new ej(this, 24));
            wyVar.getNotificationsController().showNotifications();
            wyVar.y3();
            return;
        }
        if (i10 == 3) {
            wyVar.O4(true, true, true, false);
            wyVar.Y.b(true);
            return;
        }
        if (i10 == 11) {
            wyVar.p4(wyVar.D1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.n00 n00Var = new org.telegram.ui.Components.n00(wyVar, arrayList3);
            n00Var.r = new gu(this, 5);
            wyVar.showDialog(n00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                wyVar.r4(wyVar.I2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = wyVar.getMessagesController().getDialogFilters().get(wyVar.e0[0].h);
        ArrayList I = org.telegram.ui.Components.n00.I(wyVar, dialogFilter2, arrayList3, false, false);
        if (I.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            wyVar.showDialog(org.telegram.ui.Components.c5.N(wyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (I.isEmpty()) {
            arrayList = I;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(I);
            for (int i12 = 0; i12 < I.size(); i12++) {
                Long l4 = (Long) I.get(i12);
                dialogFilter2.alwaysShow.remove(l4);
                dialogFilter2.pinnedDialogs.delete(l4.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = I;
            i11 = 1;
            h10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, wyVar, null);
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
        UndoView Y3 = wyVar.Y3();
        if (Y3 != null) {
            Y3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        wyVar.b4(z10);
    }
}

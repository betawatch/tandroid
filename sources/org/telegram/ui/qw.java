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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class qw extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ qy a;

    public qw(qy qyVar) {
        this.a = qyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        zx zxVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar = this.a;
        ArrayList arrayList3 = qyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (zxVar = qyVar.C0) != null) {
            HashMap hashMap = zxVar.z0;
            qy qyVar2 = zxVar.J0;
            if (i10 == 202) {
                if (qyVar2 == null || qyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar2.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.T = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.fa0(16));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.w2(15, zxVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (zxVar.N()) {
                    qyVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) qyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                zxVar.d((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    qy qyVar3 = new qy(org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true));
                    qyVar3.C2 = new org.telegram.ui.Components.mv(zxVar, 18);
                    qyVar2.presentFragment(qyVar3);
                    return;
                }
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            kx kxVar = qyVar.F3;
            if (kxVar != null && kxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                if (!kVar2.s()) {
                    qyVar.F3.a();
                    zx zxVar2 = qyVar.C0;
                    if (zxVar2 != null) {
                        zxVar2.R();
                        return;
                    }
                    return;
                }
                zx zxVar3 = qyVar.C0;
                if (zxVar3 != null && zxVar3.getVisibility() == 0) {
                    zx zxVar4 = qyVar.C0;
                    if (zxVar4.y0) {
                        zxVar4.Q(false);
                        return;
                    }
                }
                qyVar.b4(true);
                return;
            }
            nw nwVar = qyVar.z0;
            if (nwVar != null && nwVar.n) {
                nwVar.setIsEditing(false);
                qyVar.I4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            if (!kVar.s()) {
                if (!qyVar.l2 && qyVar.V2 == 0 && qyVar.X2 == 0) {
                    return;
                }
                qyVar.finishFragment();
                return;
            }
            zx zxVar5 = qyVar.C0;
            if (zxVar5 != null && zxVar5.getVisibility() == 0) {
                zx zxVar6 = qyVar.C0;
                if (zxVar6.y0) {
                    zxVar6.Q(false);
                    return;
                }
            }
            qyVar.b4(true);
            return;
        }
        if (i10 == 1) {
            if (qyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            qyVar.f0.getLocationInWindow(iArr);
            ((LaunchActivity) qyVar.getParentActivity()).G0(false, true, (qyVar.f0.getMeasuredWidth() / 2) + iArr[0], (qyVar.f0.getMeasuredHeight() / 2) + iArr[1], new aj(this, 24));
            qyVar.getNotificationsController().showNotifications();
            qyVar.y3();
            return;
        }
        if (i10 == 3) {
            qyVar.O4(true, true, true, false);
            qyVar.Y.b(true);
            return;
        }
        if (i10 == 11) {
            qyVar.p4(qyVar.D1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.o00 o00Var = new org.telegram.ui.Components.o00(qyVar, arrayList3);
            o00Var.r = new du(this, 4);
            qyVar.showDialog(o00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                qyVar.r4(qyVar.I2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = qyVar.getMessagesController().getDialogFilters().get(qyVar.e0[0].h);
        ArrayList I = org.telegram.ui.Components.o00.I(qyVar, dialogFilter2, arrayList3, false, false);
        if (I.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            qyVar.showDialog(org.telegram.ui.Components.e5.N(qyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
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
            b10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, qyVar, null);
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
        UndoView Y3 = qyVar.Y3();
        if (Y3 != null) {
            Y3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        qyVar.b4(z10);
    }
}

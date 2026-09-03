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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rw extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ qy a;

    public rw(qy qyVar) {
        this.a = qyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        zx zxVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar = this.a;
        ArrayList arrayList3 = qyVar.F2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (zxVar = qyVar.z0) != null) {
            HashMap hashMap = zxVar.w0;
            qy qyVar2 = zxVar.G0;
            if (i10 == 202) {
                if (qyVar2 == null || qyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar2.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.Q = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.lh0(2));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.o1(22, zxVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (zxVar.N()) {
                    qyVar2.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) qyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                zxVar.c((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    qy qyVar3 = new qy(org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true));
                    qyVar3.z2 = new org.telegram.ui.Components.ev(zxVar, 17);
                    qyVar2.presentFragment(qyVar3);
                    return;
                }
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            lx lxVar = qyVar.C3;
            if (lxVar != null && lxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                if (!kVar2.s()) {
                    qyVar.C3.a();
                    zx zxVar2 = qyVar.z0;
                    if (zxVar2 != null) {
                        zxVar2.R();
                        return;
                    }
                    return;
                }
                zx zxVar3 = qyVar.z0;
                if (zxVar3 != null && zxVar3.getVisibility() == 0) {
                    zx zxVar4 = qyVar.z0;
                    if (zxVar4.v0) {
                        zxVar4.Q(false);
                        return;
                    }
                }
                qyVar.b4(true);
                return;
            }
            pw pwVar = qyVar.w0;
            if (pwVar != null && pwVar.n) {
                pwVar.setIsEditing(false);
                qyVar.I4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            if (!kVar.s()) {
                if (!qyVar.i2 && qyVar.S2 == 0 && qyVar.U2 == 0) {
                    return;
                }
                qyVar.finishFragment();
                return;
            }
            zx zxVar5 = qyVar.z0;
            if (zxVar5 != null && zxVar5.getVisibility() == 0) {
                zx zxVar6 = qyVar.z0;
                if (zxVar6.v0) {
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
            qyVar.c0.getLocationInWindow(iArr);
            ((LaunchActivity) qyVar.getParentActivity()).G0(false, true, (qyVar.c0.getMeasuredWidth() / 2) + iArr[0], (qyVar.c0.getMeasuredHeight() / 2) + iArr[1], new bj(this, 24));
            qyVar.getNotificationsController().showNotifications();
            qyVar.y3();
            return;
        }
        if (i10 == 3) {
            qyVar.O4(true, true, true, false);
            qyVar.V.b(true);
            return;
        }
        if (i10 == 11) {
            qyVar.p4(qyVar.A1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.o00 o00Var = new org.telegram.ui.Components.o00(arrayList3, qyVar);
            o00Var.r = new hu(this, 4);
            qyVar.showDialog(o00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                qyVar.r4(qyVar.F2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = qyVar.getMessagesController().getDialogFilters().get(qyVar.b0[0].h);
        ArrayList H = org.telegram.ui.Components.o00.H(qyVar, dialogFilter2, arrayList3, false, false);
        if (H.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            qyVar.showDialog(org.telegram.ui.Components.z4.N(qyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (H.isEmpty()) {
            arrayList = H;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(H);
            for (int i12 = 0; i12 < H.size(); i12++) {
                Long l10 = (Long) H.get(i12);
                dialogFilter2.alwaysShow.remove(l10);
                dialogFilter2.pinnedDialogs.delete(l10.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = H;
            i11 = 1;
            c10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, qyVar, null);
        }
        if (arrayList.size() == i11) {
            arrayList2 = arrayList;
            z4 = false;
            j10 = ((Long) arrayList2.get(0)).longValue();
        } else {
            arrayList2 = arrayList;
            z4 = false;
        }
        long j11 = j10;
        UndoView Y3 = qyVar.Y3();
        if (Y3 != null) {
            Y3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        qyVar.b4(z4);
    }
}

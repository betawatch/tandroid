package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wg1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 1:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 2:
                oh1.g0((oh1) obj2, (String) obj);
                break;
            case 3:
                Runnable runnable = (Runnable) obj;
                ks[] ksVarArr = ((oh1) obj2).w.f;
                int length = ksVarArr.length;
                while (i14 < length) {
                    ksVarArr[i14].l(0.0f);
                    i14++;
                }
                runnable.run();
                break;
            case 4:
                vh1 vh1Var = (vh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = vh1Var.f;
                ArrayList<TLRPC.Chat> arrayList2 = vh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(vh1Var.a).putChats(arrayList2, false);
                vh1Var.d = false;
                vh1Var.c = true;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj3 = arrayList.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList.clear();
                break;
            case 5:
                cj1 cj1Var = (cj1) obj2;
                cj1Var.U.a(new li1(cj1Var, (VoIPService) obj, i13), true);
                break;
            case 6:
                cj1 cj1Var2 = (cj1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.k2.U = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = cj1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
                duration.setInterpolator(esVar).start();
                cj1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                cj1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                cj1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                cj1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                cj1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                cj1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(esVar).start();
                cj1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(esVar).start();
                cj1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(esVar).start();
                valueAnimator.addListener(new qi1(cj1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(esVar);
                valueAnimator.start();
                break;
            case 7:
                MessagesController.getInstance(((org.telegram.ui.Wallet.k0) obj2).a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 8:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.k0.E("enable backup: ready! getting secret phrase...");
                k0Var.x(new bi.f0(20, k0Var, (org.telegram.ui.Wallet.b7) obj), false, true);
                break;
            case 9:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.q qVar = (org.telegram.ui.Wallet.q) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    qVar.run();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.k0.E("emulate disable backup: ready");
                if (k0Var2.t() > 0) {
                    WalletEngine2 walletEngine2 = k0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(k0Var2, jVar));
                        break;
                    } else {
                        org.telegram.ui.Wallet.k0.i("emulate disable backup: no engine!");
                        jVar.run(null, "NULL_ENGINE");
                        break;
                    }
                } else {
                    jVar.run(500000L, null);
                    break;
                }
            case 11:
                MessagesController.getInstance(((org.telegram.ui.Wallet.e2) obj2).a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 12:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.ia0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Wallet.o3) obj2).run(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 14:
                ((org.telegram.ui.Wallet.a5) obj2).D0.remove((org.telegram.ui.Wallet.m6) obj);
                break;
            case 15:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Utilities.Callback2) obj2).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 16:
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) obj2;
                j2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.v3((TLRPC.User) obj, i14));
                j2VarArr[0].dismiss();
                break;
            case 17:
                new org.telegram.ui.Components.zc(((org.telegram.ui.Wallet.j2[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                break;
            case 18:
                org.telegram.ui.Wallet.j2[] j2VarArr2 = (org.telegram.ui.Wallet.j2[]) obj2;
                j2VarArr2[0].setOnDismissListener(new org.telegram.ui.Wallet.v3((TL_wallet.WalletTransactionPeer) obj, i13));
                j2VarArr2[0].dismiss();
                break;
            case 19:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.v5) obj2).h);
                break;
            case 20:
                ((Utilities.Callback) obj2).run((TL_wallet.walletTransaction) obj);
                break;
            case 21:
                org.telegram.ui.Wallet.a7 a7Var = (org.telegram.ui.Wallet.a7) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if ((m2Var instanceof org.telegram.ui.Wallet.a5) && org.telegram.ui.Components.zc.a(m2Var)) {
                    org.telegram.ui.Components.zc.a0(m2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                a7Var.finishFragment();
                break;
            case 22:
                ((org.telegram.ui.Wallet.p0) obj).B();
                ((org.telegram.ui.Wallet.l7) obj2).a.W2.N(true);
                break;
            case 23:
                org.telegram.ui.Wallet.l7 l7Var = (org.telegram.ui.Wallet.l7) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getParentActivity(), 0, l7Var.getResourceProvider());
                String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new bs0(26, l7Var, (org.telegram.ui.Wallet.k0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 24:
                ((org.telegram.ui.ActionBar.a2[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            case 25:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.w8) obj2).h);
                break;
            case 26:
                lj1 lj1Var = (lj1) obj2;
                int[] iArr = (int[]) obj;
                lj1Var.getClass();
                int i15 = iArr[0] - 1;
                iArr[0] = i15;
                if (i15 == 0) {
                    WallpapersListActivity wallpapersListActivity = lj1Var.a;
                    int[][] iArr2 = WallpapersListActivity.k0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 27:
                rj1 rj1Var = (rj1) obj2;
                String str = (String) obj;
                rj1Var.d.clear();
                rj1Var.e.clear();
                rj1Var.f = true;
                rj1Var.F(str, "", true);
                rj1Var.h = str;
                rj1Var.l();
                rj1Var.y = null;
                break;
            case 28:
                rj1 rj1Var2 = (rj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = rj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = rj1Var2.x;
                rj1Var2.x = null;
                rj1Var2.F(str2, "", false);
                break;
            default:
                String str3 = (String) obj;
                xj1 xj1Var = ((wj1) obj2).a;
                Activity parentActivity = xj1Var.getParentActivity();
                MessageObject messageObject = xj1Var.n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        messageObject.messageOwner.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        messageObject.messageOwner.with_my_score = true;
                    }
                    xj1Var.showDialog(org.telegram.ui.Components.ir0.O0(xj1Var.getParentActivity(), messageObject, null, false, xj1Var.h));
                    break;
                }
                break;
        }
    }
}

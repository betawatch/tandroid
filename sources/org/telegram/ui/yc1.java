package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yc1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ad1.W((ad1) this.b, (TLRPC.TL_theme) this.c);
                break;
            case 1:
                kd1 kd1Var = (kd1) this.b;
                String str = (String) this.c;
                kd1Var.getClass();
                AndroidUtilities.addToClipboard(str);
                kd1Var.c(true);
                break;
            case 2:
                kd1 kd1Var2 = (kd1) this.b;
                TLRPC.TodoItem todoItem = (TLRPC.TodoItem) this.c;
                kd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(todoItem.title, false));
                kd1Var2.c(true);
                break;
            case 3:
                ie1 ie1Var = (ie1) this.b;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
                ie1Var.getClass();
                Bundle bundle = new Bundle();
                cf1 cf1Var = ie1Var.b;
                bundle.putLong("dialog_id", -cf1Var.a);
                bundle.putLong("topic_id", tL_forumTopic.id);
                cf1Var.presentFragment(new j11(bundle, null));
                break;
            case 4:
                ye1 ye1Var = (ye1) this.b;
                String str2 = (String) this.c;
                ArrayList arrayList = ye1Var.e0;
                cf1 cf1Var2 = ye1Var.v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList3 = cf1Var2.b;
                    if (i10 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        ye1Var.N();
                        if (!arrayList.isEmpty()) {
                            ye1Var.n0 = false;
                            ye1Var.q0.b(0);
                        }
                        ye1Var.L(str2);
                        break;
                    } else {
                        if (((te1) arrayList3.get(i10)).c != null && ((te1) arrayList3.get(i10)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((te1) arrayList3.get(i10)).c);
                            ((te1) arrayList3.get(i10)).c.searchQuery = lowerCase;
                        }
                        i10++;
                    }
                }
                break;
            case 5:
                ef1 ef1Var = (ef1) this.b;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) this.c;
                ff1 ff1Var = ef1Var.b;
                ff1Var.a.e.remove(Integer.valueOf(tL_forumTopic2.id));
                ff1Var.a.W();
                break;
            case 6:
                TwoStepVerificationActivity.Z((TwoStepVerificationActivity) this.b, (byte[]) this.c);
                break;
            case 7:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) this.b, (TL_account.updatePasswordSettings) this.c);
                break;
            case 8:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) this.b, (TLRPC.TL_error) this.c);
                break;
            case 9:
                fg1.h0((fg1) this.b, (String) this.c);
                break;
            case 10:
                fg1 fg1Var = (fg1) this.b;
                Runnable runnable = (Runnable) this.c;
                for (zr zrVar : fg1Var.w.f) {
                    zrVar.l(0.0f);
                }
                runnable.run();
                break;
            case 11:
                lg1 lg1Var = (lg1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList4 = lg1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = lg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                int i11 = 0;
                MessagesController.getInstance(lg1Var.a).putChats(arrayList5, false);
                lg1Var.d = false;
                lg1Var.c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj).run();
                }
                arrayList4.clear();
                break;
            case 12:
                rh1 rh1Var = (rh1) this.b;
                rh1Var.U.a(new zg1(rh1Var, (VoIPService) this.c, 1), true);
                break;
            case 13:
                rh1 rh1Var2 = (rh1) this.b;
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                org.telegram.ui.Components.voip.n2.U = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = rh1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
                duration.setInterpolator(dsVar).start();
                rh1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(dsVar).start();
                rh1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(dsVar).start();
                rh1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(dsVar).start();
                valueAnimator.addListener(new fh1(rh1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(dsVar);
                valueAnimator.start();
                break;
            case 14:
                MessagesController.getInstance(((org.telegram.ui.Wallet.l0) this.b).a).lambda$processUpdates$379((TLRPC.Updates) this.c, false);
                break;
            case 15:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.x7 x7Var = (org.telegram.ui.Wallet.x7) this.c;
                org.telegram.ui.Wallet.l0.H("enable backup: ready! getting secret phrase...");
                l0Var.z(new bi.m5(24, l0Var, x7Var), false, true);
                break;
            case 16:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Wallet.q qVar = (org.telegram.ui.Wallet.q) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    qVar.run();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.c;
                org.telegram.ui.Wallet.l0.H("emulate disable backup: ready");
                if (l0Var2.v() <= 0) {
                    jVar.run(500000L, null);
                    break;
                } else {
                    WalletEngine2 walletEngine2 = l0Var2.b;
                    if (walletEngine2 == null) {
                        org.telegram.ui.Wallet.l0.j("emulate disable backup: no engine!");
                        jVar.run(null, "NULL_ENGINE");
                        break;
                    } else {
                        walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(l0Var2, jVar));
                        break;
                    }
                }
            case 18:
                ai.e eVar = (ai.e) this.b;
                Exception exc = (Exception) this.c;
                eVar.run(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            case 19:
                MessagesController.getInstance(((org.telegram.ui.Wallet.e2) this.b).a).lambda$processUpdates$379((TLRPC.Updates) this.c, false);
                break;
            case 20:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.b;
                r2Var.presentFragment(new org.telegram.ui.Wallet.i9(r2Var.getCurrentAccount(), ((TL_wallet.card) this.c).address));
                break;
            case 21:
                TextView[] textViewArr = (TextView[]) this.b;
                SpannableString[] spannableStringArr = (SpannableString[]) this.c;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.fa0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 22:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.c;
                callback2.run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 23:
                ((di.s) this.b).run(((TL_wallet.walletTransaction[]) this.c)[0]);
                break;
            case 24:
                ((org.telegram.ui.Wallet.m5) this.b).P0.remove((org.telegram.ui.Wallet.w6) this.c);
                break;
            case 25:
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) this.b;
                j2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.f4((TLRPC.User) this.c, 0));
                j2VarArr[0].dismiss();
                break;
            case 26:
                new org.telegram.ui.Components.wc(((org.telegram.ui.Wallet.j2[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.u6) this.c).R(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                break;
            case 27:
                super/*android.widget.TextView*/.onDraw((Canvas) this.c);
                break;
            case 28:
                super/*org.telegram.ui.Components.s6*/.onDraw((Canvas) this.c);
                break;
            default:
                super/*org.telegram.ui.Components.s6*/.onDraw((Canvas) this.c);
                break;
        }
    }
}

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sb1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                jc1 jc1Var = (jc1) obj2;
                jc1Var.U.a(new tb1(jc1Var, (VoIPService) obj, i12), true);
                break;
            case 1:
                jc1 jc1Var2 = (jc1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.e2.S = false;
                org.telegram.ui.Components.voip.e2.b();
                ViewPropertyAnimator duration = jc1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
                duration.setInterpolator(wqVar).start();
                jc1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
                jc1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
                jc1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
                jc1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
                jc1Var2.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
                jc1Var2.g0.animate().alpha(1.0f).setDuration(350L).setInterpolator(wqVar).start();
                jc1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(wqVar).start();
                jc1Var2.L0.animate().alpha(1.0f).setDuration(350L).setInterpolator(wqVar).start();
                valueAnimator.addListener(new zb1(jc1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(wqVar);
                valueAnimator.start();
                break;
            case 2:
                org.telegram.messenger.qp.s1(((org.telegram.ui.Wallet.l0) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 3:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.l0.H("enable backup: ready! getting secret phrase...");
                l0Var.z(new bi.p5(23, l0Var, (org.telegram.ui.Wallet.h8) obj), false, true);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.run();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.l0.H("emulate disable backup: ready");
                if (l0Var2.v() > 0) {
                    WalletEngine2 walletEngine2 = l0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(l0Var2, jVar));
                        break;
                    } else {
                        org.telegram.ui.Wallet.l0.j("emulate disable backup: no engine!");
                        jVar.a(null, "NULL_ENGINE");
                        break;
                    }
                } else {
                    jVar.a(500000L, null);
                    break;
                }
            case 6:
                Exception exc = (Exception) obj;
                ((ai.e) obj2).a(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            case 7:
                org.telegram.messenger.qp.s1(((org.telegram.ui.Wallet.d2) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 8:
                org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) obj2;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj;
                if (!s2Var.e) {
                    x2Var.c0 = true;
                    Runnable runnable = s2Var.g;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 9:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.id.M0(2131748779, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.b80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 10:
                ((di.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 11:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((org.telegram.messenger.v10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 12:
                ((org.telegram.ui.Wallet.z5) obj2).P0.remove((org.telegram.ui.Wallet.h7) obj);
                break;
            case 13:
                org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) obj2;
                y2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.k2((TLRPC.User) obj, i12));
                y2VarArr[0].dismiss();
                break;
            case 14:
                new org.telegram.ui.Components.gc(((org.telegram.ui.Wallet.y2[]) obj2)[0].E, (org.telegram.ui.ActionBar.h6) obj).Q(R.raw.copy, 36, org.telegram.messenger.id.M0(2131743201, null)).k(false);
                break;
            case 15:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                break;
            case 16:
                super/*org.telegram.ui.Components.i6*/.onDraw((Canvas) obj);
                break;
            case 17:
                super/*org.telegram.ui.Components.i6*/.onDraw((Canvas) obj);
                break;
            case 18:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.p6) obj2).h);
                break;
            case 19:
                ((org.telegram.messenger.c20) obj2).a((TL_wallet.walletTransaction) obj);
                break;
            case 20:
                org.telegram.ui.Wallet.d8 d8Var = (org.telegram.ui.Wallet.d8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!d8Var.a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    d8Var.d(cardVar);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Wallet.g8 g8Var = (org.telegram.ui.Wallet.g8) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                if ((f2Var instanceof org.telegram.ui.Wallet.z5) && org.telegram.ui.Components.gc.a(f2Var)) {
                    org.telegram.ui.Components.gc.a0(f2Var).I(R.raw.contact_check, org.telegram.messenger.id.M0(2131743089, null), org.telegram.messenger.id.M0(2131743088, null)).j();
                }
                g8Var.finishFragment();
                break;
            case 22:
                ((org.telegram.ui.Wallet.p0) obj).B();
                ((org.telegram.ui.Wallet.p8) obj2).a.f3.O(true);
                break;
            case 23:
                org.telegram.ui.Wallet.p8 p8Var = (org.telegram.ui.Wallet.p8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, p8Var.getParentActivity(), p8Var.getResourceProvider());
                String M0 = org.telegram.messenger.id.M0(2131743131, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131743133, null);
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743136, null), new ok0(27, p8Var, (org.telegram.ui.Wallet.l0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 24:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            case 25:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.ca) obj2).h);
                break;
            case 26:
                rc1 rc1Var = (rc1) obj2;
                int[] iArr = (int[]) obj;
                rc1Var.getClass();
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    rc1Var.a.G0(true);
                    break;
                }
                break;
            case 27:
                wc1 wc1Var = (wc1) obj2;
                String str = (String) obj;
                wc1Var.d.clear();
                wc1Var.e.clear();
                wc1Var.f = true;
                wc1Var.F(str, "", true);
                wc1Var.h = str;
                wc1Var.f();
                wc1Var.D = null;
                break;
            case 28:
                wc1 wc1Var2 = (wc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = wc1Var2.E;
                i7 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qp.s1(i7).Y3(tL_contacts_resolvedPeer.users, false);
                i10 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qp.s1(i10).S3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = wc1Var2.y;
                wc1Var2.y = null;
                wc1Var2.F(str2, "", false);
                break;
            default:
                String str3 = (String) obj;
                dd1 dd1Var = ((cd1) obj2).a;
                Activity parentActivity = dd1Var.getParentActivity();
                org.telegram.messenger.ij ijVar = dd1Var.n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        ijVar.k.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        ijVar.k.with_my_score = true;
                    }
                    dd1Var.showDialog(org.telegram.ui.Components.mo0.N0(dd1Var.getParentActivity(), ijVar, null, false, dd1Var.h));
                    break;
                }
                break;
        }
    }
}

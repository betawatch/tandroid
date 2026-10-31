package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t11(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ck0 ck0Var;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                i31 i31Var = (i31) obj2;
                i31Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.k2) obj).presentFragment(new StickersActivity(5, i31Var.L0));
                Runnable runnable = i31Var.U1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.i0.g((String) obj);
                org.telegram.ui.Components.cc.a0((e51) obj2).k(false).j();
                break;
            case 2:
                e51.a0((e51) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 3:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                new m51(k2Var.getContext(), k2Var.getCurrentAccount(), k2Var.getResourceProvider(), (ag.e0) obj2).show();
                break;
            case 4:
                ((StickersActivity) obj2).r0((org.telegram.ui.Cells.k8) obj);
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().C4(true);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().P4());
                    break;
                }
                break;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.t6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.t6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.t6.x), Double.valueOf(org.telegram.ui.ActionBar.t6.y));
                }
                org.telegram.ui.ActionBar.t6.w1();
                org.telegram.ui.Components.tk0 tk0Var = themeActivity2.b;
                if (tk0Var != null && (ck0Var = (org.telegram.ui.Components.ck0) tk0Var.K(themeActivity2.Y)) != null) {
                    View view2 = ck0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.x9) {
                        ((org.telegram.ui.Cells.x9) view2).c(org.telegram.messenger.cd.L0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.t6.w, false, false);
                        break;
                    }
                }
                break;
            case 7:
                m91 m91Var = (m91) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (m91Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    m91Var.B0.f(m91Var.L0[0], true);
                    break;
                }
                break;
            case 8:
                p91.b0((p91) obj2, (String) obj);
                break;
            case 9:
                p91.Z((p91) obj2, (TLRPC.TL_theme) obj);
                break;
            case 10:
                x91 x91Var = (x91) obj2;
                x91Var.getClass();
                org.telegram.messenger.i0.g((String) obj);
                x91Var.c(true);
                break;
            case 11:
                org.telegram.messenger.i0.g(org.telegram.messenger.jj.h0(((TLRPC.TodoItem) obj).title, false));
                ((x91) obj2).c(true);
                break;
            case 12:
                wa1 wa1Var = (wa1) obj2;
                wa1Var.getClass();
                Bundle bundle = new Bundle();
                pb1 pb1Var = wa1Var.b;
                bundle.putLong("dialog_id", -pb1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                pb1Var.presentFragment(new uy0(bundle, null));
                break;
            case 13:
                lb1 lb1Var = (lb1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = lb1Var.e0;
                pb1 pb1Var2 = lb1Var.v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = pb1Var2.b;
                    if (i14 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        lb1Var.N();
                        if (!arrayList.isEmpty()) {
                            lb1Var.n0 = false;
                            lb1Var.q0.b(0);
                        }
                        lb1Var.L(str2);
                        break;
                    } else {
                        if (((hb1) arrayList3.get(i14)).c != null && ((hb1) arrayList3.get(i14)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((hb1) arrayList3.get(i14)).c);
                            ((hb1) arrayList3.get(i14)).c.searchQuery = lowerCase;
                        }
                        i14++;
                    }
                }
                break;
            case 14:
                sb1 sb1Var = ((rb1) obj2).b;
                sb1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                sb1Var.a.Z();
                break;
            case 15:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 16:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 17:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 18:
                tc1.k0((tc1) obj2, (String) obj);
                break;
            case 19:
                Runnable runnable2 = (Runnable) obj;
                bs[] bsVarArr = ((tc1) obj2).x.f;
                int length = bsVarArr.length;
                while (i13 < length) {
                    bsVarArr[i13].C(0.0f);
                    i13++;
                }
                runnable2.run();
                break;
            case 20:
                zc1 zc1Var = (zc1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = zc1Var.f;
                ArrayList arrayList5 = zc1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.vp.r1(zc1Var.a).P3(arrayList5, false);
                zc1Var.d = false;
                zc1Var.c = true;
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 21:
                be1 be1Var = (be1) obj2;
                be1Var.U.a(new ld1(be1Var, (VoIPService) obj, i12), true);
                break;
            case 22:
                be1 be1Var2 = (be1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.t1.U = false;
                org.telegram.ui.Components.voip.t1.a();
                ViewPropertyAnimator duration = be1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                duration.setInterpolator(grVar).start();
                be1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                be1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                be1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                valueAnimator.addListener(new qd1(be1Var2, i11));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(grVar);
                valueAnimator.start();
                break;
            case 23:
                org.telegram.messenger.vp.r1(((org.telegram.ui.Wallet.k0) obj2).a).L3((TLRPC.Updates) obj, false);
                break;
            case 24:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.k0.H("enable backup: ready! getting secret phrase...");
                k0Var.z(new ih.s(17, k0Var, (org.telegram.ui.Wallet.l8) obj), false, true);
                break;
            case 25:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.run();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.k0.H("emulate disable backup: ready");
                if (k0Var2.v() > 0) {
                    WalletEngine2 walletEngine2 = k0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(k0Var2, jVar));
                        break;
                    } else {
                        org.telegram.ui.Wallet.k0.j("emulate disable backup: no engine!");
                        jVar.a(null, "NULL_ENGINE");
                        break;
                    }
                } else {
                    jVar.a(500000L, null);
                    break;
                }
            case 27:
                Exception exc = (Exception) obj;
                ((qh.d) obj2).a(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            case 28:
                org.telegram.messenger.vp.r1(((org.telegram.ui.Wallet.e2) obj2).a).L3((TLRPC.Updates) obj, false);
                break;
            default:
                org.telegram.ui.Wallet.t2 t2Var = (org.telegram.ui.Wallet.t2) obj2;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj;
                if (!t2Var.e) {
                    y2Var.c0 = true;
                    Runnable runnable3 = t2Var.g;
                    if (runnable3 != null) {
                        runnable3.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ t11(org.telegram.ui.ActionBar.k2 k2Var, ag.e0 e0Var) {
        this.a = 3;
        this.c = k2Var;
        this.b = e0Var;
    }
}

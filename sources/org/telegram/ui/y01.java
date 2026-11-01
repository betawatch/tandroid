package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y01(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.dk0 dk0Var;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((SecretMediaViewer) ((m5.e) obj2).c).i((File) obj);
                break;
            case 1:
                g31 g31Var = (g31) obj2;
                g31Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.k2) obj).presentFragment(new StickersActivity(5, g31Var.L0));
                Runnable runnable = g31Var.U1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.i0.g((String) obj);
                org.telegram.ui.Components.cc.a0((c51) obj2).k(false).j();
                break;
            case 3:
                c51.b0((c51) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 4:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                new k51(k2Var.getContext(), k2Var.getCurrentAccount(), k2Var.getResourceProvider(), (ag.e0) obj).show();
                break;
            case 5:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.k8) obj);
                break;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().C4(true);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().P4());
                    break;
                }
                break;
            case 7:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.t6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.t6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.t6.x), Double.valueOf(org.telegram.ui.ActionBar.t6.y));
                }
                org.telegram.ui.ActionBar.t6.w1();
                org.telegram.ui.Components.uk0 uk0Var = themeActivity2.b;
                if (uk0Var != null && (dk0Var = (org.telegram.ui.Components.dk0) uk0Var.K(themeActivity2.Y)) != null) {
                    View view2 = dk0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.x9) {
                        ((org.telegram.ui.Cells.x9) view2).c(org.telegram.messenger.dd.L0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.t6.w, false, false);
                        break;
                    }
                }
                break;
            case 8:
                k91 k91Var = (k91) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (k91Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    k91Var.B0.f(k91Var.L0[0], true);
                    break;
                }
                break;
            case 9:
                n91.c0((n91) obj2, (String) obj);
                break;
            case 10:
                n91.a0((n91) obj2, (TLRPC.TL_theme) obj);
                break;
            case 11:
                v91 v91Var = (v91) obj2;
                v91Var.getClass();
                org.telegram.messenger.i0.g((String) obj);
                v91Var.c(true);
                break;
            case 12:
                org.telegram.messenger.i0.g(org.telegram.messenger.kj.h0(((TLRPC.TodoItem) obj).title, false));
                ((v91) obj2).c(true);
                break;
            case 13:
                ua1 ua1Var = (ua1) obj2;
                ua1Var.getClass();
                Bundle bundle = new Bundle();
                nb1 nb1Var = ua1Var.b;
                bundle.putLong("dialog_id", -nb1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                nb1Var.presentFragment(new ty0(bundle, null));
                break;
            case 14:
                jb1 jb1Var = (jb1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = jb1Var.e0;
                nb1 nb1Var2 = jb1Var.v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = nb1Var2.b;
                    if (i14 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        jb1Var.N();
                        if (!arrayList.isEmpty()) {
                            jb1Var.n0 = false;
                            jb1Var.q0.b(0);
                        }
                        jb1Var.L(str2);
                        break;
                    } else {
                        if (((fb1) arrayList3.get(i14)).c != null && ((fb1) arrayList3.get(i14)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((fb1) arrayList3.get(i14)).c);
                            ((fb1) arrayList3.get(i14)).c.searchQuery = lowerCase;
                        }
                        i14++;
                    }
                }
                break;
            case 15:
                qb1 qb1Var = ((pb1) obj2).b;
                qb1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                qb1Var.a.a0();
                break;
            case 16:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 17:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 18:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 19:
                rc1.l0((rc1) obj2, (String) obj);
                break;
            case 20:
                Runnable runnable2 = (Runnable) obj;
                bs[] bsVarArr = ((rc1) obj2).x.f;
                int length = bsVarArr.length;
                while (i13 < length) {
                    bsVarArr[i13].C(0.0f);
                    i13++;
                }
                runnable2.run();
                break;
            case 21:
                xc1 xc1Var = (xc1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = xc1Var.f;
                ArrayList arrayList5 = xc1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.wp.r1(xc1Var.a).P3(arrayList5, false);
                xc1Var.d = false;
                xc1Var.c = true;
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 22:
                zd1 zd1Var = (zd1) obj2;
                zd1Var.U.a(new jd1(zd1Var, (VoIPService) obj, i12), true);
                break;
            case 23:
                zd1 zd1Var2 = (zd1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.u1.U = false;
                org.telegram.ui.Components.voip.u1.a();
                ViewPropertyAnimator duration = zd1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                duration.setInterpolator(grVar).start();
                zd1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                zd1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                zd1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                valueAnimator.addListener(new od1(zd1Var2, i11));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(grVar);
                valueAnimator.start();
                break;
            case 24:
                org.telegram.messenger.wp.r1(((org.telegram.ui.Wallet.k0) obj2).a).L3((TLRPC.Updates) obj, false);
                break;
            case 25:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.k0.H("enable backup: ready! getting secret phrase...");
                k0Var.z(new ih.s(17, k0Var, (org.telegram.ui.Wallet.l8) obj), false, true);
                break;
            case 26:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.run();
                    break;
                }
                break;
            case 27:
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
            case 28:
                Exception exc = (Exception) obj;
                ((qh.d) obj2).a(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            default:
                org.telegram.messenger.wp.r1(((org.telegram.ui.Wallet.e2) obj2).a).L3((TLRPC.Updates) obj, false);
                break;
        }
    }
}

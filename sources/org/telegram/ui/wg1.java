package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wg1(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.c;
        final int i12 = this.b;
        switch (i10) {
            case 0:
                oh1 oh1Var = (oh1) obj;
                oh1Var.F.setSignalBarCount(i12);
                if (i12 <= 1) {
                    org.telegram.ui.Components.voip.a3 a3Var = oh1Var.v;
                    if (a3Var.V != 3) {
                        a3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(a3Var.H, 255);
                        a3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var, 2));
                        a3Var.O.setDuration(500L);
                        a3Var.O.start();
                    }
                    oh1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.a3 a3Var2 = oh1Var.v;
                    if (a3Var2.V != 2) {
                        a3Var2.V = 2;
                        a3Var2.c();
                        ValueAnimator valueAnimator = a3Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            a3Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(a3Var2.H, 0);
                        a3Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var2, 0));
                        a3Var2.O.setDuration(500L);
                        a3Var2.O.start();
                    }
                    oh1Var.F.c(false);
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                HashSet hashSet = l0Var.E;
                hashSet.remove(Integer.valueOf(i12));
                if (hashSet.isEmpty()) {
                    l0Var.Q();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i12);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(notificationCenter, (f80) obj, w9);
                notificationCenter.addObserver(a0Var, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(a0Var, 10000L);
                if (w9.e == null && w9.A < 0) {
                    w9.W();
                }
                w9.U();
                a0Var.a();
                break;
            case 3:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c41(p5Var, i12, org.telegram.ui.Wallet.p5.h(p5Var.R, i12), 19));
                break;
            case 4:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                if (m6Var.r && !m6Var.x && i12 == m6Var.k0) {
                    m6Var.postDelayed(m6Var.l0, 500L);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Wallet.w7 w7Var = (org.telegram.ui.Wallet.w7) obj;
                ArrayList arrayList = w7Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) w7Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i13 = 0; i12 < arrayList.size() && i13 < split.length; i13++) {
                            ((org.telegram.ui.Wallet.ia) arrayList.get(i12)).setText(split[i13]);
                            i12++;
                        }
                        w7Var.Y();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.s9 s9Var = (org.telegram.ui.Wallet.s9) obj;
                if (!s9Var.n && i12 == s9Var.I) {
                    s9Var.K = false;
                    s9Var.a.Z2.N(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    try {
                        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pf.a
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i12, true);
                            }
                        });
                        c2VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 8:
                rg.j jVar = (rg.j) obj;
                jVar.L = i12;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
                }
                ValueAnimator valueAnimator2 = jVar.P;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.Q;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(org.telegram.ui.Components.bs.f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, i11));
                jVar.P.start();
                break;
            case 9:
                jt0 jt0Var = (jt0) obj;
                qg.s1 s1Var = jt0Var.K1;
                jt0Var.s0(s1Var, null);
                qg.u0.e(i12).j(s1Var.c);
                break;
            case 10:
                rg.o2 o2Var = (rg.o2) obj;
                o2Var.getClass();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o2Var.h();
                break;
            case 11:
                org.telegram.ui.Components.y90 y90Var = ((ug.p0) obj).e;
                try {
                    if (y90Var.getLayout().getLineForOffset(i12) == 0) {
                        y90Var.getEditableText().insert(i12, "\n");
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                ((org.telegram.ui.ActionBar.h5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
        }
    }

    public /* synthetic */ wg1(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yg1(int i10, kb0 kb0Var) {
        this.a = 2;
        this.b = i10;
        this.c = kb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i10 = this.a;
        int i11 = 2;
        final int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                rh1 rh1Var = (rh1) obj;
                rh1Var.F.setSignalBarCount(i12);
                if (i12 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = rh1Var.v;
                    if (d3Var.V != 3) {
                        d3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.H, 255);
                        d3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.O.setDuration(500L);
                        d3Var.O.start();
                    }
                    rh1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.d3 d3Var2 = rh1Var.v;
                    if (d3Var2.V != 2) {
                        d3Var2.V = 2;
                        d3Var2.c();
                        ValueAnimator valueAnimator = d3Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            d3Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(d3Var2.H, 0);
                        d3Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var2, 0));
                        d3Var2.O.setDuration(500L);
                        d3Var2.O.start();
                    }
                    rh1Var.F.c(false);
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                HashSet hashSet = l0Var.E;
                hashSet.remove(Integer.valueOf(i12));
                if (hashSet.isEmpty()) {
                    l0Var.S();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i12);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(notificationCenter, (kb0) obj, x9);
                notificationCenter.addObserver(a0Var, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(a0Var, 10000L);
                if (x9.e == null && x9.A < 0) {
                    x9.Y();
                }
                x9.W();
                a0Var.a();
                break;
            case 3:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) obj;
                AndroidUtilities.runOnUIThread(new fx(n5Var, i12, org.telegram.ui.Wallet.n5.h(n5Var.R, i12), 18));
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
                            ((org.telegram.ui.Wallet.ha) arrayList.get(i12)).setText(split[i13]);
                            i12++;
                        }
                        w7Var.Z();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) obj;
                if (!r9Var.r && i12 == r9Var.J) {
                    r9Var.L = false;
                    r9Var.a.g3.O(true);
                    break;
                }
                break;
            case 7:
                ((ph.a) obj).w0(i12, 0, null);
                break;
            case 8:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) obj;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    try {
                        e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: qf.a
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i12, true);
                            }
                        });
                        e2VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 9:
                sg.j jVar = (sg.j) obj;
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
                duration.setInterpolator(org.telegram.ui.Components.ds.f);
                jVar.P.addUpdateListener(new sg.f(jVar, 5));
                jVar.P.addListener(new sg.g(jVar, i11));
                jVar.P.start();
                break;
            case 10:
                pt0 pt0Var = (pt0) obj;
                rg.q1 q1Var = pt0Var.z1;
                pt0Var.r0(q1Var, null);
                rg.s0.e(i12).j(q1Var.c);
                break;
            case 11:
                sg.o2 o2Var = (sg.o2) obj;
                o2Var.getClass();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o2Var.h();
                break;
            default:
                org.telegram.ui.Components.aa0 aa0Var = ((vg.r0) obj).e;
                try {
                    if (aa0Var.getLayout().getLineForOffset(i12) == 0) {
                        aa0Var.getEditableText().insert(i12, "\n");
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                break;
        }
    }

    public /* synthetic */ yg1(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}

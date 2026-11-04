package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ xe(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.y0 y0Var;
        int i3 = this.a;
        int i10 = 0;
        wm wmVar = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.d0(wmVar.A0, new ei.e(10));
                fl flVar = wmVar.D0;
                if (flVar != null) {
                    flVar.O(false);
                    break;
                }
                break;
            case 1:
                wmVar.O7(true);
                break;
            case 2:
                wmVar.O7(true);
                break;
            case 3:
                wmVar.Yc();
                break;
            case 4:
                wmVar.O7(false);
                vg.v0 v0Var = new vg.v0((org.telegram.ui.ActionBar.d2) wmVar, 24, true);
                v0Var.p0 = false;
                v0Var.I0 = new ce(wmVar, 2);
                v0Var.show();
                break;
            case 5:
                wm.x0(wmVar);
                break;
            case 6:
                if (wmVar.getUserConfig().q()) {
                    wmVar.nc = null;
                    wmVar.vd(true);
                    org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                    wmVar.getMessagesController().o0(true);
                    break;
                } else {
                    wmVar.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) wmVar, 3, true));
                    break;
                }
            case 7:
                mj mjVar = wmVar.a0;
                if (mjVar != null) {
                    mjVar.n0(true);
                    break;
                }
                break;
            case 8:
                wm.Z(wmVar);
                break;
            case 9:
                wmVar.Ka = null;
                wmVar.Ja = -1;
                View view = wmVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                wmVar.Lc(false);
                break;
            case 11:
                ArrayList arrayList = wmVar.L6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = ((org.telegram.messenger.zi) arrayList.get(i11)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                wmVar.C6 = 0;
                wmVar.getMessagesController().o3(wmVar.k6, wmVar.b());
                wmVar.D6 = true;
                wmVar.nc(false);
                org.telegram.ui.ActionBar.f1 f1Var = wmVar.f9;
                if (f1Var != null) {
                    f1Var.dismiss();
                    break;
                }
                break;
            case 12:
                ArrayList arrayList2 = wmVar.L6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((org.telegram.messenger.zi) arrayList2.get(i12)).i5();
                }
                wmVar.A1 = 0;
                wmVar.fd(true);
                wmVar.getMessagesController().t3(wmVar.k6, wmVar.b());
                org.telegram.ui.ActionBar.f1 f1Var2 = wmVar.f9;
                if (f1Var2 != null) {
                    f1Var2.dismiss();
                    break;
                }
                break;
            case 13:
                ArrayList arrayList3 = wmVar.L6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.zi) arrayList3.get(i13)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                wmVar.B1 = 0;
                wmVar.ed(true);
                wmVar.getMessagesController().s3(wmVar.k6, wmVar.b());
                org.telegram.ui.ActionBar.f1 f1Var3 = wmVar.f9;
                if (f1Var3 != null) {
                    f1Var3.dismiss();
                    break;
                }
                break;
            case 14:
                wm.z1(wmVar);
                break;
            case 15:
                wmVar.a0.G0();
                break;
            case 16:
                wmVar.Ec(true);
                wmVar.ud(true);
                org.telegram.ui.Components.fc.z(wmVar, 4, 0, wmVar.ya).j();
                break;
            case 17:
                org.telegram.ui.Components.fc.a0(wmVar).I(R.raw.chats_infotip, org.telegram.messenger.bd.M0(2131753290, null), org.telegram.messenger.bd.M0(2131753291, null)).j();
                break;
            case 18:
                wmVar.finishFragment();
                break;
            case 19:
                wmVar.v8(false, true, 0.0f);
                break;
            case 20:
                org.telegram.messenger.g0.E2(wmVar.Y0);
                break;
            case 21:
                wmVar.P4 = null;
                wmVar.K9();
                wmVar.M9();
                break;
            case 22:
                wmVar.v8(false, true, 0.0f);
                break;
            case 23:
                wmVar.Ib = null;
                break;
            case 24:
                wmVar.g7();
                break;
            case 25:
                wmVar.I9 = false;
                wmVar.B9(true);
                break;
            case 26:
                wmVar.H7 = null;
                org.telegram.ui.Components.p40 p40Var = wmVar.q3;
                if (p40Var != null) {
                    org.telegram.ui.Components.m40 cameraContainer = p40Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m40, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m40, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m40, Float>) property, 0.0f), ObjectAnimator.ofFloat(wmVar.q3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(wmVar.q3.getPaint(), org.telegram.ui.Components.k6.b, 0), ObjectAnimator.ofFloat(wmVar.q3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ai(wmVar, i10));
                    animatorSet.start();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ActionBar.y0[] y0VarArr = wmVar.h9;
                if (y0VarArr != null && y0VarArr.length > 0 && (y0Var = y0VarArr[0]) != null) {
                    y0Var.requestFocus();
                    wmVar.h9[0].performAccessibilityAction(64, null);
                    wmVar.h9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 28:
                pj pjVar = wmVar.I8;
                if (pjVar != null && pjVar.getParent() != null) {
                    wmVar.A0.g1();
                    wmVar.K8.setDrawingReady(false);
                    wmVar.I8.setTag(null);
                    wmVar.m1.removeView(wmVar.I8);
                    break;
                }
                break;
            default:
                wmVar.v8(false, true, 0.0f);
                break;
        }
    }
}

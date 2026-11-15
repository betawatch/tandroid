package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ye(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        an anVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.d0(anVar.A0, new fi.e(11));
                jl jlVar = anVar.D0;
                if (jlVar != null) {
                    jlVar.O(true);
                    break;
                }
                break;
            case 1:
                anVar.P7(true);
                break;
            case 2:
                anVar.P7(true);
                break;
            case 3:
                org.telegram.messenger.g0.d0(anVar.A0, new fi.e(10));
                jl jlVar2 = anVar.D0;
                if (jlVar2 != null) {
                    jlVar2.O(false);
                    break;
                }
                break;
            case 4:
                anVar.cd();
                break;
            case 5:
                anVar.P7(false);
                ug.x0 x0Var = new ug.x0((org.telegram.ui.ActionBar.e2) anVar, 24, true);
                x0Var.p0 = false;
                x0Var.I0 = new ge(anVar, 7);
                x0Var.show();
                break;
            case 6:
                an.A0(anVar);
                break;
            case 7:
                if (anVar.getUserConfig().q()) {
                    anVar.pc = null;
                    anVar.zd(true);
                    org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                    anVar.getMessagesController().o0(true);
                    break;
                } else {
                    anVar.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) anVar, 3, true));
                    break;
                }
            case 8:
                qj qjVar = anVar.a0;
                if (qjVar != null) {
                    qjVar.C0(true);
                    break;
                }
                break;
            case 9:
                an.Z(anVar);
                break;
            case 10:
                anVar.Ma = null;
                anVar.La = -1;
                View view = anVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 11:
                ArrayList arrayList = anVar.L6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = ((org.telegram.messenger.gj) arrayList.get(i11)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                anVar.C6 = 0;
                anVar.getMessagesController().o3(anVar.k6, anVar.b());
                anVar.D6 = true;
                anVar.rc(false);
                org.telegram.ui.ActionBar.g1 g1Var = anVar.f9;
                if (g1Var != null) {
                    g1Var.dismiss();
                    break;
                }
                break;
            case 12:
                ArrayList arrayList2 = anVar.L6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((org.telegram.messenger.gj) arrayList2.get(i12)).h5();
                }
                anVar.A1 = 0;
                anVar.jd(true);
                anVar.getMessagesController().t3(anVar.k6, anVar.b());
                org.telegram.ui.ActionBar.g1 g1Var2 = anVar.f9;
                if (g1Var2 != null) {
                    g1Var2.dismiss();
                    break;
                }
                break;
            case 13:
                ArrayList arrayList3 = anVar.L6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.gj) arrayList3.get(i13)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                anVar.B1 = 0;
                anVar.id(true);
                anVar.getMessagesController().s3(anVar.k6, anVar.b());
                org.telegram.ui.ActionBar.g1 g1Var3 = anVar.f9;
                if (g1Var3 != null) {
                    g1Var3.dismiss();
                    break;
                }
                break;
            case 14:
                an.D1(anVar);
                break;
            case 15:
                anVar.x8(false, true, 0.0f);
                break;
            case 16:
                anVar.Ic(true);
                anVar.yd(true);
                org.telegram.ui.Components.cc.z(anVar, 4, 0, anVar.Aa).j();
                break;
            case 17:
                anVar.a0.W0();
                break;
            case 18:
                org.telegram.messenger.g0.E2(anVar.Y0);
                break;
            case 19:
                org.telegram.ui.Components.cc.a0(anVar).I(R.raw.chats_infotip, org.telegram.messenger.hd.M0(2131753290, null), org.telegram.messenger.hd.M0(2131753291, null)).j();
                break;
            case 20:
                anVar.P4 = null;
                anVar.M9();
                anVar.O9();
                break;
            case 21:
                anVar.Pc(false);
                break;
            case 22:
                anVar.Kb = null;
                break;
            case 23:
                anVar.K9 = false;
                anVar.D9(true);
                break;
            case 24:
                anVar.H7 = null;
                org.telegram.ui.Components.w40 w40Var = anVar.q3;
                if (w40Var != null) {
                    org.telegram.ui.Components.t40 cameraContainer = w40Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.t40, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.t40, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.t40, Float>) property, 0.0f), ObjectAnimator.ofFloat(anVar.q3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(anVar.q3.getPaint(), org.telegram.ui.Components.k6.b, 0), ObjectAnimator.ofFloat(anVar.q3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ei(anVar, i10));
                    animatorSet.start();
                    break;
                }
                break;
            case 25:
                anVar.h7();
                break;
            case 26:
                qj qjVar2 = anVar.a0;
                if (qjVar2 != null && anVar.jd != null) {
                    if (qjVar2.G0()) {
                        anVar.a0.y0(false);
                        org.telegram.messenger.g0.J3(anVar.jd.a);
                        ((te.a) anVar.jd.b.b).a(false, true);
                        break;
                    } else {
                        anVar.a0.l1(false, false, false);
                        anVar.a0.K1();
                        ((te.a) anVar.jd.b.b).a(true, true);
                        break;
                    }
                }
                break;
            case 27:
                tj tjVar = anVar.I8;
                if (tjVar != null && tjVar.getParent() != null) {
                    anVar.A0.g1();
                    anVar.K8.setDrawingReady(false);
                    anVar.I8.setTag(null);
                    anVar.m1.removeView(anVar.I8);
                    break;
                }
                break;
            case 28:
                anVar.Va();
                break;
            default:
                anVar.B9();
                anVar.gd(0, true);
                break;
        }
    }
}

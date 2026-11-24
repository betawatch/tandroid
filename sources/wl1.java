// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wl1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ wl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 4;
        byte b4 = 0;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                ar1 ar1Var = mu1Var.a0;
                if (ar1Var != null && mu1Var.Sb != 5) {
                    ar1Var.h1();
                    break;
                }
                break;
            case 1:
                pc2 pc2Var = ((pc2[]) mu1Var.c0.b)[0];
                jia jiaVar = pc2Var.d;
                jia jiaVar2 = pc2Var.e;
                mu1Var.U1 = !mu1Var.U1;
                jiaVar.setPivotX(0.0f);
                jiaVar2.setPivotX(0.0f);
                if (mu1Var.U1) {
                    jiaVar.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    jiaVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    jiaVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    jiaVar2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                gl.e3(mu1Var.V1, 6000L);
                break;
            case 2:
                gl.d0(mu1Var.A0, new bm0(b2));
                vs1 vs1Var = mu1Var.D0;
                if (vs1Var != null) {
                    vs1Var.J(true);
                    break;
                }
                break;
            case 3:
                mu1Var.F5(true);
                break;
            case 4:
                mu1Var.F5(true);
                break;
            case 5:
                gl.d0(mu1Var.A0, new bm0(b3));
                vs1 vs1Var2 = mu1Var.D0;
                if (vs1Var2 != null) {
                    vs1Var2.J(false);
                    break;
                }
                break;
            case 6:
                mu1Var.Oc();
                break;
            case 7:
                mu1Var.F5(false);
                jh8 jh8Var = new jh8((d) mu1Var, 24, true);
                jh8Var.p0 = false;
                jh8Var.I0 = new cl1(mu1Var, (byte) 7);
                jh8Var.show();
                break;
            case 8:
                mu1Var.E9();
                break;
            case 9:
                if (mu1Var.getUserConfig().p()) {
                    mu1Var.qc = null;
                    mu1Var.ld(true);
                    u21.b0(mu1Var).c(k96.M0(2131754485, null)).j();
                    mu1Var.getMessagesController().l0(true);
                    break;
                } else {
                    mu1Var.showDialog(new jh8((d) mu1Var, 3, true));
                    break;
                }
            case 10:
                ar1 ar1Var2 = mu1Var.a0;
                if (ar1Var2 != null) {
                    ar1Var2.N0(true);
                    break;
                }
                break;
            case 11:
                mu1Var.v9();
                break;
            case 12:
                mu1Var.Na = null;
                mu1Var.Ma = -1;
                View view = mu1Var.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 13:
                ArrayList arrayList = mu1Var.M6;
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.Message message = ((k27) arrayList.get(i)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                mu1Var.D6 = 0;
                mu1Var.getMessagesController().p3(mu1Var.l6, mu1Var.d());
                mu1Var.E6 = true;
                mu1Var.Yb(false);
                m8 m8Var = mu1Var.g9;
                if (m8Var != null) {
                    m8Var.dismiss();
                    break;
                }
                break;
            case 14:
                ArrayList arrayList2 = mu1Var.M6;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    ((k27) arrayList2.get(i2)).g5();
                }
                mu1Var.A1 = 0;
                mu1Var.Vc(true);
                mu1Var.getMessagesController().u3(mu1Var.l6, mu1Var.d());
                m8 m8Var2 = mu1Var.g9;
                if (m8Var2 != null) {
                    m8Var2.dismiss();
                    break;
                }
                break;
            case 15:
                ArrayList arrayList3 = mu1Var.M6;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    TLRPC.Message message2 = ((k27) arrayList3.get(i3)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                mu1Var.B1 = 0;
                mu1Var.Uc(true);
                mu1Var.getMessagesController().t3(mu1Var.l6, mu1Var.d());
                m8 m8Var3 = mu1Var.g9;
                if (m8Var3 != null) {
                    m8Var3.dismiss();
                    break;
                }
                break;
            case 16:
                mu1Var.n9();
                break;
            case 17:
                mu1Var.p6(false, true, 0.0f);
                break;
            case 18:
                mu1Var.tc(true);
                mu1Var.kd(true);
                u21.z(mu1Var, 4, 0, mu1Var.Ba).j();
                break;
            case 19:
                mu1Var.a0.h1();
                break;
            case 20:
                gl.B2(mu1Var.Y0);
                break;
            case 21:
                u21.b0(mu1Var).I(R.raw.chats_infotip, k96.M0(2131753287, null), k96.M0(2131753288, null)).j();
                break;
            case 22:
                mu1Var.Q4 = null;
                mu1Var.E7();
                mu1Var.G7();
                break;
            case 23:
                mu1Var.Bc(false);
                break;
            case 24:
                mu1Var.Lb = null;
                break;
            case 25:
                mu1Var.L9 = false;
                mu1Var.u7(true);
                break;
            case 26:
                mu1Var.I7 = null;
                q qVar = mu1Var.q3;
                if (qVar != null) {
                    wo5 cameraContainer = qVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<wo5, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<wo5, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<wo5, Float>) property, 0.0f), ObjectAnimator.ofFloat(mu1Var.q3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(mu1Var.q3.getPaint(), rn.b, 0), ObjectAnimator.ofFloat(mu1Var.q3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new lp1(mu1Var, b4));
                    animatorSet.start();
                    break;
                }
                break;
            case 27:
                mu1Var.X4();
                break;
            case 28:
                dr1 dr1Var = mu1Var.J8;
                if (dr1Var != null && dr1Var.getParent() != null) {
                    mu1Var.A0.h1();
                    mu1Var.L8.setDrawingReady(false);
                    mu1Var.J8.setTag(null);
                    mu1Var.m1.removeView(mu1Var.J8);
                    break;
                }
                break;
            default:
                ar1 ar1Var3 = mu1Var.a0;
                if (ar1Var3 != null && mu1Var.kd != null) {
                    boolean Q0 = ar1Var3.Q0();
                    ar1 ar1Var4 = mu1Var.a0;
                    if (Q0) {
                        ar1Var4.J0(false);
                        gl.F3(mu1Var.kd.a);
                        ((fm0) mu1Var.kd.b.b).a(false, true);
                        break;
                    } else {
                        ar1Var4.w1(false, false, false);
                        mu1Var.a0.V1();
                        ((fm0) mu1Var.kd.b.b).a(true, true);
                        break;
                    }
                }
                break;
        }
    }
}

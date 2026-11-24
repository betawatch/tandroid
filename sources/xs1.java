// default package

import android.app.Activity;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xs1 implements hy1 {
    public int a;
    public final /* synthetic */ mu1 b;

    public xs1(mu1 mu1Var) {
        this.b = mu1Var;
    }

    @Override // hy1
    public final void A(boolean z) {
        this.b.lc(false, z);
    }

    @Override // hy1
    public final void B() {
        dbb dbbVar = this.b.s1;
        if (dbbVar != null) {
            dbbVar.e();
        }
    }

    @Override // hy1
    public final void C0(CharSequence charSequence, boolean z, boolean z2) {
        CharSequence charSequence2;
        je5 je5Var;
        TLRPC.ChatFull chatFull;
        MediaController w = MediaController.w();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z3 = false;
        mu1 mu1Var = this.b;
        w.N = !isEmpty || mu1Var.a0.P0();
        sq1 sq1Var = mu1Var.X1;
        if (sq1Var == null || sq1Var.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            mu1Var.X1.getAdapter().U(charSequence2, mu1Var.a0.getCursorPosition(), mu1Var.M6, false, false);
        }
        tq4 tq4Var = mu1Var.b6;
        if (tq4Var != null) {
            gl.r(tq4Var);
            mu1Var.b6 = null;
        }
        TLRPC.Chat chat = mu1Var.e;
        if (chat == null || hc2.m(chat)) {
            ar1 ar1Var = mu1Var.a0;
            if (ar1Var.O3 && (!ar1Var.P0() || !mu1Var.a0.Q2)) {
                if (z) {
                    mu1Var.hb(charSequence2, true);
                } else {
                    mu1Var.R4(charSequence2);
                    tq4 tq4Var2 = new tq4(this, charSequence2, false, (byte) 4);
                    mu1Var.b6 = tq4Var2;
                    gl.e3(tq4Var2, gl.S == null ? 3000L : 1000L);
                }
            }
        }
        kr1 kr1Var = mu1Var.Ua;
        if (kr1Var != null) {
            ArrayList arrayList = kr1Var.G;
            for (int i = 0; i < arrayList.size(); i++) {
                ((yu3) arrayList.get(i)).n = true;
            }
        }
        d19 d19Var = d19.B;
        if (d19Var != null) {
            d19Var.l = true;
        }
        d19 d19Var2 = d19.C;
        if (d19Var2 != null) {
            d19Var2.l = true;
        }
        if (z2) {
            return;
        }
        je5 je5Var2 = mu1Var.v2;
        if ((je5Var2 != null && je5Var2.W) || ((je5Var = mu1Var.x2) != null && je5Var.W)) {
            if (je5Var2 != null) {
                je5Var2.f(true);
            }
            je5 je5Var3 = mu1Var.x2;
            if (je5Var3 != null) {
                je5Var3.f(true);
                return;
            }
            return;
        }
        vm1 vm1Var = mu1Var.lb;
        if (l7c.C(mu1Var.f) || ((chatFull = mu1Var.r8) != null && chatFull.slowmode_next_send_date > 0 && mu1Var.g4 == 0)) {
            z3 = true;
        }
        if (mu1Var.y2 || mu1Var.w2 || z3 || gba.L >= 3 || mu1Var.a0.P0()) {
            return;
        }
        gl.r(vm1Var);
        gl.e3(vm1Var, 4000L);
    }

    @Override // hy1
    public final bu1 G() {
        return this.b.D5;
    }

    @Override // hy1
    public final void G0() {
        q qVar = this.b.q3;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override // hy1
    public final boolean H0() {
        mu1 mu1Var = this.b;
        TLRPC.User user = mu1Var.f;
        return (user == null || l7c.C(user) || mu1Var.f.bot || mu1Var.h != null || mu1Var.g4 != 0) ? false : true;
    }

    @Override // hy1
    public final void I0() {
        int i;
        mu1 mu1Var = this.b;
        Activity parentActivity = mu1Var.getParentActivity();
        i = ((d) mu1Var).currentAccount;
        long j = mu1Var.l6;
        u47 u47Var = mu1Var.y5;
        if (u47Var == null) {
            u47Var = u47.a();
        }
        new t47(parentActivity, i, j, u47Var, mu1Var, mu1Var.getResourceProvider(), 0, new hl1(mu1Var, (byte) 9)).show();
    }

    @Override // hy1
    public final void J() {
        a aVar;
        mu1 mu1Var = this.b;
        aVar = ((d) mu1Var).actionBar;
        if (aVar.o0 || mu1Var.V7() || !TextUtils.isEmpty(mu1Var.a0.getSlowModeTimer())) {
            return;
        }
        r7 r7Var = mu1Var.j0;
        if (r7Var != null) {
            r7Var.setVisibility(8);
        }
        q6 q6Var = mu1Var.g0;
        if (q6Var != null) {
            q6Var.e(0);
        }
        fq2 fq2Var = mu1Var.f0;
        if (fq2Var != null) {
            fq2Var.b(true);
        }
    }

    @Override // hy1
    public final void K0() {
        this.b.K4();
    }

    @Override // hy1
    public final void L0() {
        int i;
        int i2;
        mu1 mu1Var = this.b;
        mu1Var.b5();
        ar1 ar1Var = mu1Var.a0;
        boolean z = ar1Var.p4;
        wx1 wx1Var = ar1Var.V0;
        mu1Var.fd.a(z && !(wx1Var != null && wx1Var.getCurrentPage() == 0), true);
        if (z) {
            Activity parentActivity = mu1Var.getParentActivity();
            i2 = ((d) mu1Var).classGuid;
            gl.h3(parentActivity, i2);
            m21 m21Var = m21.w;
            if (m21Var != null && m21Var.l) {
                m21Var.b();
            }
        } else {
            Activity parentActivity2 = mu1Var.getParentActivity();
            i = ((d) mu1Var).classGuid;
            gl.W2(parentActivity2, i);
        }
        sq1 sq1Var = mu1Var.X1;
        float f = 0.0f;
        if (sq1Var != null) {
            sq1Var.animate().alpha((z || mu1Var.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(s33.f).start();
        }
        dbb dbbVar = mu1Var.s1;
        if (dbbVar != null) {
            dbbVar.setVisibility(0);
            ViewPropertyAnimator animate = mu1Var.s1.animate();
            if (!z && !mu1Var.isInPreviewMode()) {
                f = 1.0f;
            }
            animate.alpha(f).setInterpolator(s33.f).withEndAction(new x6c((byte) 9, this, z)).start();
        }
    }

    @Override // hy1
    public final void O0(View view, CharSequence charSequence, boolean z) {
        mu1 mu1Var = this.b;
        mu1Var.hc(view, charSequence, z);
        r7 r7Var = mu1Var.j0;
        if (r7Var == null || r7Var.getVisibility() == 0) {
            return;
        }
        mu1Var.j0.setVisibility(0);
        q6 q6Var = mu1Var.g0;
        if (q6Var != null) {
            q6Var.e(8);
        }
        fq2 fq2Var = mu1Var.f0;
        if (fq2Var != null) {
            fq2Var.b(false);
        }
    }

    @Override // hy1
    public final void P0(CharSequence charSequence) {
        this.b.hb(charSequence, true);
    }

    @Override // hy1
    public final boolean Q0() {
        m27 m27Var;
        o27 o27Var = this.b.x5;
        return (o27Var == null || (m27Var = o27Var.b) == null || m27Var.e.isEmpty()) ? false : true;
    }

    @Override // hy1
    public final boolean R() {
        int i;
        mu1 mu1Var = this.b;
        if ((mu1Var.getMessagesController().r2(mu1Var.a()) && !mu1Var.x4) || (i = mu1Var.g4) == 9 || mu1Var.h4 <= 0) {
            return false;
        }
        if (i != 0) {
            return i == 3 && mu1Var.V6() == mu1Var.getUserConfig().e();
        }
        return true;
    }

    @Override // hy1
    public final void R0() {
        int i;
        long j;
        long j2;
        mu1 mu1Var = this.b;
        i = ((d) mu1Var).currentAccount;
        wp0 b = wp0.b(i);
        long j3 = mu1Var.l6;
        long d = (int) mu1Var.d();
        lj9 lj9Var = b.a;
        LongSparseArray x = lj9Var.x(j3, d);
        if (x != null && x.size() > 0) {
            int size = x.size();
            rp0 rp0Var = null;
            int i2 = 0;
            long j4 = 0;
            while (true) {
                if (i2 >= size) {
                    j = 0;
                    break;
                }
                j4 = x.keyAt(i2);
                rp0Var = (rp0) x.valueAt(i2);
                j = 0;
                if (!rp0Var.e) {
                    break;
                } else {
                    i2++;
                }
            }
            rp0 rp0Var2 = rp0Var;
            long j5 = j4;
            if (rp0Var2 != null && !rp0Var2.e) {
                Runnable runnable = rp0Var2.f;
                if (runnable != null) {
                    gl.r(runnable);
                }
                b.b.F(j3, d, j5, new Object());
                if (rp0Var2.d) {
                    rp0Var2.e = true;
                    j2 = j5;
                } else {
                    lj9Var.G(j3, d, j5);
                    j2 = j5;
                    kk7 notificationCenter = b.getNotificationCenter();
                    sp0 sp0Var = new sp0(j3, rp0Var2.b, d);
                    d = d;
                    notificationCenter.k(kk7.N5, sp0Var);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j2;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b.getMessagesController().h1(j3);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (d != j) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) d;
                }
                b.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new np0((byte) 0));
            }
        }
        mu1Var.h5(true);
    }

    @Override // hy1
    public final void T() {
        mu1 mu1Var = this.b;
        mu1Var.L9 = true;
        vs1 vs1Var = mu1Var.D0;
        if (vs1Var != null) {
            vs1Var.F(true);
        }
    }

    @Override // hy1
    public final void W0() {
        int i;
        int i2;
        mu1 mu1Var = this.b;
        if (mu1Var.Q7() || (i = mu1Var.g4) == 6 || i == 8) {
            return;
        }
        na7 messagesController = mu1Var.getMessagesController();
        long j = mu1Var.l6;
        long j2 = mu1Var.s4;
        i2 = ((d) mu1Var).classGuid;
        messagesController.G4(0, i2, j, j2, null);
    }

    @Override // hy1
    public final void Z() {
        this.b.na(0, false);
    }

    @Override // hy1
    public final void a() {
        this.b.Pc();
    }

    @Override // hy1
    public final void e() {
        dbb dbbVar = this.b.s1;
        if (dbbVar != null) {
            dbbVar.e();
        }
    }

    @Override // hy1
    public final void e1() {
        dbb dbbVar = this.b.s1;
        if (dbbVar != null) {
            dbbVar.d();
        }
    }

    @Override // hy1
    public final void f0() {
        mu1 mu1Var = this.b;
        z3a sendMessagesHelper = mu1Var.getSendMessagesHelper();
        long j = mu1Var.l6;
        SparseArray sparseArray = sendMessagesHelper.e;
        SparseArray sparseArray2 = sendMessagesHelper.c;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= sparseArray2.size()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseArray.size()) {
                        break;
                    }
                    TLRPC.Message message = (TLRPC.Message) sparseArray.valueAt(i3);
                    if (message.dialog_id == j) {
                        i = message.id;
                        break;
                    }
                    i3++;
                }
            } else {
                TLRPC.Message message2 = (TLRPC.Message) sparseArray2.valueAt(i2);
                if (message2.dialog_id == j) {
                    i = message2.id;
                    break;
                }
                i2++;
            }
        }
        int i4 = i;
        if (i4 != 0) {
            mu1Var.J(i4, 0, 0, 0, true, true);
        }
    }

    @Override // hy1
    public final void f1(int i) {
        int currentActionBarHeight = a.getCurrentActionBarHeight() + gl.L(72.0f);
        mu1 mu1Var = this.b;
        if (i < currentActionBarHeight) {
            mu1Var.r5 = false;
            if (mu1Var.s1.getVisibility() == 0) {
                mu1Var.s1.setVisibility(4);
            }
        } else {
            mu1Var.r5 = true;
            if (mu1Var.s1.getVisibility() == 4 && !mu1Var.isInPreviewMode()) {
                mu1Var.s1.setVisibility(0);
            }
        }
        mu1Var.s5 = !mu1Var.a0.Q0();
        int i2 = i + (mu1Var.a0.Q0() ? 65536 : 0);
        if (this.a != i2) {
            mu1Var.d0 = 0;
        }
        this.a = i2;
    }

    @Override // hy1
    public final boolean g() {
        return this.b.O4();
    }

    @Override // hy1
    public final void g1() {
        int indexOfChild;
        mu1 mu1Var = this.b;
        if (mu1Var.getParentActivity() != null) {
            if ((mu1Var.e == null && mu1Var.s8 == null) || mu1Var.fragmentView == null) {
                return;
            }
            je5 je5Var = mu1Var.u2;
            if ((je5Var == null || !je5Var.W) && (indexOfChild = mu1Var.m1.indexOfChild(mu1Var.U)) != -1) {
                try {
                    mu1Var.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                je5 je5Var2 = mu1Var.u2;
                if (je5Var2 == null) {
                    je5Var2 = mu1Var.r4(310.0f, 3, indexOfChild + 1, false);
                    mu1Var.u2 = je5Var2;
                }
                TLRPC.UserFull userFull = mu1Var.s8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    je5Var2.t(gl.T2(k96.a0(null, null, mu1Var.a0.d1 ? 2131743355 : 2131743278, mu1Var.f.first_name)));
                } else if (hc2.v(mu1Var.e) || hc2.s(mu1Var.e)) {
                    if (hc2.P(20, mu1Var.e)) {
                        mu1Var.u2.t(k96.M0(2131749362, null));
                    } else if (hc2.P(21, mu1Var.e)) {
                        mu1Var.u2.t(k96.M0(2131749365, null));
                    } else if (hc2.P(7, mu1Var.e)) {
                        mu1Var.u2.t(k96.M0(2131749368, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = mu1Var.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        boolean B1 = gl.B1(tL_chatBannedRights);
                        je5 je5Var3 = mu1Var.u2;
                        if (B1) {
                            je5Var3.t(k96.M0(2131753952, null));
                        } else {
                            je5Var3.t(k96.a0("AttachMediaRestricted", null, 2131753953, k96.v(mu1Var.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (mu1Var.O4()) {
                        return;
                    }
                    boolean z = mu1Var.a0.d1;
                    je5 je5Var4 = mu1Var.u2;
                    TLRPC.Chat chat = mu1Var.e;
                    if (z) {
                        je5Var4.t(hc2.L(21, chat));
                    } else {
                        je5Var4.t(hc2.L(20, chat));
                    }
                }
                View sendButton = mu1Var.a0.getSendButton();
                View audioVideoButtonContainer = mu1Var.a0.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                mu1Var.u2.x(sendButton, true);
            }
        }
    }

    @Override // hy1
    public final int h() {
        return this.b.m1.Q();
    }

    @Override // hy1
    public final TLRPC.Peer i() {
        return null;
    }

    @Override // hy1
    public final void j() {
        boolean z;
        mu1 mu1Var = this.b;
        if (mu1Var.B0 != null) {
            mu1Var.d0 = mu1Var.a0.getBackgroundTop();
        }
        sq1 sq1Var = mu1Var.X1;
        if (sq1Var != null) {
            sq1Var.getAdapter().g0 = true;
        }
        if (mu1Var.H5 != null) {
            gl.e3(new hq1(this, (byte) 3), 30L);
        }
        if (mu1Var.a0.Q0()) {
            mu1Var.a0.F1();
            z = true;
        } else {
            z = false;
        }
        mu1Var.a0.w1(true, true, z);
        if (mu1Var.G5 != 0) {
            mu1Var.getConnectionsManager().cancelRequest(mu1Var.G5, true);
            mu1Var.G5 = 0;
        }
        mu1Var.Sc(0, true);
        mu1Var.Bc(false);
        mu1Var.sd(false);
    }

    @Override // hy1
    public final void j1(boolean z) {
        mu1 mu1Var = this.b;
        View view = mu1Var.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        mu1Var.t5 = !z;
    }

    @Override // hy1
    public final void k(float f) {
        mu1 mu1Var = this.b;
        if (f != 0.0f) {
            mu1Var.R4 = true;
        }
        mu1Var.E7();
        mu1Var.G7();
        mu1Var.hd(false, false);
        mu1Var.m1.invalidate();
        m21 m21Var = m21.w;
        if (m21Var == null || mu1Var.Ec == null) {
            return;
        }
        m21Var.l();
    }

    @Override // hy1
    public final void k1(int i, int i2, int i3, long j, long j2, boolean z) {
        mu1 mu1Var = this.b;
        boolean z2 = false;
        if (mu1Var.q3 == null && CameraView.isCameraAllowed() && mu1Var.getParentActivity() != null) {
            Activity parentActivity = mu1Var.getParentActivity();
            ku1 ku1Var = mu1Var.Ba;
            int i4 = zo5.e;
            q qVar = new q(parentActivity, mu1Var, ku1Var, true);
            mu1Var.q3 = qVar;
            qVar.setAnimationCallback(new yk1(mu1Var, (byte) 0));
            mu1Var.q3.setTrimCallback(new yk1(mu1Var, (byte) 1));
            mu1Var.q3.setRecordingUiFrameCallback(new l69(mu1Var, (byte) 18));
            mu1Var.q3.setClipToPadding(false);
            q qVar2 = mu1Var.q3;
            kl0 kl0Var = mu1Var.L;
            wp1 wp1Var = mu1Var.x;
            LinearLayout linearLayout = qVar2.G;
            il0 c = kl0Var.c(linearLayout, wp1Var, false);
            c.q(gl.L(6.0f));
            c.r(gl.L(21.0f));
            linearLayout.setBackground(c);
            int indexOfChild = mu1Var.m1.indexOfChild(mu1Var.U);
            if (indexOfChild < 0) {
                indexOfChild = mu1Var.m1.getChildCount();
            }
            mu1Var.m1.addView(mu1Var.q3, Math.min(indexOfChild + 1, mu1Var.m1.getChildCount()), nme.e(-1, -1, 51));
        }
        q qVar3 = mu1Var.q3;
        if (qVar3 != null) {
            if (i == 0) {
                qVar3.v();
                mu1Var.A0.D0();
                mu1Var.D0.O();
            } else {
                if (i == 1 || i == 3 || i == 4) {
                    qVar3.u(i, i2, i3, j, j2, z);
                    return;
                }
                if (i == 2) {
                    z2 = true;
                } else if (i != 5) {
                    return;
                }
                qVar3.f(z2);
            }
        }
    }

    @Override // hy1
    public final void m(boolean z) {
        int i;
        int i2;
        mu1 mu1Var = this.b;
        if (!z) {
            Activity parentActivity = mu1Var.getParentActivity();
            i = ((d) mu1Var).classGuid;
            gl.W2(parentActivity, i);
        } else {
            Activity parentActivity2 = mu1Var.getParentActivity();
            i2 = ((d) mu1Var).classGuid;
            gl.h3(parentActivity2, i2);
            mu1Var.fragmentView.requestLayout();
        }
    }

    @Override // hy1
    public final void n() {
        this.b.lc(true, false);
    }

    @Override // hy1
    public final void n0(int i) {
        int i2 = i == 0 ? 8 : 0;
        mu1 mu1Var = this.b;
        if (mu1Var.r3.getVisibility() != i2) {
            mu1Var.r3.setVisibility(i2);
        }
    }

    @Override // hy1
    public final int o0() {
        return this.b.m1.getHeight();
    }

    @Override // hy1
    public final void o1() {
        mu1 mu1Var = this.b;
        je5 je5Var = mu1Var.v2;
        if (je5Var != null) {
            je5Var.f(true);
        }
        je5 je5Var2 = mu1Var.x2;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
    }

    @Override // hy1
    public final void p1() {
        a aVar;
        mu1 mu1Var = this.b;
        aVar = ((d) mu1Var).actionBar;
        if (aVar.o0) {
            return;
        }
        r7 r7Var = mu1Var.j0;
        if (r7Var != null) {
            r7Var.setVisibility(0);
        }
        q6 q6Var = mu1Var.g0;
        if (q6Var != null) {
            q6Var.e(8);
        }
        fq2 fq2Var = mu1Var.f0;
        if (fq2Var != null) {
            fq2Var.b(false);
        }
    }

    @Override // hy1
    public final void r() {
        dbb dbbVar = this.b.s1;
        if (dbbVar != null) {
            dbbVar.d();
        }
    }

    @Override // hy1
    public final void s1() {
        mu1 mu1Var = this.b;
        x31 x31Var = mu1Var.Y1;
        if (x31Var != null) {
            x31Var.r1(0, null);
        }
        mu1Var.aa();
    }

    @Override // hy1
    public final TL_stories.StoryItem t0() {
        return null;
    }

    @Override // hy1
    public final void u(CharSequence charSequence, boolean z, int i, int i2, long j) {
        mz3 mz3Var;
        k27 k27Var;
        int i3;
        long b2;
        o27 o27Var;
        m27 m27Var;
        TLRPC.Message message;
        m27 m27Var2;
        mu1 mu1Var = this.b;
        ArrayList arrayList = mu1Var.M6;
        if (mu1Var.B0 != null) {
            mu1Var.d0 = mu1Var.a0.getBackgroundTop();
        }
        sq1 sq1Var = mu1Var.X1;
        if (sq1Var != null && sq1Var.getAdapter() != null) {
            mu1Var.X1.getAdapter().x.a(charSequence);
        }
        if (i != 0) {
            int i4 = mu1Var.h4;
            if (i4 == -1) {
                mu1Var.h4 = 0;
                i4 = 0;
            }
            if (charSequence != null) {
                mu1Var.h4 = i4 + 1;
            }
            o27 o27Var2 = mu1Var.x5;
            if (o27Var2 != null && (m27Var2 = o27Var2.b) != null && !m27Var2.e.isEmpty()) {
                mu1Var.h4 += mu1Var.x5.b.e.size();
            }
            mu1Var.Yc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (o27Var = mu1Var.x5) != null && (m27Var = o27Var.b) != null && !m27Var.e.isEmpty() && mu1Var.x5.d == null && j <= 0) {
            ArrayList arrayList2 = new ArrayList();
            mu1Var.x5.b.b(arrayList2);
            boolean z2 = arrayList2.size() > 0;
            TLRPC.Peer w1 = mu1Var.getMessagesController().w1(mu1Var.l6);
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList2.size()) {
                    break;
                }
                k27 k27Var2 = (k27) arrayList2.get(i5);
                if (k27Var2 != null && (message = k27Var2.k) != null && !k27.u5(message.peer_id, w1)) {
                    z2 = false;
                    break;
                }
                i5++;
            }
            if (z2) {
                m21 I = u21.b0(mu1Var).I(R.raw.hint_swipe_reply, k96.M0(2131744065, null), k96.M0(2131744064, null));
                ry8 ry8Var = ((j21) I.e).a;
                ry8Var.setScaleX(1.8f);
                ry8Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (hc2.c0(mu1Var.e) && !mu1Var.x4 && (k27Var = mu1Var.F5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = k27Var.j1;
            if (tL_forumTopic != null) {
                b2 = tL_forumTopic.id;
            } else {
                i3 = ((d) mu1Var).currentAccount;
                b2 = k27.b2(i3, mu1Var.F5.k, true, false);
            }
            long j2 = b2;
            if (j2 != 0) {
                mu1Var.getMediaDataController().F(mu1Var.l6, j2, false);
            }
        }
        mu1Var.Mb(false, null, null, null, null, z, i, null, false, j);
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null && ar1Var.getEmojiView() != null && (mz3Var = mu1Var.a0.getEmojiView().U0) != null) {
            if (mz3Var.e) {
                na7.q1(mz3Var.a).G4(2, 0, mz3Var.b, mz3Var.c, null);
            }
            mz3Var.f = -1L;
        }
        if (mu1Var.getMessagesController().E3() || mu1Var.getMessagesController().G3 > 0 || mu1Var.getMessagesController().a4 >= 2 || mu1Var.getUserConfig().p() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i6 = 1; i6 < Math.min(5, arrayList.size()); i6++) {
            k27 k27Var3 = (k27) arrayList.get(i6);
            if (k27Var3 != null && !k27Var3.O3() && ((k27.Q4(k27Var3.k) || k27Var3.g4()) && k27Var3.k.media_unread)) {
                uyb.v(k27Var3, true);
            }
        }
    }

    @Override // hy1
    public final TLRPC.TL_channels_sendAsPeers v() {
        return this.b.Ea;
    }

    @Override // hy1
    public final void w(float f, int i) {
        q qVar = this.b.q3;
        if (qVar != null) {
            qVar.h(f, i);
        }
    }

    @Override // hy1
    public final boolean x0(long j) {
        return false;
    }

    @Override // hy1
    public final void y() {
        mu1 mu1Var = this.b;
        ar1 ar1Var = mu1Var.a0;
        boolean z = ar1Var.p4;
        wx1 wx1Var = ar1Var.V0;
        boolean z2 = false;
        boolean z3 = wx1Var != null && wx1Var.getCurrentPage() == 0;
        fm0 fm0Var = mu1Var.fd;
        if (z && !z3) {
            z2 = true;
        }
        fm0Var.a(z2, true);
    }

    @Override // hy1
    public final boolean y0() {
        tl9 tl9Var;
        q qVar = this.b.q3;
        if (qVar == null || (tl9Var = qVar.S) == null) {
            return false;
        }
        int i = tl9Var.a;
        return i == 4 || i == 5 || i == 6;
    }
}

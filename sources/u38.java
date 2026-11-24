// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u38 implements uz1 {
    public final /* synthetic */ a58 a;

    public u38(a58 a58Var) {
        this.a = a58Var;
    }

    @Override // uz1
    public final void A1() {
        String str;
        a58 a58Var = this.a;
        if (a58Var.u1) {
            a58Var.Y0();
            return;
        }
        if (a58Var.M2 == null) {
            ig5 ig5Var = new ig5(9, a58Var.r0, a58Var.getContext(), false);
            a58Var.M2 = ig5Var;
            ig5Var.setVisibility(8);
            a58Var.addView(a58Var.M2, qoe.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        long j = a58Var.r1;
        int i = a58Var.s2;
        if (j >= 0) {
            str = m9c.k(oc7.r1(i).W1(Long.valueOf(a58Var.r1)), true);
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-a58Var.r1));
            str = L0 != null ? L0.title : "";
        }
        a58Var.M2.setText(gm.S2(jb6.a0(null, null, a58Var.R1.d1 ? 2131743281 : 2131743204, str)));
        a58Var.M2.c(a58Var.R1.getAudioVideoButtonContainer());
    }

    @Override // uz1
    public final int B0() {
        return this.a.getHeight();
    }

    @Override // uz1
    public final TL_stories.StoryItem C0() {
        return this.a.E1.a;
    }

    @Override // uz1
    public final boolean E0(long j) {
        a58 a58Var = this.a;
        z48 z48Var = a58Var.E1;
        TL_stories.StoryItem storyItem = z48Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) z48Var.a.media).call;
            savedefaultsendas.send_as = oc7.r1(a58Var.s2).i1(j);
            ConnectionsManager.getInstance(a58Var.s2).sendRequest(savedefaultsendas, null);
            s96 s96Var = a58Var.z0.B0;
            if (s96Var != null) {
                TLRPC.Peer x1 = oc7.r1(a58Var.s2).x1(j);
                TLRPC.GroupCall groupCall = s96Var.s;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, true);
                    s96Var.s.default_send_as = x1;
                }
            }
            a58Var.h0(true);
            a58Var.R1.A2(true);
            a58Var.R1.M(true);
            a58Var.c1(false);
        }
        return true;
    }

    @Override // uz1
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
        a58 a58Var = this.a;
        boolean z2 = false;
        if (a58Var.z2 == null && CameraView.isCameraAllowed()) {
            a58Var.z2 = new q(a58Var.getContext(), new c48(a58Var), a58Var.r0, false);
            a58Var.addView(a58Var.z2, Math.min(a58Var.indexOfChild(a58Var.R1.getRecordCircle()), a58Var.indexOfChild(a58Var.R1.E2)), qoe.e(-1, -1, 51));
        }
        q qVar = a58Var.z2;
        if (qVar != null) {
            if (i == 0) {
                qVar.v();
                return;
            }
            if (i == 1 || i == 3 || i == 4) {
                qVar.u(i, i2, i3, j, j2, z);
                return;
            }
            if (i == 2) {
                z2 = true;
            } else if (i != 5) {
                return;
            }
            qVar.f(z2);
        }
    }

    @Override // uz1
    public final boolean G0() {
        tn9 tn9Var;
        q qVar = this.a.z2;
        if (qVar == null || (tn9Var = qVar.S) == null) {
            return false;
        }
        int i = tn9Var.a;
        return i == 4 || i == 5 || i == 6;
    }

    @Override // uz1
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
        a58 a58Var = this.a;
        if (a58Var.T2 == null) {
            v38 v38Var = new v38(a58Var, a58Var.getContext(), a58Var.r1, a58Var.z0.f, a58Var.r0);
            a58Var.T2 = v38Var;
            v38Var.p(new w38(a58Var));
            a58Var.addView(a58Var.T2, qoe.e(-1, -1, 83));
        }
        if (a58Var.T2.getAdapter() != null) {
            a58Var.T2.setDialogId(a58Var.r1);
            boolean z3 = a58Var.E1.f;
            v38 v38Var2 = a58Var.T2;
            if (z3) {
                k17 adapter = v38Var2.getAdapter();
                if (adapter.k0 == 0 && adapter.v0 == 0 && adapter.u0 == 0 && adapter.F0 == 0) {
                    adapter.x0 = null;
                    adapter.G = null;
                    ArrayList arrayList = adapter.B0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.S;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.U = null;
                    adapter.V = null;
                    ArrayList arrayList3 = adapter.y;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.J;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.K;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.N;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.O;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.f();
                }
            } else {
                k17 adapter2 = v38Var2.getAdapter();
                oc7.r1(a58Var.s2).W1(Long.valueOf(a58Var.r1));
                TLRPC.Chat L0 = oc7.r1(a58Var.s2).L0(Long.valueOf(-a58Var.r1));
                adapter2.getClass();
                adapter2.m0 = L0;
                a58Var.T2.getAdapter().U(charSequence, a58Var.R1.getCursorPosition(), null, false, false);
            }
        }
        a58Var.invalidate();
    }

    @Override // uz1
    public final void I0() {
        q qVar = this.a.z2;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override // uz1
    public final nv1 J() {
        return null;
    }

    @Override // uz1
    public final boolean K0() {
        TLRPC.User W1;
        a58 a58Var = this.a;
        return (a58Var.r1 < 0 || (W1 = oc7.r1(a58Var.s2).W1(Long.valueOf(a58Var.r1))) == null || m9c.D(W1) || W1.bot) ? false : true;
    }

    @Override // uz1
    public final void O0() {
        this.a.H0();
    }

    @Override // uz1
    public final void R1() {
        this.a.J0();
    }

    @Override // uz1
    public final void Y0() {
        this.a.requestLayout();
    }

    @Override // uz1
    public final boolean b0() {
        return true;
    }

    @Override // uz1
    public final boolean d1() {
        return false;
    }

    @Override // uz1
    public final boolean h() {
        return false;
    }

    @Override // uz1
    public final int j() {
        return 0;
    }

    @Override // uz1
    public final TLRPC.Peer l() {
        s96 s96Var;
        oab oabVar = this.a.z0;
        if (oabVar == null || (s96Var = oabVar.B0) == null) {
            return null;
        }
        if (s96Var.s == null ? false : !r0.messages_enabled) {
            return null;
        }
        return s96Var.l();
    }

    @Override // uz1
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
        a58 a58Var = this.a;
        if (a58Var.w2) {
            gm.d3(new fu(this, j, (byte) 23), 200L);
        } else {
            a58Var.a0(j <= 0);
        }
    }

    @Override // uz1
    public final TLRPC.TL_channels_sendAsPeers x() {
        s96 s96Var;
        a58 a58Var = this.a;
        if (!a58Var.E1.f) {
            return null;
        }
        oab oabVar = a58Var.z0;
        if (oabVar != null && (s96Var = oabVar.B0) != null) {
            if (s96Var.s == null ? false : !r0.messages_enabled) {
                return null;
            }
        }
        return a58Var.D3;
    }

    @Override // uz1
    public final void y(float f, int i) {
        q qVar = this.a.z2;
        if (qVar != null) {
            qVar.h(f, i);
        }
    }

    @Override // uz1
    public final void B() {
    }

    @Override // uz1
    public final void C(boolean z) {
    }

    @Override // uz1
    public final void E1(boolean z) {
    }

    @Override // uz1
    public final void G1() {
    }

    @Override // uz1
    public final void H1() {
    }

    @Override // uz1
    public final void I() {
    }

    @Override // uz1
    public final void L() {
    }

    @Override // uz1
    public final void W0() {
    }

    @Override // uz1
    public final void a() {
    }

    @Override // uz1
    public final void c0() {
    }

    @Override // uz1
    public final void c1(CharSequence charSequence) {
    }

    @Override // uz1
    public final void e() {
    }

    @Override // uz1
    public final void e1() {
    }

    @Override // uz1
    public final void f0() {
    }

    @Override // uz1
    public final void j1() {
    }

    @Override // uz1
    public final void n() {
    }

    @Override // uz1
    public final void n0() {
    }

    @Override // uz1
    public final void o(float f) {
    }

    @Override // uz1
    public final void p(boolean z) {
    }

    @Override // uz1
    public final void r() {
    }

    @Override // uz1
    public final void s1() {
    }

    @Override // uz1
    public final void v() {
    }

    @Override // uz1
    public final void v1(int i) {
    }

    @Override // uz1
    public final void z0(int i) {
    }

    @Override // uz1
    public final void a1(View view, CharSequence charSequence, boolean z) {
    }
}

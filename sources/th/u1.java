package th;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.sf;
import org.telegram.ui.kn;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u1 implements sf {
    public final /* synthetic */ z2 a;

    public u1(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.Components.sf
    public final void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        z2 z2Var = this.a;
        if (z2Var.p2) {
            org.telegram.messenger.i0.h3(new bi.e(this, j10, 24), 200L);
        } else {
            z2Var.i0(j10 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final TLRPC.TL_channels_sendAsPeers F() {
        s0 s0Var;
        z2 z2Var = this.a;
        if (!z2Var.x1.f) {
            return null;
        }
        o7 o7Var = z2Var.s0;
        if (o7Var != null && (s0Var = o7Var.A0) != null) {
            if (s0Var.w == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return z2Var.x3;
    }

    @Override // org.telegram.ui.Components.sf
    public final int H0() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.sf
    public final void I(float f7, int i10) {
        e50 e50Var = this.a.s2;
        if (e50Var != null) {
            e50Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final TL_stories.StoryItem P0() {
        return this.a.x1.a;
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean R0(long j10) {
        z2 z2Var = this.a;
        y2 y2Var = z2Var.x1;
        TL_stories.StoryItem storyItem = y2Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) y2Var.a.media).call;
            savedefaultsendas.send_as = vp.r1(z2Var.l2).i1(j10);
            ConnectionsManager.getInstance(z2Var.l2).sendRequest(savedefaultsendas, null);
            s0 s0Var = z2Var.s0.A0;
            if (s0Var != null) {
                TLRPC.Peer y12 = vp.r1(z2Var.l2).y1(j10);
                TLRPC.GroupCall groupCall = s0Var.w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, true);
                    s0Var.w.default_send_as = y12;
                }
            }
            z2Var.p0(true);
            z2Var.K1.O1(true);
            z2Var.K1.F(true);
            z2Var.d1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean T0() {
        e50 e50Var = this.a.s2;
        return (e50Var == null || e50Var.i0) ? false : true;
    }

    @Override // org.telegram.ui.Components.sf
    public final void T1() {
        String str;
        z2 z2Var = this.a;
        if (z2Var.n1) {
            z2.f0(z2Var);
            return;
        }
        if (z2Var.F2 == null) {
            q30 q30Var = new q30(9, z2Var.getContext(), z2Var.k0, false);
            z2Var.F2 = q30Var;
            q30Var.setVisibility(8);
            z2Var.addView(z2Var.F2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (z2Var.k1 >= 0) {
            str = h20.j(vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1)), true);
        } else {
            TLRPC.Chat L0 = vp.r1(z2Var.l2).L0(Long.valueOf(-z2Var.k1));
            str = L0 != null ? L0.title : "";
        }
        z2Var.F2.setText(org.telegram.messenger.i0.W2(cd.a0(null, null, z2Var.K1.c1 ? 2131743620 : 2131743546, str)));
        z2Var.F2.f(z2Var.K1.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.sf
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        z2 z2Var = this.a;
        if (z2Var.M2 == null) {
            v1 v1Var = new v1(z2Var, z2Var.getContext(), z2Var.k1, z2Var.s0.f, z2Var.k0);
            z2Var.M2 = v1Var;
            v1Var.p(new w1(z2Var));
            z2Var.addView(z2Var.M2, w7.b6.e(-1, -1, 83));
        }
        if (z2Var.M2.getAdapter() != null) {
            z2Var.M2.setDialogId(z2Var.k1);
            if (z2Var.x1.f) {
                zf.x0 adapter = z2Var.M2.getAdapter();
                if (adapter.j0 == 0 && adapter.u0 == 0 && adapter.t0 == 0 && adapter.E0 == 0) {
                    adapter.w0 = null;
                    adapter.F = null;
                    ArrayList arrayList = adapter.A0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.R;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.T = null;
                    adapter.U = null;
                    ArrayList arrayList3 = adapter.y;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.I;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.J;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.M;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.N;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.f();
                }
            } else {
                zf.x0 adapter2 = z2Var.M2.getAdapter();
                vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1));
                TLRPC.Chat L0 = vp.r1(z2Var.l2).L0(Long.valueOf(-z2Var.k1));
                adapter2.getClass();
                adapter2.l0 = L0;
                z2Var.M2.getAdapter().U(charSequence, z2Var.K1.getCursorPosition(), null, false, false);
            }
        }
        z2Var.invalidate();
    }

    @Override // org.telegram.ui.Components.sf
    public final void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        z2 z2Var = this.a;
        if (z2Var.s2 == null && CameraView.isCameraAllowed()) {
            z2Var.s2 = new e50(z2Var.getContext(), new c2(z2Var), z2Var.k0, false);
            z2Var.addView(z2Var.s2, Math.min(z2Var.indexOfChild(z2Var.K1.getRecordCircle()), z2Var.indexOfChild(z2Var.K1.O1)), w7.b6.e(-1, -1, 51));
        }
        e50 e50Var = z2Var.s2;
        if (e50Var != null) {
            if (i10 == 0) {
                e50Var.i(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                e50Var.g(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                e50Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void X0() {
        e50 e50Var = this.a.s2;
        if (e50Var != null) {
            e50Var.j();
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean Y0() {
        TLRPC.User Z1;
        z2 z2Var = this.a;
        return (z2Var.k1 < 0 || (Z1 = vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1))) == null || h20.B(Z1) || Z1.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.sf
    public final void a1() {
        this.a.M0();
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ kn b0() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final void d1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final void h2() {
        this.a.N0();
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean k0() {
        return true;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // org.telegram.ui.Components.sf
    public final TLRPC.Peer u() {
        s0 s0Var;
        o7 o7Var = this.a.s0;
        if (o7Var == null || (s0Var = o7Var.A0) == null) {
            return null;
        }
        if (s0Var.w == null ? false : !r1.messages_enabled) {
            return null;
        }
        return s0Var.i();
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void G0(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void Q1(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void U1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void V(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void g1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void C() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void D() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void O1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void Y1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void d2() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void e() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void j0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void n0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void o1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void w() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }
}

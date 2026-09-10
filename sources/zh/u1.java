package zh;

import android.view.View;
import bi.va;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.s40;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u1 implements qg {
    public final /* synthetic */ a3 a;

    public u1(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        a3 a3Var = this.a;
        if (a3Var.G2) {
            AndroidUtilities.runOnUIThread(new va(this, j3, 28), 200L);
        } else {
            a3Var.k0(j3 <= 0);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final TLRPC.TL_channels_sendAsPeers J() {
        t0 t0Var;
        a3 a3Var = this.a;
        if (!a3Var.O1.f) {
            return null;
        }
        u7 u7Var = a3Var.J0;
        if (u7Var != null && (t0Var = u7Var.A0) != null) {
            if (t0Var.v == null ? false : !r1.messages_enabled) {
                return null;
            }
        }
        return a3Var.O3;
    }

    @Override // org.telegram.ui.Components.qg
    public final void T(float f7, int i10) {
        f60 f60Var = this.a.J2;
        if (f60Var != null) {
            f60Var.e(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final int b1() {
        return this.a.getHeight();
    }

    @Override // org.telegram.ui.Components.qg
    public final TL_stories.StoryItem d1() {
        return this.a.O1.a;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean e1(long j3) {
        a3 a3Var = this.a;
        z2 z2Var = a3Var.O1;
        TL_stories.StoryItem storyItem = z2Var.a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) z2Var.a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(a3Var.C2).getInputPeer(j3);
            ConnectionsManager.getInstance(a3Var.C2).sendRequest(savedefaultsendas, null);
            t0 t0Var = a3Var.J0.A0;
            if (t0Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(a3Var.C2).getPeer(j3);
                TLRPC.GroupCall groupCall = t0Var.v;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, TLObject.FLAG_21, peer != null);
                    t0Var.v.default_send_as = peer;
                }
            }
            a3Var.r0(true);
            a3Var.b2.P1(true);
            a3Var.b2.K(true);
            a3Var.f1(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void g2() {
        String str;
        a3 a3Var = this.a;
        if (a3Var.E1) {
            a3.h0(a3Var);
            return;
        }
        if (a3Var.W2 == null) {
            s40 s40Var = new s40(9, a3Var.getContext(), a3Var.B0, false);
            a3Var.W2 = s40Var;
            s40Var.setVisibility(8);
            a3Var.addView(a3Var.W2, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (a3Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-a3Var.B1));
            str = chat != null ? chat.title : "";
        }
        a3Var.W2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(a3Var.b2.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
        a3Var.W2.f(a3Var.b2.getAudioVideoButtonContainer(), true);
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean h1() {
        f60 f60Var = this.a.J2;
        return (f60Var == null || f60Var.e0) ? false : true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        a3 a3Var = this.a;
        if (a3Var.J2 == null && CameraView.isCameraAllowed()) {
            a3Var.J2 = new f60(a3Var.getContext(), new d2(a3Var), a3Var.B0, false);
            a3Var.addView(a3Var.J2, Math.min(a3Var.indexOfChild(a3Var.b2.getRecordCircle()), a3Var.indexOfChild(a3Var.b2.N1)), w7.a6.e(-1, -1, 51));
        }
        f60 f60Var = a3Var.J2;
        if (f60Var != null) {
            if (i10 == 0) {
                f60Var.l(false);
                return;
            }
            if (i10 == 1 || i10 == 3 || i10 == 4) {
                f60Var.k(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                f60Var.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
        a3 a3Var = this.a;
        if (a3Var.d3 == null) {
            v1 v1Var = new v1(a3Var, a3Var.getContext(), a3Var.B1, a3Var.J0.f, a3Var.B0);
            a3Var.d3 = v1Var;
            v1Var.p(new w1(a3Var));
            a3Var.addView(a3Var.d3, w7.a6.e(-1, -1, 83));
        }
        if (a3Var.d3.getAdapter() != null) {
            a3Var.d3.setDialogId(a3Var.B1);
            if (a3Var.O1.f) {
                fg.l1 adapter = a3Var.d3.getAdapter();
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
                    ArrayList arrayList3 = adapter.x;
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
                    adapter.l();
                }
            } else {
                fg.l1 adapter2 = a3Var.d3.getAdapter();
                MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-a3Var.B1));
                adapter2.getClass();
                adapter2.l0 = chat;
                a3Var.d3.getAdapter().U(charSequence, a3Var.b2.getCursorPosition(), null, false, false);
            }
        }
        a3Var.invalidate();
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final void m1() {
        f60 f60Var = this.a.J2;
        if (f60Var != null) {
            f60Var.q();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean n1() {
        TLRPC.User user;
        a3 a3Var = this.a;
        return (a3Var.B1 < 0 || (user = MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ tn p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final void p1() {
        this.a.O0();
    }

    @Override // org.telegram.ui.Components.qg
    public final void r1() {
        this.a.requestLayout();
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final TLRPC.Peer w() {
        t0 t0Var;
        u7 u7Var = this.a.J0;
        if (u7Var == null || (t0Var = u7Var.A0) == null) {
            return null;
        }
        if (t0Var.v == null ? false : !r1.messages_enabled) {
            return null;
        }
        return t0Var.i();
    }

    @Override // org.telegram.ui.Components.qg
    public final void y2() {
        this.a.P0();
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void D1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void G() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void Z(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void b2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void d2(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void u2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void x() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void y1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void F0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }
}

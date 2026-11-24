// default package

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qg1 implements zl1 {
    public final /* synthetic */ sg1 a;

    public qg1(sg1 sg1Var) {
        this.a = sg1Var;
    }

    @Override // zl1
    public final void I(long j) {
        int i;
        int i2;
        vg1 vg1Var = this.a.n;
        if (j < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            i2 = ((d) vg1Var).currentAccount;
            if (oc7.r1(i2).A(bundle, vg1Var, null, null)) {
                vg1Var.presentFragment(new yv1(bundle), true);
                return;
            }
            return;
        }
        i = ((d) vg1Var).currentAccount;
        if (j != z8c.h(i).e()) {
            Bundle k = kt6.k(j, "user_id");
            vg1Var.J0(k, j);
            ProfileActivity profileActivity = new ProfileActivity(k, null);
            profileActivity.B3(0);
            vg1Var.presentFragment(profileActivity);
        }
    }

    @Override // zl1
    public final long a() {
        return -this.a.n.f.id;
    }

    @Override // zl1
    public final long d() {
        return 0L;
    }

    @Override // zl1
    public final boolean f() {
        return true;
    }

    @Override // zl1
    public final boolean j0(cm1 cm1Var, float f, float f2) {
        vg1 vg1Var = this.a.n;
        int i = vg1.Q0;
        return vg1Var.M0(cm1Var, 0.0f, 0.0f);
    }

    @Override // zl1
    public final void o(cm1 cm1Var) {
        vg1 vg1Var = this.a.n;
        k47 messageObject = cm1Var.getMessageObject();
        if (messageObject.D == 22) {
            vi1 vi1Var = new vi1(a());
            vi1Var.m0 = vg1Var;
            vg1Var.presentFragment(vi1Var);
            return;
        }
        PhotoViewer.r0().T1(null, vg1Var, null);
        TLRPC.PhotoSize w = bc4.w(messageObject.p0, 640, false, null, false);
        if (w == null) {
            PhotoViewer.r0().l1(messageObject, null, 0L, 0L, 0L, vg1Var.C0);
        } else {
            PhotoViewer.r0().k1(w.location, gn5.i(w, messageObject.k.action.photo), vg1Var.C0);
        }
    }

    @Override // zl1
    public final d w() {
        return this.a.n;
    }

    @Override // zl1
    public final void x(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i;
        vg1 vg1Var = this.a.n;
        if (vg1Var.B0) {
            return;
        }
        Object obj = vg1Var.z0.containsKey(tL_chatInviteExported.link) ? vg1Var.z0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                vg1Var.e1((TLRPC.TL_messages_exportedChatInvite) obj, vg1Var.A0);
                return;
            } else {
                ts2.u(null, 2131748670, c41.b0(vg1Var), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = vg1Var.getMessagesController().i1(-vg1Var.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        vg1Var.B0 = true;
        final boolean[] zArr = new boolean[1];
        he heVar = new he(3, null, vg1Var.getParentActivity());
        heVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pg1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                qg1.this.a.n.B0 = false;
                zArr[0] = true;
            }
        });
        heVar.q(300L);
        int sendRequest = vg1Var.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new av0((Object) this, (Object) tL_chatInviteExported, (Object) zArr, (Object) heVar, (byte) 2));
        ConnectionsManager connectionsManager = vg1Var.getConnectionsManager();
        i = ((d) vg1Var).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i);
    }

    @Override // zl1
    public final void J(cm1 cm1Var) {
    }

    @Override // zl1
    public final void b0(cm1 cm1Var) {
    }

    @Override // zl1
    public final void h(cm1 cm1Var) {
    }

    @Override // zl1
    public final void C(cm1 cm1Var, int i) {
    }

    @Override // zl1
    public final void l(cm1 cm1Var, String str) {
    }

    @Override // zl1
    public final void g0(cm1 cm1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // zl1
    public final void n(cm1 cm1Var, int i, int i2) {
    }

    @Override // zl1
    public final void r(cm1 cm1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // zl1
    public final void y(cm1 cm1Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }
}

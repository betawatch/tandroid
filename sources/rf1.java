// default package

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rf1 implements al1 {
    public final /* synthetic */ tf1 a;

    public rf1(tf1 tf1Var) {
        this.a = tf1Var;
    }

    @Override // al1
    public final void I(long j) {
        int i;
        int i2;
        wf1 wf1Var = this.a.n;
        if (j < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            i2 = ((e) wf1Var).currentAccount;
            if (uc7.s1(i2).C(bundle, wf1Var, null, null)) {
                wf1Var.presentFragment(new zu1(bundle), true);
                return;
            }
            return;
        }
        i = ((e) wf1Var).currentAccount;
        if (j != yac.h(i).e()) {
            Bundle k = qu6.k(j, "user_id");
            wf1Var.J0(k, j);
            ProfileActivity profileActivity = new ProfileActivity(k, null);
            profileActivity.y3(0);
            wf1Var.presentFragment(profileActivity);
        }
    }

    @Override // al1
    public final long a() {
        return -this.a.n.f.id;
    }

    @Override // al1
    public final long c() {
        return 0L;
    }

    @Override // al1
    public final boolean h() {
        return true;
    }

    @Override // al1
    public final boolean i0(dl1 dl1Var, float f, float f2) {
        wf1 wf1Var = this.a.n;
        int i = wf1.Q0;
        return wf1Var.M0(dl1Var, 0.0f, 0.0f);
    }

    @Override // al1
    public final void o(dl1 dl1Var) {
        wf1 wf1Var = this.a.n;
        r47 messageObject = dl1Var.getMessageObject();
        if (messageObject.D == 22) {
            wh1 wh1Var = new wh1(a());
            wh1Var.m0 = wf1Var;
            wf1Var.presentFragment(wh1Var);
            return;
        }
        PhotoViewer.q0().T1(null, wf1Var, null);
        TLRPC.PhotoSize w = xb4.w(messageObject.p0, 640, false, null, false);
        if (w == null) {
            PhotoViewer.q0().l1(messageObject, null, 0L, 0L, 0L, wf1Var.C0);
        } else {
            PhotoViewer.q0().k1(w.location, jn5.i(w, messageObject.k.action.photo), wf1Var.C0);
        }
    }

    @Override // al1
    public final e w() {
        return this.a.n;
    }

    @Override // al1
    public final void x(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i;
        wf1 wf1Var = this.a.n;
        if (wf1Var.B0) {
            return;
        }
        Object obj = wf1Var.z0.containsKey(tL_chatInviteExported.link) ? wf1Var.z0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                wf1Var.e1((TLRPC.TL_messages_exportedChatInvite) obj, wf1Var.A0);
                return;
            } else {
                bs2.v(null, 2131748667, d31.b0(wf1Var), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = wf1Var.getMessagesController().j1(-wf1Var.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        wf1Var.B0 = true;
        final boolean[] zArr = new boolean[1];
        id idVar = new id(3, null, wf1Var.getParentActivity());
        idVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: qf1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                rf1.this.a.n.B0 = false;
                zArr[0] = true;
            }
        });
        idVar.q(300L);
        int sendRequest = wf1Var.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new au0((Object) this, (Object) tL_chatInviteExported, (Object) zArr, (Object) idVar, (byte) 2));
        ConnectionsManager connectionsManager = wf1Var.getConnectionsManager();
        i = ((e) wf1Var).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i);
    }

    @Override // al1
    public final void J(dl1 dl1Var) {
    }

    @Override // al1
    public final void X(dl1 dl1Var) {
    }

    @Override // al1
    public final void j(dl1 dl1Var) {
    }

    @Override // al1
    public final void B(dl1 dl1Var, int i) {
    }

    @Override // al1
    public final void k(dl1 dl1Var, String str) {
    }

    @Override // al1
    public final void f0(dl1 dl1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // al1
    public final void n(dl1 dl1Var, int i, int i2) {
    }

    @Override // al1
    public final void q(dl1 dl1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // al1
    public final void y(dl1 dl1Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }
}

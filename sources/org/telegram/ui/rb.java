package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class rb implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ tb a;

    public rb(tb tbVar) {
        this.a = tbVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 L0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        xb xbVar = this.a.n;
        if (xbVar.A0) {
            return;
        }
        Object obj = xbVar.y0.containsKey(tL_chatInviteExported.link) ? xbVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                xb.A0(xbVar, (TLRPC.TL_messages_exportedChatInvite) obj, xbVar.z0);
                return;
            } else {
                org.telegram.messenger.g0.q(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(xbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = xbVar.getMessagesController().getInputPeer(-xbVar.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        xbVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(xbVar.getParentActivity(), 3, null);
        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.qb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                rb.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        b2Var.q(300L);
        int sendRequest = xbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.w2(this, tL_chatInviteExported, zArr, b2Var, 9));
        ConnectionsManager connectionsManager = xbVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.n2) xbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final long a() {
        return -this.a.n.f.id;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean h2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        xb xbVar = this.a.n;
        int i10 = xb.Q0;
        return xbVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        xb xbVar = this.a.n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            dd ddVar = new dd(a());
            ddVar.l0 = xbVar;
            xbVar.presentFragment(ddVar);
            return;
        }
        PhotoViewer.t1().K2(null, xbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, xbVar.B0);
        } else {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), xbVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void s1(long j10) {
        int i10;
        int i11;
        xb xbVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i11 = ((org.telegram.ui.ActionBar.n2) xbVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, xbVar)) {
                xbVar.presentFragment(new sn(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) xbVar).currentAccount;
        if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
            Bundle b10 = zf.d0.b(j10, "user_id");
            xb.p0(xbVar, b10, j10);
            ProfileActivity profileActivity = new ProfileActivity(b10, null);
            profileActivity.N4(0);
            xbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void b0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void r0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void t1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final void X(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void X1(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void C1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void c1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void k2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}

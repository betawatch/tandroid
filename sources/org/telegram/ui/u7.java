package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u7 extends k7 {
    public final /* synthetic */ x7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(x7 x7Var) {
        super(x7Var, 3);
        this.n = x7Var;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        o7 o7Var = (o7) e1Var.a;
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) o7Var.b.getChildAt(0);
        ci.a aVar = ((q7) this.e.get(i10)).d;
        boolean z10 = aVar == o7Var.getTag();
        boolean z11 = i10 != this.e.size() - 1;
        o7Var.setTag(aVar);
        x7 x7Var = this.n;
        if (aVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(x7Var.e.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.b;
            String fileExtension = FileLoader.getFileExtension(aVar.a);
            TLRPC.Document document = tL_message.media.document;
            document.id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.e == null) {
                c3.m0 m0Var = new c3.m0();
                aVar.e = m0Var;
                m0Var.a = true;
                Utilities.globalQueue.postRunnable(new q1(x7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(x7Var.e.getCurrentAccount(), tL_message, false, false);
            aVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        n7Var.f(aVar.f, z11);
        boolean z12 = aVar.e.a;
        boolean z13 = !z12;
        if (!z10) {
            n7Var.g0 = !z12 ? 1.0f : 0.0f;
        }
        if (n7Var.f0 != z13) {
            n7Var.f0 = z13;
            n7Var.invalidate();
        }
        o7Var.d = z11;
        o7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        o7Var.a.a(this.n.h.j.contains(aVar), z10);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 1);
        o7Var.e = 3;
        t7 t7Var = new t7(this, viewGroup.getContext(), o7Var);
        t7Var.setCheckForButtonPress(true);
        o7Var.b.addView(t7Var);
        return new org.telegram.ui.Components.vl0(o7Var);
    }
}

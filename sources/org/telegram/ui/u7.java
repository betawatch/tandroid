package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class u7 extends k7 {
    public final /* synthetic */ w7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(w7 w7Var) {
        super(w7Var, 3);
        this.n = w7Var;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        o7 o7Var = (o7) b1Var.a;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) o7Var.b.getChildAt(0);
        ai.b bVar = ((q7) this.e.get(i10)).d;
        boolean z10 = bVar == o7Var.getTag();
        boolean z11 = i10 != this.e.size() - 1;
        o7Var.setTag(bVar);
        w7 w7Var = this.n;
        if (bVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(w7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.b;
            String fileExtension = FileLoader.getFileExtension(bVar.a);
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
            document2.size = bVar.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.e == null) {
                ai.a aVar = new ai.a();
                bVar.e = aVar;
                aVar.a = true;
                Utilities.globalQueue.postRunnable(new t1(w7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(w7Var.d.getCurrentAccount(), tL_message, false, false);
            bVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        i7Var.f(bVar.f, z11);
        boolean z12 = bVar.e.a;
        boolean z13 = !z12;
        if (!z10) {
            i7Var.g0 = !z12 ? 1.0f : 0.0f;
        }
        if (i7Var.f0 != z13) {
            i7Var.f0 = z13;
            i7Var.invalidate();
        }
        o7Var.d = z11;
        o7Var.c.setText(AndroidUtilities.formatFileSize(bVar.c));
        o7Var.a.a(this.n.f.j.contains(bVar), z10);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 1);
        o7Var.e = 3;
        t7 t7Var = new t7(this, viewGroup.getContext(), o7Var);
        t7Var.setCheckForButtonPress(true);
        o7Var.b.addView(t7Var);
        return new org.telegram.ui.Components.wl0(o7Var);
    }
}

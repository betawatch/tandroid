package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u7 extends k7 {
    public final /* synthetic */ w7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(w7 w7Var) {
        super(w7Var, 3);
        this.n = w7Var;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        o7 o7Var = (o7) l1Var.a;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) o7Var.b.getChildAt(0);
        mh.a aVar = ((q7) this.e.get(i10)).d;
        boolean z4 = aVar == o7Var.getTag();
        boolean z10 = i10 != this.e.size() - 1;
        o7Var.setTag(aVar);
        w7 w7Var = this.n;
        if (aVar.f == null) {
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
                h5.c cVar = new h5.c();
                aVar.e = cVar;
                cVar.a = true;
                Utilities.globalQueue.postRunnable(new u1(w7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(w7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        g7Var.f(aVar.f, z10);
        boolean z11 = aVar.e.a;
        boolean z12 = !z11;
        if (!z4) {
            g7Var.d0 = !z11 ? 1.0f : 0.0f;
        }
        if (g7Var.c0 != z12) {
            g7Var.c0 = z12;
            g7Var.invalidate();
        }
        o7Var.d = z10;
        o7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        o7Var.a.a(this.n.f.j.contains(aVar), z4);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 1);
        o7Var.e = 3;
        t7 t7Var = new t7(this, viewGroup.getContext(), o7Var);
        t7Var.setCheckForButtonPress(true);
        o7Var.b.addView(t7Var);
        return new org.telegram.ui.Components.dl0(o7Var);
    }
}

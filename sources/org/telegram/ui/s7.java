package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s7 extends i7 {
    public final /* synthetic */ u7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(u7 u7Var) {
        super(u7Var, 3);
        this.n = u7Var;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        m7 m7Var = (m7) l1Var.a;
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) m7Var.b.getChildAt(0);
        mh.a aVar = ((o7) this.e.get(i10)).d;
        boolean z4 = aVar == m7Var.getTag();
        boolean z10 = i10 != this.e.size() - 1;
        m7Var.setTag(aVar);
        u7 u7Var = this.n;
        if (aVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(u7Var.d.getCurrentAccount()).getClientUserId();
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
                Utilities.globalQueue.postRunnable(new s1(u7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(u7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        h7Var.f(aVar.f, z10);
        boolean z11 = aVar.e.a;
        boolean z12 = !z11;
        if (!z4) {
            h7Var.d0 = !z11 ? 1.0f : 0.0f;
        }
        if (h7Var.c0 != z12) {
            h7Var.c0 = z12;
            h7Var.invalidate();
        }
        m7Var.d = z10;
        m7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        m7Var.a.a(this.n.f.j.contains(aVar), z4);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 1);
        m7Var.e = 3;
        r7 r7Var = new r7(this, viewGroup.getContext(), m7Var);
        r7Var.setCheckForButtonPress(true);
        m7Var.b.addView(r7Var);
        return new org.telegram.ui.Components.el0(m7Var);
    }
}

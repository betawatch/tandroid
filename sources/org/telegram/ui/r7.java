package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class r7 extends h7 {
    public final /* synthetic */ t7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(t7 t7Var) {
        super(t7Var, 3);
        this.n = t7Var;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        l7 l7Var = (l7) c1Var.a;
        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) l7Var.b.getChildAt(0);
        zh.a aVar = ((n7) this.e.get(i10)).d;
        boolean z10 = aVar == l7Var.getTag();
        boolean z11 = i10 != this.e.size() - 1;
        l7Var.setTag(aVar);
        t7 t7Var = this.n;
        if (aVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(t7Var.d.getCurrentAccount()).getClientUserId();
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
                c3.k0 k0Var = new c3.k0();
                aVar.e = k0Var;
                k0Var.b = true;
                Utilities.globalQueue.postRunnable(new q1(t7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(t7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        k7Var.f(aVar.f, z11);
        boolean z12 = aVar.e.b;
        boolean z13 = !z12;
        if (!z10) {
            k7Var.g0 = !z12 ? 1.0f : 0.0f;
        }
        if (k7Var.f0 != z13) {
            k7Var.f0 = z13;
            k7Var.invalidate();
        }
        l7Var.d = z11;
        l7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        l7Var.a.a(this.n.f.j.contains(aVar), z10);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        l7 l7Var = new l7(this, viewGroup.getContext(), 1);
        l7Var.e = 3;
        q7 q7Var = new q7(this, viewGroup.getContext(), l7Var);
        q7Var.setCheckForButtonPress(true);
        l7Var.b.addView(q7Var);
        return new org.telegram.ui.Components.il0(l7Var);
    }
}

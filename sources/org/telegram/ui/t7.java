package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class t7 extends j7 {
    public final /* synthetic */ v7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(v7 v7Var) {
        super(v7Var, 3);
        this.n = v7Var;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        n7 n7Var = (n7) b1Var.a;
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) n7Var.b.getChildAt(0);
        bi.b bVar = ((p7) this.e.get(i10)).d;
        boolean z10 = bVar == n7Var.getTag();
        boolean z11 = i10 != this.e.size() - 1;
        n7Var.setTag(bVar);
        v7 v7Var = this.n;
        if (bVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(v7Var.e.getCurrentAccount()).getClientUserId();
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
                bi.a aVar = new bi.a();
                bVar.e = aVar;
                aVar.a = true;
                Utilities.globalQueue.postRunnable(new s1(v7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(v7Var.e.getCurrentAccount(), tL_message, false, false);
            bVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        j7Var.f(bVar.f, z11);
        boolean z12 = bVar.e.a;
        boolean z13 = !z12;
        if (!z10) {
            j7Var.g0 = !z12 ? 1.0f : 0.0f;
        }
        if (j7Var.f0 != z13) {
            j7Var.f0 = z13;
            j7Var.invalidate();
        }
        n7Var.d = z11;
        n7Var.c.setText(AndroidUtilities.formatFileSize(bVar.c));
        n7Var.a.a(this.n.h.j.contains(bVar), z10);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        n7 n7Var = new n7(this, viewGroup.getContext(), 1);
        n7Var.e = 3;
        s7 s7Var = new s7(this, viewGroup.getContext(), n7Var);
        s7Var.setCheckForButtonPress(true);
        n7Var.b.addView(s7Var);
        return new org.telegram.ui.Components.wl0(n7Var);
    }
}

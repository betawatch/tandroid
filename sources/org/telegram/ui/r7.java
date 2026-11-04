package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r7 extends h7 {
    public final /* synthetic */ u7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(u7 u7Var) {
        super(u7Var, 3);
        this.n = u7Var;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        l7 l7Var = (l7) d1Var.a;
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) l7Var.b.getChildAt(0);
        di.b bVar = ((n7) this.e.get(i3)).d;
        boolean z10 = bVar == l7Var.getTag();
        boolean z11 = i3 != this.e.size() - 1;
        l7Var.setTag(bVar);
        u7 u7Var = this.n;
        if (bVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i3;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e10 = org.telegram.messenger.h10.i(u7Var.e.getCurrentAccount()).e();
            tL_peerUser.user_id = e10;
            peer.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.b;
            String D = org.telegram.messenger.w7.D(bVar.a);
            TLRPC.Document document = tL_message.media.document;
            document.id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.e == null) {
                di.a aVar = new di.a();
                bVar.e = aVar;
                aVar.a = true;
                Utilities.e.c(new p1(u7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(u7Var.e.getCurrentAccount(), tL_message, false, false);
            bVar.f = ziVar;
            ziVar.x0 = true;
        }
        f7Var.f(bVar.f, z11);
        boolean z12 = bVar.e.a;
        boolean z13 = !z12;
        if (!z10) {
            f7Var.h0 = !z12 ? 1.0f : 0.0f;
        }
        if (f7Var.g0 != z13) {
            f7Var.g0 = z13;
            f7Var.invalidate();
        }
        l7Var.d = z11;
        l7Var.c.setText(org.telegram.messenger.g0.i0(bVar.c, false, false));
        l7Var.a.a(this.n.h.j.contains(bVar), z10);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        l7 l7Var = new l7(this, viewGroup.getContext(), 1);
        l7Var.e = 3;
        q7 q7Var = new q7(this, viewGroup.getContext(), l7Var);
        q7Var.setCheckForButtonPress(true);
        l7Var.b.addView(q7Var);
        return new org.telegram.ui.Components.bj0(l7Var);
    }
}

package sh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p9;
import org.telegram.ui.fu0;
import org.telegram.ui.qu0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class l extends fu0 {
    public final /* synthetic */ n a;

    public l(n nVar) {
        this.a = nVar;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            n nVar = this.a;
            TLRPC.Chat chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                nVar.v.getLocationInWindow(iArr);
                qu0 qu0Var = new qu0();
                qu0Var.b = iArr[0];
                qu0Var.c = iArr[1];
                p9 p9Var = nVar.v;
                qu0Var.d = p9Var;
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                qu0Var.a = imageReceiver;
                qu0Var.f = -nVar.b;
                qu0Var.e = imageReceiver.getBitmapSafe();
                qu0Var.g = -1L;
                qu0Var.h = nVar.v.getImageReceiver().getRoundRadius(true);
                qu0Var.k = 1.0f;
                qu0Var.p = true;
                return qu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void f(String str, String str2, boolean z4) {
        this.a.B.q(str, str2, z4);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final int y() {
        return 1;
    }
}

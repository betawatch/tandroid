package th;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p9;
import org.telegram.ui.au0;
import org.telegram.ui.lu0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class l extends au0 {
    public final /* synthetic */ n a;

    public l(n nVar) {
        this.a = nVar;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
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
                lu0 lu0Var = new lu0();
                lu0Var.b = iArr[0];
                lu0Var.c = iArr[1];
                p9 p9Var = nVar.v;
                lu0Var.d = p9Var;
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                lu0Var.a = imageReceiver;
                lu0Var.f = -nVar.b;
                lu0Var.e = imageReceiver.getBitmapSafe();
                lu0Var.g = -1L;
                lu0Var.h = nVar.v.getImageReceiver().getRoundRadius(true);
                lu0Var.k = 1.0f;
                lu0Var.p = true;
                return lu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void f(String str, String str2, boolean z4) {
        this.a.B.q(str, str2, z4);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final int y() {
        return 1;
    }
}

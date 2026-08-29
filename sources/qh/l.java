package qh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t9;
import org.telegram.ui.pt0;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l extends pt0 {
    public final /* synthetic */ n a;

    public l(n nVar) {
        this.a = nVar;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                zt0 zt0Var = new zt0();
                zt0Var.b = iArr[0];
                zt0Var.c = iArr[1];
                t9 t9Var = nVar.v;
                zt0Var.d = t9Var;
                ImageReceiver imageReceiver = t9Var.getImageReceiver();
                zt0Var.a = imageReceiver;
                zt0Var.f = -nVar.b;
                zt0Var.e = imageReceiver.getBitmapSafe();
                zt0Var.g = -1L;
                zt0Var.h = nVar.v.getImageReceiver().getRoundRadius(true);
                zt0Var.k = 1.0f;
                zt0Var.p = true;
                return zt0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void f(String str, String str2, boolean z10) {
        this.a.A.q(str, str2, z10);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int y() {
        return 1;
    }
}

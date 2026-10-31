package yh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.gs0;
import org.telegram.ui.yr0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j extends yr0 {
    public final /* synthetic */ l a;

    public j(l lVar) {
        this.a = lVar;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            l lVar = this.a;
            TLRPC.Chat L0 = lVar.getMessagesController().L0(Long.valueOf(lVar.c));
            if (L0 == null || (chatPhoto = L0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                lVar.x.getLocationInWindow(iArr);
                gs0 gs0Var = new gs0();
                gs0Var.b = iArr[0];
                gs0Var.c = iArr[1];
                g9 g9Var = lVar.x;
                gs0Var.d = g9Var;
                ImageReceiver imageReceiver = g9Var.getImageReceiver();
                gs0Var.a = imageReceiver;
                gs0Var.f = -lVar.c;
                gs0Var.e = imageReceiver.p();
                gs0Var.g = -1L;
                gs0Var.h = lVar.x.getImageReceiver().E();
                gs0Var.k = 1.0f;
                gs0Var.p = true;
                return gs0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void G() {
        this.a.x.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void f(String str, String str2, boolean z10) {
        this.a.F.p(str, str2, z10);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int y() {
        return 1;
    }
}

package yh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.fs0;
import org.telegram.ui.xr0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class j extends xr0 {
    public final /* synthetic */ l a;

    public j(l lVar) {
        this.a = lVar;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                fs0 fs0Var = new fs0();
                fs0Var.b = iArr[0];
                fs0Var.c = iArr[1];
                g9 g9Var = lVar.x;
                fs0Var.d = g9Var;
                ImageReceiver imageReceiver = g9Var.getImageReceiver();
                fs0Var.a = imageReceiver;
                fs0Var.f = -lVar.c;
                fs0Var.e = imageReceiver.p();
                fs0Var.g = -1L;
                fs0Var.h = lVar.x.getImageReceiver().E();
                fs0Var.k = 1.0f;
                fs0Var.p = true;
                return fs0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void G() {
        this.a.x.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void f(String str, String str2, boolean z10) {
        this.a.F.p(str, str2, z10);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int y() {
        return 1;
    }
}

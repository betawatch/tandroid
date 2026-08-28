package qh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wg;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n1 implements ii {
    public final /* synthetic */ ki a;
    public final /* synthetic */ x1 b;

    public n1(x1 x1Var, ki kiVar) {
        this.b = x1Var;
        this.a = kiVar;
    }

    @Override // org.telegram.ui.Components.ii
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ki kiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
        x1 x1Var = this.b;
        if (i9 == 7 || i9 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            o3 o3Var = x1Var.L;
            a aVar = o3Var.X3;
            o3Var.X3 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i12++;
                } else if (aVar != null) {
                    x1Var.L.T1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    x1Var.L.f2((MediaController.PhotoEntry) obj);
                }
            }
        }
        x1Var.L.X3 = null;
        kiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void t(wg wgVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(wgVar);
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ii
    public final void u() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void A(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final void E(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}

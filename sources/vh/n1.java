package vh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.wg;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class n1 implements ji {
    public final /* synthetic */ li a;
    public final /* synthetic */ y1 b;

    public n1(y1 y1Var, li liVar) {
        this.b = y1Var;
        this.a = liVar;
    }

    @Override // org.telegram.ui.Components.ji
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.g0;
        y1 y1Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            r3 r3Var = y1Var.M;
            a aVar = r3Var.Y3;
            r3Var.Y3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i13++;
                } else if (aVar != null) {
                    y1Var.M.T1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    y1Var.M.f2((MediaController.PhotoEntry) obj);
                }
            }
        }
        y1Var.M.Y3 = null;
        liVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final void x(wg wgVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(wgVar);
    }

    @Override // org.telegram.ui.Components.ji
    public final void C() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void D(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public final void G(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}

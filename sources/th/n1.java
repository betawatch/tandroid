package th;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.zg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n1 implements li {
    public final /* synthetic */ ni a;
    public final /* synthetic */ x1 b;

    public n1(x1 x1Var, ni niVar) {
        this.b = x1Var;
        this.a = niVar;
    }

    @Override // org.telegram.ui.Components.li
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ni niVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f0;
        x1 x1Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            p3 p3Var = x1Var.L;
            a aVar = p3Var.X3;
            p3Var.X3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i13++;
                } else if (aVar != null) {
                    x1Var.L.T1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    x1Var.L.f2((MediaController.PhotoEntry) obj);
                }
            }
        }
        x1Var.L.X3 = null;
        niVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ boolean T1() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final void x0(zg zgVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(zgVar);
    }

    @Override // org.telegram.ui.Components.li
    public final void L0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.li
    public final void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}

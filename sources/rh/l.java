package rh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.sg;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class l implements ei {
    public final /* synthetic */ gi a;
    public final /* synthetic */ p b;

    public l(p pVar, gi giVar) {
        this.b = pVar;
        this.a = giVar;
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ boolean N0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        gi giVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f0;
        p3 p3Var = this.b.r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
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
                    p3Var.T1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    p3Var.f2((MediaController.PhotoEntry) obj);
                }
            }
        }
        p3Var.X3 = null;
        giVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public final void y(sg sgVar) {
        NotificationCenter.getInstance(this.b.n).doOnIdle(sgVar);
    }

    @Override // org.telegram.ui.Components.ei
    public final void F() {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void I(Object obj) {
    }

    @Override // org.telegram.ui.Components.ei
    public final void g0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}

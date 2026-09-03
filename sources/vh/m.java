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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class m implements ji {
    public final /* synthetic */ li a;
    public final /* synthetic */ q b;

    public m(q qVar, li liVar) {
        this.b = qVar;
        this.a = liVar;
    }

    @Override // org.telegram.ui.Components.ji
    public final void C0(wg wgVar) {
        NotificationCenter.getInstance(this.b.n).doOnIdle(wgVar);
    }

    @Override // org.telegram.ui.Components.ji
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.g0;
        s3 s3Var = this.b.r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = s3Var.Y3;
            s3Var.Y3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i13++;
                } else if (aVar != null) {
                    s3Var.S1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    s3Var.e2((MediaController.PhotoEntry) obj);
                }
            }
        }
        s3Var.Y3 = null;
        liVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean X1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final void Q0() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public final void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}

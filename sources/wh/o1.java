package wh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.wg;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class o1 implements ki {
    public final /* synthetic */ mi a;
    public final /* synthetic */ z1 b;

    public o1(z1 z1Var, mi miVar) {
        this.b = z1Var;
        this.a = miVar;
    }

    @Override // org.telegram.ui.Components.ki
    public final void B0(wg wgVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(wgVar);
    }

    @Override // org.telegram.ui.Components.ki
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        mi miVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.g0;
        z1 z1Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            r3 r3Var = z1Var.M;
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
                    z1Var.M.T1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    z1Var.M.f2((MediaController.PhotoEntry) obj);
                }
            }
        }
        z1Var.M.Y3 = null;
        miVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ boolean b2() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki
    public final void Q0() {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ki
    public final void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vm0 implements org.telegram.ui.Components.ti {
    public final /* synthetic */ qn0 a;

    public vm0(qn0 qn0Var) {
        this.a = qn0Var;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.vi viVar;
        qn0 qn0Var = this.a;
        if (qn0Var.getParentActivity() == null || (viVar = qn0Var.R0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            viVar.dismissWithButtonClick(i10);
            qn0Var.F1(i10);
            return;
        }
        if (i10 != 8) {
            viVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = qn0Var.R0.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = qn0Var.R0.j0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i13));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            String str = photoEntry.imagePath;
            if (str != null) {
                sendingMediaInfo.path = str;
            } else {
                sendingMediaInfo.path = photoEntry.path;
            }
            arrayList.add(sendingMediaInfo);
            photoEntry.reset();
        }
        qn0Var.G1(arrayList);
    }

    @Override // org.telegram.ui.Components.ti
    public final void K0() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void x0(org.telegram.ui.Components.fh fhVar) {
        fhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

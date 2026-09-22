package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tm0 implements org.telegram.ui.Components.ti {
    public final /* synthetic */ on0 a;

    public tm0(on0 on0Var) {
        this.a = on0Var;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.vi viVar;
        on0 on0Var = this.a;
        if (on0Var.getParentActivity() == null || (viVar = on0Var.R0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            viVar.dismissWithButtonClick(i10);
            on0Var.F1(i10);
            return;
        }
        if (i10 != 8) {
            viVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = on0Var.R0.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = on0Var.R0.j0.getSelectedPhotosOrder();
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
        on0Var.G1(arrayList);
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

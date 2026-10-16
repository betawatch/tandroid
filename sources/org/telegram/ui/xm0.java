package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xm0 implements org.telegram.ui.Components.ti {
    public final /* synthetic */ sn0 a;

    public xm0(sn0 sn0Var) {
        this.a = sn0Var;
    }

    @Override // org.telegram.ui.Components.ti
    public final void F() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.ti
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.vi viVar;
        sn0 sn0Var = this.a;
        if (sn0Var.getParentActivity() == null || (viVar = sn0Var.R0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            viVar.dismissWithButtonClick(i10);
            sn0Var.E1(i10);
            return;
        }
        if (i10 != 8) {
            viVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = sn0Var.R0.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = sn0Var.R0.j0.getSelectedPhotosOrder();
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
        sn0Var.F1(arrayList);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean r0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void v(org.telegram.ui.Components.hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void J(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void U(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}

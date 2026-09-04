package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class um0 implements org.telegram.ui.Components.ti {
    public final /* synthetic */ pn0 a;

    public um0(pn0 pn0Var) {
        this.a = pn0Var;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B(org.telegram.ui.Components.hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean D0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void H() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.vi viVar;
        pn0 pn0Var = this.a;
        if (pn0Var.getParentActivity() == null || (viVar = pn0Var.R0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            viVar.dismissWithButtonClick(i10);
            pn0Var.F1(i10);
            return;
        }
        if (i10 != 8) {
            viVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = pn0Var.R0.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = pn0Var.R0.j0.getSelectedPhotosOrder();
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
        pn0Var.G1(arrayList);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void K(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sm0 implements org.telegram.ui.Components.wi {
    public final /* synthetic */ nn0 a;

    public sm0(nn0 nn0Var) {
        this.a = nn0Var;
    }

    @Override // org.telegram.ui.Components.wi
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.yi yiVar;
        nn0 nn0Var = this.a;
        if (nn0Var.getParentActivity() == null || (yiVar = nn0Var.R0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            yiVar.dismissWithButtonClick(i10);
            nn0Var.E1(i10);
            return;
        }
        if (i10 != 8) {
            yiVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = nn0Var.R0.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = nn0Var.R0.j0.getSelectedPhotosOrder();
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
        nn0Var.F1(arrayList);
    }

    @Override // org.telegram.ui.Components.wi
    public final void P0() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean Y1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void f0(org.telegram.ui.Components.jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void a1(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void p1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

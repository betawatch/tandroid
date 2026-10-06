package qg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xi;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class y implements vi {
    public final /* synthetic */ xi a;
    public final /* synthetic */ m0 b;

    public y(m0 m0Var, xi xiVar) {
        this.b = m0Var;
        this.a = xiVar;
    }

    @Override // org.telegram.ui.Components.vi
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        xi xiVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = xiVar.j0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            m0 m0Var = this.b;
            m0Var.f0(m0Var.h0(str, true));
            xiVar.dismiss();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.vi
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.vi
    public final void x0(ih ihVar) {
        ihVar.run();
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

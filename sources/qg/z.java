package qg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class z implements ui {
    public final /* synthetic */ wi a;
    public final /* synthetic */ p0 b;

    public z(p0 p0Var, wi wiVar) {
        this.b = p0Var;
        this.a = wiVar;
    }

    @Override // org.telegram.ui.Components.ui
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        wi wiVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = wiVar.j0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            p0 p0Var = this.b;
            p0Var.f0(p0Var.h0(str, true));
            wiVar.dismiss();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ui
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui
    public final void x0(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

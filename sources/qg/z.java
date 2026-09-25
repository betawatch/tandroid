package qg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class z implements ui {
    public final /* synthetic */ wi a;
    public final /* synthetic */ n0 b;

    public z(n0 n0Var, wi wiVar) {
        this.b = n0Var;
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
            n0 n0Var = this.b;
            n0Var.f0(n0Var.h0(str, true));
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
    public final void x0(hh hhVar) {
        hhVar.run();
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

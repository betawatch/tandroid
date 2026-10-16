package rg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class y implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ o0 b;

    public y(o0 o0Var, vi viVar) {
        this.b = o0Var;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        vi viVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = viVar.j0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            o0 o0Var = this.b;
            o0Var.f0(o0Var.h0(str, true));
            viVar.dismiss();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean r0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void F() {
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

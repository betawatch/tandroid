package rg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class z implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ o0 b;

    public z(o0 o0Var, vi viVar) {
        this.b = o0Var;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean D0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
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
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void H() {
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

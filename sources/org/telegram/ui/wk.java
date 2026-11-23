package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wk extends oq0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ bn c;

    public wk(bn bnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = bnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.ic j(int i7) {
        return new org.telegram.messenger.ic(this.a, null, 0);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        this.c.u((org.telegram.messenger.ff) this.b.get(0), f20Var, z10, i10, 0, z11, 0L);
    }
}

package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sl extends xr0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ un c;

    public sl(un unVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = unVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.messenger.lc j(int i10) {
        return new org.telegram.messenger.lc(this.a, null, 0);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        this.c.u((org.telegram.messenger.ff) this.b.get(0), y20Var, z10, i11, 0, z11, 0L);
    }
}

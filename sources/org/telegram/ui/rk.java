package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rk extends eq0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ wm c;

    public rk(wm wmVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = wmVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.messenger.cc j(int i3) {
        return new org.telegram.messenger.cc(this.a, null, 0);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        this.c.u((org.telegram.messenger.ye) this.b.get(0), b20Var, z10, i10, 0, z11, 0L);
    }
}

package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class yi1 implements org.telegram.ui.Components.d91 {
    public final /* synthetic */ WallpapersListActivity a;

    public yi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        vd1 vd1Var = new vd1(new fj1(file, file, ""), bitmap, false);
        vd1Var.c1(0L);
        this.a.presentFragment(vd1Var, z10);
    }

    @Override // org.telegram.ui.Components.d91
    public final void a() {
    }
}

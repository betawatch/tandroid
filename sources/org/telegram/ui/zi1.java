package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zi1 implements org.telegram.ui.Components.f91 {
    public final /* synthetic */ WallpapersListActivity a;

    public zi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.f91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        xd1 xd1Var = new xd1(new gj1(file, file, ""), bitmap, false);
        xd1Var.c1(0L);
        this.a.presentFragment(xd1Var, z10);
    }

    @Override // org.telegram.ui.Components.f91
    public final void a() {
    }
}

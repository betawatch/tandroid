package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rh1 implements org.telegram.ui.Components.v71 {
    public final /* synthetic */ WallpapersListActivity a;

    public rh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.v71
    public final void b(File file, Bitmap bitmap, boolean z10) {
        nc1 nc1Var = new nc1(new xh1(file, file, ""), bitmap, false);
        nc1Var.c1(0L);
        this.a.presentFragment(nc1Var, z10);
    }

    @Override // org.telegram.ui.Components.v71
    public final void a() {
    }
}

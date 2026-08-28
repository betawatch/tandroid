package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sh1 implements org.telegram.ui.Components.t71 {
    public final /* synthetic */ WallpapersListActivity a;

    public sh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.t71
    public final void b(File file, Bitmap bitmap, boolean z10) {
        oc1 oc1Var = new oc1(new yh1(file, file, ""), bitmap, false);
        oc1Var.c1(0L);
        this.a.presentFragment(oc1Var, z10);
    }

    @Override // org.telegram.ui.Components.t71
    public final void a() {
    }
}

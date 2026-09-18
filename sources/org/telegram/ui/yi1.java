package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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

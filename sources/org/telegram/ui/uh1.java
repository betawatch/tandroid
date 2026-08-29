package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uh1 implements org.telegram.ui.Components.f81 {
    public final /* synthetic */ WallpapersListActivity a;

    public uh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.f81
    public final void b(File file, Bitmap bitmap, boolean z10) {
        qc1 qc1Var = new qc1(new ai1(file, file, ""), bitmap, false);
        qc1Var.c1(0L);
        this.a.presentFragment(qc1Var, z10);
    }

    @Override // org.telegram.ui.Components.f81
    public final void a() {
    }
}

package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class uh1 implements org.telegram.ui.Components.r91 {
    public final /* synthetic */ WallpapersListActivity a;

    public uh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.r91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        qc1 qc1Var = new qc1(new ai1(file, file, ""), bitmap, false);
        qc1Var.c1(0L);
        this.a.presentFragment(qc1Var, z10);
    }

    @Override // org.telegram.ui.Components.r91
    public final void a() {
    }
}

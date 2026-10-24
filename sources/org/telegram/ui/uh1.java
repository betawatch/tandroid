package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

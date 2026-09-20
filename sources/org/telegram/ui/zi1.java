package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class zi1 implements org.telegram.ui.Components.d91 {
    public final /* synthetic */ WallpapersListActivity a;

    public zi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        xd1 xd1Var = new xd1(new gj1(file, file, ""), bitmap, false);
        xd1Var.c1(0L);
        this.a.presentFragment(xd1Var, z10);
    }

    @Override // org.telegram.ui.Components.d91
    public final void a() {
    }
}

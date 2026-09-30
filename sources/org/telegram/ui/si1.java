package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class si1 implements org.telegram.ui.Components.e91 {
    public final /* synthetic */ WallpapersListActivity a;

    public si1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.e91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        od1 od1Var = new od1(new zi1(file, file, ""), bitmap, false);
        od1Var.c1(0L);
        this.a.presentFragment(od1Var, z10);
    }

    @Override // org.telegram.ui.Components.e91
    public final void a() {
    }
}

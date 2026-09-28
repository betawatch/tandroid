package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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

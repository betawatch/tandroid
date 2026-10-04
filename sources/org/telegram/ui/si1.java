package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class si1 implements org.telegram.ui.Components.m91 {
    public final /* synthetic */ WallpapersListActivity a;

    public si1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        rd1 rd1Var = new rd1(new zi1(file, file, ""), bitmap, false);
        rd1Var.c1(0L);
        this.a.presentFragment(rd1Var, z10);
    }

    @Override // org.telegram.ui.Components.m91
    public final void a() {
    }
}

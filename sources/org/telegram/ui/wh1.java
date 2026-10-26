package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wh1 implements org.telegram.ui.Components.aa1 {
    public final /* synthetic */ WallpapersListActivity a;

    public wh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.aa1
    public final void b(File file, Bitmap bitmap, boolean z10) {
        tc1 tc1Var = new tc1(new ci1(file, file, ""), bitmap, false);
        tc1Var.d1(0L);
        this.a.presentFragment(tc1Var, z10);
    }

    @Override // org.telegram.ui.Components.aa1
    public final void a() {
    }
}

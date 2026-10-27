package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yh1 implements org.telegram.ui.Components.ba1 {
    public final /* synthetic */ WallpapersListActivity a;

    public yh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.ba1
    public final void b(File file, Bitmap bitmap, boolean z10) {
        vc1 vc1Var = new vc1(new ei1(file, file, ""), bitmap, false);
        vc1Var.d1(0L);
        this.a.presentFragment(vc1Var, z10);
    }

    @Override // org.telegram.ui.Components.ba1
    public final void a() {
    }
}

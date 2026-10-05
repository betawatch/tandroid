package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class qi1 implements org.telegram.ui.Components.n91 {
    public final /* synthetic */ WallpapersListActivity a;

    public qi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        pd1 pd1Var = new pd1(new xi1(file, file, ""), bitmap, false);
        pd1Var.c1(0L);
        this.a.presentFragment(pd1Var, z10);
    }

    @Override // org.telegram.ui.Components.n91
    public final void a() {
    }
}

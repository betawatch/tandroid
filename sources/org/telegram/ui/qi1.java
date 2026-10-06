package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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

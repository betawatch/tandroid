package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zi1 implements org.telegram.ui.Components.p81 {
    public final /* synthetic */ WallpapersListActivity a;

    public zi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.Components.p81
    public final void b(File file, Bitmap bitmap, boolean z10) {
        xd1 xd1Var = new xd1(new gj1(file, file, ""), bitmap, false);
        xd1Var.c1(0L);
        this.a.presentFragment(xd1Var, z10);
    }

    @Override // org.telegram.ui.Components.p81
    public final void a() {
    }
}

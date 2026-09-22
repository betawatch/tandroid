package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi1 implements org.telegram.ui.ActionBar.a2, vd1 {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ zi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.vd1
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.k0;
        this.a.removeSelfFromStack();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.a);
    }
}

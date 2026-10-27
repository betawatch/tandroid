package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh1 implements org.telegram.ui.ActionBar.b2, uc1 {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ wh1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.uc1
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.g0;
        this.a.removeSelfFromStack();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        WallpapersListActivity.W(this.a);
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xh1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                int[][] iArr = WallpapersListActivity.g0;
                ((WallpapersListActivity) obj).C0(false);
                break;
            case 1:
                ((org.telegram.ui.Components.ra1) obj).b();
                break;
            case 2:
                ((org.telegram.ui.Components.ab1) obj).d();
                break;
            default:
                ((WidgetConformanceActivity) obj).b.fullScroll(130);
                break;
        }
    }
}

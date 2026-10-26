package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vh1(Object obj, int i10) {
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
                ((org.telegram.ui.Components.qa1) obj).b();
                break;
            case 2:
                ((org.telegram.ui.Components.za1) obj).d();
                break;
            default:
                ((WidgetConformanceActivity) obj).b.fullScroll(130);
                break;
        }
    }
}

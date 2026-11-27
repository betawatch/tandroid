// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tvc implements fd, oqb {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ tvc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // oqb
    public final void a(TLRPC.WallPaper wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override // fd
    public final void w(id idVar, int i) {
        this.a.C0();
    }
}

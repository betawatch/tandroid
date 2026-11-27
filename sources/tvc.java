// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

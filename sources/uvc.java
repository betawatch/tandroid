// default package

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uvc implements qvc {
    public final /* synthetic */ WallpapersListActivity a;

    public uvc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // qvc
    public final void b(File file, Bitmap bitmap, boolean z) {
        pqb pqbVar = new pqb(new zvc(file, file, ""), bitmap, false);
        pqbVar.h1(0L);
        this.a.presentFragment(pqbVar, z);
    }

    @Override // qvc
    public final void a() {
    }
}

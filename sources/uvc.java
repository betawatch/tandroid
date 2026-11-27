// default package

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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

// default package

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

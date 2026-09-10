package zh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class w5 extends ImageReceiver {
    public final /* synthetic */ Runnable[] a;
    public final /* synthetic */ org.telegram.ui.web.a1 b;

    public w5(Runnable[] runnableArr, org.telegram.ui.web.a1 a1Var) {
        this.a = runnableArr;
        this.b = a1Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((yg.q) this.b.d).run();
        }
        AndroidUtilities.runOnUIThread(new k5(this, 2));
        return imageBitmapByKey;
    }
}

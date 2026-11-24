// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y68 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ y68(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f9;
                this.b.E1(false, 0, 0, true, false, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer.h2();
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.f9;
                this.b.E1(false, 0, 0, false, false, false);
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer.B(false, false);
                x02 x02Var = photoViewer.b2;
                if (x02Var != null) {
                    x02Var.a(true);
                }
                d dVar = photoViewer.m4;
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.f9;
                photoViewer.t7 = null;
                break;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.f9;
                photoViewer.B(true, false);
                break;
            default:
                Drawable[] drawableArr7 = PhotoViewer.f9;
                photoViewer.E2();
                break;
        }
    }
}

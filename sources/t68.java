// default package

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t68 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ t68(PhotoViewer photoViewer, Bitmap bitmap, byte b) {
        this.a = b;
        this.b = photoViewer;
        this.c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Bitmap bitmap = this.c;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.f(bitmap);
                gl.d3(new t68(photoViewer, bitmap, (byte) 5));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer.f(bitmap);
                gl.d3(new t68(photoViewer, bitmap, (byte) 4));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.f9;
                photoViewer.f(bitmap);
                gl.d3(new t68(photoViewer, bitmap, (byte) 6));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer.f(bitmap);
                break;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.f9;
                photoViewer.C4.f0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.j2(true, true);
                break;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.f9;
                photoViewer.C4.f0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.j2(true, true);
                break;
            default:
                Drawable[] drawableArr7 = PhotoViewer.f9;
                photoViewer.C4.f0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.j2(true, true);
                break;
        }
    }
}

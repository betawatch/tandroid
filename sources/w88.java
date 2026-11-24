// default package

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w88 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ w88(PhotoViewer photoViewer, Bitmap bitmap, byte b) {
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
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.f(bitmap);
                gm.c3(new w88(photoViewer, bitmap, (byte) 5));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer.f(bitmap);
                gm.c3(new w88(photoViewer, bitmap, (byte) 4));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer.f(bitmap);
                gm.c3(new w88(photoViewer, bitmap, (byte) 6));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer.f(bitmap);
                break;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.d9;
                photoViewer.B4.f0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.k2(true, true);
                break;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.d9;
                photoViewer.B4.f0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.k2(true, true);
                break;
            default:
                Drawable[] drawableArr7 = PhotoViewer.d9;
                photoViewer.B4.f0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.k2(true, true);
                break;
        }
    }
}

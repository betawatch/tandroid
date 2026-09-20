package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ int c;

    public /* synthetic */ i(j jVar, int i10, int i11) {
        this.a = i11;
        this.b = jVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                int i10 = jVar.k;
                m5.e[] eVarArr = jVar.c;
                int i11 = this.c;
                if (eVarArr[i11] == null) {
                    eVarArr[i11] = new m5.e(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f, jVar.o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) eVarArr[i11].b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                break;
            default:
                j jVar2 = this.b;
                int i12 = this.c;
                jVar2.d = i12;
                jVar2.g.setShader((BitmapShader) jVar2.c[i12].c);
                jVar2.j = false;
                jVar2.p = true;
                break;
        }
    }
}

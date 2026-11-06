package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ int c;

    public /* synthetic */ g(h hVar, int i7, int i10) {
        this.a = i10;
        this.b = hVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b;
                int i7 = hVar.k;
                v6.e[] eVarArr = hVar.c;
                int i10 = this.c;
                if (eVarArr[i10] == null) {
                    eVarArr[i10] = new v6.e(i7);
                }
                Bitmap bitmap = hVar.e;
                if (bitmap == null) {
                    hVar.e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f = new Canvas(hVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f, hVar.o);
                Utilities.copyBitmaps(hVar.e, (Bitmap) eVarArr[i10].a);
                g0.h3(new g(hVar, i10, 1));
                break;
            default:
                h hVar2 = this.b;
                int i11 = this.c;
                hVar2.d = i11;
                hVar2.g.setShader((BitmapShader) hVar2.c[i11].b);
                hVar2.j = false;
                hVar2.p = true;
                break;
        }
    }
}

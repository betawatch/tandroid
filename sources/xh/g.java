package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import tg.y;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                y[] yVarArr = hVar.c;
                int i10 = this.c;
                if (yVarArr[i10] == null) {
                    yVarArr[i10] = new y(i7);
                }
                Bitmap bitmap = hVar.e;
                if (bitmap == null) {
                    hVar.e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f = new Canvas(hVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f, hVar.o);
                Utilities.copyBitmaps(hVar.e, (Bitmap) yVarArr[i10].b);
                g0.g3(new g(hVar, i10, 1));
                break;
            default:
                h hVar2 = this.b;
                int i11 = this.c;
                hVar2.d = i11;
                hVar2.g.setShader((BitmapShader) hVar2.c[i11].c);
                hVar2.j = false;
                hVar2.p = true;
                break;
        }
    }
}

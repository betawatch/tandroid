package yh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ int c;

    public /* synthetic */ g(h hVar, int i3, int i10) {
        this.a = i10;
        this.b = hVar;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b;
                int i3 = hVar.k;
                w9.b[] bVarArr = hVar.c;
                int i10 = this.c;
                if (bVarArr[i10] == null) {
                    bVarArr[i10] = new w9.b(i3);
                }
                Bitmap bitmap = hVar.e;
                if (bitmap == null) {
                    hVar.e = Bitmap.createBitmap(i3, i3, Bitmap.Config.ALPHA_8);
                    hVar.f = new Canvas(hVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f, hVar.o);
                Utilities.copyBitmaps(hVar.e, (Bitmap) bVarArr[i10].b);
                g0.h3(new g(hVar, i10, 1));
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

// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sna implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tna b;
    public final /* synthetic */ int c;

    public /* synthetic */ sna(tna tnaVar, int i, byte b) {
        this.a = b;
        this.b = tnaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        int i = this.c;
        tna tnaVar = this.b;
        switch (b) {
            case 0:
                int i2 = tnaVar.k;
                mj4[] mj4VarArr = tnaVar.c;
                if (mj4VarArr[i] == null) {
                    mj4VarArr[i] = new mj4(i2);
                }
                Bitmap bitmap = tnaVar.e;
                if (bitmap == null) {
                    tnaVar.e = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
                    tnaVar.f = new Canvas(tnaVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                tnaVar.a(tnaVar.f, tnaVar.o);
                Utilities.copyBitmaps(tnaVar.e, (Bitmap) mj4VarArr[i].b);
                gm.c3(new sna(tnaVar, i, b2));
                break;
            default:
                tnaVar.d = i;
                tnaVar.g.setShader((BitmapShader) tnaVar.c[i].c);
                tnaVar.j = false;
                tnaVar.p = true;
                break;
        }
    }
}

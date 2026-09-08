package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                o0.a[] aVarArr = jVar.c;
                int i11 = this.c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f, jVar.o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) aVarArr[i11].b);
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

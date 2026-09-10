package uh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import n7.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                a1[] a1VarArr = jVar.c;
                int i11 = this.c;
                if (a1VarArr[i11] == null) {
                    a1VarArr[i11] = new a1(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f, jVar.o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) a1VarArr[i11].b);
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

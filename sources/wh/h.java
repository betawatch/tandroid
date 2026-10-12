package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ int c;

    public /* synthetic */ h(i iVar, int i10, int i11) {
        this.a = i11;
        this.b = iVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                int i10 = iVar.k;
                m4.c[] cVarArr = iVar.c;
                int i11 = this.c;
                if (cVarArr[i11] == null) {
                    cVarArr[i11] = new m4.c(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f, iVar.o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) cVarArr[i11].b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                break;
            default:
                i iVar2 = this.b;
                int i12 = this.c;
                iVar2.d = i12;
                iVar2.g.setShader((BitmapShader) iVar2.c[i12].c);
                iVar2.j = false;
                iVar2.p = true;
                break;
        }
    }
}

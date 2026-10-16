package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import m2.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
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
                t[] tVarArr = iVar.c;
                int i11 = this.c;
                if (tVarArr[i11] == null) {
                    tVarArr[i11] = new t(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f, iVar.o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) tVarArr[i11].b);
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

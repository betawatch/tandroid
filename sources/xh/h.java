package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import m4.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                w1[] w1VarArr = iVar.c;
                int i11 = this.c;
                if (w1VarArr[i11] == null) {
                    w1VarArr[i11] = new w1(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f, iVar.o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) w1VarArr[i11].b);
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

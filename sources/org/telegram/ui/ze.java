package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ ze(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                wn.k1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                wn.N0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                wn wnVar = this.b;
                fh.b bVar = wnVar.z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, wnVar.fragmentView);
                wnVar.A8.d();
                break;
            default:
                wn wnVar2 = this.b;
                wnVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                wnVar2.D8 = paint;
                Bitmap bitmap = wnVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                wnVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                wnVar2.E8 = new Matrix();
                fh.b bVar2 = wnVar2.z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, wnVar2.fragmentView);
                wnVar2.A8.d();
                break;
        }
    }
}

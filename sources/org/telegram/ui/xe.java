package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ xe(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                wn.B1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                wn.r1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                wn wnVar = this.b;
                hh.b bVar = wnVar.P8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, wnVar.fragmentView);
                wnVar.Q8.d();
                break;
            default:
                wn wnVar2 = this.b;
                wnVar2.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                wnVar2.T8 = paint;
                Bitmap bitmap = wnVar2.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                wnVar2.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                wnVar2.U8 = new Matrix();
                hh.b bVar2 = wnVar2.P8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, wnVar2.fragmentView);
                wnVar2.Q8.d();
                break;
        }
    }
}

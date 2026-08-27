package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ re(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                rn.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                rn.O0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                rn rnVar = this.b;
                og.b bVar = rnVar.v8;
                bVar.a((Bitmap) obj2);
                pg.c.c(bVar, rnVar.fragmentView);
                rnVar.w8.d();
                break;
            default:
                rn rnVar2 = this.b;
                rnVar2.x8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                rnVar2.z8 = paint;
                Bitmap bitmap = rnVar2.x8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                rnVar2.y8 = bitmapShader;
                paint.setShader(bitmapShader);
                rnVar2.A8 = new Matrix();
                og.b bVar2 = rnVar2.v8;
                bVar2.a((Bitmap) obj2);
                pg.c.c(bVar2, rnVar2.fragmentView);
                rnVar2.w8.d();
                break;
        }
    }
}

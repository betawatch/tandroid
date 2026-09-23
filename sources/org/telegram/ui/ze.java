package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ ze(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                xn.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                xn.O0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                xn xnVar = this.b;
                fh.b bVar = xnVar.z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, xnVar.fragmentView);
                xnVar.A8.d();
                break;
            default:
                xn xnVar2 = this.b;
                xnVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                xnVar2.D8 = paint;
                Bitmap bitmap = xnVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                xnVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                xnVar2.E8 = new Matrix();
                fh.b bVar2 = xnVar2.z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, xnVar2.fragmentView);
                xnVar2.A8.d();
                break;
        }
    }
}

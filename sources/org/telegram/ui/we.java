package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ we(xn xnVar, int i10) {
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
                tg.b bVar = xnVar.w8;
                bVar.a((Bitmap) obj2);
                ug.c.c(bVar, xnVar.fragmentView);
                xnVar.x8.d();
                break;
            default:
                xn xnVar2 = this.b;
                xnVar2.y8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                xnVar2.A8 = paint;
                Bitmap bitmap = xnVar2.y8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                xnVar2.z8 = bitmapShader;
                paint.setShader(bitmapShader);
                xnVar2.B8 = new Matrix();
                tg.b bVar2 = xnVar2.w8;
                bVar2.a((Bitmap) obj2);
                ug.c.c(bVar2, xnVar2.fragmentView);
                xnVar2.x8.d();
                break;
        }
    }
}

package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ re(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qn.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                qn.O0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                qn qnVar = this.b;
                ng.b bVar = qnVar.v8;
                bVar.a((Bitmap) obj2);
                og.d.c(bVar, qnVar.fragmentView);
                qnVar.w8.d();
                break;
            default:
                qn qnVar2 = this.b;
                qnVar2.x8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                qnVar2.z8 = paint;
                Bitmap bitmap = qnVar2.x8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                qnVar2.y8 = bitmapShader;
                paint.setShader(bitmapShader);
                qnVar2.A8 = new Matrix();
                ng.b bVar2 = qnVar2.v8;
                bVar2.a((Bitmap) obj2);
                og.d.c(bVar2, qnVar2.fragmentView);
                qnVar2.w8.d();
                break;
        }
    }
}

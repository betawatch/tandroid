package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ ze(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                bo.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                bo.O0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                bo boVar = this.b;
                fh.b bVar = boVar.z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, boVar.fragmentView);
                boVar.A8.d();
                break;
            default:
                bo boVar2 = this.b;
                boVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                boVar2.D8 = paint;
                Bitmap bitmap = boVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                boVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                boVar2.E8 = new Matrix();
                fh.b bVar2 = boVar2.z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, boVar2.fragmentView);
                boVar2.A8.d();
                break;
        }
    }
}

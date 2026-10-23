package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ we(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qn.z1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                qn.p1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                qn qnVar = this.b;
                gh.b bVar = qnVar.z8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, qnVar.fragmentView);
                qnVar.A8.d();
                break;
            default:
                qn qnVar2 = this.b;
                qnVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                qnVar2.D8 = paint;
                Bitmap bitmap = qnVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                qnVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                qnVar2.E8 = new Matrix();
                gh.b bVar2 = qnVar2.z8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, qnVar2.fragmentView);
                qnVar2.A8.d();
                break;
        }
    }
}

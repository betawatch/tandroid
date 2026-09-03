package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ ye(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                zn.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                zn.O0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                zn znVar = this.b;
                sg.b bVar = znVar.w8;
                bVar.a((Bitmap) obj2);
                tg.c.c(bVar, znVar.fragmentView);
                znVar.x8.d();
                break;
            default:
                zn znVar2 = this.b;
                znVar2.y8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                znVar2.A8 = paint;
                Bitmap bitmap = znVar2.y8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                znVar2.z8 = bitmapShader;
                paint.setShader(bitmapShader);
                znVar2.B8 = new Matrix();
                sg.b bVar2 = znVar2.w8;
                bVar2.a((Bitmap) obj2);
                tg.c.c(bVar2, znVar2.fragmentView);
                znVar2.x8.d();
                break;
        }
    }
}

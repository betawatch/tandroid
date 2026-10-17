package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ ye(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                sn.z1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                sn.p1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                sn snVar = this.b;
                gh.b bVar = snVar.z8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, snVar.fragmentView);
                snVar.A8.d();
                break;
            default:
                sn snVar2 = this.b;
                snVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                snVar2.D8 = paint;
                Bitmap bitmap = snVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                snVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                snVar2.E8 = new Matrix();
                gh.b bVar2 = snVar2.z8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, snVar2.fragmentView);
                snVar2.A8.d();
                break;
        }
    }
}

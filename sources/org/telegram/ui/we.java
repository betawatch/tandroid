package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ we(sn snVar, int i10) {
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
                sn.s1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                sn snVar = this.b;
                gh.b bVar = snVar.L8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, snVar.fragmentView);
                snVar.M8.d();
                break;
            default:
                sn snVar2 = this.b;
                snVar2.N8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                snVar2.P8 = paint;
                Bitmap bitmap = snVar2.N8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                snVar2.O8 = bitmapShader;
                paint.setShader(bitmapShader);
                snVar2.Q8 = new Matrix();
                gh.b bVar2 = snVar2.L8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, snVar2.fragmentView);
                snVar2.M8.d();
                break;
        }
    }
}

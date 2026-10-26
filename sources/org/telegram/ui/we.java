package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ we(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                un.l1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                un.S0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                un unVar = this.b;
                hh.b bVar = unVar.L8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, unVar.fragmentView);
                unVar.M8.d();
                break;
            default:
                un unVar2 = this.b;
                unVar2.N8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                unVar2.P8 = paint;
                Bitmap bitmap = unVar2.N8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                unVar2.O8 = bitmapShader;
                paint.setShader(bitmapShader);
                unVar2.Q8 = new Matrix();
                hh.b bVar2 = unVar2.L8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, unVar2.fragmentView);
                unVar2.M8.d();
                break;
        }
    }
}

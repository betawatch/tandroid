package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ ye(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                un.B0(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                un.C0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                un unVar = this.b;
                hi.b bVar = unVar.N8;
                bVar.a((Bitmap) obj2);
                yg.d.c(bVar, unVar.fragmentView);
                unVar.O8.d();
                break;
            default:
                un unVar2 = this.b;
                unVar2.P8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                unVar2.R8 = paint;
                Bitmap bitmap = unVar2.P8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                unVar2.Q8 = bitmapShader;
                paint.setShader(bitmapShader);
                unVar2.S8 = new Matrix();
                hi.b bVar2 = unVar2.N8;
                bVar2.a((Bitmap) obj2);
                yg.d.c(bVar2, unVar2.fragmentView);
                unVar2.O8.d();
                break;
        }
    }
}

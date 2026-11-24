// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pm1 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ pm1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.z8((Integer) obj, (Boolean) obj2);
                break;
            case 1:
                yv1Var.A8((Long) obj, (Boolean) obj2);
                break;
            case 2:
                jz4 jz4Var = yv1Var.P8;
                jz4Var.a((Bitmap) obj2);
                tl0.c(jz4Var, yv1Var.fragmentView);
                yv1Var.Q8.d();
                break;
            default:
                yv1Var.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                yv1Var.T8 = paint;
                Bitmap bitmap = yv1Var.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                yv1Var.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                yv1Var.U8 = new Matrix();
                jz4 jz4Var2 = yv1Var.P8;
                jz4Var2.a((Bitmap) obj2);
                tl0.c(jz4Var2, yv1Var.fragmentView);
                yv1Var.Q8.d();
                break;
        }
    }
}

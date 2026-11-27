// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pl1 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ pl1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                nz4 nz4Var = zu1Var.P8;
                nz4Var.a((Bitmap) obj2);
                uk0.c(nz4Var, zu1Var.fragmentView);
                zu1Var.Q8.d();
                break;
            case 1:
                zu1Var.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                zu1Var.T8 = paint;
                Bitmap bitmap = zu1Var.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                zu1Var.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                zu1Var.U8 = new Matrix();
                nz4 nz4Var2 = zu1Var.P8;
                nz4Var2.a((Bitmap) obj2);
                uk0.c(nz4Var2, zu1Var.fragmentView);
                zu1Var.Q8.d();
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z = false;
                zu1Var.Qc = false;
                if (!zu1Var.isFinished && d31.a(zu1Var)) {
                    z = true;
                }
                d31 b0 = z ? d31.b0(zu1Var) : d31.Y();
                if (bool.booleanValue()) {
                    b0.I(R.raw.contact_check, ob6.M0(2131747850, null), ob6.M0(2131747851, null)).j();
                } else {
                    b0.Z(tL_error).j();
                }
                if (z) {
                    zu1Var.zd(true);
                    break;
                }
                break;
            case 3:
                zu1Var.A8((Integer) obj, (Boolean) obj2);
                break;
            default:
                zu1Var.B8((Long) obj, (Boolean) obj2);
                break;
        }
    }
}

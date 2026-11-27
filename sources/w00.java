// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class w00 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j20 b;

    public /* synthetic */ w00(j20 j20Var, byte b) {
        this.a = b;
        this.b = j20Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                j20Var.R1 = !((Boolean) obj2).booleanValue();
                MediaController z = MediaController.z();
                w7 w7Var = j20Var.Q1;
                float floatValue = ((Float) obj).floatValue();
                w7Var.getClass();
                z.o0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                j20Var.b2.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}

// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class v00 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;

    public /* synthetic */ v00(i20 i20Var, byte b) {
        this.a = b;
        this.b = i20Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                i20Var.R1 = !((Boolean) obj2).booleanValue();
                MediaController w = MediaController.w();
                v7 v7Var = i20Var.Q1;
                float floatValue = ((Float) obj).floatValue();
                v7Var.getClass();
                w.l0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                i20Var.b2.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}

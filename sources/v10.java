// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v10 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i30 b;

    public /* synthetic */ v10(i30 i30Var, byte b) {
        this.a = b;
        this.b = i30Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                i30Var.R1 = !((Boolean) obj2).booleanValue();
                MediaController w = MediaController.w();
                v7 v7Var = i30Var.Q1;
                float floatValue = ((Float) obj).floatValue();
                v7Var.getClass();
                w.l0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                i30Var.b2.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}

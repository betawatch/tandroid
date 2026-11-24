// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xu3 implements ll5 {
    public final /* synthetic */ yu3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k27 c;
    public final /* synthetic */ zu3 d;

    public xu3(zu3 zu3Var, yu3 yu3Var, boolean z, k27 k27Var) {
        this.d = zu3Var;
        this.a = yu3Var;
        this.b = z;
        this.c = k27Var;
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.y() != null) {
            imageReceiver2.y().I(0, false, true);
        }
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
        k27 k27Var;
        if (this.b && (k27Var = this.c) != null && k27Var.F2() && imageReceiver.y() != null && imageReceiver.y().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }
}

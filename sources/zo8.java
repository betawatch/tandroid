// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class zo8 implements ll5 {
    public final /* synthetic */ Runnable[] a;

    public zo8(Runnable[] runnableArr) {
        this.a = runnableArr;
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if (imageReceiver.B()) {
            Runnable[] runnableArr = this.a;
            if (runnableArr[0] != null) {
                oy8 y = imageReceiver.y();
                if (y == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (y.t()) {
                    y.B0 = new w88(runnableArr, (byte) 27);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }
}

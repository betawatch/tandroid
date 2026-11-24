// default package

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p09 extends ImageReceiver {
    public final /* synthetic */ byte K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p09(View view, byte b) {
        super(view);
        this.K1 = b;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        switch (this.K1) {
            case 0:
                if (drawable instanceof oy8) {
                    ((oy8) drawable).I(0, false, true);
                }
                return super.h0(drawable, str, i, z, i2);
            default:
                boolean h0 = super.h0(drawable, str, i, z, i2);
                if (h0 && (drawable instanceof oy8)) {
                    oy8 oy8Var = (oy8) drawable;
                    oy8Var.I(0, false, true);
                    oy8Var.stop();
                }
                return h0;
        }
    }
}

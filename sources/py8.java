// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class py8 extends ImageReceiver {
    public final /* synthetic */ ry8 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py8(ry8 ry8Var) {
        super(null);
        this.K1 = ry8Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.h0(drawable, str, i, z, i2);
    }
}

// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

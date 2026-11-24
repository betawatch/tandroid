// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q09 extends ImageReceiver {
    public final /* synthetic */ s09 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q09(s09 s09Var) {
        super(null);
        this.K1 = s09Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.h0(drawable, str, i, z, i2);
    }
}

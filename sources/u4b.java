// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class u4b extends ImageReceiver {
    public final /* synthetic */ Runnable[] K1;
    public final /* synthetic */ ow0 L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4b(Runnable[] runnableArr, ow0 ow0Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = ow0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        boolean h0 = super.h0(drawable, str, i, z, i2);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            gm.r(runnable);
            ((uva) this.L1.d).run();
        }
        gm.c3(new nsa(this, (byte) 16));
        return h0;
    }
}

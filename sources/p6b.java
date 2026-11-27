// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class p6b extends ImageReceiver {
    public final /* synthetic */ Runnable[] K1;
    public final /* synthetic */ pv0 L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6b(Runnable[] runnableArr, pv0 pv0Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = pv0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        boolean h0 = super.h0(drawable, str, i, z, i2);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            hl.r(runnable);
            ((n3b) this.L1.d).run();
        }
        hl.c3(new uoa((Object) this, (byte) 25));
        return h0;
    }
}

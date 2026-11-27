// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
            ((z3b) this.L1.d).run();
        }
        hl.c3(new uoa((Object) this, (byte) 25));
        return h0;
    }
}

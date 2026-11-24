// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class t2b extends ImageReceiver {
    public final /* synthetic */ Runnable[] K1;
    public final /* synthetic */ ev0 L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2b(Runnable[] runnableArr, ev0 ev0Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = ev0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        boolean h0 = super.h0(drawable, str, i, z, i2);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            gl.r(runnable);
            ((iya) this.L1.d).run();
        }
        gl.c3(new kya(this, (byte) 8));
        return h0;
    }
}

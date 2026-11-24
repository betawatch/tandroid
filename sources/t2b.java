// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        gl.d3(new kya(this, (byte) 8));
        return h0;
    }
}

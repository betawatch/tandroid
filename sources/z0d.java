// default package

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.utils.twidget.x;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class z0d implements io4 {
    public final /* synthetic */ Context a;

    public z0d(Context context) {
        this.a = context;
    }

    @Override // io4
    public final void a() {
        x xVar = x.v;
        synchronized (xVar.a) {
            xVar.l = false;
        }
        xVar.b.removeCallbacks(xVar.u);
        xVar.b.postDelayed(xVar.u, 30000L);
    }

    @Override // io4
    public final void b() {
        Utilities.e.c(new xf1(this.a, (byte) 29));
    }
}

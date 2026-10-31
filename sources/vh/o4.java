package vh;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.d20;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o4 {
    public final z6 c;
    public m4 d;
    public CameraView f;
    public Bitmap g;
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final l4 h = new l4(this, 0);
    public final String e = vp.r1(d20.s0).U2;

    public o4(Context context, z6 z6Var) {
        this.c = z6Var;
        Utilities.e.c(new d1(7, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f = cameraView;
        if (this.a.get() == null || this.b.get()) {
            return;
        }
        Utilities.e.a(this.h);
        Utilities.e.d(this.h, b());
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o10 = tz.o();
        if (o10 != 1) {
            return o10 != 2 ? 800L : 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.b.getAndSet(z10) == z10) {
            return;
        }
        if (!z10) {
            Utilities.e.a(this.h);
            Utilities.e.d(this.h, b());
            return;
        }
        Utilities.e.a(this.h);
        if (this.d != null) {
            this.d = null;
            org.telegram.messenger.i0.g3(new l4(this, 1));
        }
    }
}

package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class w implements a0 {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ Runnable b;

    public w(Utilities.Callback callback, Runnable runnable) {
        this.a = callback;
        this.b = runnable;
    }

    @Override // zh.a0
    public final void a(String str) {
        this.a.run(str);
    }

    @Override // zh.a0
    public final void b(b0 b0Var) {
        AndroidUtilities.removeFromParent(b0Var);
        this.b.run();
    }
}

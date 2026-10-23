package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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

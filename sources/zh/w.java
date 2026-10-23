package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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

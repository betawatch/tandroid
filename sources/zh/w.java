package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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

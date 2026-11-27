// default package

import android.content.Context;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class u3a extends e39 {
    public final /* synthetic */ v3a M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3a(int i, x53 x53Var, v3a v3aVar, Context context) {
        super(1, i, x53Var, context, false, true);
        this.M = v3aVar;
    }

    @Override // e39
    public final void b(long j) {
        e Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        lcb createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.H(getContext(), j, l6b.a(this.M.d.r));
    }
}

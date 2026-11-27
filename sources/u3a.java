// default package

import android.content.Context;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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

package th;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t3 extends org.telegram.ui.Cells.q6 {
    public final /* synthetic */ u3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(int i10, Context context, b bVar, u3 u3Var) {
        super(1, i10, context, bVar, false, true);
        this.L = u3Var;
    }

    @Override // org.telegram.ui.Cells.q6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        o7 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.R(getContext(), j10, n5.a(this.L.d.r));
    }
}

package zh;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u3 extends org.telegram.ui.Cells.p6 {
    public final /* synthetic */ v3 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(int i10, Context context, b bVar, v3 v3Var) {
        super(1, i10, context, bVar, false, true);
        this.K = v3Var;
    }

    @Override // org.telegram.ui.Cells.p6
    public final void b(long j3) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        u7 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j3, s5.a(this.K.d.r));
    }
}

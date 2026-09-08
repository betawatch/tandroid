package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class q implements r {
    public final ScrollFeedbackProvider a;

    public q(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // r0.r
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override // r0.r
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.a.onScrollProgress(i10, i11, i12, i13);
    }
}

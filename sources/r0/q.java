package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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

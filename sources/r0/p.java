package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p implements q {
    public final ScrollFeedbackProvider a;

    public p(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // r0.q
    public final void onScrollLimit(int i3, int i10, int i11, boolean z10) {
        this.a.onScrollLimit(i3, i10, i11, z10);
    }

    @Override // r0.q
    public final void onScrollProgress(int i3, int i10, int i11, int i12) {
        this.a.onScrollProgress(i3, i10, i11, i12);
    }
}

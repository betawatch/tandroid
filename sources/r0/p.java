package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p implements q {
    public final ScrollFeedbackProvider a;

    public p(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // r0.q
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override // r0.q
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.a.onScrollProgress(i10, i11, i12, i13);
    }
}

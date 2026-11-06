package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p implements q {
    public final ScrollFeedbackProvider a;

    public p(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // r0.q
    public final void onScrollLimit(int i7, int i10, int i11, boolean z9) {
        this.a.onScrollLimit(i7, i10, i11, z9);
    }

    @Override // r0.q
    public final void onScrollProgress(int i7, int i10, int i11, int i12) {
        this.a.onScrollProgress(i7, i10, i11, i12);
    }
}

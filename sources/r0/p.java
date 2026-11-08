package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

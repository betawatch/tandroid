package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

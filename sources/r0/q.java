package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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

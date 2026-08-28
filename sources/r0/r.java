package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r implements s {
    public final ScrollFeedbackProvider a;

    public r(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // r0.s
    public final void onScrollLimit(int i9, int i10, int i11, boolean z10) {
        this.a.onScrollLimit(i9, i10, i11, z10);
    }

    @Override // r0.s
    public final void onScrollProgress(int i9, int i10, int i11, int i12) {
        this.a.onScrollProgress(i9, i10, i11, i12);
    }
}

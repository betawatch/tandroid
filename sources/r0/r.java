package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r implements s {
    public final ScrollFeedbackProvider a;

    public r(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // r0.s
    public final void onScrollLimit(int i10, int i11, int i12, boolean z4) {
        this.a.onScrollLimit(i10, i11, i12, z4);
    }

    @Override // r0.s
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.a.onScrollProgress(i10, i11, i12, i13);
    }
}

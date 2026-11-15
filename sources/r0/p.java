package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class p implements q {
    public final ScrollFeedbackProvider a;

    public p(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // r0.q
    public final void onScrollLimit(int i7, int i10, int i11, boolean z10) {
        this.a.onScrollLimit(i7, i10, i11, z10);
    }

    @Override // r0.q
    public final void onScrollProgress(int i7, int i10, int i11, int i12) {
        this.a.onScrollProgress(i7, i10, i11, i12);
    }
}

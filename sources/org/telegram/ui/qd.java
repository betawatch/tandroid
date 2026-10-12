package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qd extends RadialProgressView {
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd(org.telegram.ui.Components.h50 h50Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = h50Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                cv0 cv0Var = ((PhotoViewer) this.L).e0;
                if (cv0Var != null) {
                    cv0Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void setAlpha(float f7) {
        switch (this.K) {
            case 0:
                super.setAlpha(f7);
                ((sd) this.L).f.invalidate();
                break;
            case 1:
                super.setAlpha(f7);
                ((p70) this.L).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((mf0) this.L).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                cv0 cv0Var = ((PhotoViewer) this.L).e0;
                if (cv0Var != null) {
                    cv0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper, c6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}

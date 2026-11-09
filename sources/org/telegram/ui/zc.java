package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zc extends RadialProgressView {
    public final /* synthetic */ int N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(org.telegram.ui.Components.j30 j30Var, Context context, int i7) {
        super(context, null);
        this.N = i7;
        this.O = j30Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.N) {
            case 3:
                super.invalidate();
                rq0 rq0Var = ((PhotoViewer) this.O).e0;
                if (rq0Var != null) {
                    rq0Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void setAlpha(float f10) {
        switch (this.N) {
            case 0:
                super.setAlpha(f10);
                ((bd) this.O).h.invalidate();
                break;
            case 1:
                super.setAlpha(f10);
                ((f50) this.O).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((rc0) this.O).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                rq0 rq0Var = ((PhotoViewer) this.O).e0;
                if (rq0Var != null) {
                    rq0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.g6 g6Var) {
        super(contextThemeWrapper, g6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}

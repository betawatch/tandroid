package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yc extends RadialProgressView {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc(org.telegram.ui.Components.e30 e30Var, Context context, int i3) {
        super(context, null);
        this.O = i3;
        this.P = e30Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                gq0 gq0Var = ((PhotoViewer) this.P).f0;
                if (gq0Var != null) {
                    gq0Var.invalidate();
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
        switch (this.O) {
            case 0:
                super.setAlpha(f10);
                ((ad) this.P).h.invalidate();
                break;
            case 1:
                super.setAlpha(f10);
                ((y40) this.P).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((nc0) this.P).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                gq0 gq0Var = ((PhotoViewer) this.P).f0;
                if (gq0Var != null) {
                    gq0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper, e6Var);
        this.O = 3;
        this.P = photoViewer;
    }
}

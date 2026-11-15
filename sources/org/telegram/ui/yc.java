package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yc extends RadialProgressView {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc(org.telegram.ui.Components.l30 l30Var, Context context, int i7) {
        super(context, null);
        this.O = i7;
        this.P = l30Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                oq0 oq0Var = ((PhotoViewer) this.P).f0;
                if (oq0Var != null) {
                    oq0Var.invalidate();
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
                ((c50) this.P).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((oc0) this.P).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                oq0 oq0Var = ((PhotoViewer) this.P).f0;
                if (oq0Var != null) {
                    oq0Var.invalidate();
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

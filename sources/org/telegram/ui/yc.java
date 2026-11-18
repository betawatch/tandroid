package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yc extends RadialProgressView {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc(org.telegram.ui.Components.t30 t30Var, Context context, int i7) {
        super(context, null);
        this.O = i7;
        this.P = t30Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                qq0 qq0Var = ((PhotoViewer) this.P).f0;
                if (qq0Var != null) {
                    qq0Var.invalidate();
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
                ((f50) this.P).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((pc0) this.P).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                qq0 qq0Var = ((PhotoViewer) this.P).f0;
                if (qq0Var != null) {
                    qq0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.i6 i6Var) {
        super(contextThemeWrapper, i6Var);
        this.O = 3;
        this.P = photoViewer;
    }
}

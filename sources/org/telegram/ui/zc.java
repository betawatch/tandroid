package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zc extends RadialProgressView {
    public final /* synthetic */ int N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(org.telegram.ui.Components.i30 i30Var, Context context, int i7) {
        super(context, null);
        this.N = i7;
        this.O = i30Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.N) {
            case 3:
                super.invalidate();
                sq0 sq0Var = ((PhotoViewer) this.O).e0;
                if (sq0Var != null) {
                    sq0Var.invalidate();
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
                ((g50) this.O).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((sc0) this.O).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                sq0 sq0Var = ((PhotoViewer) this.O).e0;
                if (sq0Var != null) {
                    sq0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.h6 h6Var) {
        super(contextThemeWrapper, h6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}

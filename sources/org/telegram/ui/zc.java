package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                oq0 oq0Var = ((PhotoViewer) this.O).e0;
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
        switch (this.N) {
            case 0:
                super.setAlpha(f10);
                ((bd) this.O).h.invalidate();
                break;
            case 1:
                super.setAlpha(f10);
                ((d50) this.O).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((pc0) this.O).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                oq0 oq0Var = ((PhotoViewer) this.O).e0;
                if (oq0Var != null) {
                    oq0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper, f6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}

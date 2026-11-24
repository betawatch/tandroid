// default package

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wh1 extends RadialProgressView {
    public final /* synthetic */ byte O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh1(vl5 vl5Var, Context context, byte b) {
        super(context, null);
        this.O = b;
        this.P = vl5Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                k98 k98Var = ((PhotoViewer) this.P).f0;
                if (k98Var != null) {
                    k98Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void setAlpha(float f) {
        byte b = this.O;
        Object obj = this.P;
        switch (b) {
            case 0:
                super.setAlpha(f);
                ((yh1) obj).h.invalidate();
                break;
            case 1:
                super.setAlpha(f);
                ((wa5) obj).e.invalidate();
                break;
            case 2:
                super.setAlpha(f);
                ((ae6) obj).h.invalidate();
                break;
            default:
                super.setAlpha(f);
                k98 k98Var = ((PhotoViewer) obj).f0;
                if (k98Var != null) {
                    k98Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, wjb wjbVar) {
        super(contextThemeWrapper, wjbVar);
        this.O = (byte) 3;
        this.P = photoViewer;
    }
}

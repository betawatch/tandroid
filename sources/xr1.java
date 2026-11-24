// default package

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xr1 extends UndoView {
    public final /* synthetic */ byte k0 = 1;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr1(mu1 mu1Var, Activity activity, mu1 mu1Var2, wjb wjbVar) {
        super(activity, mu1Var2, true, wjbVar);
        this.l0 = mu1Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        switch (this.k0) {
            case 0:
                ((mu1) this.l0).f6(characterStyle, false, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        switch (this.k0) {
            case 1:
                super.invalidate();
                ((e55) this.l0).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i2;
        switch (this.k0) {
            case 0:
                uq1 uq1Var = ((mu1) this.l0).m2;
                setAdditionalTranslationY((uq1Var == null || !(((i2 = uq1Var.U) == 1 || i2 == 3) && uq1Var.T)) ? 0.0f : gl.L(uq1Var.getStyleHeight()));
                super.k(j, i, obj, obj2, runnable, runnable2);
                break;
            default:
                super.k(j, i, obj, obj2, runnable, runnable2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr1(e55 e55Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.l0 = e55Var;
    }
}

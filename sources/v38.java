// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v38 extends a {
    public final /* synthetic */ b48 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v38(b48 b48Var, Activity activity) {
        super(activity, null);
        this.G1 = b48Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.G1.b.invalidate();
    }
}

// default package

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y92 extends RadioButton {
    public final /* synthetic */ z92 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y92(z92 z92Var, Context context) {
        super(context);
        this.y = z92Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }
}

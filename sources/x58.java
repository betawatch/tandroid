// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x58 extends a {
    public final /* synthetic */ d68 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x58(d68 d68Var, Activity activity) {
        super(activity, null);
        this.G1 = d68Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.G1.b.invalidate();
    }
}

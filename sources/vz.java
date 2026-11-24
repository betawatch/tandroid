// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vz implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zx0 b;

    public /* synthetic */ vz(zx0 zx0Var, byte b) {
        this.a = b;
        this.b = zx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        zx0 zx0Var = this.b;
        switch (b) {
            case 0:
                zx0Var.run();
                break;
            default:
                RectF rectF = ProfileActivity.e7;
                zx0Var.run();
                break;
        }
    }
}

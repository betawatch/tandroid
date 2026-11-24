// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vy implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rw0 b;

    public /* synthetic */ vy(rw0 rw0Var, byte b) {
        this.a = b;
        this.b = rw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rw0 rw0Var = this.b;
        switch (b) {
            case 0:
                rw0Var.run();
                break;
            default:
                RectF rectF = ProfileActivity.Z6;
                rw0Var.run();
                break;
        }
    }
}

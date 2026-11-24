// default package

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class yr8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ an8 b;

    public /* synthetic */ yr8(an8 an8Var, byte b) {
        this.a = b;
        this.b = an8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        an8 an8Var = this.b;
        switch (b) {
            case 0:
                int i = ProfileStoriesView.t0;
                ProfileActivity profileActivity = an8Var.v0;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.Z2(false);
                break;
            default:
                an8Var.invalidate();
                break;
        }
    }
}

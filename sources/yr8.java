// default package

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

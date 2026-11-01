package th;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.lw0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lw0 b;

    public /* synthetic */ b3(lw0 lw0Var, int i10) {
        this.a = i10;
        this.b = lw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        lw0 lw0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = ProfileStoriesView.s0;
                ProfileActivity profileActivity = lw0Var.u0;
                RectF rectF = ProfileActivity.S6;
                profileActivity.K4(false);
                break;
            default:
                lw0Var.invalidate();
                break;
        }
    }
}

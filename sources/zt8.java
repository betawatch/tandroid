// default package

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bp8 b;

    public /* synthetic */ zt8(bp8 bp8Var, byte b) {
        this.a = b;
        this.b = bp8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bp8 bp8Var = this.b;
        switch (b) {
            case 0:
                int i = ProfileStoriesView.t0;
                ProfileActivity profileActivity = bp8Var.v0;
                RectF rectF = ProfileActivity.e7;
                profileActivity.d3(false);
                break;
            default:
                bp8Var.invalidate();
                break;
        }
    }
}

package th;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.mw0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mw0 b;

    public /* synthetic */ b3(mw0 mw0Var, int i10) {
        this.a = i10;
        this.b = mw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        mw0 mw0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = ProfileStoriesView.s0;
                ProfileActivity profileActivity = mw0Var.u0;
                RectF rectF = ProfileActivity.R6;
                profileActivity.J4(false);
                break;
            default:
                mw0Var.invalidate();
                break;
        }
    }
}

// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xy implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ax0 b;

    public /* synthetic */ xy(ax0 ax0Var, byte b) {
        this.a = b;
        this.b = ax0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ax0 ax0Var = this.b;
        switch (b) {
            case 0:
                ax0Var.run();
                break;
            default:
                RectF rectF = ProfileActivity.Z6;
                ax0Var.run();
                break;
        }
    }
}

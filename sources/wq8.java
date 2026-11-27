// default package

import android.content.Context;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wq8 extends jla {
    public final /* synthetic */ ProfileActivity E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq8(ProfileActivity profileActivity, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.E0 = profileActivity;
    }

    @Override // jla, s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        super.t(i, f, f2, t84Var);
        RectF rectF = ProfileActivity.Z6;
        this.E0.S3();
    }
}

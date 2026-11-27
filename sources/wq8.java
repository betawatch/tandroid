// default package

import android.content.Context;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

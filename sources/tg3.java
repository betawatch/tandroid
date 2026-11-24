// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tg3 extends FrameLayout {
    public d a;
    public FrameLayout b;
    public a c;
    public r59 d;
    public pu9 e;
    public int f;
    public final /* synthetic */ ug3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(ug3 ug3Var, Context context) {
        super(context);
        this.h = ug3Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        tg3 tg3Var;
        super.setTranslationX(f);
        ug3 ug3Var = this.h;
        tg3[] tg3VarArr = ug3Var.f;
        if (ug3Var.n && (tg3Var = tg3VarArr[0]) == this) {
            ug3Var.e.i(Math.abs(tg3Var.getTranslationX()) / tg3VarArr[0].getMeasuredWidth(), tg3VarArr[1].f);
        }
    }
}

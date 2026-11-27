// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x13 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new x13());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        clb clbVar = (clb) view;
        clbVar.c(b8cVar.m, b8cVar.o, !b8cVar.j);
        tpa tpaVar = clbVar.a;
        if (b8cVar.m instanceof SpannableStringBuilder) {
            tpaVar.setTextSize(1, 13.0f);
            tpaVar.setTranslationY(hl.L(2.0f));
            tpaVar.setTypeface(hl.n1("fonts/rmono.ttf"));
        }
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        clb clbVar = new clb(vnbVar, context, true);
        yob.h(aob.d6, vnbVar, clbVar);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        yob.x(clbVar, mutate, aob.L6, vnbVar, PorterDuff.Mode.MULTIPLY);
        clbVar.setImage(mutate);
        clbVar.setImageClickListener(new sb1(this, context, clbVar));
        return clbVar;
    }
}

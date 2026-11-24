// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q23 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new q23());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        hjb hjbVar = (hjb) view;
        hjbVar.c(c6cVar.m, c6cVar.o, !c6cVar.j);
        xna xnaVar = hjbVar.a;
        if (c6cVar.m instanceof SpannableStringBuilder) {
            xnaVar.setTextSize(1, 13.0f);
            xnaVar.setTranslationY(gm.L(2.0f));
            xnaVar.setTypeface(gm.n1("fonts/rmono.ttf"));
        }
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        hjb hjbVar = new hjb(ylbVar, context, true);
        anb.h(cmb.c6, ylbVar, hjbVar);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        anb.x(hjbVar, mutate, cmb.K6, ylbVar, PorterDuff.Mode.MULTIPLY);
        hjbVar.setImage(mutate);
        hjbVar.setImageClickListener(new rc1(this, context, hjbVar));
        return hjbVar;
    }
}

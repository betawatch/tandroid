// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class os5 extends f56 {
    public final /* synthetic */ ss5 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os5(ss5 ss5Var, Context context, d dVar, my0 my0Var, boolean z) {
        super(context, dVar, my0Var, false, z);
        this.N = ss5Var;
    }

    @Override // f56
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        xs5 xs5Var = this.N.c;
        dy0 dy0Var = xs5Var.c;
        int i = xs5.h2;
        u31 Q = new c41(dy0Var, xs5Var.J0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.s = false;
        Q.k(true);
    }
}

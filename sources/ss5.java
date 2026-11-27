// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ss5 extends i56 {
    public final /* synthetic */ ws5 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss5(ws5 ws5Var, Context context, e eVar, nx0 nx0Var, boolean z) {
        super(context, eVar, nx0Var, false, z);
        this.N = ws5Var;
    }

    @Override // i56
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        bt5 bt5Var = this.N.c;
        ex0 ex0Var = bt5Var.c;
        int i = bt5.h2;
        v21 Q = new d31(ex0Var, bt5Var.J0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.s = false;
        Q.k(true);
    }
}

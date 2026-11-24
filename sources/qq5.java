// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qq5 extends f36 {
    public final /* synthetic */ uq5 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq5(uq5 uq5Var, Context context, d dVar, fx0 fx0Var, boolean z) {
        super(context, dVar, fx0Var, false, z);
        this.N = uq5Var;
    }

    @Override // f36
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        zq5 zq5Var = this.N.c;
        ww0 ww0Var = zq5Var.c;
        int i = zq5.h2;
        m21 Q = new u21(ww0Var, zq5Var.J0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}

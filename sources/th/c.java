package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class c implements kl0 {
    public final /* synthetic */ d6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f c;

    public c(Context context, d6 d6Var, f fVar) {
        this.c = fVar;
        this.a = d6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.c;
        g20 g20Var = fVar.h0;
        HashMap hashMap = fVar.j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            g20Var.c((n30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new yc(fVar.n0, this.a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            n30 n30Var = new n30(this.b, tL_help_country);
            n30Var.setOnClickListener(new a(fVar, 4));
            g20Var.a(n30Var);
            hashMap.put(tL_help_country.iso2, n30Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.d0.N(true);
        fVar.e0.b(hashMap.size(), true);
    }
}

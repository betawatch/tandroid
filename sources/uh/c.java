package uh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class c implements wl0 {
    public final /* synthetic */ d6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f c;

    public c(Context context, d6 d6Var, f fVar) {
        this.c = fVar;
        this.a = d6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.c;
        o20 o20Var = fVar.h0;
        HashMap hashMap = fVar.j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            o20Var.c((v30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new xc(fVar.n0, this.a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            v30 v30Var = new v30(this.b, tL_help_country);
            v30Var.setOnClickListener(new a(fVar, 4));
            o20Var.a(v30Var);
            hashMap.put(tL_help_country.iso2, v30Var);
            z10 = true;
        }
        if (view instanceof yg.b) {
            ((yg.b) view).c(z10, true);
        }
        fVar.d0.N(true);
        fVar.e0.b(hashMap.size(), true);
    }
}

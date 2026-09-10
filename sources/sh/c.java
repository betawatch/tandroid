package sh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c implements jl0 {
    public final /* synthetic */ f6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f c;

    public c(Context context, f6 f6Var, f fVar) {
        this.c = fVar;
        this.a = f6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.c;
        o20 o20Var = fVar.h0;
        HashMap hashMap = fVar.j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            o20Var.c((w30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new wc(fVar.n0, this.a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            w30 w30Var = new w30(this.b, tL_help_country);
            w30Var.setOnClickListener(new a(fVar, 4));
            o20Var.a(w30Var);
            hashMap.put(tL_help_country.iso2, w30Var);
            z10 = true;
        }
        if (view instanceof wg.b) {
            ((wg.b) view).c(z10, true);
        }
        fVar.d0.N(true);
        fVar.e0.b(hashMap.size(), true);
    }
}

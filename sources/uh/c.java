package uh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c implements am0 {
    public final /* synthetic */ c6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f c;

    public c(Context context, c6 c6Var, f fVar) {
        this.c = fVar;
        this.a = c6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.c;
        s20 s20Var = fVar.h0;
        HashMap hashMap = fVar.j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            s20Var.c((z30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new zc(fVar.n0, this.a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            z30 z30Var = new z30(this.b, tL_help_country);
            z30Var.setOnClickListener(new a(fVar, 4));
            s20Var.a(z30Var);
            hashMap.put(tL_help_country.iso2, z30Var);
            z10 = true;
        }
        if (view instanceof yg.b) {
            ((yg.b) view).c(z10, true);
        }
        fVar.d0.N(true);
        fVar.e0.b(hashMap.size(), true);
    }
}

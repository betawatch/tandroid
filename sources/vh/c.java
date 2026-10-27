package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x30;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c implements am0 {
    public final /* synthetic */ u6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f c;

    public c(Context context, u6 u6Var, f fVar) {
        this.c = fVar;
        this.a = u6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.c;
        q20 q20Var = fVar.h0;
        HashMap hashMap = fVar.j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            q20Var.c((x30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new wc(fVar.n0, this.a).R(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            x30 x30Var = new x30(this.b, tL_help_country);
            x30Var.setOnClickListener(new a(fVar, 4));
            q20Var.a(x30Var);
            hashMap.put(tL_help_country.iso2, x30Var);
            z10 = true;
        }
        if (view instanceof zg.b) {
            ((zg.b) view).c(z10, true);
        }
        fVar.d0.O(true);
        fVar.e0.b(hashMap.size(), true);
    }
}

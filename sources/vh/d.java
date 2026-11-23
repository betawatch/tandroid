package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d implements qj0 {
    public final /* synthetic */ i6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g c;

    public d(Context context, i6 i6Var, g gVar) {
        this.c = gVar;
        this.a = i6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.c;
        h10 h10Var = gVar.d2;
        HashMap hashMap = gVar.f2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.Z1.G(i7 - 1).H) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            h10Var.c((n20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.i2;
            if (size >= i10) {
                m10.u(gd.a0(null, null, 2131746918, Integer.valueOf(i10)), new kc(gVar.j2, this.a), R.raw.info, 36);
                return;
            }
            n20 n20Var = new n20(this.b, tL_help_country);
            n20Var.setOnClickListener(new a(gVar, 4));
            h10Var.a(n20Var);
            hashMap.put(tL_help_country.iso2, n20Var);
            z10 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z10, true);
        }
        gVar.Z1.O(true);
        gVar.a2.c(hashMap.size(), true);
    }
}

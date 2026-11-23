package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d implements qj0 {
    public final /* synthetic */ h6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g c;

    public d(Context context, h6 h6Var, g gVar) {
        this.c = gVar;
        this.a = h6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.c;
        j10 j10Var = gVar.d2;
        HashMap hashMap = gVar.f2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.Z1.G(i7 - 1).H) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            j10Var.c((p20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.i2;
            if (size >= i10) {
                o10.u(hd.a0(null, null, 2131746918, Integer.valueOf(i10)), new lc(gVar.j2, this.a), R.raw.info, 36);
                return;
            }
            p20 p20Var = new p20(this.b, tL_help_country);
            p20Var.setOnClickListener(new a(gVar, 4));
            j10Var.a(p20Var);
            hashMap.put(tL_help_country.iso2, p20Var);
            z10 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z10, true);
        }
        gVar.Z1.O(true);
        gVar.a2.c(hashMap.size(), true);
    }
}

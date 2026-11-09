package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.w00;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d implements cj0 {
    public final /* synthetic */ g6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g c;

    public d(Context context, g6 g6Var, g gVar) {
        this.c = gVar;
        this.a = g6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void c(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.c;
        w00 w00Var = gVar.Z1;
        HashMap hashMap = gVar.b2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.V1.G(i7 - 1).G) == null) {
            return;
        }
        boolean z9 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            w00Var.c((d20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.e2;
            if (size >= i10) {
                q.s(id.a0(null, null, 2131747112, Integer.valueOf(i10)), new hc(gVar.f2, this.a), R.raw.info, 36);
                return;
            }
            d20 d20Var = new d20(this.b, tL_help_country);
            d20Var.setOnClickListener(new a(gVar, 4));
            w00Var.a(d20Var);
            hashMap.put(tL_help_country.iso2, d20Var);
            z9 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z9, true);
        }
        gVar.V1.O(true);
        gVar.W1.c(hashMap.size(), true);
    }
}

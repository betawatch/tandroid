package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.w00;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class d implements bj0 {
    public final /* synthetic */ f6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g c;

    public d(Context context, f6 f6Var, g gVar) {
        this.c = gVar;
        this.a = f6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.bj0
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
            w00Var.c((c20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.e2;
            if (size >= i10) {
                q.s(id.a0(null, null, 2131747113, Integer.valueOf(i10)), new hc(gVar.f2, this.a), R.raw.info, 36);
                return;
            }
            c20 c20Var = new c20(this.b, tL_help_country);
            c20Var.setOnClickListener(new a(gVar, 4));
            w00Var.a(c20Var);
            hashMap.put(tL_help_country.iso2, c20Var);
            z9 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z9, true);
        }
        gVar.V1.O(true);
        gVar.W1.c(hashMap.size(), true);
    }
}

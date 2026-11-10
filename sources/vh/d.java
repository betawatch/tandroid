package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.v00;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d implements bj0 {
    public final /* synthetic */ h6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g c;

    public d(Context context, h6 h6Var, g gVar) {
        this.c = gVar;
        this.a = h6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.c;
        v00 v00Var = gVar.c2;
        HashMap hashMap = gVar.e2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.Y1.G(i7 - 1).G) == null) {
            return;
        }
        boolean z9 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            v00Var.c((c20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.h2;
            if (size >= i10) {
                q.s(id.a0(null, null, 2131747112, Integer.valueOf(i10)), new gc(gVar.i2, this.a), R.raw.info, 36);
                return;
            }
            c20 c20Var = new c20(this.b, tL_help_country);
            c20Var.setOnClickListener(new a(gVar, 4));
            v00Var.a(c20Var);
            hashMap.put(tL_help_country.iso2, c20Var);
            z9 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z9, true);
        }
        gVar.Y1.O(true);
        gVar.Z1.c(hashMap.size(), true);
    }
}

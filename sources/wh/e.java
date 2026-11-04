package wh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.y10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e implements fj0 {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ h c;

    public e(Context context, e6 e6Var, h hVar) {
        this.c = hVar;
        this.a = e6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        TLRPC.TL_help_country tL_help_country;
        h hVar = this.c;
        r00 r00Var = hVar.a2;
        HashMap hashMap = hVar.c2;
        if (i3 == 0 || (tL_help_country = (TLRPC.TL_help_country) hVar.W1.G(i3 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            r00Var.c((y10) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = hVar.f2;
            if (size >= i10) {
                q.s(bd.a0(null, null, 2131747120, Integer.valueOf(i10)), new fc(hVar.g2, this.a), R.raw.info, 36);
                return;
            }
            y10 y10Var = new y10(this.b, tL_help_country);
            y10Var.setOnClickListener(new a(hVar, 4));
            r00Var.a(y10Var);
            hashMap.put(tL_help_country.iso2, y10Var);
            z10 = true;
        }
        if (view instanceof bh.c) {
            ((bh.c) view).c(z10, true);
        }
        hVar.W1.O(true);
        hVar.X1.c(hashMap.size(), true);
    }
}

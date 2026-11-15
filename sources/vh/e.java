package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.z00;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e implements gj0 {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ h c;

    public e(Context context, e6 e6Var, h hVar) {
        this.c = hVar;
        this.a = e6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        h hVar = this.c;
        z00 z00Var = hVar.d2;
        HashMap hashMap = hVar.f2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) hVar.Z1.G(i7 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            z00Var.c((f20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = hVar.i2;
            if (size >= i10) {
                i20.t(hd.a0(null, null, 2131747112, Integer.valueOf(i10)), new cc(hVar.j2, this.a), R.raw.info, 36);
                return;
            }
            f20 f20Var = new f20(this.b, tL_help_country);
            f20Var.setOnClickListener(new a(hVar, 4));
            z00Var.a(f20Var);
            hashMap.put(tL_help_country.iso2, f20Var);
            z10 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z10, true);
        }
        hVar.Z1.O(true);
        hVar.a2.c(hashMap.size(), true);
    }
}

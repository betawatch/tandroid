// default package

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ux2 implements c39 {
    public final /* synthetic */ wjb a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xx2 c;

    public ux2(xx2 xx2Var, wjb wjbVar, Context context) {
        this.c = xx2Var;
        this.a = wjbVar;
        this.b = context;
    }

    @Override // c39
    public final void d(int i, View view) {
        TLRPC.TL_help_country tL_help_country;
        xx2 xx2Var = this.c;
        ro4 ro4Var = xx2Var.c2;
        HashMap hashMap = xx2Var.e2;
        if (i == 0 || (tL_help_country = (TLRPC.TL_help_country) xx2Var.Y1.G(i - 1).H) == null) {
            return;
        }
        boolean z = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            ro4Var.c((ya5) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i2 = xx2Var.h2;
            if (size >= i2) {
                b00.u(k96.a0(null, null, 2131746919, Integer.valueOf(i2)), new u21(xx2Var.i2, this.a), R.raw.info, 36);
                return;
            }
            ya5 ya5Var = new ya5(this.b, tL_help_country);
            ya5Var.setOnClickListener(new rx2(xx2Var, (byte) 4));
            ro4Var.a(ya5Var);
            hashMap.put(tL_help_country.iso2, ya5Var);
            z = true;
        }
        if (view instanceof bz9) {
            ((bz9) view).c(z, true);
        }
        xx2Var.Y1.O(true);
        xx2Var.Z1.c(hashMap.size(), true);
    }
}

// default package

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class oy2 implements r69 {
    public final /* synthetic */ vnb a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ry2 c;

    public oy2(ry2 ry2Var, vnb vnbVar, Context context) {
        this.c = ry2Var;
        this.a = vnbVar;
        this.b = context;
    }

    @Override // r69
    public final void e(int i, View view) {
        TLRPC.TL_help_country tL_help_country;
        ry2 ry2Var = this.c;
        vq4 vq4Var = ry2Var.c2;
        HashMap hashMap = ry2Var.e2;
        if (i == 0 || (tL_help_country = (TLRPC.TL_help_country) ry2Var.Y1.G(i - 1).H) == null) {
            return;
        }
        boolean z = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            vq4Var.c((zc5) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i2 = ry2Var.h2;
            if (size >= i2) {
                c00.v(ob6.a0(null, null, 2131746839, Integer.valueOf(i2)), new d31(ry2Var.i2, this.a), R.raw.info, 36);
                return;
            }
            zc5 zc5Var = new zc5(this.b, tL_help_country);
            zc5Var.setOnClickListener(new ly2(ry2Var, (byte) 4));
            vq4Var.a(zc5Var);
            hashMap.put(tL_help_country.iso2, zc5Var);
            z = true;
        }
        if (view instanceof v2a) {
            ((v2a) view).c(z, true);
        }
        ry2Var.Y1.O(true);
        ry2Var.Z1.c(hashMap.size(), true);
    }
}

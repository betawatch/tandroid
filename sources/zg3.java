// default package

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zg3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aj3 b;

    public /* synthetic */ zg3(aj3 aj3Var, byte b) {
        this.a = b;
        this.b = aj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        aj3 aj3Var = this.b;
        switch (b) {
            case 0:
                nk3 nk3Var = aj3Var.P0;
                if (!nk3Var.M || !nk3Var.v3().H()) {
                    nk3Var.R4(true, true);
                    break;
                } else {
                    nk3Var.F0.h();
                    break;
                }
                break;
            case 1:
                aj3Var.P0.F0.j(0L);
                break;
            case 2:
                Bundle bundle = new Bundle();
                nk3 nk3Var2 = aj3Var.P0;
                i = ((d) nk3Var2).currentAccount;
                bundle.putLong("dialog_id", z8c.h(i).e());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                bundle.putInt("start_from", 9);
                nk3Var2.presentFragment(new cm6(bundle, null));
                break;
            default:
                Bundle bundle2 = new Bundle();
                nk3 nk3Var3 = aj3Var.P0;
                i2 = ((d) nk3Var3).currentAccount;
                bundle2.putLong("dialog_id", z8c.h(i2).e());
                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                nk3Var3.presentFragment(new cm6(bundle2, null));
                break;
        }
    }
}

package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Wallet.m4;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ u0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                x0 x0Var = this.b;
                ArrayList arrayList = x0Var.g0;
                m4 m4Var = x0Var.v0;
                x0Var.n0 = str;
                int i10 = x0Var.r0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(m4Var);
                    AndroidUtilities.runOnUIThread(m4Var, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(m4Var);
                        AndroidUtilities.runOnUIThread(m4Var, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(m4Var);
                        arrayList.clear();
                        arrayList.addAll(q.e(x0Var.q0.id));
                        x0Var.a0(false, true);
                        x0Var.X(true);
                        break;
                    }
                } else if (i10 == 3) {
                    x0Var.a0(false, true);
                    x0Var.X(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                x0 x0Var2 = this.b;
                ArrayList arrayList2 = x0Var2.g0;
                if (!TextUtils.isEmpty(x0Var2.n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    x0Var2.b0(true, true);
                    x0Var2.X(true);
                    break;
                }
                break;
        }
    }
}

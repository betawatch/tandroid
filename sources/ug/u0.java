package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                p4.s0 s0Var = x0Var.v0;
                x0Var.n0 = str;
                int i10 = x0Var.r0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(s0Var);
                    AndroidUtilities.runOnUIThread(s0Var, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(s0Var);
                        AndroidUtilities.runOnUIThread(s0Var, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(s0Var);
                        arrayList.clear();
                        arrayList.addAll(q.e(x0Var.q0.id));
                        x0Var.b0(false, true);
                        x0Var.Y(true);
                        break;
                    }
                } else if (i10 == 3) {
                    x0Var.b0(false, true);
                    x0Var.Y(true);
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
                    x0Var2.c0(true, true);
                    x0Var2.Y(true);
                    break;
                }
                break;
        }
    }
}

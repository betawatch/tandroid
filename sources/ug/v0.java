package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ v0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                y0 y0Var = this.b;
                ArrayList arrayList = y0Var.g0;
                p4.s0 s0Var = y0Var.v0;
                y0Var.n0 = str;
                int i10 = y0Var.r0;
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
                        arrayList.addAll(r.e(y0Var.q0.id));
                        y0Var.b0(false, true);
                        y0Var.Y(true);
                        break;
                    }
                } else if (i10 == 3) {
                    y0Var.b0(false, true);
                    y0Var.Y(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                y0 y0Var2 = this.b;
                ArrayList arrayList2 = y0Var2.g0;
                if (!TextUtils.isEmpty(y0Var2.n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    y0Var2.c0(true, true);
                    y0Var2.Y(true);
                    break;
                }
                break;
        }
    }
}

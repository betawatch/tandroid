package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ x0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                a1 a1Var = this.b;
                ArrayList arrayList = a1Var.g0;
                rg.b0 b0Var = a1Var.v0;
                a1Var.n0 = str;
                int i10 = a1Var.r0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(b0Var);
                    AndroidUtilities.runOnUIThread(b0Var, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(b0Var);
                        AndroidUtilities.runOnUIThread(b0Var, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(b0Var);
                        arrayList.clear();
                        arrayList.addAll(t.e(a1Var.q0.id));
                        a1Var.a0(false, true);
                        a1Var.X(true);
                        break;
                    }
                } else if (i10 == 3) {
                    a1Var.a0(false, true);
                    a1Var.X(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                a1 a1Var2 = this.b;
                ArrayList arrayList2 = a1Var2.g0;
                if (!TextUtils.isEmpty(a1Var2.n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    a1Var2.b0(true, true);
                    a1Var2.X(true);
                    break;
                }
                break;
        }
    }
}

package sg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ y0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                c1 c1Var = this.b;
                ArrayList arrayList = c1Var.g0;
                a1 a1Var = c1Var.v0;
                c1Var.n0 = str;
                int i10 = c1Var.r0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(a1Var);
                        AndroidUtilities.runOnUIThread(a1Var, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(a1Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(c1Var.q0.id));
                        c1Var.a0(false, true);
                        c1Var.X(true);
                        break;
                    }
                } else if (i10 == 3) {
                    c1Var.a0(false, true);
                    c1Var.X(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                c1 c1Var2 = this.b;
                ArrayList arrayList2 = c1Var2.g0;
                if (!TextUtils.isEmpty(c1Var2.n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    c1Var2.b0(true, true);
                    c1Var2.X(true);
                    break;
                }
                break;
        }
    }
}

package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ w0(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.b;
                ArrayList arrayList = z0Var.g0;
                p8.b bVar = z0Var.v0;
                z0Var.n0 = str;
                int i10 = z0Var.r0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.q0.id));
                        z0Var.a0(false, true);
                        z0Var.X(true);
                        break;
                    }
                } else if (i10 == 3) {
                    z0Var.a0(false, true);
                    z0Var.X(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                z0 z0Var2 = this.b;
                ArrayList arrayList2 = z0Var2.g0;
                if (!TextUtils.isEmpty(z0Var2.n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    z0Var2.b0(true, true);
                    z0Var2.X(true);
                    break;
                }
                break;
        }
    }
}

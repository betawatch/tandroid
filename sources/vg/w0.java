package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dy0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
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
                dy0 dy0Var = z0Var.v0;
                z0Var.n0 = str;
                int i10 = z0Var.r0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(dy0Var);
                    AndroidUtilities.runOnUIThread(dy0Var, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(dy0Var);
                        AndroidUtilities.runOnUIThread(dy0Var, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(dy0Var);
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

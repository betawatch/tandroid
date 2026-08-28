package pf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c0 extends vk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ e0 f;

    public c0(e0 e0Var, Context context) {
        this.f = e0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        return i9 == h() - 1 ? 2 : 0;
    }

    @Override // f2.r0
    public final void l() {
        super.l();
        this.f.K();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        Object obj;
        if (q1Var.f != 0) {
            return;
        }
        m1 m1Var = (m1) q1Var.a;
        boolean z10 = i9 != h() + (-2);
        int i10 = i9 - 1;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                obj = arrayList.get(i10);
                if (obj instanceof q1) {
                    return;
                }
                q1 q1Var2 = (q1) obj;
                m1Var.a(q1Var2, this.e, z10);
                m1Var.d.a(this.f.w.contains(Integer.valueOf(q1Var2.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof q1) {
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m1Var;
        Context context = this.c;
        if (i9 == 0) {
            m1Var = new m1(context, this.f.a, false);
        } else if (i9 != 1) {
            m1Var = new View(context);
            m1Var.setTag(-33024);
        } else {
            m1Var = new View(context);
            m1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
            m1Var.setTag(-33024);
        }
        return new ik0(m1Var);
    }
}

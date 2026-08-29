package sf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b0 extends il0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ d0 f;

    public b0(d0 d0Var, Context context) {
        this.f = d0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 0;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        this.f.K();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        Object obj;
        if (n1Var.f != 0) {
            return;
        }
        m1 m1Var = (m1) n1Var.a;
        boolean z10 = i10 != h() + (-2);
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                obj = arrayList.get(i11);
                if (obj instanceof r1) {
                    return;
                }
                r1 r1Var = (r1) obj;
                m1Var.a(r1Var, this.e, z10);
                m1Var.d.a(this.f.w.contains(Integer.valueOf(r1Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof r1) {
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View m1Var;
        Context context = this.c;
        if (i10 == 0) {
            m1Var = new m1(context, this.f.a, false);
        } else if (i10 != 1) {
            m1Var = new View(context);
            m1Var.setTag(-33024);
        } else {
            m1Var = new View(context);
            m1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
            m1Var.setTag(-33024);
        }
        return new vk0(m1Var);
    }
}

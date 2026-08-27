package qf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c0 extends yk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ e0 f;

    public c0(e0 e0Var, Context context) {
        this.f = e0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 0;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // f2.q0
    public final void l() {
        super.l();
        this.f.L();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        Object obj;
        if (o1Var.f != 0) {
            return;
        }
        m1 m1Var = (m1) o1Var.a;
        boolean z10 = i10 != h() + (-2);
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                obj = arrayList.get(i11);
                if (obj instanceof p1) {
                    return;
                }
                p1 p1Var = (p1) obj;
                m1Var.a(p1Var, this.e, z10);
                m1Var.d.a(this.f.w.contains(Integer.valueOf(p1Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof p1) {
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View m1Var;
        Context context = this.c;
        if (i10 == 0) {
            m1Var = new m1(context, this.f.a, false);
        } else if (i10 != 1) {
            m1Var = new View(context);
            m1Var.setTag(-33024);
        } else {
            m1Var = new View(context);
            m1Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            m1Var.setTag(-33024);
        }
        return new lk0(m1Var);
    }
}

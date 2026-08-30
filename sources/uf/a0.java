package uf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a0 extends rl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ c0 f;

    public a0(c0 c0Var, Context context) {
        this.f = c0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 0;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // f2.o0
    public final void l() {
        super.l();
        this.f.K();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        Object obj;
        if (l1Var.f != 0) {
            return;
        }
        l1 l1Var2 = (l1) l1Var.a;
        boolean z4 = i10 != h() + (-2);
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                obj = arrayList.get(i11);
                if (obj instanceof o1) {
                    return;
                }
                o1 o1Var = (o1) obj;
                l1Var2.a(o1Var, this.e, z4);
                l1Var2.d.a(this.f.w.contains(Integer.valueOf(o1Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof o1) {
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View l1Var;
        Context context = this.c;
        if (i10 == 0) {
            l1Var = new l1(context, this.f.a, false);
        } else if (i10 != 1) {
            l1Var = new View(context);
            l1Var.setTag(-33024);
        } else {
            l1Var = new View(context);
            l1Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
            l1Var.setTag(-33024);
        }
        return new el0(l1Var);
    }
}

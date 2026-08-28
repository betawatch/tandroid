package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v8 extends f2.d1 {
    public boolean a;
    public final /* synthetic */ i9 b;

    public v8(i9 i9Var) {
        this.b = i9Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        i9 i9Var = this.b;
        ArrayList arrayList = i9Var.C;
        int L0 = i9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(i9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = i9Var.d.U2.x.size();
            if (!i9Var.F && !i9Var.D && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(17, this, (e9) j3.r0.j(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i10 != 0 && this.a) {
            i9Var.f.e(i10 < 0, true);
        }
        this.a = true;
        i9Var.r.b(L0 != 0 || top < i9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (eVar = i9Var.U) == null) {
            return;
        }
        eVar.f(i9, i10);
        i9Var.e0();
    }
}

package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w8 extends f2.b1 {
    public boolean a;
    public final /* synthetic */ j9 b;

    public w8(j9 j9Var) {
        this.b = j9Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        j9 j9Var = this.b;
        ArrayList arrayList = j9Var.C;
        int L0 = j9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(j9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = j9Var.d.U2.x.size();
            if (!j9Var.F && !j9Var.D && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(17, this, (f9) i0.a.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.a) {
            j9Var.f.e(i11 < 0, true);
        }
        this.a = true;
        j9Var.r.b(L0 != 0 || top < j9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (eVar = j9Var.U) == null) {
            return;
        }
        eVar.f(i10, i11);
        j9Var.f0();
    }
}

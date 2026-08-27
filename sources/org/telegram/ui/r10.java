package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r10 extends f2.c0 {
    public final /* synthetic */ FiltersSetupActivity d;

    public r10(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override // f2.c0
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        View view = o1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        return o1Var.f != 2 ? f2.c0.l(0, 0) : f2.c0.l(3, 0);
    }

    @Override // f2.c0
    public final boolean k() {
        return true;
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (o1Var.f != o1Var2.f) {
            return false;
        }
        o10 o10Var = this.d.b;
        int b10 = o1Var.b();
        int b11 = o1Var2.b();
        FiltersSetupActivity filtersSetupActivity = o10Var.e;
        int i10 = filtersSetupActivity.r;
        ArrayList arrayList = filtersSetupActivity.n;
        if (b10 >= i10 && b11 >= i10) {
            m10 m10Var = (m10) arrayList.get(b10);
            m10 m10Var2 = (m10) arrayList.get(b11);
            if (m10Var != null && m10Var2 != null && (dialogFilter = m10Var.d) != null && (dialogFilter2 = m10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.r, m10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.r, m10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        if (i10 != 0) {
            this.d.a.I0(false);
            o1Var.a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new r00(this, 4));
            AndroidUtilities.runOnUIThread(new r00(this, 4), 320L);
        }
        if (o1Var != null) {
            o1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
    }
}

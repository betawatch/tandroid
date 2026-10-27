package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u10 extends s4.w {
    public final r00 d = new r00(this, 4);
    public final /* synthetic */ FiltersSetupActivity e;

    public u10(FiltersSetupActivity filtersSetupActivity) {
        this.e = filtersSetupActivity;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        View view = e1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
        if (view instanceof n10) {
            ((n10) view).setDragging(false);
        }
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        return e1Var.f != 2 ? s4.w.l(0, 0) : s4.w.l(3, 0);
    }

    @Override // s4.w
    public final boolean k() {
        return true;
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (e1Var.f != e1Var2.f) {
            return false;
        }
        r10 r10Var = this.e.b;
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        FiltersSetupActivity filtersSetupActivity = r10Var.e;
        int i10 = filtersSetupActivity.r;
        ArrayList arrayList = filtersSetupActivity.n;
        if (b10 >= i10 && b11 >= i10) {
            p10 p10Var = (p10) arrayList.get(b10);
            p10 p10Var2 = (p10) arrayList.get(b11);
            if (p10Var != null && p10Var2 != null && (dialogFilter = p10Var.d) != null && (dialogFilter2 = p10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.r, p10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.r, p10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.c0(true);
            }
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        if (i10 != 0) {
            this.e.a.I0(false);
            e1Var.a.setPressed(true);
        } else {
            r00 r00Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(r00Var);
            AndroidUtilities.runOnUIThread(r00Var, 320L);
        }
        if (e1Var != null) {
            View view = e1Var.a;
            view.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
            if (view instanceof n10) {
                ((n10) view).setDragging(i10 == 2);
            }
        }
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
    }
}

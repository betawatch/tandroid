package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class s10 extends s4.v {
    public final fz d = new fz(this, 5);
    public final /* synthetic */ FiltersSetupActivity e;

    public s10(FiltersSetupActivity filtersSetupActivity) {
        this.e = filtersSetupActivity;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
        if (view instanceof l10) {
            ((l10) view).setDragging(false);
        }
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        return b1Var.f != 2 ? s4.v.l(0, 0) : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean k() {
        return true;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (b1Var.f != b1Var2.f) {
            return false;
        }
        p10 p10Var = this.e.b;
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        FiltersSetupActivity filtersSetupActivity = p10Var.e;
        int i10 = filtersSetupActivity.r;
        ArrayList arrayList = filtersSetupActivity.n;
        if (b10 >= i10 && b11 >= i10) {
            n10 n10Var = (n10) arrayList.get(b10);
            n10 n10Var2 = (n10) arrayList.get(b11);
            if (n10Var != null && n10Var2 != null && (dialogFilter = n10Var.d) != null && (dialogFilter2 = n10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.r, n10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.r, n10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.b0(true);
            }
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        if (i10 != 0) {
            this.e.a.I0(false);
            b1Var.a.setPressed(true);
        } else {
            fz fzVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(fzVar);
            AndroidUtilities.runOnUIThread(fzVar, 320L);
        }
        if (b1Var != null) {
            View view = b1Var.a;
            view.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
            if (view instanceof l10) {
                ((l10) view).setDragging(i10 == 2);
            }
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}

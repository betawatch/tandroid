package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s10 extends s4.w {
    public final p00 d = new p00(this, 4);
    public final /* synthetic */ FiltersSetupActivity e;

    public s10(FiltersSetupActivity filtersSetupActivity) {
        this.e = filtersSetupActivity;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        View view = e1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
        if (view instanceof l10) {
            ((l10) view).setDragging(false);
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
        p10 p10Var = this.e.b;
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
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
            p00 p00Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(p00Var);
            AndroidUtilities.runOnUIThread(p00Var, 320L);
        }
        if (e1Var != null) {
            View view = e1Var.a;
            view.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
            if (view instanceof l10) {
                ((l10) view).setDragging(i10 == 2);
            }
        }
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
    }
}

package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y00 extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ f10 c;

    public y00(f10 f10Var) {
        this.c = f10Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        f10 f10Var = this.c;
        if (f10Var.f.isEmpty()) {
            return 0;
        }
        return f10Var.f.size() + (!f10Var.J ? 1 : 0);
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 >= this.c.f.size() ? 3 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) q1Var.a;
            f10 f10Var = this.c;
            MessageObject messageObject = (MessageObject) f10Var.f.get(i9);
            r2Var.K = f10Var.l0;
            r2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            r2Var.o2 = i9 != h() - 1;
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.dk(this, r2Var, messageObject, r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        of.x xVar;
        if (i9 == 0) {
            xVar = new of.x(2, viewGroup.getContext(), true);
        } else if (i9 != 3) {
            org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
            v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            xVar = v3Var;
        } else {
            org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(viewGroup.getContext(), null);
            e00Var.setIsSingleCell(true);
            e00Var.setViewType(1);
            xVar = e00Var;
        }
        return j3.r0.s(xVar, xVar, -1, -2);
    }
}

package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class z00 extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ g10 c;

    public z00(g10 g10Var) {
        this.c = g10Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        g10 g10Var = this.c;
        if (g10Var.f.isEmpty()) {
            return 0;
        }
        return g10Var.f.size() + (!g10Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) b1Var.a;
            g10 g10Var = this.c;
            MessageObject messageObject = (MessageObject) g10Var.f.get(i10);
            r2Var.O = g10Var.p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            r2Var.s2 = i10 != h() - 1;
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, r2Var, messageObject, r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar;
        if (i10 == 0) {
            zVar = new hg.z(2, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
            u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            zVar = u3Var;
        } else {
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
            b10Var.setIsSingleCell(true);
            b10Var.setViewType(1);
            zVar = b10Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(zVar, zVar, -1, -2);
    }
}

package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class u10 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ b20 c;

    public u10(b20 b20Var) {
        this.c = b20Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        b20 b20Var = this.c;
        if (b20Var.f.isEmpty()) {
            return 0;
        }
        return b20Var.f.size() + (!b20Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) b1Var.a;
            b20 b20Var = this.c;
            MessageObject messageObject = (MessageObject) b20Var.f.get(i10);
            s2Var.O = b20Var.p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            s2Var.s2 = i10 != h() - 1;
            s2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, s2Var, messageObject, s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar;
        if (i10 == 0) {
            zVar = new hg.z(2, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
            v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            zVar = v3Var;
        } else {
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(viewGroup.getContext(), null);
            f10Var.setIsSingleCell(true);
            f10Var.setViewType(1);
            zVar = f10Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(zVar, zVar, -1, -2);
    }
}

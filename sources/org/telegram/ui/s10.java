package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s10 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ z10 c;

    public s10(z10 z10Var) {
        this.c = z10Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        z10 z10Var = this.c;
        if (z10Var.f.isEmpty()) {
            return 0;
        }
        return z10Var.f.size() + (!z10Var.N ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.a;
            z10 z10Var = this.c;
            MessageObject messageObject = (MessageObject) z10Var.f.get(i10);
            r2Var.O = z10Var.p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            r2Var.s2 = i10 != h() - 1;
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.rk(this, r2Var, messageObject, r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        fg.z zVar;
        if (i10 == 0) {
            zVar = new fg.z(2, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
            u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            zVar = u3Var;
        } else {
            org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(viewGroup.getContext(), null);
            a10Var.setIsSingleCell(true);
            a10Var.setViewType(1);
            zVar = a10Var;
        }
        return com.google.android.gms.internal.vision.e2.j(zVar, zVar, -1, -2);
    }
}

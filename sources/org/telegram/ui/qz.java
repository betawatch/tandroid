package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qz extends v4.s0 {
    public final /* synthetic */ b00 a;

    public qz(b00 b00Var) {
        this.a = b00Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.a.K.getCurrentFocus());
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        b00 b00Var = this.a;
        tz tzVar = b00Var.m0;
        v4.b0 b0Var = b00Var.j0;
        te.a aVar = b00Var.a;
        kz kzVar = b00Var.n0;
        if (recyclerView.getAdapter() == null || b00Var.d == null) {
            return;
        }
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int b10 = recyclerView.getAdapter().b();
        if (!b00Var.M && abs > 0 && N0 >= b10 - 10 && !b00Var.N) {
            org.telegram.messenger.g0.h3(new kz(this, 1));
        }
        if (b00Var.d != b00Var.U) {
            View pinnedHeader = b00Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) pinnedHeader;
                CharSequence text = x3Var.getText();
                if (!TextUtils.isEmpty(text) && x3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(tzVar.c, charSequence)) {
                        tzVar.c = charSequence;
                        tzVar.a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(kzVar);
                        org.telegram.messenger.g0.i3(kzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(kzVar);
            aVar.a(false, true);
            return;
        }
        if (i10 != 0 && !b00Var.f.isEmpty() && TextUtils.isEmpty(b00Var.Q)) {
            org.telegram.messenger.g0.r(kzVar);
            org.telegram.messenger.g0.i3(kzVar, 1650L);
            aVar.a(true, true);
        }
        v4.d1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            org.telegram.messenger.ij ijVar = p7Var.e <= 0 ? null : p7Var.b[0];
            if (ijVar != null) {
                int i11 = ijVar.k.date;
                tzVar.getClass();
                String u10 = org.telegram.messenger.id.u(i11, false);
                if (TextUtils.equals(tzVar.c, u10)) {
                    return;
                }
                tzVar.c = u10;
                tzVar.a.t(u10, true, true);
            }
        }
    }
}

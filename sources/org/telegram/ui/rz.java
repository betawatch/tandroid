package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class rz extends v4.u0 {
    public final /* synthetic */ c00 a;

    public rz(c00 c00Var) {
        this.a = c00Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            org.telegram.messenger.g0.v1(this.a.L.getCurrentFocus());
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        c00 c00Var = this.a;
        uz uzVar = c00Var.n0;
        v4.c0 c0Var = c00Var.k0;
        te.a aVar = c00Var.a;
        lz lzVar = c00Var.o0;
        if (recyclerView.getAdapter() == null || c00Var.d == null) {
            return;
        }
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int b10 = recyclerView.getAdapter().b();
        if (!c00Var.N && abs > 0 && N0 >= b10 - 10 && !c00Var.O) {
            org.telegram.messenger.g0.g3(new lz(this, 1));
        }
        if (c00Var.d != c00Var.V) {
            View pinnedHeader = c00Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.y3) {
                org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) pinnedHeader;
                CharSequence text = y3Var.getText();
                if (!TextUtils.isEmpty(text) && y3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(uzVar.c, charSequence)) {
                        uzVar.c = charSequence;
                        uzVar.a.t(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        org.telegram.messenger.g0.r(lzVar);
                        org.telegram.messenger.g0.h3(lzVar, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            org.telegram.messenger.g0.r(lzVar);
            aVar.a(false, true);
            return;
        }
        if (i10 != 0 && !c00Var.f.isEmpty() && TextUtils.isEmpty(c00Var.R)) {
            org.telegram.messenger.g0.r(lzVar);
            org.telegram.messenger.g0.h3(lzVar, 1650L);
            aVar.a(true, true);
        }
        v4.f1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.q7) {
            org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
            org.telegram.messenger.fj fjVar = q7Var.e <= 0 ? null : q7Var.b[0];
            if (fjVar != null) {
                int i11 = fjVar.k.date;
                uzVar.getClass();
                String u10 = org.telegram.messenger.gd.u(i11, false);
                if (TextUtils.equals(uzVar.c, u10)) {
                    return;
                }
                uzVar.c = u10;
                uzVar.a.t(u10, true, true);
            }
        }
    }
}

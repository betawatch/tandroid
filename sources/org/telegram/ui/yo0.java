package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class yo0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep0 b;

    public yo0(ep0 ep0Var, int i10) {
        this.b = ep0Var;
        this.a = i10;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ep0 ep0Var = this.b;
        kp0 kp0Var = ep0Var.p0;
        if (i11 != 0) {
            kp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = kp0Var.f0) != null) {
            fVar.f(i10, i11);
        }
        ep0Var.h();
        if (ep0Var.K != null) {
            if (ep0Var.J == null || !ep0Var.c()) {
                return;
            }
            ep0Var.J.g(false);
            return;
        }
        ai.y9 y9Var = this.a == 1 ? kp0Var.c : kp0Var.b;
        if (y9Var == null || !ep0Var.c()) {
            return;
        }
        y9Var.a();
    }
}

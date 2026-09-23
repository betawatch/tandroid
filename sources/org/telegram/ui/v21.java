package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class v21 implements org.telegram.ui.ActionBar.i6 {
    public boolean a = false;
    public final /* synthetic */ w21 b;

    public v21(w21 w21Var) {
        this.b = w21Var;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void a(float f7) {
        ArrayList arrayList;
        w21 w21Var = this.b;
        if (f7 == 0.0f && !this.a) {
            org.telegram.ui.Components.lp lpVar = w21Var.b;
            if (lpVar != null && (arrayList = lpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.mp) obj).c = w21Var.M ? 1 : 0;
                }
            }
            if (!w21Var.Q) {
                org.telegram.ui.Components.lp lpVar2 = w21Var.b;
                for (int i11 = 0; i11 < lpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.mp) lpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        w21Var.E.setColorFilter(new PorterDuffColorFilter(w21Var.d.getThemedColor(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN));
        if (w21Var.Q) {
            org.telegram.ui.Components.lp lpVar3 = w21Var.b;
            for (int i12 = 0; i12 < lpVar3.h(); i12++) {
                ((org.telegram.ui.Components.mp) lpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            w21Var.Q = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void b() {
    }
}

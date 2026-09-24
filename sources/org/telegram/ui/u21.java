package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class u21 implements org.telegram.ui.ActionBar.i6 {
    public boolean a = false;
    public final /* synthetic */ v21 b;

    public u21(v21 v21Var) {
        this.b = v21Var;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void a(float f7) {
        ArrayList arrayList;
        v21 v21Var = this.b;
        if (f7 == 0.0f && !this.a) {
            org.telegram.ui.Components.lp lpVar = v21Var.b;
            if (lpVar != null && (arrayList = lpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.mp) obj).c = v21Var.M ? 1 : 0;
                }
            }
            if (!v21Var.Q) {
                org.telegram.ui.Components.lp lpVar2 = v21Var.b;
                for (int i11 = 0; i11 < lpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.mp) lpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        v21Var.E.setColorFilter(new PorterDuffColorFilter(v21Var.d.getThemedColor(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN));
        if (v21Var.Q) {
            org.telegram.ui.Components.lp lpVar3 = v21Var.b;
            for (int i12 = 0; i12 < lpVar3.h(); i12++) {
                ((org.telegram.ui.Components.mp) lpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            v21Var.Q = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void b() {
    }
}

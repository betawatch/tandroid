package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y11 implements org.telegram.ui.ActionBar.h6 {
    public boolean a = false;
    public final /* synthetic */ z11 b;

    public y11(z11 z11Var) {
        this.b = z11Var;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void a(float f9) {
        ArrayList arrayList;
        z11 z11Var = this.b;
        if (f9 == 0.0f && !this.a) {
            org.telegram.ui.Components.ep epVar = z11Var.b;
            if (epVar != null && (arrayList = epVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.fp) obj).c = z11Var.I ? 1 : 0;
                }
            }
            if (!z11Var.M) {
                org.telegram.ui.Components.ep epVar2 = z11Var.b;
                for (int i11 = 0; i11 < epVar2.h(); i11++) {
                    ((org.telegram.ui.Components.fp) epVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        z11Var.A.setColorFilter(new PorterDuffColorFilter(z11Var.d.getThemedColor(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN));
        if (z11Var.M) {
            org.telegram.ui.Components.ep epVar3 = z11Var.b;
            for (int i12 = 0; i12 < epVar3.h(); i12++) {
                ((org.telegram.ui.Components.fp) epVar3.d.get(i12)).getClass();
            }
        }
        if (f9 == 1.0f && this.a) {
            z11Var.M = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
    }
}

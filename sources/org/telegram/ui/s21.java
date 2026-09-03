package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s21 implements org.telegram.ui.ActionBar.l6 {
    public boolean a = false;
    public final /* synthetic */ t21 b;

    public s21(t21 t21Var) {
        this.b = t21Var;
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final void a(float f10) {
        ArrayList arrayList;
        t21 t21Var = this.b;
        if (f10 == 0.0f && !this.a) {
            org.telegram.ui.Components.kp kpVar = t21Var.b;
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.lp) obj).c = t21Var.J ? 1 : 0;
                }
            }
            if (!t21Var.N) {
                org.telegram.ui.Components.kp kpVar2 = t21Var.b;
                for (int i11 = 0; i11 < kpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.lp) kpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        t21Var.B.setColorFilter(new PorterDuffColorFilter(t21Var.d.getThemedColor(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN));
        if (t21Var.N) {
            org.telegram.ui.Components.kp kpVar3 = t21Var.b;
            for (int i12 = 0; i12 < kpVar3.h(); i12++) {
                ((org.telegram.ui.Components.lp) kpVar3.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            t21Var.N = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final void b() {
    }
}

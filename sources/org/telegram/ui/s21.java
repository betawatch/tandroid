package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s21 implements org.telegram.ui.ActionBar.k6 {
    public boolean a = false;
    public final /* synthetic */ t21 b;

    public s21(t21 t21Var) {
        this.b = t21Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void a(float f10) {
        ArrayList arrayList;
        t21 t21Var = this.b;
        if (f10 == 0.0f && !this.a) {
            org.telegram.ui.Components.hp hpVar = t21Var.b;
            if (hpVar != null && (arrayList = hpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.ip) obj).c = t21Var.J ? 1 : 0;
                }
            }
            if (!t21Var.N) {
                org.telegram.ui.Components.hp hpVar2 = t21Var.b;
                for (int i11 = 0; i11 < hpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.ip) hpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        t21Var.B.setColorFilter(new PorterDuffColorFilter(t21Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (t21Var.N) {
            org.telegram.ui.Components.hp hpVar3 = t21Var.b;
            for (int i12 = 0; i12 < hpVar3.h(); i12++) {
                ((org.telegram.ui.Components.ip) hpVar3.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            t21Var.N = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
    }
}

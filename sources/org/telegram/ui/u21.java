package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
            org.telegram.ui.Components.mp mpVar = v21Var.b;
            if (mpVar != null && (arrayList = mpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.np) obj).c = v21Var.M ? 1 : 0;
                }
            }
            if (!v21Var.Q) {
                org.telegram.ui.Components.mp mpVar2 = v21Var.b;
                for (int i11 = 0; i11 < mpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.np) mpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        v21Var.E.setColorFilter(new PorterDuffColorFilter(v21Var.d.getThemedColor(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN));
        if (v21Var.Q) {
            org.telegram.ui.Components.mp mpVar3 = v21Var.b;
            for (int i12 = 0; i12 < mpVar3.h(); i12++) {
                ((org.telegram.ui.Components.np) mpVar3.d.get(i12)).getClass();
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

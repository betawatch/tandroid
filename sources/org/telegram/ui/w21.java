package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class w21 implements org.telegram.ui.ActionBar.j6 {
    public boolean a = false;
    public final /* synthetic */ x21 b;

    public w21(x21 x21Var) {
        this.b = x21Var;
    }

    @Override // org.telegram.ui.ActionBar.j6
    public final void a(float f7) {
        ArrayList arrayList;
        x21 x21Var = this.b;
        if (f7 == 0.0f && !this.a) {
            org.telegram.ui.Components.np npVar = x21Var.b;
            if (npVar != null && (arrayList = npVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.op) obj).c = x21Var.M ? 1 : 0;
                }
            }
            if (!x21Var.Q) {
                org.telegram.ui.Components.np npVar2 = x21Var.b;
                for (int i11 = 0; i11 < npVar2.h(); i11++) {
                    ((org.telegram.ui.Components.op) npVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        x21Var.E.setColorFilter(new PorterDuffColorFilter(x21Var.d.getThemedColor(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN));
        if (x21Var.Q) {
            org.telegram.ui.Components.np npVar3 = x21Var.b;
            for (int i12 = 0; i12 < npVar3.h(); i12++) {
                ((org.telegram.ui.Components.op) npVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            x21Var.Q = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.j6
    public final void b() {
    }
}

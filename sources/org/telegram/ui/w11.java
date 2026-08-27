package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w11 implements org.telegram.ui.ActionBar.h6 {
    public boolean a = false;
    public final /* synthetic */ x11 b;

    public w11(x11 x11Var) {
        this.b = x11Var;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void a(float f10) {
        ArrayList arrayList;
        x11 x11Var = this.b;
        if (f10 == 0.0f && !this.a) {
            org.telegram.ui.Components.yo yoVar = x11Var.b;
            if (yoVar != null && (arrayList = yoVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.zo) obj).c = x11Var.I ? 1 : 0;
                }
            }
            if (!x11Var.M) {
                org.telegram.ui.Components.yo yoVar2 = x11Var.b;
                for (int i11 = 0; i11 < yoVar2.h(); i11++) {
                    ((org.telegram.ui.Components.zo) yoVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        x11Var.A.setColorFilter(new PorterDuffColorFilter(x11Var.d.getThemedColor(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN));
        if (x11Var.M) {
            org.telegram.ui.Components.yo yoVar3 = x11Var.b;
            for (int i12 = 0; i12 < yoVar3.h(); i12++) {
                ((org.telegram.ui.Components.zo) yoVar3.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            x11Var.M = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
    }
}

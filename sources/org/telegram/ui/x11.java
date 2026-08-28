package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x11 implements org.telegram.ui.ActionBar.g6 {
    public boolean a = false;
    public final /* synthetic */ y11 b;

    public x11(y11 y11Var) {
        this.b = y11Var;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void a(float f10) {
        ArrayList arrayList;
        y11 y11Var = this.b;
        if (f10 == 0.0f && !this.a) {
            org.telegram.ui.Components.ap apVar = y11Var.b;
            if (apVar != null && (arrayList = apVar.d) != null) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((org.telegram.ui.Components.bp) obj).c = y11Var.I ? 1 : 0;
                }
            }
            if (!y11Var.M) {
                org.telegram.ui.Components.ap apVar2 = y11Var.b;
                for (int i10 = 0; i10 < apVar2.h(); i10++) {
                    ((org.telegram.ui.Components.bp) apVar2.d.get(i10)).getClass();
                }
            }
            this.a = true;
        }
        y11Var.A.setColorFilter(new PorterDuffColorFilter(y11Var.d.getThemedColor(org.telegram.ui.ActionBar.f6.Oh), PorterDuff.Mode.SRC_IN));
        if (y11Var.M) {
            org.telegram.ui.Components.ap apVar3 = y11Var.b;
            for (int i11 = 0; i11 < apVar3.h(); i11++) {
                ((org.telegram.ui.Components.bp) apVar3.d.get(i11)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            y11Var.M = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void b() {
    }
}

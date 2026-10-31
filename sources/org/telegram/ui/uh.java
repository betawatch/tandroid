package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh implements org.telegram.messenger.i20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uh(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.i20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return un.s0((un) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.p51 p51Var = (org.telegram.ui.Components.p51) this.b;
                Object obj = ((org.telegram.ui.Components.a51) this.c).G;
                org.telegram.ui.Components.tk0 tk0Var = p51Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < p51Var.D.size()) {
                        org.telegram.ui.Components.a51 G = p51Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < tk0Var.getChildCount(); i11++) {
                        childAt = tk0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof s61) {
                                return null;
                            }
                            return (s61) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof s61) {
                }
                break;
            default:
                u61 u61Var = (u61) this.b;
                g61 g61Var = (g61) this.c;
                int childCount = u61Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = u61Var.S.getChildAt(i12);
                    if (childAt2 instanceof f61) {
                        f61 f61Var = (f61) childAt2;
                        if (f61Var.r == g61Var) {
                            return f61Var;
                        }
                    }
                }
                u61Var.S.setItemAnimator(null);
                u61Var.B0.f();
                return null;
        }
    }
}

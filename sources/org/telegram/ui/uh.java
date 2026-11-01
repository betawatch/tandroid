package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh implements org.telegram.messenger.j20 {
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
    @Override // org.telegram.messenger.j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return un.r0((un) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) this.b;
                Object obj = ((org.telegram.ui.Components.b51) this.c).G;
                org.telegram.ui.Components.uk0 uk0Var = q51Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < q51Var.D.size()) {
                        org.telegram.ui.Components.b51 G = q51Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < uk0Var.getChildCount(); i11++) {
                        childAt = uk0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof q61) {
                                return null;
                            }
                            return (q61) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof q61) {
                }
                break;
            default:
                s61 s61Var = (s61) this.b;
                e61 e61Var = (e61) this.c;
                int childCount = s61Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = s61Var.S.getChildAt(i12);
                    if (childAt2 instanceof d61) {
                        d61 d61Var = (d61) childAt2;
                        if (d61Var.r == e61Var) {
                            return d61Var;
                        }
                    }
                }
                s61Var.S.setItemAnimator(null);
                s61Var.B0.f();
                return null;
        }
    }
}

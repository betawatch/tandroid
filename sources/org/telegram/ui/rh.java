package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rh(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback0Return
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return wn.n0((wn) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.k71 k71Var = (org.telegram.ui.Components.k71) this.b;
                Object obj = ((org.telegram.ui.Components.u61) this.c).G;
                org.telegram.ui.Components.nm0 nm0Var = k71Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < k71Var.y.size()) {
                        org.telegram.ui.Components.u61 G = k71Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < nm0Var.getChildCount(); i11++) {
                        childAt = nm0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof w91) {
                                return null;
                            }
                            return (w91) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof w91) {
                }
                break;
            default:
                y91 y91Var = (y91) this.b;
                k91 k91Var = (k91) this.c;
                int childCount = y91Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = y91Var.S.getChildAt(i12);
                    if (childAt2 instanceof j91) {
                        j91 j91Var = (j91) childAt2;
                        if (j91Var.r == k91Var) {
                            return j91Var;
                        }
                    }
                }
                y91Var.S.setItemAnimator(null);
                y91Var.B0.f();
                return null;
        }
    }
}

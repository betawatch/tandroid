package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xh(int i10, Object obj, Object obj2) {
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
                return zn.p0((zn) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.c71 c71Var = (org.telegram.ui.Components.c71) this.b;
                Object obj = ((org.telegram.ui.Components.p61) this.c).G;
                org.telegram.ui.Components.qm0 qm0Var = c71Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < c71Var.x.size()) {
                        org.telegram.ui.Components.p61 G = c71Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < qm0Var.getChildCount(); i11++) {
                        childAt = qm0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof za1) {
                                return null;
                            }
                            return (za1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof za1) {
                }
                break;
            default:
                bb1 bb1Var = (bb1) this.b;
                na1 na1Var = (na1) this.c;
                int childCount = bb1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = bb1Var.S.getChildAt(i12);
                    if (childAt2 instanceof ma1) {
                        ma1 ma1Var = (ma1) childAt2;
                        if (ma1Var.r == na1Var) {
                            return ma1Var;
                        }
                    }
                }
                bb1Var.S.setItemAnimator(null);
                bb1Var.y0.f();
                return null;
        }
    }
}

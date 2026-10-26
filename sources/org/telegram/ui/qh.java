package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qh(int i10, Object obj, Object obj2) {
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
                return un.m0((un) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.j71 j71Var = (org.telegram.ui.Components.j71) this.b;
                Object obj = ((org.telegram.ui.Components.t61) this.c).G;
                org.telegram.ui.Components.mm0 mm0Var = j71Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < j71Var.y.size()) {
                        org.telegram.ui.Components.t61 G = j71Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                        childAt = mm0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof u91) {
                                return null;
                            }
                            return (u91) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof u91) {
                }
                break;
            default:
                w91 w91Var = (w91) this.b;
                i91 i91Var = (i91) this.c;
                int childCount = w91Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = w91Var.S.getChildAt(i12);
                    if (childAt2 instanceof h91) {
                        h91 h91Var = (h91) childAt2;
                        if (h91Var.r == i91Var) {
                            return h91Var;
                        }
                    }
                }
                w91Var.S.setItemAnimator(null);
                w91Var.B0.f();
                return null;
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                return sn.p0((sn) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.s61 s61Var = (org.telegram.ui.Components.s61) this.b;
                Object obj = ((org.telegram.ui.Components.f61) this.c).G;
                org.telegram.ui.Components.im0 im0Var = s61Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < s61Var.x.size()) {
                        org.telegram.ui.Components.f61 G = s61Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < im0Var.getChildCount(); i11++) {
                        childAt = im0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof p91) {
                                return null;
                            }
                            return (p91) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof p91) {
                }
                break;
            default:
                r91 r91Var = (r91) this.b;
                d91 d91Var = (d91) this.c;
                int childCount = r91Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = r91Var.S.getChildAt(i12);
                    if (childAt2 instanceof c91) {
                        c91 c91Var = (c91) childAt2;
                        if (c91Var.r == d91Var) {
                            return c91Var;
                        }
                    }
                }
                r91Var.S.setItemAnimator(null);
                r91Var.y0.f();
                return null;
        }
    }
}

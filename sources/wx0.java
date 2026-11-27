// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wx0 extends m74 {
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ yx0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx0(yx0 yx0Var, yx0 yx0Var2) {
        super(yx0Var2);
        this.q = yx0Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // m74
    public final int g(float f, float f2) {
        vx0 c;
        yx0 yx0Var = this.q;
        if (!yx0Var.b) {
            return -1;
        }
        ArrayList<xx0> tabs = yx0Var.getTabs();
        if (tabs.isEmpty() || (c = yx0Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c2 = c.c();
        RectF rectF = this.o;
        yx0Var.d(rectF, c2);
        Rect bounds = c.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()))) {
            return rectF.contains(f, f2) ? 1 : -1;
        }
        return 2;
    }

    @Override // m74
    public final void h(ArrayList arrayList) {
        yx0 yx0Var = this.q;
        if (yx0Var.b) {
            ArrayList<xx0> tabs = yx0Var.getTabs();
            if (tabs.isEmpty() || yx0Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // m74
    public final boolean k(int i, int i2) {
        if (i2 == 16) {
            yx0 yx0Var = this.q;
            ArrayList<xx0> tabs = yx0Var.getTabs();
            if (!tabs.isEmpty()) {
                xx0 xx0Var = tabs.get(0);
                if (i == 1) {
                    yx0Var.b();
                    return true;
                }
                if (i == 2) {
                    yx0Var.g(xx0Var, new bm0((byte) 2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m74
    public final void l(int i, v4 v4Var) {
        yx0 yx0Var = this.q;
        ArrayList<xx0> tabs = yx0Var.getTabs();
        xx0 xx0Var = tabs.isEmpty() ? null : tabs.get(0);
        vx0 c = xx0Var == null ? null : yx0Var.c(xx0Var);
        v4Var.i("android.widget.Button");
        v4Var.b(s4.e);
        Rect rect = this.p;
        if (c == null) {
            rect.set(0, 0, 1, 1);
            v4Var.h(rect);
            v4Var.j("");
            v4Var.p(false);
            return;
        }
        float c2 = c.c();
        RectF rectF = this.o;
        yx0Var.d(rectF, c2);
        String b = xx0Var.b() != null ? xx0Var.b() : "";
        if (i != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            v4Var.h(rect);
            v4Var.j(TextUtils.isEmpty(b) ? ob6.M0(2131747544, null) : c00.k(new StringBuilder(ob6.M0(2131747544, null)), ", ", b));
        } else {
            Rect bounds = c.l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            v4Var.h(rect);
            v4Var.j(TextUtils.isEmpty(b) ? ob6.M0(2131752006, null) : c00.k(new StringBuilder(ob6.M0(2131752006, null)), ", ", b));
        }
    }
}

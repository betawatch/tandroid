// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ox0 extends s64 {
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ qx0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox0(qx0 qx0Var, qx0 qx0Var2) {
        super(qx0Var2);
        this.q = qx0Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // s64
    public final int g(float f, float f2) {
        nx0 c;
        qx0 qx0Var = this.q;
        if (!qx0Var.b) {
            return -1;
        }
        ArrayList<px0> tabs = qx0Var.getTabs();
        if (tabs.isEmpty() || (c = qx0Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c2 = c.c();
        RectF rectF = this.o;
        qx0Var.d(rectF, c2);
        Rect bounds = c.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()))) {
            return rectF.contains(f, f2) ? 1 : -1;
        }
        return 2;
    }

    @Override // s64
    public final void h(ArrayList arrayList) {
        qx0 qx0Var = this.q;
        if (qx0Var.b) {
            ArrayList<px0> tabs = qx0Var.getTabs();
            if (tabs.isEmpty() || qx0Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // s64
    public final boolean k(int i, int i2) {
        if (i2 == 16) {
            qx0 qx0Var = this.q;
            ArrayList<px0> tabs = qx0Var.getTabs();
            if (!tabs.isEmpty()) {
                px0 px0Var = tabs.get(0);
                if (i == 1) {
                    qx0Var.b();
                    return true;
                }
                if (i == 2) {
                    qx0Var.g(px0Var, new bm0((byte) 2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // s64
    public final void l(int i, u4 u4Var) {
        qx0 qx0Var = this.q;
        ArrayList<px0> tabs = qx0Var.getTabs();
        px0 px0Var = tabs.isEmpty() ? null : tabs.get(0);
        nx0 c = px0Var == null ? null : qx0Var.c(px0Var);
        u4Var.i("android.widget.Button");
        u4Var.b(r4.c);
        Rect rect = this.p;
        if (c == null) {
            rect.set(0, 0, 1, 1);
            u4Var.h(rect);
            u4Var.j("");
            u4Var.p(false);
            return;
        }
        float c2 = c.c();
        RectF rectF = this.o;
        qx0Var.d(rectF, c2);
        String b = px0Var.b() != null ? px0Var.b() : "";
        if (i != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            u4Var.h(rect);
            u4Var.j(TextUtils.isEmpty(b) ? k96.M0(2131747624, null) : b00.j(new StringBuilder(k96.M0(2131747624, null)), ", ", b));
        } else {
            Rect bounds = c.l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            u4Var.h(rect);
            u4Var.j(TextUtils.isEmpty(b) ? k96.M0(2131752029, null) : b00.j(new StringBuilder(k96.M0(2131752029, null)), ", ", b));
        }
    }
}

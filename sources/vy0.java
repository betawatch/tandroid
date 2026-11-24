// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vy0 extends b84 {
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ xy0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(xy0 xy0Var, xy0 xy0Var2) {
        super(xy0Var2);
        this.q = xy0Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // b84
    public final int g(float f, float f2) {
        uy0 c;
        xy0 xy0Var = this.q;
        if (!xy0Var.b) {
            return -1;
        }
        ArrayList<wy0> tabs = xy0Var.getTabs();
        if (tabs.isEmpty() || (c = xy0Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c2 = c.c();
        RectF rectF = this.o;
        xy0Var.d(rectF, c2);
        Rect bounds = c.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()))) {
            return rectF.contains(f, f2) ? 1 : -1;
        }
        return 2;
    }

    @Override // b84
    public final void h(ArrayList arrayList) {
        xy0 xy0Var = this.q;
        if (xy0Var.b) {
            ArrayList<wy0> tabs = xy0Var.getTabs();
            if (tabs.isEmpty() || xy0Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // b84
    public final boolean k(int i, int i2) {
        if (i2 == 16) {
            xy0 xy0Var = this.q;
            ArrayList<wy0> tabs = xy0Var.getTabs();
            if (!tabs.isEmpty()) {
                wy0 wy0Var = tabs.get(0);
                if (i == 1) {
                    xy0Var.b();
                    return true;
                }
                if (i == 2) {
                    xy0Var.g(wy0Var, new bn0((byte) 2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b84
    public final void l(int i, u4 u4Var) {
        xy0 xy0Var = this.q;
        ArrayList<wy0> tabs = xy0Var.getTabs();
        wy0 wy0Var = tabs.isEmpty() ? null : tabs.get(0);
        uy0 c = wy0Var == null ? null : xy0Var.c(wy0Var);
        u4Var.i("android.widget.Button");
        u4Var.b(r4.d);
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
        xy0Var.d(rectF, c2);
        String b = wy0Var.b() != null ? wy0Var.b() : "";
        if (i != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            u4Var.h(rect);
            u4Var.j(TextUtils.isEmpty(b) ? jb6.M0(2131747550, null) : b10.j(new StringBuilder(jb6.M0(2131747550, null)), ", ", b));
        } else {
            Rect bounds = c.l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            u4Var.h(rect);
            u4Var.j(TextUtils.isEmpty(b) ? jb6.M0(2131751978, null) : b10.j(new StringBuilder(jb6.M0(2131751978, null)), ", ", b));
        }
    }
}

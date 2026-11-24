// default package

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v12 extends p02 {
    public fu n;
    public int r;
    public ar0 s;
    public dy0 w;
    public byte x;
    public vs2 y;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        int L;
        fu fuVar = this.n;
        dy0 dy0Var = this.w;
        if (gl.O1()) {
            this.x = (byte) 4;
        } else {
            Point point = gl.q;
            if (point.x > point.y) {
                this.x = (byte) 4;
            } else {
                this.x = (byte) 3;
            }
        }
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        int L2 = ((i - gl.L(12.0f)) - gl.L(10.0f)) / this.x;
        if (this.r != L2) {
            this.r = L2;
            dy0Var.f();
        }
        this.s.x1(Math.max(1, ((this.x - 1) * gl.L(5.0f)) + (L2 * this.x)));
        ((ArrayList) dy0Var.e).size();
        a.getCurrentActionBarHeight();
        if (!gl.O1()) {
            Point point2 = gl.q;
            if (point2.x > point2.y) {
                i3 = (int) (i2 / 3.5f);
                L = i3 - gl.L(52.0f);
                if (L < 0) {
                    L = 0;
                }
                if (fuVar.getPaddingTop() == L) {
                    fuVar.setPadding(gl.L(6.0f), L, gl.L(6.0f), gl.L(48.0f));
                    return;
                }
                return;
            }
        }
        i3 = (i2 / 5) << 1;
        L = i3 - gl.L(52.0f);
        if (L < 0) {
        }
        if (fuVar.getPaddingTop() == L) {
        }
    }

    @Override // p02
    public final void I(p02 p02Var) {
        x02 x02Var = this.b;
        try {
            x02Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        x02Var.U2.setTitle(k96.M0(2131745471, null));
        this.s.g1(0, 0);
    }

    @Override // p02
    public final void K() {
        this.n.z0(0);
    }

    @Override // p02
    public int getCurrentItemTop() {
        fu fuVar = this.n;
        if (fuVar.getChildCount() <= 0) {
            fuVar.setTopGlowOffset(fuVar.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = fuVar.getChildAt(0);
        y29 y29Var = (y29) fuVar.G(childAt);
        int top = childAt.getTop();
        int L = gl.L(7.0f);
        if (top < gl.L(7.0f) || y29Var == null || y29Var.b() != 0) {
            top = L;
        }
        fuVar.setTopGlowOffset(top);
        return top;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override // p02
    public final int j() {
        return 1;
    }

    public void setDelegate(vs2 vs2Var) {
        this.y = vs2Var;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}

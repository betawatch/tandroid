// default package

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x58 extends FrameLayout {
    public v58[] a;
    public xl6[] b;
    public int c;
    public w58 d;
    public Paint e;

    public final void a(int i, xl6 xl6Var) {
        String str;
        this.b[i] = xl6Var;
        v58[] v58VarArr = this.a;
        if (xl6Var == null) {
            v58VarArr[i].setVisibility(4);
            return;
        }
        jm6 jm6Var = xl6Var.d;
        v58 v58Var = v58VarArr[i];
        be0 be0Var = v58Var.b;
        be0Var.q();
        if (jm6Var == null || (str = jm6Var.I) == null) {
            be0Var.setImageDrawable(bkb.Q4);
        } else {
            be0Var.r(jm6Var.J, jm6Var.K, true);
            boolean z = jm6Var.b;
            int i2 = jm6Var.C;
            if (z) {
                be0Var.o(mue.d("vthumb://", i2, ":", str), null, bkb.Q4);
            } else {
                be0Var.o(mue.d("thumb://", i2, ":", str), null, bkb.Q4);
            }
        }
        ((TextView) v58Var.c).setText(xl6Var.c);
        ((TextView) v58Var.d).setText(String.format("%d", Integer.valueOf(xl6Var.e.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View[] viewArr = this.a;
        int L = gl.O1() ? ((gl.L(490.0f) - gl.L(12.0f)) - (gl.L(4.0f) * (this.c - 1))) / this.c : ((gl.q.x - gl.L(12.0f)) - (gl.L(4.0f) * (this.c - 1))) / this.c;
        for (int i3 = 0; i3 < this.c; i3++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = gl.L(4.0f);
            layoutParams.leftMargin = (gl.L(4.0f) + L) * i3;
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        super.onMeasure(i, ug8.E(4.0f, L, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i) {
        int i2 = 0;
        while (true) {
            v58[] v58VarArr = this.a;
            if (i2 >= v58VarArr.length) {
                this.c = i;
                return;
            } else {
                v58VarArr[i2].setVisibility(i2 < i ? 0 : 4);
                i2++;
            }
        }
    }

    public void setDelegate(w58 w58Var) {
        this.d = w58Var;
    }
}

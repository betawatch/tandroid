// default package

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z78 extends FrameLayout {
    public x78[] a;
    public yn6[] b;
    public int c;
    public y78 d;
    public Paint e;

    public final void a(int i, yn6 yn6Var) {
        String str;
        this.b[i] = yn6Var;
        x78[] x78VarArr = this.a;
        if (yn6Var == null) {
            x78VarArr[i].setVisibility(4);
            return;
        }
        jo6 jo6Var = yn6Var.d;
        x78 x78Var = x78VarArr[i];
        bf0 bf0Var = x78Var.b;
        bf0Var.q();
        if (jo6Var == null || (str = jo6Var.I) == null) {
            bf0Var.setImageDrawable(cmb.Q4);
        } else {
            bf0Var.r(jo6Var.J, jo6Var.K, true);
            boolean z = jo6Var.b;
            int i2 = jo6Var.C;
            if (z) {
                bf0Var.o(mle.d("vthumb://", i2, ":", str), null, cmb.Q4);
            } else {
                bf0Var.o(mle.d("thumb://", i2, ":", str), null, cmb.Q4);
            }
        }
        ((TextView) x78Var.c).setText(yn6Var.c);
        ((TextView) x78Var.d).setText(String.format("%d", Integer.valueOf(yn6Var.e.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View[] viewArr = this.a;
        int L = gm.O1() ? ((gm.L(490.0f) - gm.L(12.0f)) - (gm.L(4.0f) * (this.c - 1))) / this.c : ((gm.q.x - gm.L(12.0f)) - (gm.L(4.0f) * (this.c - 1))) / this.c;
        for (int i3 = 0; i3 < this.c; i3++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = gm.L(4.0f);
            layoutParams.leftMargin = (gm.L(4.0f) + L) * i3;
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        super.onMeasure(i, wi8.E(4.0f, L, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i) {
        int i2 = 0;
        while (true) {
            x78[] x78VarArr = this.a;
            if (i2 >= x78VarArr.length) {
                this.c = i;
                return;
            } else {
                x78VarArr[i2].setVisibility(i2 < i ? 0 : 4);
                i2++;
            }
        }
    }

    public void setDelegate(y78 y78Var) {
        this.d = y78Var;
    }
}

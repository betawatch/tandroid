// default package

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z68 extends FrameLayout {
    public TextView a;
    public TextView b;
    public b78 c;
    public AnimatorSet d;
    public ei7 e;

    public final void a(String str, int i, float f) {
        TextView textView = this.a;
        TextView textView2 = this.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        gm.r(this.e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f > 0.0f) {
            textView2.setText("+" + ((int) f));
        } else {
            textView2.setText(String.valueOf((int) f));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        b78 b78Var = this.c;
        b78Var.h = i;
        b78Var.n = (byte) 100;
        b78Var.a((int) f, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), TLObject.FLAG_30));
    }

    public void setSeekBarDelegate(a78 a78Var) {
        this.c.setDelegate(new cz6((Object) this, (Object) a78Var, (byte) 16));
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag(obj);
        this.c.setTag(obj);
    }
}

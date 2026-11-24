// default package

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x48 extends FrameLayout {
    public TextView a;
    public TextView b;
    public z48 c;
    public AnimatorSet d;
    public bg7 e;

    public final void a(String str, int i, float f) {
        TextView textView = this.a;
        TextView textView2 = this.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        gl.r(this.e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f > 0.0f) {
            textView2.setText("+" + ((int) f));
        } else {
            textView2.setText(String.valueOf((int) f));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        z48 z48Var = this.c;
        z48Var.h = i;
        z48Var.n = (byte) 100;
        z48Var.a((int) f, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), TLObject.FLAG_30));
    }

    public void setSeekBarDelegate(y48 y48Var) {
        this.c.setDelegate(new dx6((Object) this, (Object) y48Var, (byte) 15));
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag(obj);
        this.c.setTag(obj);
    }
}

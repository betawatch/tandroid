// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tx7 extends FrameLayout implements sp3 {
    public final TextView a;
    public final TextView b;
    public final be0 c;
    public final ty8 d;
    public int e;
    public uu9 f;
    public final int h;
    public final /* synthetic */ vx7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx7(vx7 vx7Var, Activity activity) {
        super(activity);
        int i;
        this.n = vx7Var;
        i = ((d) vx7Var).currentAccount;
        this.h = up3.q(i).k();
        this.d = new ty8(this);
        be0 be0Var = new be0(activity);
        this.c = be0Var;
        addView(be0Var, nme.d(48, 48.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a = textView;
        zkb.X(textView, bkb.F6, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        boolean z = k96.a0;
        addView(textView, nme.d(-2, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 81, 10.0f, z ? 81 : 21, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        zkb.X(textView2, bkb.y6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(k96.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = k96.a0;
        addView(textView2, nme.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 81, 35.0f, z2 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override // sp3
    public final void B(boolean z) {
        a(false);
    }

    @Override // sp3
    public final void N(String str) {
        this.d.e(true, 1.0f);
        a(true);
    }

    public final void a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        String r = ba4.r(null, this.f);
        ba4.G(y6c.t0);
        boolean exists = ba4.I(this.f).exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        ty8 ty8Var = this.d;
        if (isEmpty) {
            ty8Var.d(null, false, false);
            return;
        }
        uu9 uu9Var = this.f;
        String str = uu9Var.c;
        vx7 vx7Var = this.n;
        if (str != null) {
            if (uu9Var.d != null) {
                i4 = ((d) vx7Var).currentAccount;
                up3.q(i4).v(this);
                ty8Var.d(null, false, z);
                this.e = -1;
                return;
            }
            i3 = ((d) vx7Var).currentAccount;
            up3.q(i3).a(this.f.c, null, this);
            this.e = 1;
            Float s = fl5.z().s(this.f.c);
            ty8Var.d(getResources().getDrawable(R.drawable.circle), true, z);
            ty8Var.e(false, s != null ? s.floatValue() : 0.0f);
            invalidate();
            return;
        }
        if (exists) {
            i2 = ((d) vx7Var).currentAccount;
            up3.q(i2).v(this);
            this.e = -1;
            ty8Var.d(null, false, z);
            invalidate();
            return;
        }
        i = ((d) vx7Var).currentAccount;
        up3.q(i).a(r, null, this);
        this.e = 1;
        Float s2 = fl5.z().s(r);
        ty8Var.d(getResources().getDrawable(R.drawable.circle), true, z);
        ty8Var.e(z, s2 != null ? s2.floatValue() : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override // sp3
    public int getObserverTag() {
        return this.h;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        this.d.e(true, Math.min(1.0f, j / j2));
        if (this.e != 1) {
            a(false);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // sp3
    public final void l(long j, long j2) {
        this.d.e(true, Math.min(1.0f, j / j2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        be0 be0Var = this.c;
        int measuredWidth = ((be0Var.getMeasuredWidth() - gl.L(24.0f)) / 2) + be0Var.getLeft();
        int measuredHeight = ((be0Var.getMeasuredHeight() - gl.L(24.0f)) / 2) + be0Var.getTop();
        this.d.f(measuredWidth, measuredHeight, gl.L(24.0f) + measuredWidth, gl.L(24.0f) + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), ug8.E(64.0f, 1, TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}

// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class z08 extends FrameLayout implements jq3 {
    public final TextView a;
    public final TextView b;
    public final de0 c;
    public final g29 d;
    public int e;
    public oy9 f;
    public final int h;
    public final /* synthetic */ b18 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z08(b18 b18Var, Activity activity) {
        super(activity);
        int i;
        this.n = b18Var;
        i = ((e) b18Var).currentAccount;
        this.h = lq3.q(i).k();
        this.d = new g29(this);
        de0 de0Var = new de0(activity);
        this.c = de0Var;
        addView(de0Var, tre.d(48, 48.0f, (ob6.a0 ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a = textView;
        yob.X(textView, aob.G6, null);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        boolean z = ob6.a0;
        addView(textView, tre.d(-2, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 81, 10.0f, z ? 81 : 21, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        yob.X(textView2, aob.z6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = ob6.a0;
        addView(textView2, tre.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 81, 35.0f, z2 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override // jq3
    public final void B(boolean z) {
        a(false);
    }

    @Override // jq3
    public final void N(String str) {
        this.d.e(true, 1.0f);
        a(true);
    }

    public final void a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        String r = xb4.r(null, this.f);
        xb4.G(yac.t0);
        boolean exists = xb4.I(this.f).exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        g29 g29Var = this.d;
        if (isEmpty) {
            g29Var.d(null, false, false);
            return;
        }
        oy9 oy9Var = this.f;
        String str = oy9Var.c;
        b18 b18Var = this.n;
        if (str != null) {
            if (oy9Var.d != null) {
                i4 = ((e) b18Var).currentAccount;
                lq3.q(i4).v(this);
                g29Var.d(null, false, z);
                this.e = -1;
                return;
            }
            i3 = ((e) b18Var).currentAccount;
            lq3.q(i3).a(this.f.c, null, this);
            this.e = 1;
            Float s = in5.z().s(this.f.c);
            g29Var.d(getResources().getDrawable(R.drawable.circle), true, z);
            g29Var.e(false, s != null ? s.floatValue() : 0.0f);
            invalidate();
            return;
        }
        if (exists) {
            i2 = ((e) b18Var).currentAccount;
            lq3.q(i2).v(this);
            this.e = -1;
            g29Var.d(null, false, z);
            invalidate();
            return;
        }
        i = ((e) b18Var).currentAccount;
        lq3.q(i).a(r, null, this);
        this.e = 1;
        Float s2 = in5.z().s(r);
        g29Var.d(getResources().getDrawable(R.drawable.circle), true, z);
        g29Var.e(z, s2 != null ? s2.floatValue() : 0.0f);
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

    @Override // jq3
    public int getObserverTag() {
        return this.h;
    }

    @Override // jq3
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

    @Override // jq3
    public final void l(long j, long j2) {
        this.d.e(true, Math.min(1.0f, j / j2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, aob.j0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        de0 de0Var = this.c;
        int measuredWidth = ((de0Var.getMeasuredWidth() - hl.L(24.0f)) / 2) + de0Var.getLeft();
        int measuredHeight = ((de0Var.getMeasuredHeight() - hl.L(24.0f)) / 2) + de0Var.getTop();
        this.d.f(measuredWidth, measuredHeight, hl.L(24.0f) + measuredWidth, hl.L(24.0f) + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), ik8.E(64.0f, 1, TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}

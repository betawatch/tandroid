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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vz7 extends FrameLayout implements cr3 {
    public final TextView a;
    public final TextView b;
    public final bf0 c;
    public final u09 d;
    public int e;
    public xw9 f;
    public final int h;
    public final /* synthetic */ xz7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz7(xz7 xz7Var, Activity activity) {
        super(activity);
        int i;
        this.n = xz7Var;
        i = ((d) xz7Var).currentAccount;
        this.h = er3.q(i).k();
        this.d = new u09(this);
        bf0 bf0Var = new bf0(activity);
        this.c = bf0Var;
        addView(bf0Var, qoe.d(48, 48.0f, (jb6.a0 ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-2, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 81, 10.0f, z ? 81 : 21, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        anb.X(textView2, cmb.y6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = jb6.a0;
        addView(textView2, qoe.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 81, 35.0f, z2 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override // cr3
    public final void A(boolean z) {
        a(false);
    }

    @Override // cr3
    public final void N(String str) {
        this.d.e(true, 1.0f);
        a(true);
    }

    public final void a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        String r = bc4.r(null, this.f);
        bc4.G(z8c.t0);
        boolean exists = bc4.I(this.f).exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        u09 u09Var = this.d;
        if (isEmpty) {
            u09Var.d(null, false, false);
            return;
        }
        xw9 xw9Var = this.f;
        String str = xw9Var.c;
        xz7 xz7Var = this.n;
        if (str != null) {
            if (xw9Var.d != null) {
                i4 = ((d) xz7Var).currentAccount;
                er3.q(i4).v(this);
                u09Var.d(null, false, z);
                this.e = -1;
                return;
            }
            i3 = ((d) xz7Var).currentAccount;
            er3.q(i3).a(this.f.c, null, this);
            this.e = 1;
            Float s = fn5.z().s(this.f.c);
            u09Var.d(getResources().getDrawable(R.drawable.circle), true, z);
            u09Var.e(false, s != null ? s.floatValue() : 0.0f);
            invalidate();
            return;
        }
        if (exists) {
            i2 = ((d) xz7Var).currentAccount;
            er3.q(i2).v(this);
            this.e = -1;
            u09Var.d(null, false, z);
            invalidate();
            return;
        }
        i = ((d) xz7Var).currentAccount;
        er3.q(i).a(r, null, this);
        this.e = 1;
        Float s2 = fn5.z().s(r);
        u09Var.d(getResources().getDrawable(R.drawable.circle), true, z);
        u09Var.e(z, s2 != null ? s2.floatValue() : 0.0f);
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

    @Override // cr3
    public int getObserverTag() {
        return this.h;
    }

    @Override // cr3
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

    @Override // cr3
    public final void l(long j, long j2) {
        this.d.e(true, Math.min(1.0f, j / j2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(jb6.a0 ? 0.0f : gm.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(20.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bf0 bf0Var = this.c;
        int measuredWidth = ((bf0Var.getMeasuredWidth() - gm.L(24.0f)) / 2) + bf0Var.getLeft();
        int measuredHeight = ((bf0Var.getMeasuredHeight() - gm.L(24.0f)) / 2) + bf0Var.getTop();
        this.d.f(measuredWidth, measuredHeight, gm.L(24.0f) + measuredWidth, gm.L(24.0f) + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), wi8.E(64.0f, 1, TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}

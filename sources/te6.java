// default package

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class te6 extends TextView implements snb {
    public final hf0 a;
    public final va6 b;
    public int c;
    public final /* synthetic */ qh6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te6(qh6 qh6Var, Context context) {
        super(context);
        this.d = qh6Var;
        int i = aob.I6;
        hf0 f0 = aob.f0(aob.p1(0.1f, aob.w0(null, i, false)), 7, -1);
        this.a = f0;
        va6 va6Var = new va6();
        this.b = va6Var;
        xob xobVar = yob.a;
        this.c = aob.p1(0.1f, aob.w0(null, i, false));
        f0.setCallback(this);
        va6Var.D = true;
        va6Var.u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.Ce));
    }

    public boolean b() {
        return true;
    }

    public final void c() {
        CharSequence text;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        f66 f66Var = new f66(0);
        float L = hl.L(3.0f);
        float L2 = hl.L(6.0f);
        f66Var.q = L;
        f66Var.r = L2;
        int length = text.length();
        f66Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, f66Var);
        RectF rectF = hl.P;
        rectF.set(f66Var.s, f66Var.u, f66Var.t, f66Var.v);
        this.a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        va6 va6Var = this.b;
        va6Var.y = f66Var;
        va6Var.j(4.0f);
        int themedColor = this.d.getThemedColor(aob.Ce);
        va6Var.g(aob.p1(0.85f, themedColor), aob.p1(2.0f, themedColor), aob.p1(3.5f, themedColor), aob.p1(6.0f, themedColor));
        va6Var.k();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        canvas.save();
        if ((getGravity() & 16) == 0 || getLayout() == null) {
            paddingTop = getPaddingTop();
        } else {
            paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        }
        canvas.translate(getPaddingLeft(), paddingTop);
        this.a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a = a();
        va6 va6Var = this.b;
        if (a || va6Var.d()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), paddingTop);
            va6Var.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean b = b();
        hf0 hf0Var = this.a;
        if (b && motionEvent.getAction() == 0) {
            hf0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
            hf0Var.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
            hf0Var.setState(new int[0]);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        c();
    }

    @Override // snb
    public final void updateColors() {
        try {
            int p1 = aob.p1(0.1f, aob.w0(null, aob.I6, false));
            hf0 hf0Var = this.a;
            if (hf0Var != null && p1 != this.c) {
                aob.F1(hf0Var, p1, true);
            }
            this.c = p1;
            va6 va6Var = this.b;
            if (va6Var != null) {
                int themedColor = this.d.getThemedColor(aob.Ce);
                va6Var.g(aob.p1(0.85f, themedColor), aob.p1(2.0f, themedColor), aob.p1(3.5f, themedColor), aob.p1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}

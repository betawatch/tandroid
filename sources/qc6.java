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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class qc6 extends TextView implements tjb {
    public final ff0 a;
    public final r86 b;
    public int c;
    public final /* synthetic */ mf6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc6(mf6 mf6Var, Context context) {
        super(context);
        this.d = mf6Var;
        int i = bkb.H6;
        ff0 f0 = bkb.f0(bkb.p1(0.1f, bkb.w0(null, i, false)), 7, -1);
        this.a = f0;
        r86 r86Var = new r86();
        this.b = r86Var;
        ykb ykbVar = zkb.a;
        this.c = bkb.p1(0.1f, bkb.w0(null, i, false));
        f0.setCallback(this);
        r86Var.D = true;
        r86Var.u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.Be));
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
        b46 b46Var = new b46(0);
        float L = gl.L(3.0f);
        float L2 = gl.L(6.0f);
        b46Var.q = L;
        b46Var.r = L2;
        int length = text.length();
        b46Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, b46Var);
        RectF rectF = gl.P;
        rectF.set(b46Var.s, b46Var.u, b46Var.t, b46Var.v);
        this.a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        r86 r86Var = this.b;
        r86Var.y = b46Var;
        r86Var.j(4.0f);
        int themedColor = this.d.getThemedColor(bkb.Be);
        r86Var.g(bkb.p1(0.85f, themedColor), bkb.p1(2.0f, themedColor), bkb.p1(3.5f, themedColor), bkb.p1(6.0f, themedColor));
        r86Var.k();
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
        r86 r86Var = this.b;
        if (a || r86Var.d()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), paddingTop);
            r86Var.draw(canvas);
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
        ff0 ff0Var = this.a;
        if (b && motionEvent.getAction() == 0) {
            ff0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
            ff0Var.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
            ff0Var.setState(new int[0]);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        c();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            int p1 = bkb.p1(0.1f, bkb.w0(null, bkb.H6, false));
            ff0 ff0Var = this.a;
            if (ff0Var != null && p1 != this.c) {
                bkb.F1(ff0Var, p1, true);
            }
            this.c = p1;
            r86 r86Var = this.b;
            if (r86Var != null) {
                int themedColor = this.d.getThemedColor(bkb.Be);
                r86Var.g(bkb.p1(0.85f, themedColor), bkb.p1(2.0f, themedColor), bkb.p1(3.5f, themedColor), bkb.p1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}

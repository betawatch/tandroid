// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class p66 extends TextView {
    public static Field J;
    public static Class K;
    public static Method L;
    public Object E;
    public boolean F;
    public boolean G;
    public PorterDuffColorFilter H;
    public int I;
    public final boolean a;
    public final m66 b;
    public final vnb c;
    public dm d;
    public q66 e;
    public o66 f;
    public o66 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public CharacterStyle w;
    public int x;
    public boolean y;

    public p66(Context context, vnb vnbVar) {
        super(context);
        this.F = false;
        this.G = true;
        this.a = false;
        this.b = new m66(this);
        this.c = vnbVar;
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i - getPaddingLeft();
        int textPaddingTop = i2 - getTextPaddingTop();
        int lineForVertical = layout.getLineForVertical(textPaddingTop);
        float f = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f && layout.getLineWidth(lineForVertical) + lineLeft >= f && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !hl.A1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return aob.v0(aob.Ce, this.c);
    }

    public int getTextPaddingTop() {
        int paddingTop = getPaddingTop();
        return (getGravity() != 17 || getLayout() == null) ? paddingTop : Math.max(0, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2) + paddingTop;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.y) {
            this.y = true;
            try {
                if (K == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    J = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    K = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        L = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (L != null) {
                    Object obj = this.E;
                    if (obj == null) {
                        obj = J.get(this);
                        this.E = obj;
                    }
                    if (obj != null) {
                        L.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = hm.update(a(), this, this.d, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm.release(this, this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        Layout layout;
        if (!this.a) {
            canvas.save();
            if (!this.n) {
                canvas.translate(this.r ? 0.0f : getPaddingLeft(), this.s ? 0.0f : getTextPaddingTop());
            }
            m66 m66Var = this.b;
            if (m66Var != null && m66Var.g(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        boolean z2 = false;
        try {
            layout = getLayout();
            float height = ((getGravity() & 16) == 0 || layout == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - layout.getHeight()) / 2.0f) + getPaddingTop();
            if (height == 0.0f && getPaddingLeft() == 0) {
                z = false;
            } else {
                canvas.save();
                try {
                    canvas.translate(getPaddingLeft(), height);
                    z = true;
                } catch (Exception e) {
                    e = e;
                    canvas2 = canvas;
                    z2 = true;
                    if (!this.F) {
                        cc4.g(e, true);
                    }
                    this.F = true;
                    z = z2;
                    if (z) {
                    }
                }
            }
            try {
                this.d = hm.update(a(), this, this.d, getLayout());
                if (this.G && (this.H == null || this.I != getPaint().linkColor)) {
                    int i = getPaint().linkColor;
                    this.I = i;
                    this.H = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                }
                canvas2 = canvas;
            } catch (Exception e2) {
                e = e2;
                canvas2 = canvas;
            }
        } catch (Exception e3) {
            e = e3;
            canvas2 = canvas;
        }
        try {
            hm.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.H);
        } catch (Exception e4) {
            e = e4;
            z2 = z;
            if (!this.F) {
            }
            this.F = true;
            z = z2;
            if (z) {
            }
        }
        if (z) {
            canvas2.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.x;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        this.d = hm.update(a(), this, this.d, getLayout());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        m66 m66Var = this.b;
        if (m66Var != null) {
            Layout layout = getLayout();
            ClickableSpan b = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b != null && motionEvent.getAction() == 0) {
                q66 q66Var = new q66(b, this.c, motionEvent.getX(), motionEvent.getY(), 0);
                q66Var.d(c());
                this.e = q66Var;
                m66Var.a(q66Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.i);
                int spanEnd = spannableString.getSpanEnd(this.e.i);
                f66 b2 = this.e.b();
                b2.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b2);
                hl.d3(new ls5((Object) this, (Object) q66Var, (Object) b, (byte) 14), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m66Var.e(true);
                q66 q66Var2 = this.e;
                if (q66Var2 != null && (characterStyle = q66Var2.i) == b) {
                    o66 o66Var = this.f;
                    if (o66Var != null) {
                        o66Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                m66Var.e(true);
                this.e = null;
            }
        }
        return this.e != null || super.onTouchEvent(motionEvent);
    }

    public void setDisablePaddingsOffset(boolean z) {
        this.n = z;
    }

    public void setDisablePaddingsOffsetX(boolean z) {
        this.r = z;
    }

    public void setDisablePaddingsOffsetY(boolean z) {
        this.s = z;
    }

    public void setEmojiColor(int i) {
        this.G = false;
        this.H = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.w != characterStyle) {
            m66 m66Var = this.b;
            m66Var.f();
            this.w = characterStyle;
            va6 j = m66.j(getLayout(), characterStyle, getPaddingTop());
            if (j != null) {
                int d = d(aob.v0(aob.Ce, this.c));
                j.g(aob.p1(0.8f, d), aob.p1(1.3f, d), aob.p1(1.0f, d), aob.p1(4.0f, d));
                j.x.setStrokeWidth(hl.N(1.25f));
                m66Var.b(j, null);
            }
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        this.x = i;
    }

    public void setOnLinkLongPressListener(o66 o66Var) {
        this.h = o66Var;
    }

    public void setOnLinkPressListener(o66 o66Var) {
        this.f = o66Var;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = hm.update(a(), this, this.d, getLayout());
    }

    public p66(Context context) {
        this(context, null);
    }

    public p66(Context context, m66 m66Var, vnb vnbVar) {
        super(context);
        this.F = false;
        this.G = true;
        this.a = true;
        this.b = m66Var;
        this.c = vnbVar;
    }

    public int d(int i) {
        return i;
    }
}

package xh;

import ab.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
import n2.o0;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.j6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.y5;
import wg.p;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class l extends TextView implements s9 {
    public static Field S;
    public static Class T;
    public static Method U;
    public final h6 E;
    public CharacterStyle F;
    public l80 G;
    public l80 H;
    public n80 I;
    public PorterDuffColorFilter J;
    public final boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public Layout O;
    public int P;
    public boolean Q;
    public Object R;
    public final gf.c a;
    public final ArrayList b;
    public final Stack c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int h;
    public final Path n;
    public boolean r;
    public int s;
    public u5 w;
    public boolean x;
    public final o0 y;

    public l(Context context) {
        this(context, null, true);
    }

    public ClickableSpan a(int i7, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i7 - getPaddingLeft();
        int paddingTop = i10 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !g0.C1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public final void b() {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i7 = f.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            f.a(this, layout, 0, measuredWidth, (Spanned) getText(), stack, arrayList, null);
        }
        invalidate();
    }

    public final void c(float f10, float f11) {
        this.e = false;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            this.d = true;
            b();
            return;
        }
        this.f = true;
        int i7 = this.h + 1;
        this.h = i7;
        ((f) arrayList.get(0)).q = new k(this, i7, 0);
        float hypot = (float) Math.hypot(getWidth(), getHeight());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f) obj).j(f10, f11, hypot, false);
        }
    }

    public final void d(boolean z10) {
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (!z10 && this.O == getLayout() && this.P == length) {
            return;
        }
        this.w = y5.update(this.s, this, this.w, getLayout());
        this.O = getLayout();
        this.P = length;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        o0 o0Var = this.y;
        if (o0Var != null) {
            Layout layout = getLayout();
            ClickableSpan a10 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a10 != null && motionEvent.getAction() == 0) {
                n80 n80Var = new n80(a10, this.E, motionEvent.getX(), motionEvent.getY(), 0);
                n80Var.d(m6.w0(m6.Ce, this.E));
                this.I = n80Var;
                o0Var.b(n80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.I.i);
                int spanEnd = spannableString.getSpanEnd(this.I.i);
                h80 b10 = this.I.b();
                b10.d(layout, spanStart, this.K ? 0.0f : getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                g0.h3(new p(this, n80Var, a10, 2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                o0Var.f(true);
                n80 n80Var2 = this.I;
                if (n80Var2 != null && (characterStyle = n80Var2.i) == a10) {
                    l80 l80Var = this.G;
                    if (l80Var != null) {
                        l80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.I = null;
                    return true;
                }
                this.I = null;
            }
            if (motionEvent.getAction() == 3) {
                o0Var.f(true);
                this.I = null;
            }
        }
        if (this.I == null && !(this.r && ((GestureDetector) ((jn) this.a.d).b).onTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.s9
    public Layout getStaticTextLayout() {
        return getLayout();
    }

    @Override // android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        if (!this.Q) {
            this.Q = true;
            try {
                if (T == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    S = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    T = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        U = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (U != null) {
                    if (this.R == null) {
                        this.R = S.get(this);
                    }
                    Object obj = this.R;
                    if (obj != null) {
                        U.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d(true);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        ArrayList arrayList;
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        if (!this.L) {
            canvas.translate(this.M ? 0.0f : paddingLeft, this.N ? 0.0f : paddingTop);
        }
        o0 o0Var = this.y;
        if (o0Var != null && o0Var.h(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.b;
        boolean isEmpty = arrayList2.isEmpty();
        Path path = this.n;
        if (isEmpty) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            path.rewind();
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                Rect bounds = ((f) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            j6.n = this.x;
            super.onDraw(canvas);
            j6.n = true;
            canvas.restore();
            f fVar = (f) arrayList2.get(0);
            if (fVar.m > 0.0f && fVar.n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((f) arrayList2.get(0)).e(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        d(false);
        if (this.w != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            y5.drawAnimatedEmojis(canvas, getLayout(), this.w, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.J);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = ((f) arrayList.get(0)).n != -1.0f;
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        canvas2.translate(paddingLeft, g0.L(2.0f) + paddingTop);
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            f fVar2 = (f) obj2;
            fVar2.h(getPaint().getColor());
            fVar2.draw(canvas2);
        }
        if (z10) {
            path.rewind();
            ((f) arrayList.get(0)).e(path);
            canvas2.drawPath(path, m6.Fm);
        }
        canvas2.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        b();
        if (this.e) {
            c((getWidth() / 2.0f) - getPaddingLeft(), ((getHeight() / 2.0f) - getPaddingTop()) + getScrollY());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        b();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        b();
        d(true);
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.L = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.M = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.N = z10;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.F != characterStyle) {
            o0 o0Var = this.y;
            o0Var.g();
            this.F = characterStyle;
            q80 k10 = o0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int w02 = m6.w0(m6.Ce, this.E);
                k10.g(m6.r1(0.8f, w02), m6.r1(1.3f, w02), m6.r1(1.0f, w02), m6.r1(4.0f, w02));
                k10.x.setStrokeWidth(g0.N(1.25f));
                o0Var.c(k10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(l80 l80Var) {
        this.H = l80Var;
    }

    public void setOnLinkPressListener(l80 l80Var) {
        this.G = l80Var;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.h++;
        this.e = false;
        this.f = false;
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.J = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z10) {
        this.x = z10;
    }

    public l(Context context, h6 h6Var, boolean z10) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new Stack();
        this.n = new Path();
        this.r = true;
        this.s = 0;
        this.x = true;
        this.K = true;
        this.O = null;
        this.y = new o0(this);
        this.E = h6Var;
        this.a = new gf.c(this, arrayList, new z(12, this, z10));
    }

    public void setClearLinkOnLongPress(boolean z10) {
    }
}

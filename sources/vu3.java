// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class vu3 extends EditText {
    public static Boolean a0;
    public int E;
    public cn F;
    public PorterDuffColorFilter G;
    public boolean H;
    public Layout I;
    public int J;
    public l K;
    public Rect L;
    public boolean M;
    public int N;
    public Integer O;
    public float P;
    public boolean Q;
    public rl7 R;
    public int S;
    public int T;
    public boolean[] U;
    public boolean V;
    public boolean W;
    public ArrayList a;
    public Stack b;
    public ArrayList c;
    public boolean d;
    public boolean e;
    public ml0 f;
    public boolean h;
    public Path n;
    public int r;
    public int s;
    public float w;
    public float x;
    public boolean y;

    public final void d() {
        int i;
        int i2;
        l lVar = this.K;
        CharSequence text = getLayout() != null ? getLayout().getText() : null;
        boolean z = false;
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (xkb xkbVar : (xkb[]) spannable.getSpans(0, spannable.length(), xkb.class)) {
                int spanStart = spannable.getSpanStart(xkbVar);
                int spanEnd = spannable.getSpanEnd(xkbVar);
                if (xkbVar.b() && ((spanStart > (i = this.r) && spanEnd < this.s) || ((i > spanStart && i < spanEnd) || ((i2 = this.s) > spanStart && i2 < spanEnd)))) {
                    removeCallbacks(lVar);
                    this.y = false;
                    z = true;
                    break;
                }
            }
        }
        if (!this.d || z || this.y) {
            return;
        }
        this.y = true;
        postDelayed(lVar, 10000L);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        ml0 ml0Var;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            z = false;
        } else {
            int size = arrayList.size();
            z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                b09 b09Var = (b09) obj;
                u30 u30Var = b09Var.e.K;
                boolean z3 = b09Var.b() && b09Var.g.contains(motionEvent.getX(), motionEvent.getY() - ((float) paddingTop));
                if (motionEvent.getAction() == 0) {
                    if (u30Var != null) {
                        u30Var.f(z3);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (u30Var != null && u30Var.c && z3) {
                        b09Var.e.e = !r5.e;
                        g(true);
                        z = true;
                    }
                    if (u30Var != null) {
                        u30Var.f(false);
                    }
                } else if (motionEvent.getAction() == 3 && u30Var != null) {
                    u30Var.f(false);
                }
                z = (u30Var != null && u30Var.c) || z;
            }
        }
        if (!z) {
            if (this.e && (ml0Var = this.f) != null && ((GestureDetector) ((lj4) ml0Var.d).a).onTouchEvent(motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (!super.dispatchTouchEvent(motionEvent) && !z2) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return vm.f();
    }

    public final void f() {
        Editable text = getText();
        if (text != null) {
            for (xkb xkbVar : (xkb[]) text.getSpans(0, text.length(), xkb.class)) {
                if (xkbVar.b()) {
                    boolean z = this.d;
                    wkb wkbVar = xkbVar.b;
                    if (z) {
                        wkbVar.a |= 512;
                    } else {
                        wkbVar.a &= -513;
                    }
                }
            }
        }
        h();
    }

    public final void g(boolean z) {
        if (this.V) {
            this.W = true;
            return;
        }
        int i = 0;
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (z || this.S != length) {
            this.T = 2;
            this.S = length;
        }
        if (this.T > 0) {
            boolean[] zArr = this.U;
            if (zArr == null) {
                zArr = new boolean[1];
                this.U = zArr;
            }
            zArr[0] = false;
            this.W = false;
            this.V = true;
            this.c = f09.d(this, getLayout(), this.c, this.U);
            if (this.W) {
                this.c = f09.d(this, getLayout(), this.c, this.U);
            }
            this.V = false;
            this.W = false;
            if (this.U[0]) {
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            this.T--;
            if (getLayout() != null && getLayout().getText() != null) {
                i = getLayout().getText().length();
            }
            this.S = i;
        }
    }

    public float getOffsetY() {
        return this.P;
    }

    public CharSequence getTextToUse() {
        Editable text = getText();
        if (text == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        d09[] d09VarArr = (d09[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), d09.class);
        for (int length = d09VarArr.length - 1; length >= 0; length--) {
            d09 d09Var = d09VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(d09Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(d09Var);
            spannableStringBuilder.removeSpan(d09Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public final void h() {
        vu3 vu3Var;
        cn cnVar;
        cn cnVar2;
        Stack stack = this.b;
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        Layout layout = getLayout();
        if (layout == null || !(layout.getText() instanceof Spannable)) {
            vu3Var = this;
        } else {
            if (this.H && (cnVar2 = this.F) != null) {
                ArrayList arrayList2 = cnVar2.a;
                for (int i = 0; i < arrayList2.size(); i++) {
                    ((bn) arrayList2.get(i)).d.recordPositions = false;
                }
            }
            ArrayList arrayList3 = this.c;
            short s = rna.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            int i2 = measuredWidth;
            vu3Var = this;
            rna.a(vu3Var, layout2, 0, i2, (Spanned) getText(), stack, arrayList, arrayList3);
            if (vu3Var.H && (cnVar = vu3Var.F) != null) {
                ArrayList arrayList4 = cnVar.a;
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    ((bn) arrayList4.get(i3)).d.recordPositions = true;
                }
            }
        }
        vu3Var.invalidate();
    }

    public final void i(rna rnaVar, float f, float f2) {
        if (this.d) {
            return;
        }
        this.w = f;
        this.x = f2;
        this.y = false;
        removeCallbacks(this.K);
        j(true, false);
        rnaVar.q = new tu3(this, (byte) 0);
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((rna) obj).j(f, f2, sqrt, false);
        }
    }

    public final void j(boolean z, boolean z2) {
        this.d = z;
        Editable text = getText();
        if (text != null) {
            for (xkb xkbVar : (xkb[]) text.getSpans(0, text.length(), xkb.class)) {
                if (xkbVar.b()) {
                    wkb wkbVar = xkbVar.b;
                    if (z) {
                        wkbVar.a |= 512;
                    } else {
                        wkbVar.a &= -513;
                    }
                }
            }
        }
        this.h = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.r, this.s);
        this.h = false;
        if (z2) {
            h();
        }
    }

    public final void k(boolean z) {
        if (this.H) {
            int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
            if (!z && this.I == getLayout() && this.J == length) {
                return;
            }
            this.F = gn.update(e(), this, this.F, getLayout());
            this.I = getLayout();
            this.J = length;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k(true);
        g(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.K);
        gn.release(this, this.F);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        ArrayList arrayList;
        boolean z = this.Q;
        Rect rect = this.L;
        Path path2 = this.n;
        ArrayList arrayList2 = this.a;
        canvas.save();
        if (this.M && getScrollY() != 0) {
            canvas.clipRect(-gm.L(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.P, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.P);
        }
        int paddingLeft = getPaddingLeft();
        int i = 0;
        if (arrayList2.isEmpty()) {
            path = path2;
        } else {
            path2.rewind();
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                Rect bounds = ((rna) arrayList2.get(i2)).getBounds();
                path2.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
                i2 = i3;
            }
            path = path2;
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        g(false);
        for (int i4 = 0; i4 < this.c.size(); i4++) {
            b09 b09Var = (b09) this.c.get(i4);
            int width = getWidth();
            int i5 = this.E;
            getPaint();
            b09Var.a(canvas, width, i5);
        }
        k(false);
        if (z) {
            rl7 rl7Var = this.R;
            if (rl7Var == null) {
                rl7Var = new rl7();
                this.R = rl7Var;
            }
            rl7Var.a = canvas;
            super.onDraw(rl7Var);
        } else {
            super.onDraw(canvas);
        }
        if (!this.H || this.F == null) {
            arrayList = arrayList2;
        } else {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            arrayList = arrayList2;
            gn.drawAnimatedEmojis(canvas, getLayout(), this.F, 0.0f, arrayList, computeVerticalScrollOffset() - gm.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.G);
            canvas.restore();
        }
        canvas.restore();
        if (arrayList.isEmpty()) {
            return;
        }
        rna rnaVar = (rna) arrayList.get(0);
        if (rnaVar.m > 0.0f && rnaVar.n > 0.0f) {
            canvas.save();
            canvas.clipPath(path);
            path.rewind();
            ((rna) arrayList.get(0)).e(path);
            canvas.clipPath(path);
            canvas.translate(0.0f, -getPaddingTop());
            if (z) {
                rl7 rl7Var2 = this.R;
                if (rl7Var2 == null) {
                    rl7Var2 = new rl7();
                    this.R = rl7Var2;
                }
                rl7Var2.a = canvas;
                super.onDraw(rl7Var2);
            } else {
                super.onDraw(canvas);
            }
            canvas.restore();
        }
        rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.P), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.P));
        canvas.save();
        canvas.clipRect(rect);
        canvas.translate(paddingLeft, 0.0f);
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            rna rnaVar2 = (rna) obj;
            Rect bounds2 = rnaVar2.getBounds();
            int i6 = rect.top;
            int i7 = bounds2.bottom;
            if ((i6 <= i7 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i7 >= i6)) {
                rnaVar2.h(rnaVar2.y ? this.E : getPaint().getColor());
                rnaVar2.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g(false);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.h) {
            return;
        }
        this.r = i;
        this.s = i2;
        d();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r10 = r10 - r9;
        r6.r += r10;
        r6.s += r10;
        i(r4, r8, r7);
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.h) {
            f();
            try {
                Layout layout = getLayout();
                if ((charSequence instanceof Spannable) && layout != null) {
                    int lineForOffset = layout.getLineForOffset(i);
                    int primaryHorizontal = (int) layout.getPrimaryHorizontal(i);
                    int lineTop = (int) ((layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset)) / 2.0f);
                    ArrayList arrayList = this.a;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i4);
                        i4++;
                        rna rnaVar = (rna) obj;
                        if (rnaVar.getBounds().contains(primaryHorizontal, lineTop)) {
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        k(true);
        g(true);
        invalidate();
    }

    public void setClipToPadding(boolean z) {
        this.M = z;
    }

    public void setEmojiColor(Integer num) {
        this.O = num;
        this.G = new PorterDuffColorFilter(num == null ? this.N : num.intValue(), PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f) {
        this.P = f;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z) {
        this.e = z;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.h) {
            this.d = false;
            Stack stack = this.b;
            if (stack != null) {
                stack.clear();
            }
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        this.N = i;
        super.setTextColor(i);
        Integer num = this.O;
        if (num != null) {
            i = num.intValue();
        }
        this.G = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}

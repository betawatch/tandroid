package ru.noties.jlatexmath;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.telegram.ui.Cells.r6;
import ru.noties.jlatexmath.android.R;
import ru.noties.jlatexmath.awt.Color;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public class JLatexMathView extends View {
    public static final int ALIGN_CENTER = 1;
    public static final int ALIGN_END = 2;
    public static final int ALIGN_START = 0;
    private int alignHorizontal;
    private int alignVertical;
    private Drawable background;
    private JLatexMathDrawable drawable;
    private float left;
    private float scale;
    private int textColor;
    private int textSize;
    private float top;

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    @Retention(RetentionPolicy.CLASS)
    public @interface Align {
    }

    public JLatexMathView(Context context) {
        super(context);
        init(context, null);
    }

    private static float alignment(int i10, float f7) {
        if (i10 == 0) {
            return 0.0f;
        }
        return 1 == i10 ? f7 / 2.0f : f7;
    }

    private void init(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.JLatexMathView);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.JLatexMathView_jlmv_background, 0);
            if (resourceId != 0) {
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                if ("drawable".equals(resourceTypeName)) {
                    drawable = obtainStyledAttributes.getDrawable(R.styleable.JLatexMathView_jlmv_background);
                } else {
                    if (!"color".equals(resourceTypeName)) {
                        throw new IllegalStateException("Unexpected background reference: " + context.getResources().getResourceName(resourceId) + " is of type: " + resourceTypeName + ". Supported: drawable, color");
                    }
                    drawable = new ColorDrawable(obtainStyledAttributes.getColor(R.styleable.JLatexMathView_jlmv_background, 0));
                }
            } else {
                drawable = null;
            }
            textSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.JLatexMathView_jlmv_textSize, 0)).textColor(obtainStyledAttributes.getColor(R.styleable.JLatexMathView_jlmv_textColor, Color.black.getColorInt())).background(drawable).align(obtainStyledAttributes.getInteger(R.styleable.JLatexMathView_jlmv_alignVertical, 0), obtainStyledAttributes.getInteger(R.styleable.JLatexMathView_jlmv_alignHorizontal, 0));
            obtainStyledAttributes.recycle();
            if (isInEditMode()) {
                JLatexMathAndroid.init(context);
                setLatex(r6.t(r6.t(r6.t(r6.t("\\begin{array}{l}\\forall\\varepsilon\\in\\mathbb{R}_+^*\\ \\exists\\eta>0\\ |x-x_0|\\leq\\eta\\Longrightarrow|f(x)-f(x_0)|\\leq\\varepsilon\\\\\\det\\begin{bmatrix}a_{11}&a_{12}&\\cdots&a_{1n}\\\\a_{21}&\\ddots&&\\vdots\\\\\\vdots&&\\ddots&\\vdots\\\\a_{n1}&\\cdots&\\cdots&a_{nn}\\end{bmatrix}\\overset{\\mathrm{def}}{=}\\sum_{\\sigma\\in\\mathfrak{S}_n}\\varepsilon(\\sigma)\\prod_{k=1}^n a_{k\\sigma(k)}\\\\\\sideset{_\\alpha^\\beta}{_\\gamma^\\delta}{\\begin{pmatrix}a&b\\\\c&d\\end{pmatrix}}\\\\\\int_0^\\infty{x^{2n} e^{-a x^2}\\,dx} = \\frac{2n-1}{2a} \\int_0^\\infty{x^{2(n-1)} e^{-a x^2}\\,dx} = \\frac{(2n-1)!!}{2^{n+1}} \\sqrt{\\frac{\\pi}{a^{2n+1}}}\\\\", "\\int_a^b{f(x)\\,dx} = (b - a) \\sum\\limits_{n = 1}^\\infty  {\\sum\\limits_{m = 1}^{2^n  - 1} {\\left( { - 1} \\right)^{m + 1} } } 2^{ - n} f(a + m\\left( {b - a} \\right)2^{-n} )\\\\"), "\\int_{-\\pi}^{\\pi} \\sin(\\alpha x) \\sin^n(\\beta x) dx = \\textstyle{\\left \\{ \\begin{array}{cc} (-1)^{(n+1)/2} (-1)^m \\frac{2 \\pi}{2^n} \\binom{n}{m} & n \\mbox{ odd},\\ \\alpha = \\beta (2m-n) \\\\ 0 & \\mbox{otherwise} \\\\ \\end{array} \\right .}\\\\"), "L = \\int_a^b \\sqrt{ \\left|\\sum_{i,j=1}^ng_{ij}(\\gamma(t))\\left(\\frac{d}{dt}x^i\\circ\\gamma(t)\\right)\\left(\\frac{d}{dt}x^j\\circ\\gamma(t)\\right)\\right|}\\,dt\\\\"), "\\begin{array}{rl} s &= \\int_a^b\\left\\|\\frac{d}{dt}\\vec{r}\\,(u(t),v(t))\\right\\|\\,dt \\\\ &= \\int_a^b \\sqrt{u'(t)^2\\,\\vec{r}_u\\cdot\\vec{r}_u + 2u'(t)v'(t)\\, \\vec{r}_u\\cdot\\vec{r}_v+ v'(t)^2\\,\\vec{r}_v\\cdot\\vec{r}_v}\\,\\,\\, dt. \\end{array}\\\\") + "\\end{array}");
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public JLatexMathView align(int i10, int i11) {
        this.alignVertical = i10;
        this.alignHorizontal = i11;
        return this;
    }

    public JLatexMathView background(Drawable drawable) {
        this.background = drawable;
        return this;
    }

    public void clear() {
        this.drawable = null;
        requestLayout();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.drawable == null) {
            return;
        }
        int save = canvas.save();
        try {
            float f7 = this.left;
            if (f7 > 0.0f) {
                canvas.translate(f7, 0.0f);
            }
            float f10 = this.top;
            if (f10 > 0.0f) {
                canvas.translate(0.0f, f10);
            }
            float f11 = this.scale;
            if (f11 > 0.0f && Float.compare(f11, 1.0f) != 0) {
                float f12 = this.scale;
                canvas.scale(f12, f12);
            }
            this.drawable.draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th2) {
            canvas.restoreToCount(save);
            throw th2;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.drawable == null) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int intrinsicWidth = this.drawable.getIntrinsicWidth();
        int intrinsicHeight = this.drawable.getIntrinsicHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (1073741824 != mode) {
            int paddingRight = getPaddingRight() + intrinsicWidth + paddingLeft;
            size = size > 0 ? Math.min(size, paddingRight) : paddingRight;
        }
        if (1073741824 != mode2) {
            int paddingBottom = getPaddingBottom() + intrinsicHeight + paddingTop;
            size2 = size2 > 0 ? Math.min(size2, paddingBottom) : paddingBottom;
        }
        int paddingRight2 = (size - paddingLeft) - getPaddingRight();
        int paddingBottom2 = (size2 - paddingTop) - getPaddingBottom();
        float min = (intrinsicWidth >= paddingRight2 || intrinsicHeight >= paddingBottom2) ? Math.min(paddingRight2 / intrinsicWidth, paddingBottom2 / intrinsicHeight) : 1.0f;
        int i12 = (int) ((intrinsicWidth * min) + 0.5f);
        int i13 = (int) ((intrinsicHeight * min) + 0.5f);
        if (1073741824 != mode) {
            size = i12 + paddingLeft + getPaddingRight();
        }
        if (1073741824 != mode2) {
            size2 = i13 + paddingTop + getPaddingBottom();
        }
        float alignment = alignment(this.alignHorizontal, ((size - paddingLeft) - getPaddingRight()) - i12);
        float alignment2 = alignment(this.alignVertical, ((size2 - paddingTop) - getPaddingBottom()) - i13);
        this.scale = min;
        this.left = paddingLeft + alignment;
        this.top = paddingTop + alignment2;
        setMeasuredDimension(size, size2);
    }

    public void setLatex(String str) {
        setLatexDrawable(JLatexMathDrawable.builder(str).textSize(this.textSize).color(this.textColor).background(this.background).fitCanvas(false).build());
    }

    public void setLatexDrawable(JLatexMathDrawable jLatexMathDrawable) {
        this.drawable = jLatexMathDrawable;
        requestLayout();
    }

    public JLatexMathView textColor(int i10) {
        this.textColor = i10;
        return this;
    }

    public JLatexMathView textSize(int i10) {
        this.textSize = i10;
        return this;
    }

    public JLatexMathView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }
}

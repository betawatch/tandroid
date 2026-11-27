// default package

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class rq4 extends FrameLayout implements s84, snb {
    public Runnable E;
    public long F;
    public final pn G;
    public final ArrayList H;
    public final oob I;
    public qq4 J;
    public int K;
    public final fm0 a;
    public final fm0 b;
    public final t84 c;
    public final vnb d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final m7 r;
    public jl0 s;
    public Drawable w;
    public boolean x;
    public boolean y;

    public rq4(Context context, vnb vnbVar) {
        super(context);
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 380L, false);
        this.b = new fm0(1, this, k43Var, 380L, true);
        this.c = new t84(2, this, un.a, 280L);
        this.F = -1L;
        this.G = new pn(null);
        this.H = new ArrayList();
        this.d = vnbVar;
        m7 m7Var = new m7((byte) 3, context, this);
        this.r = m7Var;
        m7Var.setTextSize(1, 15.0f);
        m7Var.setCursorWidth(1.5f);
        m7Var.setInputType(m7Var.getInputType() | jn7.F2);
        m7Var.setSingleLine(true);
        m7Var.setBackground(null);
        m7Var.setVerticalScrollBarEnabled(false);
        m7Var.setHorizontalScrollBarEnabled(false);
        m7Var.setPadding(hl.L(48.0f), 0, hl.L(48.0f), 0);
        m7Var.setClipToPadding(true);
        m7Var.setImeOptions(268435459);
        m7Var.setGravity((ob6.a0 ? 5 : 3) | 16);
        m7Var.addTextChangedListener(new c7(this, (byte) 24));
        if (Build.VERSION.SDK_INT >= 35) {
            m7Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(m7Var, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new mh3(this, (byte) 20));
        addView(imageView2, tre.d(24, 24.0f, (ob6.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        oob oobVar = new oob((byte) 7, getContext(), this);
        this.I = oobVar;
        oobVar.setOrientation(0);
        oobVar.setVisibility(0);
        addView(oobVar, tre.d(-2, 32.0f, (ob6.a0 ? (byte) 5 : (byte) 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        c();
        updateColors();
    }

    public final void a(s7 s7Var) {
        this.h.addView(s7Var);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.Pi));
    }

    public final void b() {
        boolean z = this.n || this.r.length() > 0;
        long j = this.F;
        fm0 fm0Var = this.a;
        if (j > 0 && z != fm0Var.f) {
            if (z) {
                j = 380;
            }
            fm0Var.d = j;
            t84 t84Var = fm0Var.h;
            if (t84Var != null) {
                t84Var.d = j;
            }
            k43 k43Var = z ? k43.h : k43.g;
            fm0Var.c = k43Var;
            if (t84Var != null) {
                t84Var.c = k43Var;
            }
        }
        fm0Var.a(z, true);
    }

    public final void c() {
        int max = Math.max(hl.L(6.0f) + ((int) this.c.f), hl.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + hl.L(48.0f);
        if (!ob6.a0) {
            measuredWidth = max;
            max = measuredWidth;
        }
        Rect rect = hl.Q;
        m7 m7Var = this.r;
        rect.set(measuredWidth, 0, m7Var.getMeasuredWidth() - max, m7Var.getMeasuredHeight());
        m7Var.setClipBounds(rect);
        m7Var.setPadding(measuredWidth, 0, max, 0);
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                f();
                return;
            }
            if (((ph4) arrayList.get(i)).h) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.w.draw(canvas);
        }
        jl0 jl0Var = this.s;
        if (jl0Var != null) {
            jl0Var.setBounds(getPaddingLeft() - hl.L(4.0f), getPaddingTop() - hl.L(4.0f), hl.L(4.0f) + (getWidth() - getPaddingRight()), hl.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean e() {
        ArrayList arrayList = this.H;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((ph4) arrayList.get(i)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        ArrayList arrayList = this.H;
        boolean isEmpty = arrayList.isEmpty();
        byte b = 1;
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new i7(b).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) k43.g);
        transitionSet.addListener((Transition.TransitionListener) new j7(this, b));
        oob oobVar = this.I;
        TransitionManager.beginDelayedTransition(oobVar, transitionSet);
        int i = 0;
        while (i < oobVar.getChildCount()) {
            if (!arrayList2.remove(((r7) oobVar.getChildAt(i)).getFilter())) {
                oobVar.removeViewAt(i);
                i--;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ph4 ph4Var = (ph4) arrayList2.get(i2);
            ph4Var.getClass();
            r7 r7Var = new r7(getContext(), this.d);
            r7Var.r = true;
            r7Var.updateColors();
            r7Var.setData(ph4Var);
            r7Var.setOnClickListener(new je3(this, r7Var, (byte) 14));
            boolean z = ob6.a0;
            oobVar.addView(r7Var, tre.t(-2, -1, 0, z ? 6 : 0, 0, z ? 0 : 6, 0));
        }
        int i3 = 0;
        while (i3 < oobVar.getChildCount()) {
            ((r7) oobVar.getChildAt(i3)).setExpanded(i3 == this.K);
            i3++;
        }
        oobVar.setTag(!isEmpty ? 1 : null);
    }

    public final void g(ph4 ph4Var) {
        bj3 bj3Var;
        if (ph4Var.h) {
            this.H.remove(ph4Var);
            int i = this.K;
            if (i < 0 || i > r0.size() - 1) {
                this.K = r0.size() - 1;
            }
            f();
            qq4 qq4Var = this.J;
            if (qq4Var == null || (bj3Var = ((xi3) qq4Var).a.D0) == null) {
                return;
            }
            bj3Var.S(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c();
    }

    public void setBlurredBackgroundVisibility(float f) {
        boolean z;
        int i;
        int i2 = (int) (f * 255.0f);
        jl0 jl0Var = this.s;
        boolean z2 = true;
        if (jl0Var == null || jl0Var.c == i2) {
            z = false;
        } else {
            jl0Var.setAlpha(i2);
            z = true;
        }
        Drawable drawable = this.w;
        if (drawable == null || drawable.getAlpha() == (i = 255 - i2)) {
            z2 = z;
        } else {
            this.w.setAlpha(i);
        }
        if (z2) {
            invalidate();
        }
    }

    public void setCloseButtonHideDuration(long j) {
        this.F = j;
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setCloseButtonVisible(boolean z) {
        this.n = z;
        b();
    }

    public void setSearchFiltersListener(qq4 qq4Var) {
        this.J = qq4Var;
    }

    public void setupBlurredBackground(jl0 jl0Var) {
        ik8.r(jl0Var, hl.L(20.0f), 4.0f);
        this.s = jl0Var;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            ImageView imageView = this.f;
            zp4.d(imageView, f);
            imageView.setRotation((1.0f - f) * 90.0f);
        } else if (i == 1) {
            zp4.d(this.e, f);
        } else if (i == 2) {
            c();
        }
    }

    @Override // snb
    public final void updateColors() {
        int p1;
        Drawable b0;
        vnb vnbVar = this.d;
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        if (this.x) {
            b0 = aob.d0(hl.L(20.0f), aob.v0(aob.d6, vnbVar));
        } else {
            int L = hl.L(20.0f);
            if (this.y) {
                p1 = aob.v0(aob.d6, vnbVar);
            } else {
                p1 = aob.p1(a ? 0.07f : 0.05f, aob.v0(aob.G6, vnbVar));
            }
            b0 = aob.b0(L, p1);
        }
        this.w = b0;
        int i = aob.G6;
        int p12 = aob.p1(0.6f, aob.v0(i, vnbVar));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(p12, mode);
        int p13 = aob.p1(0.6f, aob.v0(i, vnbVar));
        ImageView imageView = this.f;
        imageView.setColorFilter(p13, mode);
        imageView.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), 1, hl.L(17.0f)));
        int p14 = aob.p1(0.5f, aob.v0(i, vnbVar));
        m7 m7Var = this.r;
        m7Var.setHintTextColor(p14);
        m7Var.setTextColor(aob.v0(i, vnbVar));
        m7Var.setCursorColor(aob.v0(aob.Pi, vnbVar));
        jl0 jl0Var = this.s;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.getIconView() != null) {
                    s7Var.getIconView().setColorFilter(aob.p1(0.6f, aob.v0(aob.G6, vnbVar)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), 1, hl.L(17.0f)));
            }
        }
        oob oobVar = this.I;
        int childCount2 = oobVar.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            if (oobVar.getChildAt(i3) instanceof r7) {
                ((r7) oobVar.getChildAt(i3)).updateColors();
            }
        }
        invalidate();
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}

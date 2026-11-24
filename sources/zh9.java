// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class zh9 extends jd9 implements vlb, fkb, td9 {
    public static Paint n0;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public final boolean I;
    public final nz4 J;
    public final jk2 K;
    public final ArrayList L;
    public final HashMap M;
    public qna N;
    public vg9 O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final ln V;
    public int W;
    public int a0;
    public float b0;
    public boolean c0;
    public float d0;
    public float e0;
    public int f0;
    public int g0;
    public int h0;
    public VelocityTracker i0;
    public ValueAnimator j0;
    public final ArrayList k0;
    public int l0;
    public final Path m0;
    public final ylb n;
    public final Paint r;
    public final Paint s;
    public final sd9 w;
    public final ImageView x;
    public final ImageView y;

    public zh9(Context context, ylb ylbVar) {
        super(context);
        byte b = 1;
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 31 && gda.f();
        this.I = z;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.U = -1;
        this.V = new ln(this, 0L, 320L, d53.h);
        this.k0 = new ArrayList();
        this.l0 = anb.b;
        this.m0 = new Path();
        this.n = ylbVar;
        setWillNotDraw(false);
        f(0, gm.L(6.0f), 0, gm.L(4.0f));
        sd9 sd9Var = new sd9(context, ylbVar, new cf9(this, (byte) 1));
        this.w = sd9Var;
        addView(sd9Var.a, qoe.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z && i >= 31) {
            nz4 nz4Var = new nz4(new kz4());
            this.J = nz4Var;
            nz4Var.l(gm.L(24.0f));
            this.K = new jk2((byte) 25);
        }
        ImageView g = g();
        this.x = g;
        g.setImageResource(R.drawable.iv_media_add);
        addView(g, qoe.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g.setOnClickListener(new wh9(this, b));
        ImageView g2 = g();
        this.y = g2;
        g2.setVisibility(8);
        addView(g2, qoe.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g2.setOnClickListener(new wh9(this, (byte) 2));
        updateColors();
    }

    private qna getSpoilerEffect() {
        qna qnaVar = null;
        if (this.P) {
            qna qnaVar2 = this.N;
            if (qnaVar2 == null || !qnaVar2.i) {
                qnaVar = qnaVar2;
            } else {
                this.N = null;
            }
            if (qnaVar == null) {
                qna e = qna.e(this);
                this.N = e;
                return e;
            }
        }
        return qnaVar;
    }

    private void settle(float f) {
        int i;
        int size = this.E.size();
        if (f >= 0.0f || this.a0 >= size - 1) {
            i = -1;
            if (f <= 0.0f || this.a0 <= 0) {
                float f2 = this.b0;
                if (f2 <= 0.5f || this.a0 >= size - 1) {
                    if (f2 >= -0.5f || this.a0 <= 0) {
                        i = 0;
                    }
                }
            }
            int i2 = i + this.a0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, i2 - r7);
            this.j0 = ofFloat;
            ofFloat.setDuration(220L);
            this.j0.setInterpolator(d53.h);
            this.j0.addUpdateListener(new p29(this, (byte) 3));
            this.j0.addListener(new co(this, i2, (byte) 10));
            this.j0.start();
        }
        i = 1;
        int i22 = i + this.a0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b0, i22 - r7);
        this.j0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.j0.setInterpolator(d53.h);
        this.j0.addUpdateListener(new p29(this, (byte) 3));
        this.j0.addListener(new co(this, i22, (byte) 10));
        this.j0.start();
    }

    @Override // td9
    public final boolean a(int i, int i2) {
        return this.w.f(i, i2);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.we));
        hashSet.add(Integer.valueOf(cmb.kg));
    }

    @Override // td9
    public final void b() {
        this.w.i();
    }

    @Override // jd9
    public final int d() {
        return gm.L(16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.k0;
        ylb ylbVar = this.n;
        int i = this.l0;
        int i2 = anb.b;
        if (i != i2) {
            this.l0 = i2;
            try {
                int v0 = cmb.v0(cmb.c6, ylbVar);
                if (getBackground() instanceof gf9) {
                    ((gf9) getBackground()).a(v0);
                }
                int v = cmb.v(v0, cmb.v0(cmb.h6, ylbVar));
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Drawable drawable = (Drawable) arrayList.get(i3);
                    if (drawable instanceof RippleDrawable) {
                        RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                        if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                            ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                            if (shapeDrawable.getPaint().getColor() != v0) {
                                shapeDrawable.getPaint().setColor(v0);
                                rippleDrawable.setColor(ColorStateList.valueOf(v));
                                rippleDrawable.invalidateSelf();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        super.dispatchDraw(canvas);
        this.w.c(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.F.contains(view)) {
            ll0 ll0Var = this.a;
            if ((ll0Var == null ? 0 : ll0Var.k.size()) > 0) {
                canvas.save();
                Path path = this.m0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.Q, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final ImageView g() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (!this.I || Build.VERSION.SDK_INT < 31) {
            int i = cmb.F6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ylb ylbVar = this.n;
            anb.s(imageView, i, ylbVar, mode);
            int i2 = cmb.c6;
            fg0 Z = cmb.Z(cmb.v0(i2, ylbVar), cmb.v(cmb.v0(i2, ylbVar), cmb.v0(cmb.h6, ylbVar)), 20, 20);
            this.k0.add(Z);
            imageView.setBackground(new if9(Z));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            nz4 nz4Var = this.J;
            im0 im0Var = new im0(nz4Var, nz4Var, nz4Var);
            im0Var.p(this.K);
            im0Var.r(gm.L(16.0f));
            this.M.put(imageView, im0Var);
        }
        rve.a(imageView);
        this.L.add(imageView);
        return imageView;
    }

    @Override // td9
    public ne9 getCaptionEditText() {
        return this.w.a;
    }

    @Override // td9
    public ll0 getRow() {
        return this.a;
    }

    public final void h(Canvas canvas, ImageView imageView) {
        im0 im0Var;
        if (imageView.getVisibility() != 0 || (im0Var = (im0) this.M.get(imageView)) == null) {
            return;
        }
        im0Var.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        im0Var.setAlpha((int) (imageView.getAlpha() * 255.0f));
        gm0 gm0Var = im0Var.h0;
        if (gm0Var != null) {
            gm0Var.h = true;
        }
        im0Var.draw(canvas);
    }

    public final void j(Canvas canvas) {
        char c;
        int i;
        ArrayList arrayList;
        in5 in5Var;
        int i2;
        zh9 zh9Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = zh9Var.getPaddingTop();
        int paddingLeft = zh9Var.getPaddingLeft();
        int i3 = 0;
        int max = Math.max(0, (zh9Var.getWidth() - paddingLeft) - zh9Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        ll0 ll0Var = zh9Var.a;
        if ((ll0Var == null ? 0 : ll0Var.k.size()) > 0) {
            Path path = zh9Var.m0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, zh9Var.Q + paddingTop, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, zh9Var.Q + paddingTop);
        }
        boolean n = zh9Var.n();
        char c2 = 2;
        int i4 = 1;
        ArrayList arrayList2 = zh9Var.E;
        boolean z = n && arrayList2.size() >= 2;
        ll0 ll0Var2 = zh9Var.a;
        int L = (ll0Var2 == null ? 0 : ll0Var2.k.size()) > 0 ? gm.L(8.0f) : 0;
        Paint paint = zh9Var.r;
        if (z && (((i2 = zh9Var.a0) == 0 && zh9Var.b0 < 0.0f) || (i2 == arrayList2.size() - 1 && zh9Var.b0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, zh9Var.Q + paddingTop, paint);
        }
        int size = arrayList2.size();
        in5 in5Var2 = null;
        ArrayList arrayList3 = zh9Var.H;
        if (size == 1 && arrayList3.size() == 1) {
            RectF rectF = (RectF) arrayList3.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = gm.P;
                rectF2.set(0.0f, paddingTop, max, paddingTop + zh9Var.Q);
                ci9 ci9Var = (ci9) arrayList2.get(0);
                ImageReceiver imageReceiver = ci9Var.b;
                if (ci9Var.b()) {
                    imageReceiver.k0(rectF2);
                    imageReceiver.setAlpha(ci9Var.a.i1);
                    imageReceiver.h(canvas2, null);
                }
            }
        }
        int i5 = 0;
        while (i5 < arrayList2.size() && i5 < arrayList3.size()) {
            ci9 ci9Var2 = (ci9) arrayList2.get(i5);
            RectF rectF3 = (RectF) arrayList3.get(i5);
            if (z) {
                int i6 = i5 == 0 ? L : i3;
                int i7 = i5 == arrayList2.size() - i4 ? L : i3;
                int i8 = i5 == arrayList2.size() - i4 ? L : i3;
                c = c2;
                int i9 = i5 == 0 ? L : i3;
                ci9Var2.a.r0(i6, i7, i8, i9);
                ci9Var2.b.r0(i6, i7, i8, i9);
            } else {
                c = c2;
                ci9Var2.a.r0(i3, i3, i3, i3);
                ci9Var2.b.r0(i3, i3, i3, i3);
            }
            boolean c3 = ci9Var2.c();
            ImageReceiver imageReceiver2 = ci9Var2.a;
            if (!c3) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.i0(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (ci9Var2.c()) {
                imageReceiver2.h(canvas2, in5Var2);
            }
            RadialProgress2 radialProgress2 = ci9Var2.d;
            i07 i07Var = ci9Var2.e;
            if (i07Var == null || !i07Var.a()) {
                i = 1;
            } else {
                int L2 = gm.L(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i10 = L2 / 2;
                radialProgress2.p(round - i10, round2 - i10, round + i10, round2 + i10);
                i = 1;
                radialProgress2.o(true, ci9Var2.e.f);
                radialProgress2.draw(canvas2);
            }
            i07 i07Var2 = ci9Var2.e;
            if (i07Var2 != null && i07Var2.n && ci9Var2.c()) {
                qna spoilerEffect = zh9Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = ci9Var2.b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (ci9Var2.b()) {
                    imageReceiver3.k0(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.i1);
                    in5Var = null;
                    imageReceiver3.h(canvas2, null);
                } else {
                    in5Var = null;
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    arrayList = arrayList3;
                    spoilerEffect.c(canvas2, zh9Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.i1, false);
                } else {
                    arrayList = arrayList3;
                }
                canvas.restore();
            } else {
                arrayList = arrayList3;
                in5Var = null;
            }
            i5++;
            zh9Var = this;
            canvas2 = canvas;
            arrayList3 = arrayList;
            i4 = i;
            in5Var2 = in5Var;
            c2 = c;
            i3 = 0;
        }
        canvas.restore();
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        this.w.e(arrayList);
    }

    public final void m(int i) {
        if (this.O == null || this.a == null) {
            return;
        }
        List o = o();
        if (o.isEmpty() || (o.size() == 1 && ((i07) o.get(0)).a == 0)) {
            vg9 vg9Var = this.O;
            ll0 ll0Var = this.a;
            ch9 ch9Var = vg9Var.a;
            ch9Var.j4 = ll0Var;
            ch9Var.p3.c(0);
            return;
        }
        if (i < 0 || i >= o.size() || !((i07) o.get(i)).a()) {
            return;
        }
        vg9 vg9Var2 = this.O;
        vg9Var2.a.n2(this.a, (i07) o.get(i));
    }

    public final boolean n() {
        ll0 ll0Var = this.a;
        return ll0Var != null && (ll0Var.b instanceof TL_iv.pageBlockSlideshow);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List o() {
        boolean z;
        ll0 ll0Var = this.a;
        if (ll0Var == null) {
            return Collections.EMPTY_LIST;
        }
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                z = true;
                if (z) {
                    i07 i07Var = ll0Var.g;
                    return i07Var != null ? Collections.singletonList(i07Var) : Collections.EMPTY_LIST;
                }
                ArrayList arrayList = ll0Var.h;
                return arrayList != null ? arrayList : Collections.EMPTY_LIST;
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                return;
            }
            ci9 ci9Var = (ci9) arrayList.get(i);
            ci9Var.a.I();
            ci9Var.b.I();
            ci9Var.a();
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.P = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.i0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.i0 = null;
        }
        this.c0 = false;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                break;
            }
            ci9 ci9Var = (ci9) arrayList.get(i);
            ci9Var.a.K();
            ci9Var.b.K();
            ci9Var.c = null;
            i++;
        }
        qna qnaVar = this.N;
        if (qnaVar != null) {
            qnaVar.b(this);
            this.N = null;
        }
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        nz4 nz4Var;
        ImageView imageView;
        ImageView imageView2;
        gkb textSelectionHelper;
        float f;
        float f2;
        float i;
        int paddingTop = getPaddingTop();
        j(canvas);
        ln lnVar = this.V;
        float f3 = lnVar.c;
        ArrayList arrayList = this.E;
        if (arrayList.size() >= 2 && f3 > 0.001f) {
            if (n0 == null) {
                Paint paint = new Paint(1);
                n0 = paint;
                paint.setColor(-1);
                n0.setShadowLayer(gm.N(3.0f), 0.0f, gm.N(1.0f), TLObject.FLAG_31);
            }
            int size = arrayList.size();
            float L = gm.L(5.0f) + ((getPaddingTop() + this.Q) - gm.L(23.0f));
            int L2 = gm.L(4.0f) + hg9.y(6.0f, size - 1, gm.L(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f4 = this.a0 + this.b0;
            if (L2 < max) {
                i = ((max - L2) / 2.0f) + paddingLeft;
                f = 23.0f;
                f2 = 4.0f;
            } else {
                float L3 = gm.L(4.0f) + paddingLeft;
                int L4 = gm.L(13.0f);
                f = 23.0f;
                f2 = 4.0f;
                i = L3 - (Utilities.i(f4 - (((max - gm.L(8.0f)) / 2) / L4), Math.max(0, (size - (r12 << 1)) - 1), 0.0f) * L4);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.Q) - gm.L(f), max + paddingLeft, getPaddingTop() + this.Q);
            for (int i2 = 0; i2 < size; i2++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i2 - f4));
                n0.setAlpha((int) mlb.A(max2, 95.0f, 160.0f, f3));
                canvas.drawCircle(gm.L(f2) + i + (gm.L(13.0f) * i2), L, (gm.L(1.0f) * max2) + gm.L(2.0f), n0);
            }
            canvas.restore();
        }
        vg9 vg9Var = this.O;
        if (vg9Var != null && (textSelectionHelper = vg9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.Q, this.s);
            }
        }
        if (this.I && (nz4Var = this.J) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !nz4Var.r) {
                    try {
                        j(nz4Var.i(width, height));
                    } finally {
                        nz4Var.j();
                    }
                }
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = this.L;
                    int size2 = arrayList2.size();
                    imageView = this.y;
                    imageView2 = this.x;
                    if (i3 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i3);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        h(canvas, imageView3);
                    }
                    i3++;
                }
                h(canvas, imageView);
                h(canvas, imageView2);
            }
        }
        if (lnVar.i) {
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = i3 - i;
        int max = Math.max(0, (i5 - paddingLeft) - paddingRight);
        int i6 = i5 - paddingRight;
        int L = uue.b(this.a) > 0 ? gm.L(16.0f) : 0;
        this.w.g(paddingLeft - L, paddingRight - L, i5, getPaddingTop() + this.Q);
        int L2 = gm.L(6.0f);
        int i7 = i6 - L2;
        ImageView imageView = this.x;
        imageView.layout(i7 - imageView.getMeasuredWidth(), getPaddingTop() + L2, i7, imageView.getMeasuredHeight() + getPaddingTop() + L2);
        int i8 = i7 - L2;
        int measuredWidth = i8 - imageView.getMeasuredWidth();
        ImageView imageView2 = this.y;
        imageView2.layout(measuredWidth - imageView2.getMeasuredWidth(), getPaddingTop() + L2, i8 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + L2);
        List o = o();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i9 >= arrayList.size()) {
                return;
            }
            ImageView imageView3 = (ImageView) arrayList.get(i9);
            if (i9 < o.size() && ((i07) o.get(i9)).a != 0) {
                ArrayList arrayList2 = this.H;
                if (i9 < arrayList2.size()) {
                    RectF rectF = (RectF) arrayList2.get(i9);
                    if (rectF.right <= 0.0f || rectF.left >= max || rectF.bottom <= getPaddingTop() || rectF.top >= getPaddingTop() + this.Q) {
                        imageView3.setVisibility(8);
                    } else {
                        int i10 = ((int) rectF.left) + L2 + paddingLeft;
                        int i11 = ((int) rectF.top) + L2;
                        imageView3.layout(i10, i11, imageView3.getMeasuredWidth() + i10, imageView3.getMeasuredHeight() + i11);
                        float f = 1.0f;
                        if (this.I) {
                            int left = (imageView2.getVisibility() == 0 ? imageView2.getLeft() : imageView.getLeft()) - gm.L(4.0f);
                            if (imageView3.getMeasuredWidth() + i10 > left) {
                                f = aq1.x(r9 - left, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
                            }
                        }
                        imageView3.setAlpha(f);
                        imageView3.setVisibility(f > 0.01f ? 0 : 8);
                    }
                    i9++;
                }
            }
            imageView3.setVisibility(8);
            i9++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03ec A[LOOP:1: B:24:0x03e4->B:26:0x03ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0408 A[EDGE_INSN: B:27:0x0408->B:28:0x0408 BREAK  A[LOOP:1: B:24:0x03e4->B:26:0x03ec], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x039a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        c47[] c47VarArr;
        int round;
        int i10;
        c47[] c47VarArr2;
        int i11;
        float[] fArr;
        int i12;
        i07 i07Var;
        int i13;
        int i14;
        i07 i07Var2;
        int i15;
        int i16;
        int L;
        int i17;
        int i18;
        int size;
        int i19;
        ArrayList arrayList;
        int size2 = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size2 - paddingLeft) - paddingRight);
        float f = n() ? 1.0f : 0.0f;
        ln lnVar = this.V;
        float e = lnVar.e(false, f);
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        int paddingTop = getPaddingTop();
        ArrayList arrayList3 = this.E;
        int size3 = arrayList3.size();
        int i20 = 1;
        if (size3 == 0) {
            i6 = (gm.L(200.0f) - getPaddingTop()) - getPaddingBottom();
            this.T = i6;
            this.R = i6;
            this.S = max;
            i4 = paddingLeft;
            i5 = paddingRight;
        } else {
            if (size3 != 1) {
                float[] fArr2 = new float[size3];
                int i21 = 0;
                while (i21 < size3) {
                    ci9 ci9Var = (ci9) arrayList3.get(i21);
                    i07 i07Var3 = ci9Var.e;
                    if (i07Var3 == null) {
                        i12 = i20;
                        i07Var = i07Var3;
                        i13 = 0;
                    } else {
                        boolean d = ci9Var.d();
                        i12 = i20;
                        i07Var = ci9Var.e;
                        i13 = d ? i07Var.k : i07Var.j;
                    }
                    if (i07Var == null) {
                        i14 = 0;
                    } else {
                        boolean d2 = ci9Var.d();
                        i07 i07Var4 = ci9Var.e;
                        i14 = d2 ? i07Var4.j : i07Var4.k;
                    }
                    fArr2[i21] = (i13 <= 0 || i14 <= 0) ? 1.0f : i13 / i14;
                    i21++;
                    i20 = i12;
                }
                i3 = i20;
                c47[] e2 = uj9.e(fArr2);
                int i22 = 0;
                for (c47 c47Var : e2) {
                    i22 = Math.max(i22, (int) c47Var.d);
                }
                int i23 = i22 + 1;
                float[] fArr3 = new float[i23];
                int length = e2.length;
                i4 = paddingLeft;
                int i24 = 0;
                while (i24 < length) {
                    int i25 = i24;
                    c47 c47Var2 = e2[i25];
                    int i26 = paddingRight;
                    byte b = c47Var2.c;
                    int i27 = i23;
                    if (b == c47Var2.d) {
                        fArr3[b] = Math.max(fArr3[b], c47Var2.f);
                    }
                    i24 = i25 + 1;
                    paddingRight = i26;
                    i23 = i27;
                }
                i5 = paddingRight;
                int i28 = i23;
                int length2 = e2.length;
                int i29 = 0;
                while (i29 < length2) {
                    c47 c47Var3 = e2[i29];
                    int i30 = c47Var3.c;
                    int i31 = length2;
                    byte b2 = c47Var3.d;
                    if (i30 != b2) {
                        int i32 = (b2 - i30) + 1;
                        i11 = i29;
                        float[] fArr4 = c47Var3.m;
                        if (fArr4 == null || fArr4.length != i32) {
                            fArr = fArr3;
                            float f2 = c47Var3.f / i32;
                            while (i30 <= c47Var3.d) {
                                fArr[i30] = Math.max(fArr[i30], f2);
                                i30++;
                            }
                            i29 = i11 + 1;
                            length2 = i31;
                            fArr3 = fArr;
                        } else {
                            int i33 = 0;
                            while (i33 < i32) {
                                int i34 = c47Var3.c + i33;
                                int i35 = i33;
                                float[] fArr5 = fArr3;
                                fArr5[i34] = Math.max(fArr3[i34], c47Var3.m[i35]);
                                i33 = i35 + 1;
                                fArr3 = fArr5;
                            }
                        }
                    } else {
                        i11 = i29;
                    }
                    fArr = fArr3;
                    i29 = i11 + 1;
                    length2 = i31;
                    fArr3 = fArr;
                }
                float[] fArr6 = fArr3;
                Point point = gm.q;
                float max2 = Math.max(point.x, point.y) * 0.5f;
                int[] iArr = new int[i22 + 2];
                float f3 = 0.0f;
                for (int i36 = 0; i36 <= i22; i36++) {
                    iArr[i36] = Math.round(f3 * max2);
                    f3 += fArr6[i36];
                }
                iArr[i28] = Math.round(f3 * max2);
                int L2 = gm.L(2.0f);
                int i37 = 0;
                while (i37 < e2.length) {
                    c47 c47Var4 = e2[i37];
                    int i38 = iArr[c47Var4.c];
                    int i39 = iArr[c47Var4.d + 1] - i38;
                    int i40 = L2;
                    if (c47Var4.j > 0) {
                        round = Math.round((r2 * max) / 1000.0f);
                        i9 = i39;
                        c47VarArr = e2;
                    } else {
                        i9 = i39;
                        int i41 = 0;
                        int i42 = 0;
                        while (i41 < e2.length) {
                            if (i41 == i37) {
                                i10 = i41;
                                c47VarArr2 = e2;
                            } else {
                                c47 c47Var5 = e2[i41];
                                i10 = i41;
                                byte b3 = c47Var5.c;
                                c47VarArr2 = e2;
                                byte b4 = c47Var4.c;
                                if (b3 <= b4 && c47Var5.d >= b4 && c47Var5.a < c47Var4.a) {
                                    i42 += c47Var5.e;
                                }
                            }
                            i41 = i10 + 1;
                            e2 = c47VarArr2;
                        }
                        c47VarArr = e2;
                        round = Math.round((i42 * max) / 1000.0f);
                    }
                    arrayList2.add(new RectF(round, i38 + paddingTop, Math.max(0, (c47Var4.l & 2) != 0 ? max - round : Math.round((c47Var4.e * max) / 1000.0f) - i40) + round, Math.max(0, (c47Var4.l & 8) == 0 ? i9 - i40 : i9) + r15));
                    i37++;
                    L2 = i40;
                    iArr = iArr;
                    e2 = c47VarArr;
                }
                this.R = iArr[i28];
                this.S = max;
                float f4 = 0.0f;
                for (int i43 = 0; i43 < size3; i43++) {
                    ci9 ci9Var2 = (ci9) arrayList3.get(i43);
                    i07 i07Var5 = ci9Var2.e;
                    if (i07Var5 == null) {
                        i7 = 0;
                    } else {
                        boolean d3 = ci9Var2.d();
                        i07 i07Var6 = ci9Var2.e;
                        i7 = d3 ? i07Var6.k : i07Var6.j;
                        i07Var5 = i07Var6;
                    }
                    if (i07Var5 == null) {
                        i8 = 0;
                    } else {
                        boolean d4 = ci9Var2.d();
                        i07 i07Var7 = ci9Var2.e;
                        i8 = d4 ? i07Var7.j : i07Var7.k;
                    }
                    f4 = ((i7 <= 0 || i8 <= 0) ? 1.0f : i7 / i8) + f4;
                }
                int max3 = (int) (this.S / Math.max(0.5f, f4 / size3));
                Point point2 = gm.q;
                int max4 = (int) (Math.max(point2.x, point2.y) * 0.55f);
                i6 = max3 > max4 ? max4 : max3;
                this.T = i6;
                this.Q = Math.round(gm.U1(e, this.R, i6));
                ArrayList arrayList4 = this.H;
                arrayList4.clear();
                size = arrayList3.size();
                if (size != 0) {
                    int paddingTop2 = getPaddingTop();
                    if (size == i3) {
                        arrayList4.add(new RectF((RectF) arrayList2.get(0)));
                    } else {
                        float f5 = (-this.b0) * this.S;
                        int i44 = 0;
                        while (i44 < size && i44 < arrayList2.size()) {
                            RectF rectF = (RectF) arrayList2.get(i44);
                            float f6 = ((i44 - this.a0) * this.S) + f5;
                            arrayList4.add(new RectF(gm.R1(rectF.left, f6, e), gm.R1(rectF.top, paddingTop2, e), gm.R1(rectF.right, f6 + this.S, e), gm.R1(rectF.bottom, this.T + paddingTop2, e)));
                            i44++;
                            size = size;
                        }
                    }
                }
                int L3 = uue.b(this.a) <= 0 ? gm.L(16.0f) : 0;
                setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.Q + this.w.h(i4 - L3, i5 - L3, size2));
                this.x.measure(View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30));
                this.y.measure(View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30));
                i19 = 0;
                while (true) {
                    arrayList = this.F;
                    if (i19 < arrayList.size()) {
                        break;
                    }
                    ((ImageView) arrayList.get(i19)).measure(View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30));
                    i19++;
                }
                if (lnVar.i) {
                    return;
                }
                requestLayout();
                return;
            }
            ci9 ci9Var3 = (ci9) arrayList3.get(0);
            i07 i07Var8 = ci9Var3.e;
            if (i07Var8 == null) {
                i07Var2 = i07Var8;
                i15 = 0;
            } else {
                boolean d5 = ci9Var3.d();
                i07Var2 = ci9Var3.e;
                i15 = d5 ? i07Var2.k : i07Var2.j;
            }
            if (i07Var2 == null) {
                i16 = 0;
            } else {
                boolean d6 = ci9Var3.d();
                i07 i07Var9 = ci9Var3.e;
                i16 = d6 ? i07Var9.j : i07Var9.k;
            }
            if (i15 <= 0 || i16 <= 0) {
                L = (gm.L(200.0f) - getPaddingTop()) - getPaddingBottom();
                i17 = max;
            } else {
                i18 = (int) ((max / Math.max(1, i15)) * i16);
                Point point3 = gm.q;
                L = (int) (Math.max(point3.x, point3.y) * 0.55f);
                if (i18 > L) {
                    i17 = (int) ((L / Math.max(1, i16)) * i15);
                } else {
                    i17 = max;
                    arrayList2.add(new RectF((max - i17) / 2, paddingTop, r4 + i17, paddingTop + i18));
                    this.R = i18;
                    this.S = i17;
                    this.T = i18;
                    i4 = paddingLeft;
                    i5 = paddingRight;
                    i6 = i18;
                }
            }
            i18 = L;
            arrayList2.add(new RectF((max - i17) / 2, paddingTop, r4 + i17, paddingTop + i18));
            this.R = i18;
            this.S = i17;
            this.T = i18;
            i4 = paddingLeft;
            i5 = paddingRight;
            i6 = i18;
        }
        i3 = 1;
        this.Q = Math.round(gm.U1(e, this.R, i6));
        ArrayList arrayList42 = this.H;
        arrayList42.clear();
        size = arrayList3.size();
        if (size != 0) {
        }
        if (uue.b(this.a) <= 0) {
        }
        setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.Q + this.w.h(i4 - L3, i5 - L3, size2));
        this.x.measure(View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30));
        this.y.measure(View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30));
        i19 = 0;
        while (true) {
            arrayList = this.F;
            if (i19 < arrayList.size()) {
            }
            ((ImageView) arrayList.get(i19)).measure(View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30));
            i19++;
        }
        if (lnVar.i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f4, code lost:
    
        if (r2 == 3) goto L70;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        boolean z = y >= ((float) getPaddingTop()) && y < ((float) (getPaddingTop() + this.Q));
        int i2 = -1;
        if (n() && !this.V.i) {
            ArrayList arrayList = this.E;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f0 = viewConfiguration.getScaledTouchSlop();
                        this.g0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.h0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.d0 = x;
                    this.e0 = y;
                    this.c0 = false;
                    VelocityTracker velocityTracker = this.i0;
                    if (velocityTracker == null) {
                        this.i0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.i0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.j0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.j0 = null;
                    }
                    this.U = this.a0;
                    return true;
                }
                float f = 0.0f;
                if (actionMasked != 2) {
                    if (actionMasked == 1) {
                        VelocityTracker velocityTracker2 = this.i0;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                            this.i0.computeCurrentVelocity(1000, this.h0);
                            float xVelocity = this.i0.getXVelocity();
                            float yVelocity = this.i0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.g0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f = xVelocity;
                            }
                        }
                    }
                    VelocityTracker velocityTracker3 = this.i0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.i0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.c0) {
                        this.c0 = false;
                        settle(f);
                    } else if (actionMasked == 1) {
                        int i3 = this.U;
                        int i4 = this.a0;
                        if (i3 == i4) {
                            m(i4);
                        }
                    }
                    this.U = -1;
                    return true;
                }
                VelocityTracker velocityTracker4 = this.i0;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                float f2 = x - this.d0;
                float f3 = y - this.e0;
                if (!this.c0 && Math.abs(f2) > this.f0 && Math.abs(f2) > Math.abs(f3)) {
                    this.c0 = true;
                    this.U = -1;
                }
                if (this.c0) {
                    float f4 = (-f2) / this.S;
                    int i5 = this.a0;
                    if (i5 == 0 && f4 < 0.0f) {
                        f4 *= 0.3f;
                    }
                    if (i5 == arrayList.size() - 1 && f4 > 0.0f) {
                        f4 *= 0.3f;
                    }
                    this.b0 = f4;
                    requestLayout();
                    invalidate();
                    return true;
                }
            }
        }
        ArrayList arrayList2 = this.H;
        if (actionMasked == 0) {
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i >= arrayList2.size()) {
                    break;
                }
                if (((RectF) arrayList2.get(i)).contains(x, y)) {
                    i2 = i;
                    break;
                }
                i++;
            }
            this.U = i2;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.U = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (z) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList2.size()) {
                    i6 = -1;
                    break;
                }
                if (((RectF) arrayList2.get(i6)).contains(x, y)) {
                    break;
                }
                i6++;
            }
            int i7 = this.U;
            if (i6 == i7) {
                m(i7);
            }
        }
        boolean z2 = this.U != -1 || z;
        this.U = -1;
        return z2 || super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List o = o();
        while (true) {
            arrayList = this.E;
            if (arrayList.size() >= o.size()) {
                break;
            }
            ci9 ci9Var = new ci9(this, this.n);
            if (this.P) {
                ci9Var.a.I();
                ci9Var.b.I();
                ci9Var.a();
            }
            arrayList.add(ci9Var);
        }
        while (arrayList.size() > o.size()) {
            ci9 ci9Var2 = (ci9) td4.m(1, arrayList);
            ci9Var2.a.K();
            ci9Var2.b.K();
            ci9Var2.c = null;
        }
        Object[] objArr = 0;
        for (int i = 0; i < o.size(); i++) {
            ci9 ci9Var3 = (ci9) arrayList.get(i);
            ci9Var3.e = (i07) o.get(i);
            ci9Var3.a();
        }
        while (true) {
            arrayList2 = this.F;
            if (arrayList2.size() >= o.size()) {
                break;
            }
            ImageView g = g();
            g.setImageResource(R.drawable.iv_media_dots);
            g.setOnClickListener(new wh9(this, objArr == true ? 1 : 0));
            addView(g, qoe.e(32, 32, 51));
            arrayList2.add(g);
        }
        this.x.bringToFront();
        this.y.bringToFront();
        while (arrayList2.size() > o.size()) {
            ImageView imageView = (ImageView) td4.m(1, arrayList2);
            removeView(imageView);
            this.L.remove(imageView);
            this.M.remove(imageView);
        }
        if (this.N != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                i07 i07Var = ((ci9) arrayList.get(i2)).e;
                if (i07Var != null && i07Var.n) {
                    return;
                }
            }
            this.N.b(this);
            this.N = null;
        }
    }

    public final void q(boolean z) {
        boolean z2 = this.E.size() >= 2;
        int i = z2 ? 0 : 8;
        ImageView imageView = this.y;
        imageView.setVisibility(i);
        if (z2) {
            int i2 = n() ? R.drawable.iv_media_slideshow : R.drawable.iv_media_collage;
            if (i2 == this.W) {
                return;
            }
            this.W = i2;
            if (z) {
                gm.L3(imageView, i2);
            } else {
                imageView.setImageResource(i2);
            }
        }
    }

    @Override // vlb
    public final void updateColors() {
        int i = cmb.we;
        ylb ylbVar = this.n;
        this.r.setColor(cmb.v0(i, ylbVar));
        this.s.setColor(cmb.v0(cmb.kg, ylbVar));
        sd9 sd9Var = this.w;
        if (sd9Var != null) {
            sd9Var.a();
        }
    }
}

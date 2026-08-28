package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import g7.e6;
import g7.g6;
import g7.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l4 extends y implements org.telegram.ui.ActionBar.w5, m9, i0 {
    public static Paint g0;
    public final ArrayList A;
    public final ArrayList B;
    public final ArrayList C;
    public final boolean D;
    public final ng.d E;
    public final za.a F;
    public final ArrayList G;
    public final HashMap H;
    public dh.k I;
    public h3 J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final y5 Q;
    public int R;
    public int S;
    public float T;
    public boolean U;
    public float V;
    public float W;
    public int a0;
    public int b0;
    public int c0;
    public VelocityTracker d0;
    public ValueAnimator e0;
    public final Path f0;
    public final b6 n;
    public final Paint r;
    public final Paint s;
    public final h0 v;
    public final ImageView w;
    public final ImageView x;
    public final ArrayList y;

    public l4(Context context, b6 b6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.y = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        int i9 = Build.VERSION.SDK_INT;
        boolean z10 = i9 >= 31 && SharedConfig.chatBlurEnabled();
        this.D = z10;
        this.G = new ArrayList();
        this.H = new HashMap();
        this.P = -1;
        this.Q = new y5(this, 0L, 320L, gr.h);
        this.f0 = new Path();
        this.n = b6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        h0 h0Var = new h0(context, b6Var, new n5.e0(this, 19));
        this.v = h0Var;
        addView(h0Var.a, e6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i9 >= 31) {
            ng.d dVar = new ng.d(new ng.c());
            this.E = dVar;
            dVar.f(AndroidUtilities.dp(24.0f));
            this.F = new za.a(21);
        }
        ImageView h = h();
        this.w = h;
        h.setImageResource(R.drawable.iv_media_add);
        addView(h, e6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h.setOnClickListener(new i4(this, 1));
        ImageView h10 = h();
        this.x = h10;
        h10.setVisibility(8);
        addView(h10, e6.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        h10.setOnClickListener(new i4(this, 2));
        d();
    }

    private dh.k getSpoilerEffect() {
        if (!this.K) {
            return null;
        }
        dh.k kVar = this.I;
        if (kVar != null && kVar.i) {
            this.I = null;
        }
        if (this.I == null) {
            this.I = dh.k.e(this);
        }
        return this.I;
    }

    private void settle(float f10) {
        int i9;
        int size = this.y.size();
        if (f10 >= 0.0f || this.S >= size - 1) {
            i9 = -1;
            if (f10 <= 0.0f || this.S <= 0) {
                float f11 = this.T;
                if (f11 <= 0.5f || this.S >= size - 1) {
                    if (f11 >= -0.5f || this.S <= 0) {
                        i9 = 0;
                    }
                }
            }
            int i10 = i9 + this.S;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, i10 - r7);
            this.e0 = ofFloat;
            ofFloat.setDuration(220L);
            this.e0.setInterpolator(gr.h);
            this.e0.addUpdateListener(new kh.g4(this, 16));
            this.e0.addListener(new mh.o2(this, i10, 11));
            this.e0.start();
        }
        i9 = 1;
        int i102 = i9 + this.S;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.T, i102 - r7);
        this.e0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.e0.setInterpolator(gr.h);
        this.e0.addUpdateListener(new kh.g4(this, 16));
        this.e0.addListener(new mh.o2(this, i102, 11));
        this.e0.start();
    }

    @Override // qh.i0
    public final boolean a(int i9, int i10) {
        return this.v.f(i9, i10);
    }

    @Override // qh.i0
    public final void b() {
        this.v.i();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = f6.Gd;
        b6 b6Var = this.n;
        this.r.setColor(f6.v0(i9, b6Var));
        this.s.setColor(f6.v0(f6.uf, b6Var));
        h0 h0Var = this.v;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.v.c(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.A.contains(view)) {
            a aVar = this.a;
            if ((aVar == null ? 0 : aVar.k.size()) > 0) {
                canvas.save();
                Path path = this.f0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.L, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // qh.y
    public final int e() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.v.e(arrayList);
    }

    @Override // qh.i0
    public d1 getCaptionEditText() {
        return this.v.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // qh.i0
    public a getRow() {
        return this.a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (!this.D || Build.VERSION.SDK_INT < 31) {
            int i9 = f6.G6;
            b6 b6Var = this.n;
            imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN));
            int i10 = f6.d6;
            imageView.setBackground(new w1(f6.Z(f6.v0(i10, b6Var), f6.v(f6.v0(i10, b6Var), f6.v0(f6.i6, b6Var)), 20, 20)));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            kg.e eVar = (kg.e) this.E.y();
            eVar.n(this.F);
            eVar.p(AndroidUtilities.dp(16.0f));
            this.H.put(imageView, eVar);
        }
        g6.a(imageView);
        this.G.add(imageView);
        return imageView;
    }

    public final void i(Canvas canvas, ImageView imageView) {
        kg.e eVar;
        if (imageView.getVisibility() == 0 && (eVar = (kg.e) this.H.get(imageView)) != null) {
            eVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
            eVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
            eVar.M = true;
            eVar.draw(canvas);
        }
    }

    public final void j(Canvas canvas) {
        int i9;
        l4 l4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = l4Var.getPaddingTop();
        int paddingLeft = l4Var.getPaddingLeft();
        int i10 = 0;
        int max = Math.max(0, (l4Var.getWidth() - paddingLeft) - l4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = l4Var.a;
        if ((aVar == null ? 0 : aVar.k.size()) > 0) {
            Path path = l4Var.f0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, l4Var.L + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, l4Var.L + paddingTop);
        }
        boolean l10 = l4Var.l();
        int i11 = 1;
        ArrayList arrayList = l4Var.y;
        boolean z10 = l10 && arrayList.size() >= 2;
        a aVar2 = l4Var.a;
        int dp = (aVar2 == null ? 0 : aVar2.k.size()) > 0 ? AndroidUtilities.dp(8.0f) : 0;
        Paint paint = l4Var.r;
        if (z10 && (((i9 = l4Var.S) == 0 && l4Var.T < 0.0f) || (i9 == arrayList.size() - 1 && l4Var.T > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, l4Var.L + paddingTop, paint);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = l4Var.C;
        if (size == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, max, paddingTop + l4Var.L);
                o4 o4Var = (o4) arrayList.get(0);
                ImageReceiver imageReceiver = o4Var.b;
                if (o4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(o4Var.a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i12 = 0;
        while (i12 < arrayList.size() && i12 < arrayList2.size()) {
            o4 o4Var2 = (o4) arrayList.get(i12);
            RectF rectF3 = (RectF) arrayList2.get(i12);
            if (z10) {
                int i13 = i12 == 0 ? dp : 0;
                int i14 = i12 == arrayList.size() - i11 ? dp : 0;
                int i15 = i12 == arrayList.size() - i11 ? dp : 0;
                int i16 = i12 == 0 ? dp : 0;
                o4Var2.a.setRoundRadius(i13, i14, i15, i16);
                o4Var2.b.setRoundRadius(i13, i14, i15, i16);
            } else {
                o4Var2.a.setRoundRadius(i10, i10, i10, i10);
                o4Var2.b.setRoundRadius(i10, i10, i10, i10);
            }
            boolean c10 = o4Var2.c();
            ImageReceiver imageReceiver2 = o4Var2.a;
            if (!c10) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (o4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = o4Var2.d;
            s sVar = o4Var2.e;
            if (sVar != null && sVar.a()) {
                int dp2 = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i17 = dp2 / 2;
                radialProgress2.q(round - i17, round2 - i17, round + i17, round2 + i17);
                radialProgress2.o(o4Var2.e.f, true);
                radialProgress2.draw(canvas2);
            }
            s sVar2 = o4Var2.e;
            if (sVar2 != null && sVar2.n && o4Var2.c()) {
                dh.k spoilerEffect = l4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = o4Var2.b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (o4Var2.b()) {
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.c(canvas2, l4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i12++;
            l4Var = this;
            canvas2 = canvas;
            i10 = 0;
            i11 = 1;
        }
        canvas.restore();
    }

    public final void k(int i9) {
        if (this.J == null || this.a == null) {
            return;
        }
        List m10 = m();
        if (m10.isEmpty() || (m10.size() == 1 && ((s) m10.get(0)).a == 0)) {
            h3 h3Var = this.J;
            a aVar = this.a;
            o3 o3Var = h3Var.a;
            o3Var.X3 = aVar;
            o3Var.d3.c0(0);
            return;
        }
        if (i9 < 0 || i9 >= m10.size() || !((s) m10.get(i9)).a()) {
            return;
        }
        o3.N1(this.a, (s) m10.get(i9), this.J.a);
    }

    public final boolean l() {
        a aVar = this.a;
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockSlideshow);
    }

    public final List m() {
        a aVar = this.a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                return arrayList != null ? arrayList : Collections.EMPTY_LIST;
            }
        }
        s sVar = aVar.g;
        return sVar != null ? Collections.singletonList(sVar) : Collections.EMPTY_LIST;
    }

    public final void n() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List m10 = m();
        while (true) {
            arrayList = this.y;
            if (arrayList.size() >= m10.size()) {
                break;
            }
            o4 o4Var = new o4(this, this.n);
            if (this.K) {
                o4Var.a.onAttachedToWindow();
                o4Var.b.onAttachedToWindow();
                o4Var.a();
            }
            arrayList.add(o4Var);
        }
        while (arrayList.size() > m10.size()) {
            o4 o4Var2 = (o4) e2.c.k(1, arrayList);
            o4Var2.a.onDetachedFromWindow();
            o4Var2.b.onDetachedFromWindow();
            o4Var2.c = null;
        }
        for (int i9 = 0; i9 < m10.size(); i9++) {
            o4 o4Var3 = (o4) arrayList.get(i9);
            o4Var3.e = (s) m10.get(i9);
            o4Var3.a();
        }
        while (true) {
            arrayList2 = this.A;
            if (arrayList2.size() >= m10.size()) {
                break;
            }
            ImageView h = h();
            h.setImageResource(R.drawable.iv_media_dots);
            h.setOnClickListener(new i4(this, 0));
            addView(h, e6.e(32, 32, 51));
            arrayList2.add(h);
        }
        this.w.bringToFront();
        this.x.bringToFront();
        while (arrayList2.size() > m10.size()) {
            ImageView imageView = (ImageView) e2.c.k(1, arrayList2);
            removeView(imageView);
            this.G.remove(imageView);
            this.H.remove(imageView);
        }
        if (this.I != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                s sVar = ((o4) arrayList.get(i10)).e;
                if (sVar != null && sVar.n) {
                    return;
                }
            }
            this.I.b(this);
            this.I = null;
        }
    }

    public final void o(boolean z10) {
        boolean z11 = this.y.size() >= 2;
        int i9 = z11 ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i9);
        if (z11) {
            int i10 = l() ? R.drawable.iv_media_slideshow : R.drawable.iv_media_collage;
            if (i10 == this.R) {
                return;
            }
            this.R = i10;
            if (z10) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
            } else {
                imageView.setImageResource(i10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i9 >= arrayList.size()) {
                return;
            }
            o4 o4Var = (o4) arrayList.get(i9);
            o4Var.a.onAttachedToWindow();
            o4Var.b.onAttachedToWindow();
            o4Var.a();
            i9++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        this.K = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.d0 = null;
        }
        this.U = false;
        while (true) {
            ArrayList arrayList = this.y;
            if (i9 >= arrayList.size()) {
                break;
            }
            o4 o4Var = (o4) arrayList.get(i9);
            o4Var.a.onDetachedFromWindow();
            o4Var.b.onDetachedFromWindow();
            o4Var.c = null;
            i9++;
        }
        dh.k kVar = this.I;
        if (kVar != null) {
            kVar.b(this);
            this.I = null;
        }
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ng.d dVar;
        ImageView imageView;
        ImageView imageView2;
        n9 textSelectionHelper;
        float f10;
        float f11;
        float f12;
        float clamp;
        int paddingTop = getPaddingTop();
        j(canvas);
        y5 y5Var = this.Q;
        float f13 = y5Var.c;
        ArrayList arrayList = this.y;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (g0 == null) {
                Paint paint = new Paint(1);
                g0 = paint;
                paint.setColor(-1);
                g0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), TLObject.FLAG_31);
            }
            int size = arrayList.size();
            float dp = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.L) - AndroidUtilities.dp(23.0f));
            int dp2 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.l0.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f14 = this.S + this.T;
            if (dp2 < max) {
                f10 = 13.0f;
                clamp = ((max - dp2) / 2.0f) + paddingLeft;
                f11 = 23.0f;
                f12 = 4.0f;
            } else {
                f10 = 13.0f;
                float dp3 = AndroidUtilities.dp(4.0f) + paddingLeft;
                int dp4 = AndroidUtilities.dp(13.0f);
                f11 = 23.0f;
                f12 = 4.0f;
                clamp = dp3 - (Utilities.clamp(f14 - (((max - AndroidUtilities.dp(8.0f)) / 2) / dp4), Math.max(0, (size - (r12 * 2)) - 1), 0.0f) * dp4);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.L) - AndroidUtilities.dp(f11), max + paddingLeft, getPaddingTop() + this.L);
            for (int i9 = 0; i9 < size; i9++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i9 - f14));
                g0.setAlpha((int) e2.c.B(max2, 95.0f, 160.0f, f13));
                canvas.drawCircle(AndroidUtilities.dp(f12) + clamp + (AndroidUtilities.dp(f10) * i9), dp, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), g0);
            }
            canvas.restore();
        }
        h3 h3Var = this.J;
        if (h3Var != null && (textSelectionHelper = h3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.L, this.s);
            }
        }
        if (this.D && (dVar = this.E) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.n) {
                    try {
                        j(dVar.a(width, height));
                    } finally {
                        dVar.b();
                    }
                }
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    int size2 = arrayList2.size();
                    imageView = this.x;
                    imageView2 = this.w;
                    if (i10 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i10);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        i(canvas, imageView3);
                    }
                    i10++;
                }
                i(canvas, imageView);
                i(canvas, imageView2);
            }
        }
        if (y5Var.i) {
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i13 = i11 - i9;
        int max = Math.max(0, (i13 - paddingLeft) - paddingRight);
        int i14 = i13 - paddingRight;
        int dp = v6.b(this.a) > 0 ? AndroidUtilities.dp(16.0f) : 0;
        this.v.g(paddingLeft - dp, paddingRight - dp, i13, getPaddingTop() + this.L);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i15 = i14 - dp2;
        ImageView imageView = this.w;
        imageView.layout(i15 - imageView.getMeasuredWidth(), getPaddingTop() + dp2, i15, imageView.getMeasuredHeight() + getPaddingTop() + dp2);
        int i16 = i15 - dp2;
        int measuredWidth = i16 - imageView.getMeasuredWidth();
        ImageView imageView2 = this.x;
        imageView2.layout(measuredWidth - imageView2.getMeasuredWidth(), getPaddingTop() + dp2, i16 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp2);
        List m10 = m();
        int i17 = 0;
        while (true) {
            ArrayList arrayList = this.A;
            if (i17 >= arrayList.size()) {
                return;
            }
            ImageView imageView3 = (ImageView) arrayList.get(i17);
            if (i17 < m10.size() && ((s) m10.get(i17)).a != 0) {
                ArrayList arrayList2 = this.C;
                if (i17 < arrayList2.size()) {
                    RectF rectF = (RectF) arrayList2.get(i17);
                    if (rectF.right <= 0.0f || rectF.left >= max || rectF.bottom <= getPaddingTop() || rectF.top >= getPaddingTop() + this.L) {
                        imageView3.setVisibility(8);
                    } else {
                        int i18 = ((int) rectF.left) + dp2 + paddingLeft;
                        int i19 = ((int) rectF.top) + dp2;
                        imageView3.layout(i18, i19, imageView3.getMeasuredWidth() + i18, imageView3.getMeasuredHeight() + i19);
                        float f10 = 1.0f;
                        if (this.D) {
                            int left = (imageView2.getVisibility() == 0 ? imageView2.getLeft() : imageView.getLeft()) - AndroidUtilities.dp(4.0f);
                            if (imageView3.getMeasuredWidth() + i18 > left) {
                                f10 = Math.max(0.0f, 1.0f - ((r9 - left) / imageView3.getMeasuredWidth()));
                            }
                        }
                        imageView3.setAlpha(f10);
                        imageView3.setVisibility(f10 > 0.01f ? 0 : 8);
                    }
                    i17++;
                }
            }
            imageView3.setVisibility(8);
            i17++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03f3 A[LOOP:1: B:24:0x03eb->B:26:0x03f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x040f A[EDGE_INSN: B:27:0x040f->B:28:0x040f BREAK  A[LOOP:1: B:24:0x03eb->B:26:0x03f3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03a1  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr;
        int round;
        int i15;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr2;
        int i16;
        float[] fArr;
        int i17;
        int i18;
        int dp;
        int i19;
        int size;
        int i20;
        ArrayList arrayList;
        int size2 = View.MeasureSpec.getSize(i9);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size2 - paddingLeft) - paddingRight);
        float f10 = l() ? 1.0f : 0.0f;
        y5 y5Var = this.Q;
        float d = y5Var.d(f10, false);
        ArrayList arrayList2 = this.B;
        arrayList2.clear();
        int paddingTop = getPaddingTop();
        ArrayList arrayList3 = this.y;
        int size3 = arrayList3.size();
        if (size3 == 0) {
            int dp2 = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
            this.O = dp2;
            this.M = dp2;
            this.N = max;
        } else {
            if (size3 != 1) {
                float[] fArr2 = new float[size3];
                for (int i21 = 0; i21 < size3; i21++) {
                    o4 o4Var = (o4) arrayList3.get(i21);
                    int i22 = o4Var.e == null ? 0 : o4Var.d() ? o4Var.e.k : o4Var.e.j;
                    if (o4Var.e == null) {
                        i17 = 0;
                    } else {
                        boolean d9 = o4Var.d();
                        s sVar = o4Var.e;
                        i17 = d9 ? sVar.j : sVar.k;
                    }
                    fArr2[i21] = (i22 <= 0 || i17 <= 0) ? 1.0f : i22 / i17;
                }
                MessageObject.GroupedMessagePosition[] computeGrouped = RichMessageLayout.computeGrouped(fArr2);
                int i23 = 0;
                for (MessageObject.GroupedMessagePosition groupedMessagePosition : computeGrouped) {
                    i23 = Math.max(i23, (int) groupedMessagePosition.maxY);
                }
                int i24 = i23 + 1;
                float[] fArr3 = new float[i24];
                int length = computeGrouped.length;
                i11 = paddingLeft;
                int i25 = 0;
                while (i25 < length) {
                    int i26 = i25;
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = computeGrouped[i26];
                    int i27 = paddingRight;
                    byte b10 = groupedMessagePosition2.minY;
                    int i28 = i24;
                    if (b10 == groupedMessagePosition2.maxY) {
                        fArr3[b10] = Math.max(fArr3[b10], groupedMessagePosition2.ph);
                    }
                    i25 = i26 + 1;
                    paddingRight = i27;
                    i24 = i28;
                }
                i12 = paddingRight;
                int i29 = i24;
                int length2 = computeGrouped.length;
                int i30 = 0;
                while (i30 < length2) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = computeGrouped[i30];
                    int i31 = groupedMessagePosition3.minY;
                    int i32 = length2;
                    byte b11 = groupedMessagePosition3.maxY;
                    if (i31 != b11) {
                        int i33 = (b11 - i31) + 1;
                        i16 = i30;
                        float[] fArr4 = groupedMessagePosition3.siblingHeights;
                        if (fArr4 == null || fArr4.length != i33) {
                            fArr = fArr3;
                            float f11 = groupedMessagePosition3.ph / i33;
                            while (i31 <= groupedMessagePosition3.maxY) {
                                fArr[i31] = Math.max(fArr[i31], f11);
                                i31++;
                            }
                            i30 = i16 + 1;
                            length2 = i32;
                            fArr3 = fArr;
                        } else {
                            int i34 = 0;
                            while (i34 < i33) {
                                int i35 = groupedMessagePosition3.minY + i34;
                                int i36 = i34;
                                float[] fArr5 = fArr3;
                                fArr5[i35] = Math.max(fArr3[i35], groupedMessagePosition3.siblingHeights[i36]);
                                i34 = i36 + 1;
                                fArr3 = fArr5;
                            }
                        }
                    } else {
                        i16 = i30;
                    }
                    fArr = fArr3;
                    i30 = i16 + 1;
                    length2 = i32;
                    fArr3 = fArr;
                }
                float[] fArr6 = fArr3;
                Point point = AndroidUtilities.displaySize;
                float max2 = Math.max(point.x, point.y) * 0.5f;
                int[] iArr = new int[i23 + 2];
                float f12 = 0.0f;
                for (int i37 = 0; i37 <= i23; i37++) {
                    iArr[i37] = Math.round(f12 * max2);
                    f12 += fArr6[i37];
                }
                iArr[i29] = Math.round(f12 * max2);
                int dp3 = AndroidUtilities.dp(2.0f);
                int i38 = 0;
                while (i38 < computeGrouped.length) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = computeGrouped[i38];
                    int i39 = iArr[groupedMessagePosition4.minY];
                    int i40 = iArr[groupedMessagePosition4.maxY + 1] - i39;
                    int i41 = dp3;
                    if (groupedMessagePosition4.leftSpanOffset > 0) {
                        round = Math.round((r2 * max) / 1000.0f);
                        i14 = i40;
                        groupedMessagePositionArr = computeGrouped;
                    } else {
                        i14 = i40;
                        int i42 = 0;
                        int i43 = 0;
                        while (i42 < computeGrouped.length) {
                            if (i42 == i38) {
                                i15 = i42;
                                groupedMessagePositionArr2 = computeGrouped;
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition5 = computeGrouped[i42];
                                i15 = i42;
                                byte b12 = groupedMessagePosition5.minY;
                                groupedMessagePositionArr2 = computeGrouped;
                                byte b13 = groupedMessagePosition4.minY;
                                if (b12 <= b13 && groupedMessagePosition5.maxY >= b13 && groupedMessagePosition5.minX < groupedMessagePosition4.minX) {
                                    i43 += groupedMessagePosition5.pw;
                                }
                            }
                            i42 = i15 + 1;
                            computeGrouped = groupedMessagePositionArr2;
                        }
                        groupedMessagePositionArr = computeGrouped;
                        round = Math.round((i43 * max) / 1000.0f);
                    }
                    arrayList2.add(new RectF(round, i39 + paddingTop, Math.max(0, (groupedMessagePosition4.flags & 2) != 0 ? max - round : Math.round((groupedMessagePosition4.pw * max) / 1000.0f) - i41) + round, Math.max(0, (groupedMessagePosition4.flags & 8) == 0 ? i14 - i41 : i14) + r15));
                    i38++;
                    dp3 = i41;
                    iArr = iArr;
                    computeGrouped = groupedMessagePositionArr;
                }
                this.M = iArr[i29];
                this.N = max;
                float f13 = 0.0f;
                for (int i44 = 0; i44 < size3; i44++) {
                    o4 o4Var2 = (o4) arrayList3.get(i44);
                    int i45 = o4Var2.e == null ? 0 : o4Var2.d() ? o4Var2.e.k : o4Var2.e.j;
                    if (o4Var2.e == null) {
                        i13 = 0;
                    } else {
                        boolean d10 = o4Var2.d();
                        s sVar2 = o4Var2.e;
                        i13 = d10 ? sVar2.j : sVar2.k;
                    }
                    f13 = ((i45 <= 0 || i13 <= 0) ? 1.0f : i45 / i13) + f13;
                }
                int max3 = (int) (this.N / Math.max(0.5f, f13 / size3));
                Point point2 = AndroidUtilities.displaySize;
                int max4 = (int) (Math.max(point2.x, point2.y) * 0.55f);
                if (max3 > max4) {
                    max3 = max4;
                }
                this.O = max3;
                this.L = Math.round(AndroidUtilities.lerp(this.M, this.O, d));
                ArrayList arrayList4 = this.C;
                arrayList4.clear();
                size = arrayList3.size();
                if (size != 0) {
                    int paddingTop2 = getPaddingTop();
                    if (size == 1) {
                        arrayList4.add(new RectF((RectF) arrayList2.get(0)));
                    } else {
                        float f14 = (-this.T) * this.N;
                        int i46 = 0;
                        while (i46 < size && i46 < arrayList2.size()) {
                            RectF rectF = (RectF) arrayList2.get(i46);
                            float f15 = ((i46 - this.S) * this.N) + f14;
                            arrayList4.add(new RectF(AndroidUtilities.lerp(rectF.left, f15, d), AndroidUtilities.lerp(rectF.top, paddingTop2, d), AndroidUtilities.lerp(rectF.right, f15 + this.N, d), AndroidUtilities.lerp(rectF.bottom, this.O + paddingTop2, d)));
                            i46++;
                            size = size;
                        }
                    }
                }
                int dp4 = v6.b(this.a) <= 0 ? AndroidUtilities.dp(16.0f) : 0;
                setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.L + this.v.h(i11 - dp4, i12 - dp4, size2));
                this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                this.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                i20 = 0;
                while (true) {
                    arrayList = this.A;
                    if (i20 < arrayList.size()) {
                        break;
                    }
                    ((ImageView) arrayList.get(i20)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                    i20++;
                }
                if (y5Var.i) {
                    return;
                }
                requestLayout();
                return;
            }
            o4 o4Var3 = (o4) arrayList3.get(0);
            int i47 = o4Var3.e == null ? 0 : o4Var3.d() ? o4Var3.e.k : o4Var3.e.j;
            if (o4Var3.e == null) {
                i18 = 0;
            } else {
                boolean d11 = o4Var3.d();
                s sVar3 = o4Var3.e;
                i18 = d11 ? sVar3.j : sVar3.k;
            }
            if (i47 <= 0 || i18 <= 0) {
                dp = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
            } else {
                dp = (int) ((max / Math.max(1, i47)) * i18);
                Point point3 = AndroidUtilities.displaySize;
                int max5 = (int) (Math.max(point3.x, point3.y) * 0.55f);
                if (dp > max5) {
                    i19 = (int) ((max5 / Math.max(1, i18)) * i47);
                    dp = max5;
                    arrayList2.add(new RectF((max - i19) / 2, paddingTop, r4 + i19, paddingTop + dp));
                    this.M = dp;
                    this.N = i19;
                    this.O = dp;
                }
            }
            i19 = max;
            arrayList2.add(new RectF((max - i19) / 2, paddingTop, r4 + i19, paddingTop + dp));
            this.M = dp;
            this.N = i19;
            this.O = dp;
        }
        i11 = paddingLeft;
        i12 = paddingRight;
        this.L = Math.round(AndroidUtilities.lerp(this.M, this.O, d));
        ArrayList arrayList42 = this.C;
        arrayList42.clear();
        size = arrayList3.size();
        if (size != 0) {
        }
        if (v6.b(this.a) <= 0) {
        }
        setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.L + this.v.h(i11 - dp4, i12 - dp4, size2));
        this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
        this.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
        i20 = 0;
        while (true) {
            arrayList = this.A;
            if (i20 < arrayList.size()) {
            }
            ((ImageView) arrayList.get(i20)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
            i20++;
        }
        if (y5Var.i) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i9 = 0;
        boolean z10 = y10 >= ((float) getPaddingTop()) && y10 < ((float) (getPaddingTop() + this.L));
        int i10 = -1;
        if (l() && !this.Q.i) {
            ArrayList arrayList = this.y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.a0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.a0 = viewConfiguration.getScaledTouchSlop();
                        this.b0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.c0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.V = x10;
                    this.W = y10;
                    this.U = false;
                    VelocityTracker velocityTracker2 = this.d0;
                    if (velocityTracker2 == null) {
                        this.d0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.d0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.e0 = null;
                    }
                    this.P = this.S;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.d0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x10 - this.V;
                    float f12 = y10 - this.W;
                    if (!this.U && Math.abs(f11) > this.a0 && Math.abs(f11) > Math.abs(f12)) {
                        this.U = true;
                        this.P = -1;
                    }
                    if (this.U) {
                        float f13 = (-f11) / this.N;
                        int i11 = this.S;
                        if (i11 == 0 && f13 < 0.0f) {
                            f13 *= 0.3f;
                        }
                        if (i11 == arrayList.size() - 1 && f13 > 0.0f) {
                            f13 *= 0.3f;
                        }
                        this.T = f13;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.d0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.d0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.c0);
                        float xVelocity = this.d0.getXVelocity();
                        float yVelocity = this.d0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.b0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.d0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.d0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.U) {
                        this.U = false;
                        settle(f10);
                    } else if (actionMasked == 1) {
                        int i12 = this.P;
                        int i13 = this.S;
                        if (i12 == i13) {
                            k(i13);
                        }
                    }
                    this.P = -1;
                    return true;
                }
            }
        }
        ArrayList arrayList2 = this.C;
        if (actionMasked == 0) {
            if (!z10) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i9 >= arrayList2.size()) {
                    break;
                }
                if (((RectF) arrayList2.get(i9)).contains(x10, y10)) {
                    i10 = i9;
                    break;
                }
                i9++;
            }
            this.P = i10;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.P = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (z10) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList2.size()) {
                    i14 = -1;
                    break;
                }
                if (((RectF) arrayList2.get(i14)).contains(x10, y10)) {
                    break;
                }
                i14++;
            }
            int i15 = this.P;
            if (i14 == i15) {
                k(i15);
            }
        }
        boolean z11 = this.P != -1 || z10;
        this.P = -1;
        return z11 || super.onTouchEvent(motionEvent);
    }
}

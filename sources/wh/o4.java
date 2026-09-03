package wh;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k7.c6;
import k7.e6;
import k7.l8;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class o4 extends z implements b6, l9, j0 {
    public static Paint h0;
    public final ArrayList B;
    public final ArrayList C;
    public final ArrayList D;
    public final boolean E;
    public final tg.d F;
    public final z9.d G;
    public final ArrayList H;
    public final HashMap I;
    public jh.j J;
    public k3 K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final org.telegram.ui.Components.z5 R;
    public int S;
    public int T;
    public float U;
    public boolean V;
    public float W;
    public float a0;
    public int b0;
    public int c0;
    public int d0;
    public VelocityTracker e0;
    public ValueAnimator f0;
    public final Path g0;
    public final g6 n;
    public final Paint r;
    public final Paint s;
    public final i0 v;
    public final ImageView w;
    public final ImageView x;
    public final ArrayList y;

    public o4(Context context, g6 g6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.y = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        boolean z4 = i10 >= 31 && SharedConfig.chatBlurEnabled();
        this.E = z4;
        this.H = new ArrayList();
        this.I = new HashMap();
        this.Q = -1;
        this.R = new org.telegram.ui.Components.z5(this, 0L, 320L, pr.h);
        this.g0 = new Path();
        this.n = g6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        i0 i0Var = new i0(context, g6Var, new org.telegram.ui.Cells.f1(this, 28));
        this.v = i0Var;
        addView(i0Var.a, c6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z4 && i10 >= 31) {
            tg.d dVar = new tg.d(new tg.c());
            this.F = dVar;
            dVar.g(AndroidUtilities.dp(24.0f));
            this.G = new z9.d(24);
        }
        ImageView h = h();
        this.w = h;
        h.setImageResource(R.drawable.iv_media_add);
        addView(h, c6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h.setOnClickListener(new l4(this, 1));
        ImageView h9 = h();
        this.x = h9;
        h9.setVisibility(8);
        addView(h9, c6.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        h9.setOnClickListener(new l4(this, 2));
        e();
    }

    private jh.j getSpoilerEffect() {
        if (!this.L) {
            return null;
        }
        jh.j jVar = this.J;
        if (jVar != null && jVar.i) {
            this.J = null;
        }
        if (this.J == null) {
            this.J = jh.j.e(this);
        }
        return this.J;
    }

    private void settle(float f10) {
        int i10;
        int size = this.y.size();
        if (f10 >= 0.0f || this.T >= size - 1) {
            i10 = -1;
            if (f10 <= 0.0f || this.T <= 0) {
                float f11 = this.U;
                if (f11 <= 0.5f || this.T >= size - 1) {
                    if (f11 >= -0.5f || this.T <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i11 = i10 + this.T;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, i11 - r7);
            this.f0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f0.setInterpolator(pr.h);
            this.f0.addUpdateListener(new oh.f5(this, 26));
            this.f0.addListener(new org.telegram.ui.Cells.b4(this, i11, 11));
            this.f0.start();
        }
        i10 = 1;
        int i112 = i10 + this.T;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.U, i112 - r7);
        this.f0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f0.setInterpolator(pr.h);
        this.f0.addUpdateListener(new oh.f5(this, 26));
        this.f0.addListener(new org.telegram.ui.Cells.b4(this, i112, 11));
        this.f0.start();
    }

    @Override // wh.j0
    public final boolean a(int i10, int i11) {
        return this.v.f(i10, i11);
    }

    @Override // wh.j0
    public final void b() {
        this.v.i();
    }

    @Override // wh.z
    public final int d() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.v.c(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.B.contains(view)) {
            a aVar = this.a;
            if ((aVar == null ? 0 : aVar.k.size()) > 0) {
                canvas.save();
                Path path = this.g0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.M, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int i10 = k6.Gd;
        g6 g6Var = this.n;
        this.r.setColor(k6.v0(i10, g6Var));
        this.s.setColor(k6.v0(k6.uf, g6Var));
        i0 i0Var = this.v;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.v.e(arrayList);
    }

    @Override // wh.j0
    public e1 getCaptionEditText() {
        return this.v.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // wh.j0
    public a getRow() {
        return this.a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (!this.E || Build.VERSION.SDK_INT < 31) {
            int i10 = k6.G6;
            g6 g6Var = this.n;
            imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(i10, g6Var), PorterDuff.Mode.SRC_IN));
            int i11 = k6.d6;
            imageView.setBackground(new y1(k6.Z(k6.v0(i11, g6Var), k6.v(k6.v0(i11, g6Var), k6.v0(k6.i6, g6Var)), 20, 20)));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            qg.c cVar = (qg.c) this.F.k();
            cVar.n(this.G);
            cVar.p(AndroidUtilities.dp(16.0f));
            this.I.put(imageView, cVar);
        }
        e6.a(imageView);
        this.H.add(imageView);
        return imageView;
    }

    public final void i(Canvas canvas, ImageView imageView) {
        qg.c cVar;
        if (imageView.getVisibility() == 0 && (cVar = (qg.c) this.I.get(imageView)) != null) {
            cVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
            cVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
            cVar.M = true;
            cVar.draw(canvas);
        }
    }

    public final void j(Canvas canvas) {
        int i10;
        o4 o4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = o4Var.getPaddingTop();
        int paddingLeft = o4Var.getPaddingLeft();
        int i11 = 0;
        int max = Math.max(0, (o4Var.getWidth() - paddingLeft) - o4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = o4Var.a;
        if ((aVar == null ? 0 : aVar.k.size()) > 0) {
            Path path = o4Var.g0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, o4Var.M + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, o4Var.M + paddingTop);
        }
        boolean l10 = o4Var.l();
        int i12 = 1;
        ArrayList arrayList = o4Var.y;
        boolean z4 = l10 && arrayList.size() >= 2;
        a aVar2 = o4Var.a;
        int dp = (aVar2 == null ? 0 : aVar2.k.size()) > 0 ? AndroidUtilities.dp(8.0f) : 0;
        Paint paint = o4Var.r;
        if (z4 && (((i10 = o4Var.T) == 0 && o4Var.U < 0.0f) || (i10 == arrayList.size() - 1 && o4Var.U > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, o4Var.M + paddingTop, paint);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = o4Var.D;
        if (size == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, max, paddingTop + o4Var.M);
                r4 r4Var = (r4) arrayList.get(0);
                ImageReceiver imageReceiver = r4Var.b;
                if (r4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(r4Var.a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i13 = 0;
        while (i13 < arrayList.size() && i13 < arrayList2.size()) {
            r4 r4Var2 = (r4) arrayList.get(i13);
            RectF rectF3 = (RectF) arrayList2.get(i13);
            if (z4) {
                int i14 = i13 == 0 ? dp : 0;
                int i15 = i13 == arrayList.size() - i12 ? dp : 0;
                int i16 = i13 == arrayList.size() - i12 ? dp : 0;
                int i17 = i13 == 0 ? dp : 0;
                r4Var2.a.setRoundRadius(i14, i15, i16, i17);
                r4Var2.b.setRoundRadius(i14, i15, i16, i17);
            } else {
                r4Var2.a.setRoundRadius(i11, i11, i11, i11);
                r4Var2.b.setRoundRadius(i11, i11, i11, i11);
            }
            boolean c3 = r4Var2.c();
            ImageReceiver imageReceiver2 = r4Var2.a;
            if (!c3) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (r4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = r4Var2.d;
            t tVar = r4Var2.e;
            if (tVar != null && tVar.a()) {
                int dp2 = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i18 = dp2 / 2;
                radialProgress2.q(round - i18, round2 - i18, round + i18, round2 + i18);
                radialProgress2.o(r4Var2.e.f, true);
                radialProgress2.draw(canvas2);
            }
            t tVar2 = r4Var2.e;
            if (tVar2 != null && tVar2.n && r4Var2.c()) {
                jh.j spoilerEffect = o4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = r4Var2.b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (r4Var2.b()) {
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.c(canvas2, o4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i13++;
            o4Var = this;
            canvas2 = canvas;
            i11 = 0;
            i12 = 1;
        }
        canvas.restore();
    }

    public final void k(int i10) {
        if (this.K == null || this.a == null) {
            return;
        }
        List m9 = m();
        if (m9.isEmpty() || (m9.size() == 1 && ((t) m9.get(0)).a == 0)) {
            k3 k3Var = this.K;
            a aVar = this.a;
            r3 r3Var = k3Var.a;
            r3Var.Y3 = aVar;
            r3Var.e3.p(0);
            return;
        }
        if (i10 < 0 || i10 >= m9.size() || !((t) m9.get(i10)).a()) {
            return;
        }
        r3.M1(this.a, (t) m9.get(i10), this.K.a);
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
        t tVar = aVar.g;
        return tVar != null ? Collections.singletonList(tVar) : Collections.EMPTY_LIST;
    }

    public final void n() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List m9 = m();
        while (true) {
            arrayList = this.y;
            if (arrayList.size() >= m9.size()) {
                break;
            }
            r4 r4Var = new r4(this, this.n);
            if (this.L) {
                r4Var.a.onAttachedToWindow();
                r4Var.b.onAttachedToWindow();
                r4Var.a();
            }
            arrayList.add(r4Var);
        }
        while (arrayList.size() > m9.size()) {
            r4 r4Var2 = (r4) e2.c.g(1, arrayList);
            r4Var2.a.onDetachedFromWindow();
            r4Var2.b.onDetachedFromWindow();
            r4Var2.c = null;
        }
        for (int i10 = 0; i10 < m9.size(); i10++) {
            r4 r4Var3 = (r4) arrayList.get(i10);
            r4Var3.e = (t) m9.get(i10);
            r4Var3.a();
        }
        while (true) {
            arrayList2 = this.B;
            if (arrayList2.size() >= m9.size()) {
                break;
            }
            ImageView h = h();
            h.setImageResource(R.drawable.iv_media_dots);
            h.setOnClickListener(new l4(this, 0));
            addView(h, c6.e(32, 32, 51));
            arrayList2.add(h);
        }
        this.w.bringToFront();
        this.x.bringToFront();
        while (arrayList2.size() > m9.size()) {
            ImageView imageView = (ImageView) e2.c.g(1, arrayList2);
            removeView(imageView);
            this.H.remove(imageView);
            this.I.remove(imageView);
        }
        if (this.J != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                t tVar = ((r4) arrayList.get(i11)).e;
                if (tVar != null && tVar.n) {
                    return;
                }
            }
            this.J.b(this);
            this.J = null;
        }
    }

    public final void o(boolean z4) {
        boolean z10 = this.y.size() >= 2;
        int i10 = z10 ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i10);
        if (z10) {
            int i11 = l() ? R.drawable.iv_media_slideshow : R.drawable.iv_media_collage;
            if (i11 == this.S) {
                return;
            }
            this.S = i11;
            if (z4) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
            } else {
                imageView.setImageResource(i11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i10 >= arrayList.size()) {
                return;
            }
            r4 r4Var = (r4) arrayList.get(i10);
            r4Var.a.onAttachedToWindow();
            r4Var.b.onAttachedToWindow();
            r4Var.a();
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.L = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.e0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.e0 = null;
        }
        this.V = false;
        while (true) {
            ArrayList arrayList = this.y;
            if (i10 >= arrayList.size()) {
                break;
            }
            r4 r4Var = (r4) arrayList.get(i10);
            r4Var.a.onDetachedFromWindow();
            r4Var.b.onDetachedFromWindow();
            r4Var.c = null;
            i10++;
        }
        jh.j jVar = this.J;
        if (jVar != null) {
            jVar.b(this);
            this.J = null;
        }
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        tg.d dVar;
        ImageView imageView;
        ImageView imageView2;
        m9 textSelectionHelper;
        float f10;
        float f11;
        float f12;
        float clamp;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.z5 z5Var = this.R;
        float f13 = z5Var.c;
        ArrayList arrayList = this.y;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (h0 == null) {
                Paint paint = new Paint(1);
                h0 = paint;
                paint.setColor(-1);
                h0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), TLObject.FLAG_31);
            }
            int size = arrayList.size();
            float dp = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.M) - AndroidUtilities.dp(23.0f));
            int dp2 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y3.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f14 = this.T + this.U;
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
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.M) - AndroidUtilities.dp(f11), max + paddingLeft, getPaddingTop() + this.M);
            for (int i10 = 0; i10 < size; i10++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i10 - f14));
                h0.setAlpha((int) e2.c.y(max2, 95.0f, 160.0f, f13));
                canvas.drawCircle(AndroidUtilities.dp(f12) + clamp + (AndroidUtilities.dp(f10) * i10), dp, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), h0);
            }
            canvas.restore();
        }
        k3 k3Var = this.K;
        if (k3Var != null && (textSelectionHelper = k3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.M, this.s);
            }
        }
        if (this.E && (dVar = this.F) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.n) {
                    try {
                        j(dVar.a(width, height));
                    } finally {
                        dVar.c();
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.H;
                    int size2 = arrayList2.size();
                    imageView = this.x;
                    imageView2 = this.w;
                    if (i11 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i11);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        i(canvas, imageView3);
                    }
                    i11++;
                }
                i(canvas, imageView);
                i(canvas, imageView2);
            }
        }
        if (z5Var.i) {
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        int i15 = i14 - paddingRight;
        int dp = l8.b(this.a) > 0 ? AndroidUtilities.dp(16.0f) : 0;
        this.v.g(paddingLeft - dp, paddingRight - dp, i14, getPaddingTop() + this.M);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i16 = i15 - dp2;
        ImageView imageView = this.w;
        imageView.layout(i16 - imageView.getMeasuredWidth(), getPaddingTop() + dp2, i16, imageView.getMeasuredHeight() + getPaddingTop() + dp2);
        int i17 = i16 - dp2;
        int measuredWidth = i17 - imageView.getMeasuredWidth();
        ImageView imageView2 = this.x;
        imageView2.layout(measuredWidth - imageView2.getMeasuredWidth(), getPaddingTop() + dp2, i17 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp2);
        List m9 = m();
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i18 >= arrayList.size()) {
                return;
            }
            ImageView imageView3 = (ImageView) arrayList.get(i18);
            if (i18 < m9.size() && ((t) m9.get(i18)).a != 0) {
                ArrayList arrayList2 = this.D;
                if (i18 < arrayList2.size()) {
                    RectF rectF = (RectF) arrayList2.get(i18);
                    if (rectF.right <= 0.0f || rectF.left >= max || rectF.bottom <= getPaddingTop() || rectF.top >= getPaddingTop() + this.M) {
                        imageView3.setVisibility(8);
                    } else {
                        int i19 = ((int) rectF.left) + dp2 + paddingLeft;
                        int i20 = ((int) rectF.top) + dp2;
                        imageView3.layout(i19, i20, imageView3.getMeasuredWidth() + i19, imageView3.getMeasuredHeight() + i20);
                        float f10 = 1.0f;
                        if (this.E) {
                            int left = (imageView2.getVisibility() == 0 ? imageView2.getLeft() : imageView.getLeft()) - AndroidUtilities.dp(4.0f);
                            if (imageView3.getMeasuredWidth() + i19 > left) {
                                f10 = Math.max(0.0f, 1.0f - ((r9 - left) / imageView3.getMeasuredWidth()));
                            }
                        }
                        imageView3.setAlpha(f10);
                        imageView3.setVisibility(f10 > 0.01f ? 0 : 8);
                    }
                    i18++;
                }
            }
            imageView3.setVisibility(8);
            i18++;
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr;
        int round;
        int i16;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr2;
        int i17;
        float[] fArr;
        int i18;
        int i19;
        int dp;
        int i20;
        int size;
        int i21;
        ArrayList arrayList;
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size2 - paddingLeft) - paddingRight);
        float f10 = l() ? 1.0f : 0.0f;
        org.telegram.ui.Components.z5 z5Var = this.R;
        float d = z5Var.d(f10, false);
        ArrayList arrayList2 = this.C;
        arrayList2.clear();
        int paddingTop = getPaddingTop();
        ArrayList arrayList3 = this.y;
        int size3 = arrayList3.size();
        if (size3 == 0) {
            int dp2 = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
            this.P = dp2;
            this.N = dp2;
            this.O = max;
        } else {
            if (size3 != 1) {
                float[] fArr2 = new float[size3];
                for (int i22 = 0; i22 < size3; i22++) {
                    r4 r4Var = (r4) arrayList3.get(i22);
                    int i23 = r4Var.e == null ? 0 : r4Var.d() ? r4Var.e.k : r4Var.e.j;
                    if (r4Var.e == null) {
                        i18 = 0;
                    } else {
                        boolean d10 = r4Var.d();
                        t tVar = r4Var.e;
                        i18 = d10 ? tVar.j : tVar.k;
                    }
                    fArr2[i22] = (i23 <= 0 || i18 <= 0) ? 1.0f : i23 / i18;
                }
                MessageObject.GroupedMessagePosition[] computeGrouped = RichMessageLayout.computeGrouped(fArr2);
                int i24 = 0;
                for (MessageObject.GroupedMessagePosition groupedMessagePosition : computeGrouped) {
                    i24 = Math.max(i24, (int) groupedMessagePosition.maxY);
                }
                int i25 = i24 + 1;
                float[] fArr3 = new float[i25];
                int length = computeGrouped.length;
                i12 = paddingLeft;
                int i26 = 0;
                while (i26 < length) {
                    int i27 = i26;
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = computeGrouped[i27];
                    int i28 = paddingRight;
                    byte b10 = groupedMessagePosition2.minY;
                    int i29 = i25;
                    if (b10 == groupedMessagePosition2.maxY) {
                        fArr3[b10] = Math.max(fArr3[b10], groupedMessagePosition2.ph);
                    }
                    i26 = i27 + 1;
                    paddingRight = i28;
                    i25 = i29;
                }
                i13 = paddingRight;
                int i30 = i25;
                int length2 = computeGrouped.length;
                int i31 = 0;
                while (i31 < length2) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = computeGrouped[i31];
                    int i32 = groupedMessagePosition3.minY;
                    int i33 = length2;
                    byte b11 = groupedMessagePosition3.maxY;
                    if (i32 != b11) {
                        int i34 = (b11 - i32) + 1;
                        i17 = i31;
                        float[] fArr4 = groupedMessagePosition3.siblingHeights;
                        if (fArr4 == null || fArr4.length != i34) {
                            fArr = fArr3;
                            float f11 = groupedMessagePosition3.ph / i34;
                            while (i32 <= groupedMessagePosition3.maxY) {
                                fArr[i32] = Math.max(fArr[i32], f11);
                                i32++;
                            }
                            i31 = i17 + 1;
                            length2 = i33;
                            fArr3 = fArr;
                        } else {
                            int i35 = 0;
                            while (i35 < i34) {
                                int i36 = groupedMessagePosition3.minY + i35;
                                int i37 = i35;
                                float[] fArr5 = fArr3;
                                fArr5[i36] = Math.max(fArr3[i36], groupedMessagePosition3.siblingHeights[i37]);
                                i35 = i37 + 1;
                                fArr3 = fArr5;
                            }
                        }
                    } else {
                        i17 = i31;
                    }
                    fArr = fArr3;
                    i31 = i17 + 1;
                    length2 = i33;
                    fArr3 = fArr;
                }
                float[] fArr6 = fArr3;
                Point point = AndroidUtilities.displaySize;
                float max2 = Math.max(point.x, point.y) * 0.5f;
                int[] iArr = new int[i24 + 2];
                float f12 = 0.0f;
                for (int i38 = 0; i38 <= i24; i38++) {
                    iArr[i38] = Math.round(f12 * max2);
                    f12 += fArr6[i38];
                }
                iArr[i30] = Math.round(f12 * max2);
                int dp3 = AndroidUtilities.dp(2.0f);
                int i39 = 0;
                while (i39 < computeGrouped.length) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = computeGrouped[i39];
                    int i40 = iArr[groupedMessagePosition4.minY];
                    int i41 = iArr[groupedMessagePosition4.maxY + 1] - i40;
                    int i42 = dp3;
                    if (groupedMessagePosition4.leftSpanOffset > 0) {
                        round = Math.round((r2 * max) / 1000.0f);
                        i15 = i41;
                        groupedMessagePositionArr = computeGrouped;
                    } else {
                        i15 = i41;
                        int i43 = 0;
                        int i44 = 0;
                        while (i43 < computeGrouped.length) {
                            if (i43 == i39) {
                                i16 = i43;
                                groupedMessagePositionArr2 = computeGrouped;
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition5 = computeGrouped[i43];
                                i16 = i43;
                                byte b12 = groupedMessagePosition5.minY;
                                groupedMessagePositionArr2 = computeGrouped;
                                byte b13 = groupedMessagePosition4.minY;
                                if (b12 <= b13 && groupedMessagePosition5.maxY >= b13 && groupedMessagePosition5.minX < groupedMessagePosition4.minX) {
                                    i44 += groupedMessagePosition5.pw;
                                }
                            }
                            i43 = i16 + 1;
                            computeGrouped = groupedMessagePositionArr2;
                        }
                        groupedMessagePositionArr = computeGrouped;
                        round = Math.round((i44 * max) / 1000.0f);
                    }
                    arrayList2.add(new RectF(round, i40 + paddingTop, Math.max(0, (groupedMessagePosition4.flags & 2) != 0 ? max - round : Math.round((groupedMessagePosition4.pw * max) / 1000.0f) - i42) + round, Math.max(0, (groupedMessagePosition4.flags & 8) == 0 ? i15 - i42 : i15) + r15));
                    i39++;
                    dp3 = i42;
                    iArr = iArr;
                    computeGrouped = groupedMessagePositionArr;
                }
                this.N = iArr[i30];
                this.O = max;
                float f13 = 0.0f;
                for (int i45 = 0; i45 < size3; i45++) {
                    r4 r4Var2 = (r4) arrayList3.get(i45);
                    int i46 = r4Var2.e == null ? 0 : r4Var2.d() ? r4Var2.e.k : r4Var2.e.j;
                    if (r4Var2.e == null) {
                        i14 = 0;
                    } else {
                        boolean d11 = r4Var2.d();
                        t tVar2 = r4Var2.e;
                        i14 = d11 ? tVar2.j : tVar2.k;
                    }
                    f13 = ((i46 <= 0 || i14 <= 0) ? 1.0f : i46 / i14) + f13;
                }
                int max3 = (int) (this.O / Math.max(0.5f, f13 / size3));
                Point point2 = AndroidUtilities.displaySize;
                int max4 = (int) (Math.max(point2.x, point2.y) * 0.55f);
                if (max3 > max4) {
                    max3 = max4;
                }
                this.P = max3;
                this.M = Math.round(AndroidUtilities.lerp(this.N, this.P, d));
                ArrayList arrayList4 = this.D;
                arrayList4.clear();
                size = arrayList3.size();
                if (size != 0) {
                    int paddingTop2 = getPaddingTop();
                    if (size == 1) {
                        arrayList4.add(new RectF((RectF) arrayList2.get(0)));
                    } else {
                        float f14 = (-this.U) * this.O;
                        int i47 = 0;
                        while (i47 < size && i47 < arrayList2.size()) {
                            RectF rectF = (RectF) arrayList2.get(i47);
                            float f15 = ((i47 - this.T) * this.O) + f14;
                            arrayList4.add(new RectF(AndroidUtilities.lerp(rectF.left, f15, d), AndroidUtilities.lerp(rectF.top, paddingTop2, d), AndroidUtilities.lerp(rectF.right, f15 + this.O, d), AndroidUtilities.lerp(rectF.bottom, this.P + paddingTop2, d)));
                            i47++;
                            size = size;
                        }
                    }
                }
                int dp4 = l8.b(this.a) <= 0 ? AndroidUtilities.dp(16.0f) : 0;
                setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.M + this.v.h(i12 - dp4, i13 - dp4, size2));
                this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                this.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                i21 = 0;
                while (true) {
                    arrayList = this.B;
                    if (i21 < arrayList.size()) {
                        break;
                    }
                    ((ImageView) arrayList.get(i21)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                    i21++;
                }
                if (z5Var.i) {
                    return;
                }
                requestLayout();
                return;
            }
            r4 r4Var3 = (r4) arrayList3.get(0);
            int i48 = r4Var3.e == null ? 0 : r4Var3.d() ? r4Var3.e.k : r4Var3.e.j;
            if (r4Var3.e == null) {
                i19 = 0;
            } else {
                boolean d12 = r4Var3.d();
                t tVar3 = r4Var3.e;
                i19 = d12 ? tVar3.j : tVar3.k;
            }
            if (i48 <= 0 || i19 <= 0) {
                dp = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
            } else {
                dp = (int) ((max / Math.max(1, i48)) * i19);
                Point point3 = AndroidUtilities.displaySize;
                int max5 = (int) (Math.max(point3.x, point3.y) * 0.55f);
                if (dp > max5) {
                    i20 = (int) ((max5 / Math.max(1, i19)) * i48);
                    dp = max5;
                    arrayList2.add(new RectF((max - i20) / 2, paddingTop, r4 + i20, paddingTop + dp));
                    this.N = dp;
                    this.O = i20;
                    this.P = dp;
                }
            }
            i20 = max;
            arrayList2.add(new RectF((max - i20) / 2, paddingTop, r4 + i20, paddingTop + dp));
            this.N = dp;
            this.O = i20;
            this.P = dp;
        }
        i12 = paddingLeft;
        i13 = paddingRight;
        this.M = Math.round(AndroidUtilities.lerp(this.N, this.P, d));
        ArrayList arrayList42 = this.D;
        arrayList42.clear();
        size = arrayList3.size();
        if (size != 0) {
        }
        if (l8.b(this.a) <= 0) {
        }
        setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.M + this.v.h(i12 - dp4, i13 - dp4, size2));
        this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
        this.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
        i21 = 0;
        while (true) {
            arrayList = this.B;
            if (i21 < arrayList.size()) {
            }
            ((ImageView) arrayList.get(i21)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
            i21++;
        }
        if (z5Var.i) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        boolean z4 = y10 >= ((float) getPaddingTop()) && y10 < ((float) (getPaddingTop() + this.M));
        int i11 = -1;
        if (l() && !this.R.i) {
            ArrayList arrayList = this.y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z4) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.b0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.b0 = viewConfiguration.getScaledTouchSlop();
                        this.c0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.d0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.W = x10;
                    this.a0 = y10;
                    this.V = false;
                    VelocityTracker velocityTracker2 = this.e0;
                    if (velocityTracker2 == null) {
                        this.e0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.e0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f0 = null;
                    }
                    this.Q = this.T;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.e0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x10 - this.W;
                    float f12 = y10 - this.a0;
                    if (!this.V && Math.abs(f11) > this.b0 && Math.abs(f11) > Math.abs(f12)) {
                        this.V = true;
                        this.Q = -1;
                    }
                    if (this.V) {
                        float f13 = (-f11) / this.O;
                        int i12 = this.T;
                        if (i12 == 0 && f13 < 0.0f) {
                            f13 *= 0.3f;
                        }
                        if (i12 == arrayList.size() - 1 && f13 > 0.0f) {
                            f13 *= 0.3f;
                        }
                        this.U = f13;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.e0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.e0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.d0);
                        float xVelocity = this.e0.getXVelocity();
                        float yVelocity = this.e0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.c0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.e0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.e0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.V) {
                        this.V = false;
                        settle(f10);
                    } else if (actionMasked == 1) {
                        int i13 = this.Q;
                        int i14 = this.T;
                        if (i13 == i14) {
                            k(i14);
                        }
                    }
                    this.Q = -1;
                    return true;
                }
            }
        }
        ArrayList arrayList2 = this.D;
        if (actionMasked == 0) {
            if (!z4) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i10 >= arrayList2.size()) {
                    break;
                }
                if (((RectF) arrayList2.get(i10)).contains(x10, y10)) {
                    i11 = i10;
                    break;
                }
                i10++;
            }
            this.Q = i11;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.Q = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (z4) {
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList2.size()) {
                    i15 = -1;
                    break;
                }
                if (((RectF) arrayList2.get(i15)).contains(x10, y10)) {
                    break;
                }
                i15++;
            }
            int i16 = this.Q;
            if (i15 == i16) {
                k(i16);
            }
        }
        boolean z10 = this.Q != -1 || z4;
        this.Q = -1;
        return z10 || super.onTouchEvent(motionEvent);
    }
}

package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.o5;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.x60;
import org.telegram.ui.do0;
import rh.c8;
import rh.h8;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class c1 extends FrameLayout implements k6 {
    public static final int[] v0 = {-2781403, -3635939};
    public final g9 D;
    public FrameLayout.LayoutParams E;
    public final kg.l1 F;
    public final kg.l1 G;
    public final TextView H;
    public final TextView I;
    public final org.telegram.ui.Components.voip.i0 J;
    public final do0 K;
    public final TextView L;
    public final TextView M;
    public d01 N;
    public boolean O;
    public float P;
    public qz0 Q;
    public qz0 R;
    public final Rect S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final t5 W;
    public final int a;
    public kg.m a0;
    public final p6 b;
    public TL_stars.StarGift b0;
    public final fo0 c;
    public boolean c0;
    public final FrameLayout d;
    public boolean d0;
    public final z0 e;
    public TL_stars.SavedStarGift e0;
    public final d1 f;
    public boolean f0;
    public boolean g0;
    public final r8 h;
    public boolean h0;
    public boolean i0;
    public kg.m j0;
    public TLRPC.Document k0;
    public TL_stars.SavedStarGift l0;
    public ep m0;
    public final g9 n;
    public int n0;
    public boolean o0;
    public boolean p0;
    public int q0;
    public final FrameLayout.LayoutParams r;
    public int[] r0;
    public final FrameLayout.LayoutParams s;
    public int s0;
    public boolean t0;
    public boolean u0;
    public final FrameLayout w;
    public final ImageView x;
    public final TextView y;

    public c1(int i10, Context context, p6 p6Var) {
        super(context);
        this.P = -1.0f;
        this.S = new Rect();
        this.W = new t5(this, 0L, 320L, gr.h);
        this.n0 = -1;
        this.u0 = t6.I.q();
        this.a = i10;
        this.b = p6Var;
        e6.b(this, 0.04f, 1.5f);
        this.c = new fo0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        z0 z0Var = new z0(frameLayout, p6Var, true);
        this.e = z0Var;
        frameLayout.setBackground(z0Var);
        addView(frameLayout, b6.e(-1, -1, zs.E1));
        d1 d1Var = new d1(context);
        this.f = d1Var;
        addView(d1Var, b6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        g9 g9Var = new g9(context);
        this.D = g9Var;
        g9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = b6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = d;
        frameLayout.addView(g9Var, d);
        kg.l1 l1Var = new kg.l1(3, context, p6Var);
        this.F = l1Var;
        l1Var.setImageReceiver(g9Var.getImageReceiver());
        frameLayout.addView(l1Var, b6.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        kg.l1 l1Var2 = new kg.l1(4, context, p6Var);
        this.G = l1Var2;
        l1Var2.setImageReceiver(g9Var.getImageReceiver());
        frameLayout.addView(l1Var2, b6.e(44, 44, 17));
        l1Var2.setAlpha(0.0f);
        l1Var2.setScaleX(0.3f);
        l1Var2.setScaleY(0.3f);
        l1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i11 = t6.G6;
        a7.V(textView, i11, p6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, b6.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = l4;
        a7.V(l4, i11, p6Var);
        l4.setGravity(17);
        l4.setTextSize(1, 12.0f);
        frameLayout.addView(l4, b6.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.voip.i0 i0Var = new org.telegram.ui.Components.voip.i0(this, context, 4);
        this.J = i0Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(i0Var, b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        do0 do0Var = new do0(context);
        this.K = do0Var;
        do0Var.setBackgroundColor(-16776961);
        i0Var.addView(do0Var, b6.c(0.0f, 0));
        i0Var.addView(textView2, b6.e(-2, 26, 17));
        do0Var.setBackground(new i1(t6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(t6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, b6.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new r8((p6) null);
        g9 g9Var2 = new g9(context);
        this.n = g9Var2;
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        g9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = b6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d10;
        frameLayout.addView(g9Var2, d10);
        this.s = b6.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e = z20.e(context, R.drawable.msg_limit_pin);
        e.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e, b6.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, b6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.mini_gram_14);
        imageView.setPadding(0, org.telegram.messenger.i0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, b6.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.i0.o());
        textView4.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, b6.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        d1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.e0;
        if (savedStarGift == null) {
            return null;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) starGift;
        }
        return null;
    }

    private void setRibbonColorKey(int i10) {
        this.f.setColor(t6.w0(i10, this.b));
        this.n0 = i10;
    }

    public final void a() {
        boolean q6 = t6.I.q();
        this.u0 = q6;
        int i10 = this.t0 ? 1090519039 : q6 ? 518759725 : 1088989954;
        int i11 = q6 ? -1333971 : this.s0 == 2 ? -4229632 : -2722014;
        this.K.setBackground(new i1(i10));
        this.L.setTextColor(i11);
        ImageView imageView = this.x;
        imageView.setColorFilter(i11);
        imageView.setBackground(t6.d0(org.telegram.messenger.i0.L(10.0f), i10));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.zj));
        hashSet.add(Integer.valueOf(t6.Aj));
        hashSet.add(Integer.valueOf(t6.ik));
        hashSet.add(Integer.valueOf(t6.kk));
        hashSet.add(Integer.valueOf(t6.d6));
    }

    public void b(x60 x60Var, Canvas canvas, float f7, float f10, float f11) {
        float f12;
        org.telegram.ui.Components.voip.i0 i0Var;
        float f13;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f14;
        Canvas canvas2 = canvas;
        g9 g9Var = this.n;
        g9 g9Var2 = this.D;
        z0 z0Var = this.e;
        d1 d1Var = this.f;
        Rect rect = this.S;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        org.telegram.ui.Components.voip.i0 i0Var2 = this.J;
        kg.l1 l1Var = this.F;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f7 / 2.0f, f10 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float L = uniqueStarGift != null ? org.telegram.messenger.i0.L(63.0f) * f11 : 0.0f;
        z0Var.setBounds(0, 0, (int) f7, (int) f10);
        z0Var.b(canvas2, f11);
        z0Var.getPadding(rect);
        float W1 = org.telegram.messenger.i0.W1(f11, org.telegram.messenger.i0.L(80.0f), org.telegram.messenger.i0.L(120.0f));
        float f15 = f10 - L;
        g9Var2.getImageReceiver().y0((f7 - W1) / 2.0f, (f15 - W1) / 2.0f, W1, W1);
        g9Var2.getImageReceiver().h(canvas2, null);
        bi0 B = g9Var2.getImageReceiver().B();
        if (B != null && B.k0) {
            x60Var.invalidate();
        }
        if (l1Var.getVisibility() != 0 || l1Var.getAlpha() <= 0.0f) {
            f12 = 1.0f;
            i0Var = i0Var2;
            f13 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        } else {
            canvas2.save();
            canvas2.translate((f7 - l1Var.getMeasuredWidth()) / 2.0f, org.telegram.messenger.i0.T1(l1Var.getY(), (f15 - l1Var.getMeasuredHeight()) / 2.0f, f11));
            f12 = 1.0f;
            i0Var = i0Var2;
            f13 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, l1Var.getWidth(), l1Var.getHeight(), (int) (l1Var.getAlpha() * (1.0f - f11) * 255.0f), 31);
            l1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f13) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(2.0f) + rect.left, org.telegram.messenger.i0.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (g9Var.getVisibility() == 0 && g9Var.getAlpha() > f13) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(2.0f) + rect.left, org.telegram.messenger.i0.L(2.0f) + rect.top);
            g9Var.draw(canvas2);
            canvas2.restore();
        }
        if (d1Var.getVisibility() != 0 || d1Var.getAlpha() <= f13) {
            f14 = f12;
        } else {
            canvas2.save();
            canvas2.translate(f7 - org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(2.0f));
            f14 = f12;
            float T1 = org.telegram.messenger.i0.T1(f14, 1.25f, f11);
            canvas2.scale(T1, T1);
            canvas2.translate(-d1Var.getWidth(), f13);
            d1Var.draw(canvas2);
            canvas2.restore();
        }
        if (tL_starGiftUnique != null) {
            if (this.Q == null) {
                this.Q = new qz0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.i0.o());
            }
            if (this.R == null) {
                this.R = new qz0(cd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            qz0 qz0Var = this.Q;
            qz0Var.p = f7 - org.telegram.messenger.i0.L(8.0f);
            float f16 = f14 - f11;
            qz0Var.c((f7 - this.Q.k()) / 2.0f, ((f10 - org.telegram.messenger.i0.L(40.0f)) - (this.Q.i() / 2.0f)) + (org.telegram.messenger.i0.L(50.0f) * f16), f11, -1, canvas);
            qz0 qz0Var2 = this.R;
            qz0Var2.p = f7 - org.telegram.messenger.i0.L(8.0f);
            qz0Var2.c((f7 - this.R.k()) / 2.0f, ((f10 - org.telegram.messenger.i0.L(19.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.i0.L(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        if (i0Var != null && i0Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(i0Var.getX(), i0Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, i0Var.getWidth(), i0Var.getHeight(), (int) (i0Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            i0Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f14 - f11) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z10, boolean z11) {
        if (this.m0 == null) {
            ep epVar = new ep(21, getContext(), null);
            this.m0 = epVar;
            epVar.b(-1, t6.d6, t6.k7);
            this.m0.setDrawUnchecked(false);
            this.d.addView(this.m0, b6.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.n.setVisibility(8);
        this.m0.a(z10, z11);
    }

    public final void d(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        boolean z12 = false;
        FrameLayout frameLayout = this.w;
        if (z11) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new a1(this, z10, 1)).start();
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setScaleX(z10 ? 1.0f : 0.3f);
            frameLayout.setScaleY(z10 ? 1.0f : 0.3f);
        }
        if (!this.T && this.V && !this.h0 && (savedStarGift = this.e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        g(z12, z11);
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float d = this.W.d(this.V);
        if (d > 0.0f) {
            this.c.a(canvas, d);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        if (!z11) {
            this.W.a(z10);
        }
        invalidate();
        g((this.T || !z10 || this.h0 || (savedStarGift = this.e0) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        ImageView imageView = this.x;
        if (z11) {
            imageView.animate().translationX(z10 ? org.telegram.messenger.i0.L(6.0f) : 0.0f).translationY(z10 ? org.telegram.messenger.i0.L(6.0f) : 0.0f).setDuration(320L).setInterpolator(gr.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z10 ? org.telegram.messenger.i0.L(6.0f) : 0.0f);
        imageView.setTranslationY(z10 ? org.telegram.messenger.i0.L(6.0f) : 0.0f);
    }

    public final void g(boolean z10, boolean z11) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        kg.l1 l1Var = this.G;
        if (z11) {
            l1Var.setVisibility(0);
            l1Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new a1(this, z10, 0)).start();
        } else {
            l1Var.setVisibility(z10 ? 0 : 8);
            l1Var.setAlpha(z10 ? 1.0f : 0.0f);
            l1Var.setScaleX(z10 ? 1.0f : 0.3f);
            l1Var.setScaleY(z10 ? 1.0f : 0.3f);
        }
    }

    public TL_stars.StarGift getGift() {
        return this.b0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.b0;
        if (starGift != null) {
            return starGift.id;
        }
        return 0L;
    }

    public kg.m getPremiumTier() {
        return this.a0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        long j10;
        long j11;
        long j12;
        boolean z15;
        long j13;
        boolean z16;
        d01 d01Var = this.N;
        ColorFilter colorFilter = null;
        if (d01Var != null) {
            d01Var.run();
            this.N = null;
        }
        j(starGift.getDocument(), starGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        z0 z0Var = this.e;
        z0Var.d(stargiftattributebackdrop);
        z0Var.e((TL_stars.starGiftAttributePattern) rh.e6.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z17 = starGift.auction;
        int[] iArr = v0;
        p6 p6Var = this.b;
        if (!z17 || (((z16 = starGift.sold_out) && !this.c0) || (z12 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z12 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            z0Var.g(iArr);
        } else if (z16) {
            int i10 = t6.Aj;
            int[] iArr2 = {t6.w0(i10, p6Var), t6.w0(i10, p6Var)};
            this.r0 = iArr2;
            z0Var.g(iArr2);
        } else {
            z0Var.g(iArr);
        }
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        g9 g9Var = this.D;
        g9Var.setTranslationY(0.0f);
        this.F.setVisibility(8);
        int i11 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i11);
        int i12 = z14 ? 0 : 8;
        TextView textView = this.y;
        textView.setVisibility(i12);
        textView.setTranslationX(starGift.resale_ton_only ? org.telegram.messenger.i0.L(23.0f) : 0.0f);
        textView.setTranslationY(starGift.resale_ton_only ? org.telegram.messenger.i0.L(1.0f) : 0.0f);
        if (z14) {
            StringBuilder sb2 = new StringBuilder("+");
            int i13 = starGift.craft_chance_permille;
            sb2.append((Object) (i13 <= 0 ? "<0.1%" : xh.i.I0(i13)));
            textView.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 49;
        g9Var.setLayoutParams(layoutParams);
        int i14 = this.a;
        g9 g9Var2 = this.n;
        if (!z13) {
            if ((!z12 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i14).getCurrentTime()) {
                g9Var2.setVisibility(0);
                g9Var2.setLayoutParams(this.s);
                int w02 = t6.w0(t6.kk, p6Var);
                this.q0 = w02;
                g9Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                this.p0 = true;
                g9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i15 = (z14 || z13) ? 0 : 8;
                TextView textView2 = this.L;
                textView2.setVisibility(i15);
                textView2.setTextSize(1, 12.0f);
                do0 do0Var = this.K;
                if (!z10) {
                    textView2.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
                    textView2.setText(cd.L0(2131749928, null));
                    int w9 = stargiftattributebackdrop != null ? t6.w(stargiftattributebackdrop.center_color | (-16777216), t6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    this.s0 = 0;
                    int L = org.telegram.messenger.i0.L(13.0f);
                    int w10 = t6.w(w9, 822083583);
                    int i16 = w9;
                    do0Var.setBackground(t6.k0(L, L, L, L, i16, w10, w10));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int L2 = org.telegram.messenger.i0.L(10.0f);
                    int w11 = t6.w(i16, 822083583);
                    imageView.setBackground(t6.k0(L2, L2, L2, L2, i16, w11, w11));
                } else if (z13) {
                    textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int w12 = t6.w(stargiftattributebackdrop.center_color | (-16777216), t6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(h8.S0("XTR " + cd.E(resellStars, ',')));
                    this.s0 = 0;
                    do0Var.setBackground(new i1(1895825407, w12));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(t6.d0(org.telegram.messenger.i0.L(10.0f), w12));
                    textView.setBackground(t6.d0(org.telegram.messenger.i0.L(9.0f), w12));
                } else {
                    textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
                    if (z12) {
                        long j14 = starGift.availability_resale;
                        if (j14 > 0) {
                            long j15 = starGift.resell_min_stars;
                            if (j14 > 1) {
                                j13 = j15;
                                if (j13 < ((org.telegram.messenger.l0) vp.r1(i14).y7.q.a).c) {
                                    j12 = j13;
                                    z15 = true;
                                    if (starGift.auction || starGift.availability_resale != 0) {
                                        StringBuilder sb3 = new StringBuilder("XTR ");
                                        sb3.append(cd.E(j12, ','));
                                        sb3.append(z15 ? "+" : "");
                                        textView2.setText(h8.Z0(false, sb3.toString(), 0.71f, null));
                                    } else {
                                        textView2.setText(cd.L0(starGift.sold_out ? 2131750345 : 2131750346, null));
                                    }
                                    this.s0 = 1;
                                    this.t0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                    a();
                                    textView.setBackground(t6.d0(org.telegram.messenger.i0.L(9.0f), stargiftattributebackdrop != null ? t6.w(stargiftattributebackdrop.center_color | (-16777216), t6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                }
                            } else {
                                j13 = j15;
                            }
                            j12 = j13;
                            z15 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb32 = new StringBuilder("XTR ");
                            sb32.append(cd.E(j12, ','));
                            sb32.append(z15 ? "+" : "");
                            textView2.setText(h8.Z0(false, sb32.toString(), 0.71f, null));
                            this.s0 = 1;
                            this.t0 = starGift instanceof TL_stars.TL_starGiftUnique;
                            a();
                            textView.setBackground(t6.d0(org.telegram.messenger.i0.L(9.0f), stargiftattributebackdrop != null ? t6.w(stargiftattributebackdrop.center_color | (-16777216), t6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    long j16 = starGift.stars;
                    if (z11 && starGift.can_upgrade) {
                        j10 = j16;
                        j11 = starGift.upgrade_stars;
                    } else {
                        j10 = j16;
                        j11 = 0;
                    }
                    j12 = j10 + j11;
                    z15 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb322 = new StringBuilder("XTR ");
                    sb322.append(cd.E(j12, ','));
                    sb322.append(z15 ? "+" : "");
                    textView2.setText(h8.Z0(false, sb322.toString(), 0.71f, null));
                    this.s0 = 1;
                    this.t0 = starGift instanceof TL_stars.TL_starGiftUnique;
                    a();
                    textView.setBackground(t6.d0(org.telegram.messenger.i0.L(9.0f), stargiftattributebackdrop != null ? t6.w(stargiftattributebackdrop.center_color | (-16777216), t6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                org.telegram.ui.Components.voip.i0 i0Var = this.J;
                ((ViewGroup.MarginLayoutParams) i0Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(103.0f);
                ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).gravity = 49;
                this.M.setVisibility(8);
                this.j0 = null;
                this.a0 = null;
                this.b0 = starGift;
                this.d0 = z10;
                this.e0 = null;
                this.f0 = z12;
                this.g0 = z13;
                this.h0 = false;
                this.i0 = z14;
                this.Q = null;
                this.R = null;
                d(false, false);
                l();
            }
            colorFilter = null;
        }
        g9Var2.setColorFilter(colorFilter);
        this.p0 = false;
        g9Var2.setVisibility(8);
        if (z14) {
        }
        TextView textView22 = this.L;
        textView22.setVisibility(i15);
        textView22.setTextSize(1, 12.0f);
        do0 do0Var2 = this.K;
        if (!z10) {
        }
        org.telegram.ui.Components.voip.i0 i0Var2 = this.J;
        ((ViewGroup.MarginLayoutParams) i0Var2.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(103.0f);
        ((FrameLayout.LayoutParams) i0Var2.getLayoutParams()).gravity = 49;
        this.M.setVisibility(8);
        this.j0 = null;
        this.a0 = null;
        this.b0 = starGift;
        this.d0 = z10;
        this.e0 = null;
        this.f0 = z12;
        this.g0 = z13;
        this.h0 = false;
        this.i0 = z14;
        this.Q = null;
        this.R = null;
        d(false, false);
        l();
    }

    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        long j10;
        boolean z12;
        do0 do0Var;
        boolean z13;
        d01 d01Var = this.N;
        if (d01Var != null) {
            d01Var.run();
            this.N = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        z0 z0Var = this.e;
        z0Var.d(stargiftattributebackdrop);
        z0Var.e((TL_stars.starGiftAttributePattern) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        z0Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        g9 g9Var = this.D;
        g9Var.setTranslationY(0.0f);
        kg.l1 l1Var = this.F;
        l1Var.H = true;
        l1Var.I = false;
        l1Var.invalidate();
        l1Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(t6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        kg.l1 l1Var2 = this.G;
        l1Var2.H = true;
        l1Var2.I = false;
        l1Var2.invalidate();
        l1Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(t6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i10 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(t6.L(org.telegram.messenger.i0.L(20.0f), t6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = org.telegram.messenger.i0.L(20.0f);
            int i11 = t6.Ci;
            p6 p6Var = this.b;
            a7.C(frameLayout, t6.L(L, t6.w0(i11, p6Var)), a7.N(i11), p6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        g9Var.setLayoutParams(layoutParams);
        if (this.l0 == savedStarGift) {
            l1Var.setVisibility(0);
            l1Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(gr.h).withEndAction(new org.telegram.ui.web.v1(9, this, savedStarGift)).start();
        } else {
            l1Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            l1Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            l1Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            l1Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z14 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        g9 g9Var2 = this.n;
        g9Var2.setColorFilter(null);
        this.p0 = false;
        g9Var2.setLayoutParams(this.r);
        int i12 = this.a;
        if (z14 && savedStarGift.name_hidden) {
            g9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            g9Var2.setVisibility(0);
            eq a2 = c8.a(44, "anonymous");
            j10 = 0;
            int L2 = org.telegram.messenger.i0.L(16.0f);
            int L3 = org.telegram.messenger.i0.L(16.0f);
            a2.e = L2;
            a2.f = L3;
            g9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long o10 = o5.o(savedStarGift.from_id);
            r8 r8Var = this.h;
            if (o10 > 0) {
                TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(o10));
                if (Z1 != null) {
                    g9Var2.setVisibility(0);
                    r8Var.r(Z1);
                    g9Var2.e(Z1, r8Var);
                } else {
                    g9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat L0 = vp.r1(i12).L0(Long.valueOf(-o10));
                if (L0 != null) {
                    g9Var2.setVisibility(0);
                    r8Var.q(L0);
                    g9Var2.e(L0, r8Var);
                } else {
                    g9Var2.setVisibility(8);
                }
            }
        }
        do0 do0Var2 = this.K;
        org.telegram.ui.Components.voip.i0 i0Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop == null || savedStarGift.gift.resell_amount == null) {
            if (z10) {
                textView.setVisibility(8);
                this.E.topMargin = org.telegram.messenger.i0.L(12.0f);
                this.E.bottomMargin = org.telegram.messenger.i0.L(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = this.E;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            if (z14) {
                textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                sc.e.u(textView, 1, 12.0f, null, 2131750068);
                z12 = true;
                do0Var = do0Var2;
            } else {
                textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j11 = starGift.stars;
                z12 = true;
                do0Var = do0Var2;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift.convert_stars;
                }
                textView.setText(h8.Z0(false, i0.a.k(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z14) {
                this.s0 = 0;
                textView.setTextColor(-1);
                do0Var.setBackground(new i1(1090519039));
                imageView.setBackground(t6.d0(org.telegram.messenger.i0.L(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.s0 = 2;
                this.t0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) i0Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.E;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            dq[] dqVarArr = new dq[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && o5.o(starGift2.owner_id) == d20.i(i12).e()) {
                z13 = true;
                textView.setText(h8.r1(h8.W0(true, "XTR " + ((Object) h8.L0(savedStarGift.gift.getResellAmount(sf.b.b).o(), 1.0f, ',')), 0.95f, dqVarArr, 0.0f, 1.0f), true));
            } else {
                z13 = true;
                textView.setText(h8.T0("XTR " + cd.E(savedStarGift.gift.getResellStars(), ','), 0.95f, dqVarArr));
            }
            dq dqVar = dqVarArr[0];
            if (dqVar != null) {
                float L4 = org.telegram.messenger.i0.L(0.5f);
                dqVar.r = 0.0f;
                dqVar.s = L4;
            }
            int w9 = t6.w(stargiftattributebackdrop.center_color | (-16777216), t6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.s0 = 0;
            do0Var2.setBackground(new i1(1895825407, w9));
            textView.setTextColor(-1);
            imageView.setBackground(t6.d0(org.telegram.messenger.i0.L(10.0f), w9));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) i0Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(79.0f);
            z12 = z13;
        }
        this.M.setVisibility(8);
        this.l0 = savedStarGift;
        this.j0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.e0;
        this.a0 = null;
        this.b0 = null;
        this.d0 = false;
        this.e0 = savedStarGift;
        this.f0 = false;
        this.g0 = false;
        this.h0 = z11;
        this.Q = null;
        this.R = null;
        d((!savedStarGift.pinned_to_top || (z14 && !savedStarGift.name_hidden)) ? false : z12, savedStarGift2 == savedStarGift ? z12 : false);
        l();
        if (savedStarGift2 == savedStarGift) {
            return z12;
        }
        return false;
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        g9 g9Var = this.D;
        if (document == null) {
            g9Var.b();
            this.k0 = null;
        } else {
            if (this.k0 == document) {
                return;
            }
            this.k0 = document;
            TLRPC.PhotoSize w9 = b8.w(document.thumbs, org.telegram.messenger.i0.L(100.0f), false, null, false);
            g9Var.m(ic.b(document), "80_80_nolimit_pcache", ic.c(w9, document), "80_80_nolimit_pcache", v5.f(document, t6.a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f7) {
        if (this.P != f7) {
            this.P = f7;
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = uniqueStarGift == null ? null : (TL_stars.starGiftAttributeBackdrop) rh.e6.l(uniqueStarGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            int i10 = stargiftattributebackdrop == null ? -11184811 : stargiftattributebackdrop.pattern_color | (-16777216);
            float f10 = 1.0f - f7;
            ColorMatrixColorFilter colorMatrixColorFilter = f7 <= 0.0f ? null : new ColorMatrixColorFilter(new float[]{f10, 0.0f, 0.0f, 0.0f, Color.red(i10) * f7, 0.0f, f10, 0.0f, 0.0f, Color.green(i10) * f7, 0.0f, 0.0f, f10, 0.0f, Color.blue(i10) * f7, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f7), 0.0f});
            g9 g9Var = this.D;
            g9Var.setColorFilter(colorMatrixColorFilter);
            g9Var.getImageReceiver().u0 = f7 == 0.0f;
            if (f7 > 0.0f) {
                g9Var.getImageReceiver().Q0();
                bi0 B = g9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            g9Var.invalidate();
        }
        if (this.O != z10) {
            this.O = z10;
            if (getUniqueStarGift() != null) {
                String L0 = z10 ? cd.L0(2131743130, null) : i0.a.k(r2.num, ',', new StringBuilder("#"));
                d1 d1Var = this.f;
                if (!z11) {
                    d1Var.b(L0, true);
                    return;
                }
                d1Var.getClass();
                d1Var.b = L0;
                d1Var.a.g(10, L0);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.e0;
        d1 d1Var = this.f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    d1Var.setBackdrop(null);
                    d1Var.setVisibility(8);
                    return;
                }
                d1Var.setVisibility(0);
                setRibbonColorKey(t6.zj);
                d1Var.setStrokeColor(0);
                this.o0 = false;
                d1Var.setBackdrop(null);
                d1Var.b(cd.a0(null, null, 2131750144, org.telegram.messenger.i0.o0(this.e0.gift.availability_total, 0)), true);
                return;
            }
            d1Var.setVisibility(0);
            if (this.e0.gift.resell_amount == null) {
                setRibbonColorKey(t6.zj);
                d1Var.setStrokeColor(0);
                this.o0 = false;
                d1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) rh.e6.l(this.e0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                d1Var.b(i0.a.k(this.e0.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int i10 = t6.d6;
            p6 p6Var = this.b;
            int w9 = t6.w(t6.w0(i10, p6Var), t6.r1(0.04f, t6.w0(t6.G6, p6Var)));
            setRibbonColorKey(t6.ik);
            d1Var.setStrokeColor(w9);
            this.o0 = true;
            d1Var.setBackdrop(null);
            d1Var.b(cd.L0(2131750098, null), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.b0;
        if (starGift2 == null) {
            kg.m mVar = this.a0;
            if (mVar != null) {
                if (mVar.b() <= 0) {
                    d1Var.setVisibility(8);
                    d1Var.setBackdrop(null);
                    d1Var.setStrokeColor(0);
                    this.o0 = false;
                    return;
                }
                d1Var.setVisibility(0);
                d1Var.setBackdrop(null);
                this.n0 = -1;
                d1Var.a(-2535425, -8229377);
                d1Var.setStrokeColor(0);
                this.o0 = false;
                String a02 = cd.a0(null, null, 2131749673, Integer.valueOf(this.a0.b()));
                d1Var.b = a02;
                d1Var.a.f(12, a02, true);
                return;
            }
            return;
        }
        if (this.g0 || this.i0) {
            d1Var.setVisibility(0);
            setRibbonColorKey(t6.zj);
            d1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) rh.e6.l(this.b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            d1Var.setStrokeColor(0);
            this.o0 = false;
            d1Var.b(i0.a.k(this.b0.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.f0 && starGift2.availability_resale > 0) {
            d1Var.setVisibility(0);
            setRibbonColorKey(t6.ik);
            d1Var.setStrokeColor(0);
            this.o0 = false;
            d1Var.setBackdrop(null);
            d1Var.b(cd.L0(2131750039, null), false);
            return;
        }
        if (this.d0) {
            d1Var.setVisibility(0);
            setRibbonColorKey(t6.zj);
            d1Var.setStrokeColor(0);
            this.o0 = false;
            d1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) rh.e6.l(this.b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            d1Var.b(cd.a0(null, null, 2131750144, org.telegram.messenger.i0.o0(this.b0.availability_issued, 0)), true);
            return;
        }
        boolean z10 = starGift2.limited;
        if (z10 && starGift2.availability_remains <= 0) {
            d1Var.setVisibility(0);
            setRibbonColorKey(t6.Aj);
            d1Var.setStrokeColor(0);
            this.o0 = false;
            d1Var.setBackdrop(null);
            d1Var.b(cd.L0(2131749985, null), true);
            return;
        }
        if (starGift2.auction) {
            d1Var.setVisibility(0);
            d1Var.setBackdrop(null);
            this.n0 = -1;
            d1Var.a(-2650077, -4227818);
            d1Var.setStrokeColor(0);
            this.o0 = false;
            if (this.b0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                d1Var.b(cd.L0(2131750142, null), true);
                return;
            } else {
                d1Var.b(cd.L0(2131750143, null), true);
                return;
            }
        }
        if (starGift2.require_premium) {
            d1Var.setVisibility(0);
            d1Var.setBackdrop(null);
            this.n0 = -1;
            d1Var.a(-2650077, -4227818);
            d1Var.setStrokeColor(0);
            this.o0 = false;
            d1Var.b(cd.L0(2131750141, null), true);
            return;
        }
        if (!z10) {
            d1Var.setBackdrop(null);
            d1Var.setStrokeColor(0);
            this.o0 = false;
            d1Var.setVisibility(8);
            return;
        }
        d1Var.setVisibility(0);
        setRibbonColorKey(t6.zj);
        d1Var.setStrokeColor(0);
        this.o0 = false;
        d1Var.setBackdrop(null);
        d1Var.b(cd.L0(2131750140, null), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[Catch: Exception -> 0x0163, TRY_LEAVE, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0150 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        TL_stars.StarGift starGift;
        TextView textView;
        d1 d1Var;
        org.telegram.ui.Components.voip.i0 i0Var;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        ep epVar;
        g9 g9Var;
        long o10;
        TextView textView2;
        CharSequence text;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (isEnabled()) {
            accessibilityNodeInfo.addAction(16);
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String str = null;
            if (this.a0 == null) {
                TL_stars.SavedStarGift savedStarGift3 = this.e0;
                if (savedStarGift3 != null && (starGift = savedStarGift3.gift) != null) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.title)) {
                        charSequence = this.e0.gift.title;
                        if (TextUtils.isEmpty(charSequence)) {
                        }
                        sb2.append(charSequence);
                        textView = this.I;
                        if (textView != null) {
                        }
                        d1Var = this.f;
                        if (d1Var != null) {
                        }
                        i0Var = this.J;
                        if (i0Var != null) {
                        }
                        savedStarGift = this.e0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.e0;
                        if (savedStarGift2 != null) {
                        }
                        epVar = this.m0;
                        if (epVar != null) {
                        }
                        accessibilityNodeInfo.setContentDescription(sb2.toString());
                    }
                    charSequence = null;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb2.append(charSequence);
                    textView = this.I;
                    if (textView != null) {
                    }
                    d1Var = this.f;
                    if (d1Var != null) {
                    }
                    i0Var = this.J;
                    if (i0Var != null) {
                    }
                    savedStarGift = this.e0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.e0;
                    if (savedStarGift2 != null) {
                    }
                    epVar = this.m0;
                    if (epVar != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb2.toString());
                }
                TL_stars.StarGift starGift2 = this.b0;
                if (starGift2 != null && (starGift2 instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift2.title)) {
                    charSequence = this.b0.title;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb2.append(charSequence);
                    textView = this.I;
                    if (textView != null) {
                    }
                    d1Var = this.f;
                    if (d1Var != null) {
                    }
                    i0Var = this.J;
                    if (i0Var != null) {
                    }
                    savedStarGift = this.e0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.e0;
                    if (savedStarGift2 != null) {
                    }
                    epVar = this.m0;
                    if (epVar != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb2.toString());
                }
                charSequence = null;
                if (TextUtils.isEmpty(charSequence)) {
                }
                sb2.append(charSequence);
                textView = this.I;
                if (textView != null) {
                }
                d1Var = this.f;
                if (d1Var != null) {
                }
                i0Var = this.J;
                if (i0Var != null) {
                }
                savedStarGift = this.e0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.e0;
                if (savedStarGift2 != null) {
                }
                epVar = this.m0;
                if (epVar != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            TextView textView3 = this.H;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = cd.L0(2131750201, null);
                }
                sb2.append(charSequence);
                textView = this.I;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb2.append(", ");
                    sb2.append(textView.getText());
                }
                d1Var = this.f;
                if (d1Var != null && d1Var.getVisibility() == 0) {
                    text = d1Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb2.append(", ");
                        sb2.append(text);
                    }
                }
                i0Var = this.J;
                if (i0Var != null && i0Var.getVisibility() == 0 && (textView2 = this.L) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb2.append(", ");
                    sb2.append(textView2.getText());
                }
                savedStarGift = this.e0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb2.append(", ");
                    sb2.append(cd.L0(2131750209, null));
                }
                savedStarGift2 = this.e0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (g9Var = this.n) != null && g9Var.getVisibility() == 0) {
                    o10 = o5.o(this.e0.from_id);
                    if (o10 != 0) {
                        int i10 = this.a;
                        if (o10 > 0) {
                            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(o10));
                            if (Z1 != null) {
                                str = h20.p(Z1);
                            }
                        } else {
                            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-o10));
                            if (L0 != null) {
                                str = L0.title;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb2.append(", ");
                            sb2.append((CharSequence) str);
                        }
                    }
                }
                epVar = this.m0;
                if (epVar != null && epVar.a.q) {
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(true);
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            charSequence = null;
            if (TextUtils.isEmpty(charSequence)) {
            }
            sb2.append(charSequence);
            textView = this.I;
            if (textView != null) {
                sb2.append(", ");
                sb2.append(textView.getText());
            }
            d1Var = this.f;
            if (d1Var != null) {
                text = d1Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            i0Var = this.J;
            if (i0Var != null) {
                sb2.append(", ");
                sb2.append(textView2.getText());
            }
            savedStarGift = this.e0;
            if (savedStarGift != null) {
                sb2.append(", ");
                sb2.append(cd.L0(2131750209, null));
            }
            savedStarGift2 = this.e0;
            if (savedStarGift2 != null) {
                o10 = o5.o(this.e0.from_id);
                if (o10 != 0) {
                }
            }
            epVar = this.m0;
            if (epVar != null) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i10) {
        this.D.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        this.n0 = -1;
        d1 d1Var = this.f;
        d1Var.setColor(i10);
        d1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        d1 d1Var = this.f;
        d1Var.setVisibility(0);
        setRibbonColorKey(t6.zj);
        d1Var.setStrokeColor(0);
        this.o0 = false;
        d1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) rh.e6.l(this.b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        d1Var.b(cd.a0(null, null, 2131750144, org.telegram.messenger.i0.o0(i10, 0)), true);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int w02;
        g9 g9Var;
        int w03;
        try {
            boolean q6 = t6.I.q();
            if (q6 != this.u0) {
                this.u0 = q6;
                if (this.s0 != 0 && this.K != null && this.L != null && this.x != null) {
                    a();
                }
                TextView textView = this.M;
                if (textView != null) {
                    textView.setTextColor(q6 ? -1333971 : -2722014);
                }
            }
            d1 d1Var = this.f;
            p6 p6Var = this.b;
            if (d1Var != null) {
                int i10 = this.n0;
                if (i10 >= 0) {
                    f1 f1Var = d1Var.a;
                    ((Paint) f1Var.b).setColor(t6.w0(i10, p6Var));
                    f1Var.invalidateSelf();
                }
                if (this.o0) {
                    d1Var.setStrokeColor(t6.w(t6.w0(t6.d6, p6Var), t6.r1(0.04f, t6.w0(t6.G6, p6Var))));
                }
                d1Var.invalidate();
            }
            if (this.p0 && (g9Var = this.n) != null && (w03 = t6.w0(t6.kk, p6Var)) != this.q0) {
                this.q0 = w03;
                g9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            z0 z0Var = this.e;
            if (z0Var != null) {
                int[] iArr = this.r0;
                if (iArr != null && z0Var.m == iArr && (iArr[0] != (w02 = t6.w0(t6.Aj, p6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    z0Var.n = null;
                }
                z0Var.invalidateSelf();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}

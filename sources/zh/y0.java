package zh;

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
import bi.dd;
import bi.ea;
import bi.pb;
import bi.yc;
import c8.ha;
import c8.ka;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.o00;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class y0 extends FrameLayout implements c6 {
    public static final int[] v0 = {-2781403, -3635939};
    public final k9 D;
    public FrameLayout.LayoutParams E;
    public final ug.z0 F;
    public final ug.z0 G;
    public final TextView H;
    public final TextView I;
    public final w41 J;
    public final o00 K;
    public final TextView L;
    public final TextView M;
    public pb N;
    public boolean O;
    public float P;
    public my0 Q;
    public my0 R;
    public final Rect S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final v5 W;
    public final int a;
    public ug.j a0;
    public final h6 b;
    public TL_stars.StarGift b0;
    public final en0 c;
    public boolean c0;
    public final FrameLayout d;
    public boolean d0;
    public final v0 e;
    public TL_stars.SavedStarGift e0;
    public final z0 f;
    public boolean f0;
    public boolean g0;
    public final v8 h;
    public boolean h0;
    public boolean i0;
    public ug.j j0;
    public TLRPC.Document k0;
    public TL_stars.SavedStarGift l0;
    public wo m0;
    public final k9 n;
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

    public y0(int i7, Context context, h6 h6Var) {
        super(context);
        this.P = -1.0f;
        this.S = new Rect();
        this.W = new v5(this, 0L, 320L, wq.h);
        this.n0 = -1;
        this.u0 = m6.I.q();
        this.a = i7;
        this.b = h6Var;
        ka.b(this, 0.04f, 1.5f);
        this.c = new en0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        v0 v0Var = new v0(frameLayout, h6Var, true);
        this.e = v0Var;
        frameLayout.setBackground(v0Var);
        addView(frameLayout, ha.e(-1, -1, qs.E1));
        z0 z0Var = new z0(context);
        this.f = z0Var;
        addView(z0Var, ha.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        k9 k9Var = new k9(context);
        this.D = k9Var;
        k9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = ha.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = d;
        frameLayout.addView(k9Var, d);
        ug.z0 z0Var2 = new ug.z0(3, context, h6Var);
        this.F = z0Var2;
        z0Var2.setImageReceiver(k9Var.getImageReceiver());
        frameLayout.addView(z0Var2, ha.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        ug.z0 z0Var3 = new ug.z0(4, context, h6Var);
        this.G = z0Var3;
        z0Var3.setImageReceiver(k9Var.getImageReceiver());
        frameLayout.addView(z0Var3, ha.e(44, 44, 17));
        z0Var3.setAlpha(0.0f);
        z0Var3.setScaleX(0.3f);
        z0Var3.setScaleY(0.3f);
        z0Var3.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i10 = m6.G6;
        t6.U(textView, i10, h6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView i11 = org.telegram.ui.Cells.f1.i(frameLayout, textView, ha.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = i11;
        t6.U(i11, i10, h6Var);
        i11.setGravity(17);
        i11.setTextSize(1, 12.0f);
        frameLayout.addView(i11, ha.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        w41 w41Var = new w41(13, context, this);
        this.J = w41Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(w41Var, ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        o00 o00Var = new o00(context);
        this.K = o00Var;
        o00Var.setBackgroundColor(-16776961);
        w41Var.addView(o00Var, ha.c(0.0f, 0));
        w41Var.addView(textView2, ha.e(-2, 26, 17));
        o00Var.setBackground(new d1(m6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(m6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, ha.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new v8((h6) null);
        k9 k9Var2 = new k9(context);
        this.n = k9Var2;
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        k9Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = ha.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d2;
        frameLayout.addView(k9Var2, d2);
        this.s = ha.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_limit_pin);
        e10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e10, ha.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, ha.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.mini_gram_14);
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, ha.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, ha.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        z0Var.setImportantForAccessibility(2);
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

    private void setRibbonColorKey(int i7) {
        this.f.setColor(m6.w0(i7, this.b));
        this.n0 = i7;
    }

    public final void a() {
        boolean q10 = m6.I.q();
        this.u0 = q10;
        int i7 = this.t0 ? 1090519039 : q10 ? 518759725 : 1088989954;
        int i10 = q10 ? -1333971 : this.s0 == 2 ? -4229632 : -2722014;
        this.K.setBackground(new d1(i7));
        this.L.setTextColor(i10);
        ImageView imageView = this.x;
        imageView.setColorFilter(i10);
        imageView.setBackground(m6.d0(org.telegram.messenger.g0.L(10.0f), i7));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.zj));
        hashSet.add(Integer.valueOf(m6.Aj));
        hashSet.add(Integer.valueOf(m6.ik));
        hashSet.add(Integer.valueOf(m6.kk));
        hashSet.add(Integer.valueOf(m6.d6));
    }

    public void b(i60 i60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        w41 w41Var;
        float f14;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f15;
        Canvas canvas2 = canvas;
        k9 k9Var = this.n;
        k9 k9Var2 = this.D;
        v0 v0Var = this.e;
        z0 z0Var = this.f;
        Rect rect = this.S;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        w41 w41Var2 = this.J;
        ug.z0 z0Var2 = this.F;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float L = uniqueStarGift != null ? org.telegram.messenger.g0.L(63.0f) * f12 : 0.0f;
        v0Var.setBounds(0, 0, (int) f10, (int) f11);
        v0Var.b(canvas2, f12);
        v0Var.getPadding(rect);
        float W1 = org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(120.0f));
        float f16 = f11 - L;
        k9Var2.getImageReceiver().y0((f10 - W1) / 2.0f, (f16 - W1) / 2.0f, W1, W1);
        k9Var2.getImageReceiver().h(canvas2, null);
        zg0 B = k9Var2.getImageReceiver().B();
        if (B != null && B.k0) {
            i60Var.invalidate();
        }
        if (z0Var2.getVisibility() != 0 || z0Var2.getAlpha() <= 0.0f) {
            f13 = 1.0f;
            w41Var = w41Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        } else {
            canvas2.save();
            canvas2.translate((f10 - z0Var2.getMeasuredWidth()) / 2.0f, org.telegram.messenger.g0.T1(z0Var2.getY(), (f16 - z0Var2.getMeasuredHeight()) / 2.0f, f12));
            f13 = 1.0f;
            w41Var = w41Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, z0Var2.getWidth(), z0Var2.getHeight(), (int) (z0Var2.getAlpha() * (1.0f - f12) * 255.0f), 31);
            z0Var2.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f14) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (k9Var.getVisibility() == 0 && k9Var.getAlpha() > f14) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            k9Var.draw(canvas2);
            canvas2.restore();
        }
        if (z0Var.getVisibility() != 0 || z0Var.getAlpha() <= f14) {
            f15 = f13;
        } else {
            canvas2.save();
            canvas2.translate(f10 - org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(2.0f));
            f15 = f13;
            float T1 = org.telegram.messenger.g0.T1(f15, 1.25f, f12);
            canvas2.scale(T1, T1);
            canvas2.translate(-z0Var.getWidth(), f14);
            z0Var.draw(canvas2);
            canvas2.restore();
        }
        if (tL_starGiftUnique != null) {
            if (this.Q == null) {
                this.Q = new my0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.g0.o());
            }
            if (this.R == null) {
                this.R = new my0(id.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            my0 my0Var = this.Q;
            my0Var.p = f10 - org.telegram.messenger.g0.L(8.0f);
            float f17 = f15 - f12;
            my0Var.c((f10 - this.Q.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(40.0f)) - (this.Q.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f17), f12, -1, canvas);
            my0 my0Var2 = this.R;
            my0Var2.p = f10 - org.telegram.messenger.g0.L(8.0f);
            my0Var2.c((f10 - this.R.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(19.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f17), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        if (w41Var != null && w41Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(w41Var.getX(), w41Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, w41Var.getWidth(), w41Var.getHeight(), (int) (w41Var.getAlpha() * (f15 - f12) * 255.0f), 31);
            w41Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f15 - f12) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z9, boolean z10) {
        if (this.m0 == null) {
            wo woVar = new wo(21, getContext(), null);
            this.m0 = woVar;
            woVar.b(-1, m6.d6, m6.k7);
            this.m0.setDrawUnchecked(false);
            this.d.addView(this.m0, ha.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.n.setVisibility(8);
        this.m0.a(z9, z10);
    }

    public final void d(boolean z9, boolean z10) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.T == z9) {
            return;
        }
        this.T = z9;
        boolean z11 = false;
        FrameLayout frameLayout = this.w;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.3f).scaleY(z9 ? 1.0f : 0.3f).withEndAction(new w0(this, z9, 1)).start();
        } else {
            frameLayout.setVisibility(z9 ? 0 : 8);
            frameLayout.setAlpha(z9 ? 1.0f : 0.0f);
            frameLayout.setScaleX(z9 ? 1.0f : 0.3f);
            frameLayout.setScaleY(z9 ? 1.0f : 0.3f);
        }
        if (!this.T && this.V && !this.h0 && (savedStarGift = this.e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z11 = true;
        }
        g(z11, z10);
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

    public final void e(boolean z9, boolean z10) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.V == z9) {
            return;
        }
        this.V = z9;
        if (!z10) {
            this.W.a(z9);
        }
        invalidate();
        g((this.T || !z9 || this.h0 || (savedStarGift = this.e0) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z10);
    }

    public final void f(boolean z9, boolean z10) {
        this.e.f(z9, z10);
        ImageView imageView = this.x;
        if (z10) {
            imageView.animate().translationX(z9 ? org.telegram.messenger.g0.L(6.0f) : 0.0f).translationY(z9 ? org.telegram.messenger.g0.L(6.0f) : 0.0f).setDuration(320L).setInterpolator(wq.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z9 ? org.telegram.messenger.g0.L(6.0f) : 0.0f);
        imageView.setTranslationY(z9 ? org.telegram.messenger.g0.L(6.0f) : 0.0f);
    }

    public final void g(boolean z9, boolean z10) {
        if (this.U == z9) {
            return;
        }
        this.U = z9;
        ug.z0 z0Var = this.G;
        if (z10) {
            z0Var.setVisibility(0);
            z0Var.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.3f).scaleY(z9 ? 1.0f : 0.3f).withEndAction(new w0(this, z9, 0)).start();
        } else {
            z0Var.setVisibility(z9 ? 0 : 8);
            z0Var.setAlpha(z9 ? 1.0f : 0.0f);
            z0Var.setScaleX(z9 ? 1.0f : 0.3f);
            z0Var.setScaleY(z9 ? 1.0f : 0.3f);
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

    public ug.j getPremiumTier() {
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
    public final void h(TL_stars.StarGift starGift, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        long j3;
        long j10;
        long j11;
        boolean z14;
        long j12;
        boolean z15;
        pb pbVar = this.N;
        ColorFilter colorFilter = null;
        if (pbVar != null) {
            pbVar.run();
            this.N = null;
        }
        j(starGift.getDocument(), starGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        v0 v0Var = this.e;
        v0Var.d(stargiftattributebackdrop);
        v0Var.e((TL_stars.starGiftAttributePattern) ea.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z16 = starGift.auction;
        int[] iArr = v0;
        h6 h6Var = this.b;
        if (!z16 || (((z15 = starGift.sold_out) && !this.c0) || (z11 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z11 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            v0Var.g(iArr);
        } else if (z15) {
            int i7 = m6.Aj;
            int[] iArr2 = {m6.w0(i7, h6Var), m6.w0(i7, h6Var)};
            this.r0 = iArr2;
            v0Var.g(iArr2);
        } else {
            v0Var.g(iArr);
        }
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        k9 k9Var = this.D;
        k9Var.setTranslationY(0.0f);
        this.F.setVisibility(8);
        int i10 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i10);
        int i11 = z13 ? 0 : 8;
        TextView textView = this.y;
        textView.setVisibility(i11);
        textView.setTranslationX(starGift.resale_ton_only ? org.telegram.messenger.g0.L(23.0f) : 0.0f);
        textView.setTranslationY(starGift.resale_ton_only ? org.telegram.messenger.g0.L(1.0f) : 0.0f);
        if (z13) {
            StringBuilder sb2 = new StringBuilder("+");
            int i12 = starGift.craft_chance_permille;
            sb2.append((Object) (i12 <= 0 ? "<0.1%" : hi.j.J0(i12)));
            textView.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 49;
        k9Var.setLayoutParams(layoutParams);
        int i13 = this.a;
        k9 k9Var2 = this.n;
        if (!z12) {
            if ((!z11 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i13).getCurrentTime()) {
                k9Var2.setVisibility(0);
                k9Var2.setLayoutParams(this.s);
                int w02 = m6.w0(m6.kk, h6Var);
                this.q0 = w02;
                k9Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                this.p0 = true;
                k9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i14 = (z13 || z12) ? 0 : 8;
                TextView textView2 = this.L;
                textView2.setVisibility(i14);
                textView2.setTextSize(1, 12.0f);
                o00 o00Var = this.K;
                if (!z9) {
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    textView2.setText(id.M0(2131749919, null));
                    int w10 = stargiftattributebackdrop != null ? m6.w(stargiftattributebackdrop.center_color | (-16777216), m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    this.s0 = 0;
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int w11 = m6.w(w10, 822083583);
                    int i15 = w10;
                    o00Var.setBackground(m6.k0(L, L, L, L, i15, w11, w11));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int L2 = org.telegram.messenger.g0.L(10.0f);
                    int w12 = m6.w(i15, 822083583);
                    imageView.setBackground(m6.k0(L2, L2, L2, L2, i15, w12, w12));
                } else if (z12) {
                    textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int w13 = m6.w(stargiftattributebackdrop.center_color | (-16777216), m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(dd.T0("XTR " + id.E(resellStars, ',')));
                    this.s0 = 0;
                    o00Var.setBackground(new d1(1895825407, w13));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(m6.d0(org.telegram.messenger.g0.L(10.0f), w13));
                    textView.setBackground(m6.d0(org.telegram.messenger.g0.L(9.0f), w13));
                } else {
                    textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    if (z11) {
                        long j13 = starGift.availability_resale;
                        if (j13 > 0) {
                            long j14 = starGift.resell_min_stars;
                            if (j13 > 1) {
                                j12 = j14;
                                if (j12 < ((org.telegram.messenger.j0) qp.s1(i13).x7.q.b).c) {
                                    j11 = j12;
                                    z14 = true;
                                    if (starGift.auction || starGift.availability_resale != 0) {
                                        StringBuilder sb3 = new StringBuilder("XTR ");
                                        sb3.append(id.E(j11, ','));
                                        sb3.append(z14 ? "+" : "");
                                        textView2.setText(dd.a1(false, sb3.toString(), 0.71f, null));
                                    } else {
                                        textView2.setText(id.M0(starGift.sold_out ? 2131750336 : 2131750337, null));
                                    }
                                    this.s0 = 1;
                                    this.t0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                    a();
                                    textView.setBackground(m6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop != null ? m6.w(stargiftattributebackdrop.center_color | (-16777216), m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                }
                            } else {
                                j12 = j14;
                            }
                            j11 = j12;
                            z14 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb32 = new StringBuilder("XTR ");
                            sb32.append(id.E(j11, ','));
                            sb32.append(z14 ? "+" : "");
                            textView2.setText(dd.a1(false, sb32.toString(), 0.71f, null));
                            this.s0 = 1;
                            this.t0 = starGift instanceof TL_stars.TL_starGiftUnique;
                            a();
                            textView.setBackground(m6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop != null ? m6.w(stargiftattributebackdrop.center_color | (-16777216), m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    long j15 = starGift.stars;
                    if (z10 && starGift.can_upgrade) {
                        j3 = j15;
                        j10 = starGift.upgrade_stars;
                    } else {
                        j3 = j15;
                        j10 = 0;
                    }
                    j11 = j3 + j10;
                    z14 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb322 = new StringBuilder("XTR ");
                    sb322.append(id.E(j11, ','));
                    sb322.append(z14 ? "+" : "");
                    textView2.setText(dd.a1(false, sb322.toString(), 0.71f, null));
                    this.s0 = 1;
                    this.t0 = starGift instanceof TL_stars.TL_starGiftUnique;
                    a();
                    textView.setBackground(m6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop != null ? m6.w(stargiftattributebackdrop.center_color | (-16777216), m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                w41 w41Var = this.J;
                ((ViewGroup.MarginLayoutParams) w41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
                ((FrameLayout.LayoutParams) w41Var.getLayoutParams()).gravity = 49;
                this.M.setVisibility(8);
                this.j0 = null;
                this.a0 = null;
                this.b0 = starGift;
                this.d0 = z9;
                this.e0 = null;
                this.f0 = z11;
                this.g0 = z12;
                this.h0 = false;
                this.i0 = z13;
                this.Q = null;
                this.R = null;
                d(false, false);
                l();
            }
            colorFilter = null;
        }
        k9Var2.setColorFilter(colorFilter);
        this.p0 = false;
        k9Var2.setVisibility(8);
        if (z13) {
        }
        TextView textView22 = this.L;
        textView22.setVisibility(i14);
        textView22.setTextSize(1, 12.0f);
        o00 o00Var2 = this.K;
        if (!z9) {
        }
        w41 w41Var2 = this.J;
        ((ViewGroup.MarginLayoutParams) w41Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        ((FrameLayout.LayoutParams) w41Var2.getLayoutParams()).gravity = 49;
        this.M.setVisibility(8);
        this.j0 = null;
        this.a0 = null;
        this.b0 = starGift;
        this.d0 = z9;
        this.e0 = null;
        this.f0 = z11;
        this.g0 = z12;
        this.h0 = false;
        this.i0 = z13;
        this.Q = null;
        this.R = null;
        d(false, false);
        l();
    }

    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z9, boolean z10) {
        long j3;
        boolean z11;
        o00 o00Var;
        boolean z12;
        pb pbVar = this.N;
        if (pbVar != null) {
            pbVar.run();
            this.N = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        v0 v0Var = this.e;
        v0Var.d(stargiftattributebackdrop);
        v0Var.e((TL_stars.starGiftAttributePattern) ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        v0Var.g(null);
        int i7 = 8;
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        k9 k9Var = this.D;
        k9Var.setTranslationY(0.0f);
        ug.z0 z0Var = this.F;
        z0Var.H = true;
        z0Var.I = false;
        z0Var.invalidate();
        z0Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(m6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        ug.z0 z0Var2 = this.G;
        z0Var2.H = true;
        z0Var2.I = false;
        z0Var2.invalidate();
        z0Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(m6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i10 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(m6.L(org.telegram.messenger.g0.L(20.0f), m6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            int i11 = m6.Ci;
            h6 h6Var = this.b;
            t6.B(frameLayout, m6.L(L, m6.w0(i11, h6Var)), t6.M(i11), h6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        k9Var.setLayoutParams(layoutParams);
        if (this.l0 == savedStarGift) {
            z0Var.setVisibility(0);
            z0Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(wq.h).withEndAction(new yf.b(i7, this, savedStarGift)).start();
        } else {
            z0Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            z0Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            z0Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            z0Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z13 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        k9 k9Var2 = this.n;
        k9Var2.setColorFilter(null);
        this.p0 = false;
        k9Var2.setLayoutParams(this.r);
        int i12 = this.a;
        if (z13 && savedStarGift.name_hidden) {
            k9Var2.setVisibility(8);
            j3 = 0;
        } else if (savedStarGift.name_hidden) {
            k9Var2.setVisibility(0);
            xp a10 = yc.a(44, "anonymous");
            j3 = 0;
            int L2 = org.telegram.messenger.g0.L(16.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L2;
            a10.f = L3;
            k9Var2.setImageDrawable(a10);
        } else {
            j3 = 0;
            long o4 = m5.o(savedStarGift.from_id);
            v8 v8Var = this.h;
            if (o4 > 0) {
                TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(o4));
                if (a22 != null) {
                    k9Var2.setVisibility(0);
                    v8Var.r(a22);
                    k9Var2.e(a22, v8Var);
                } else {
                    k9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat M0 = qp.s1(i12).M0(Long.valueOf(-o4));
                if (M0 != null) {
                    k9Var2.setVisibility(0);
                    v8Var.q(M0);
                    k9Var2.e(M0, v8Var);
                } else {
                    k9Var2.setVisibility(8);
                }
            }
        }
        o00 o00Var2 = this.K;
        w41 w41Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop == null || savedStarGift.gift.resell_amount == null) {
            if (z9) {
                textView.setVisibility(8);
                this.E.topMargin = org.telegram.messenger.g0.L(12.0f);
                this.E.bottomMargin = org.telegram.messenger.g0.L(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = this.E;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            if (z13) {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                jg.g.v(textView, 1, 12.0f, null, 2131750059);
                z11 = true;
                o00Var = o00Var2;
            } else {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j10 = starGift.stars;
                z11 = true;
                o00Var = o00Var2;
                long j11 = savedStarGift.convert_stars;
                if (j11 <= j3) {
                    j11 = starGift.convert_stars;
                }
                textView.setText(dd.a1(false, jg.g.m(Math.max(j10, j11), ',', sb2), 0.66f, null));
            }
            if (z13) {
                this.s0 = 0;
                textView.setTextColor(-1);
                o00Var.setBackground(new d1(1090519039));
                imageView.setBackground(m6.d0(org.telegram.messenger.g0.L(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.s0 = 2;
                this.t0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) w41Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) w41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.E;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            wp[] wpVarArr = new wp[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && m5.o(starGift2.owner_id) == p10.i(i12).e()) {
                z12 = true;
                textView.setText(dd.s1(dd.X0(true, "XTR " + ((Object) dd.M0(savedStarGift.gift.getResellAmount(cg.b.b).o(), 1.0f, ',')), 0.95f, wpVarArr, 0.0f, 1.0f), true));
            } else {
                z12 = true;
                textView.setText(dd.U0("XTR " + id.E(savedStarGift.gift.getResellStars(), ','), 0.95f, wpVarArr));
            }
            wp wpVar = wpVarArr[0];
            if (wpVar != null) {
                float L4 = org.telegram.messenger.g0.L(0.5f);
                wpVar.r = 0.0f;
                wpVar.s = L4;
            }
            int w10 = m6.w(stargiftattributebackdrop.center_color | (-16777216), m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.s0 = 0;
            o00Var2.setBackground(new d1(1895825407, w10));
            textView.setTextColor(-1);
            imageView.setBackground(m6.d0(org.telegram.messenger.g0.L(10.0f), w10));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) w41Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) w41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(79.0f);
            z11 = z12;
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
        this.h0 = z10;
        this.Q = null;
        this.R = null;
        d((!savedStarGift.pinned_to_top || (z13 && !savedStarGift.name_hidden)) ? false : z11, savedStarGift2 == savedStarGift ? z11 : false);
        l();
        if (savedStarGift2 == savedStarGift) {
            return z11;
        }
        return false;
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        k9 k9Var = this.D;
        if (document == null) {
            k9Var.b();
            this.k0 = null;
        } else {
            if (this.k0 == document) {
                return;
            }
            this.k0 = document;
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            k9Var.m(hc.b(document), "80_80_nolimit_pcache", hc.c(w10, document), "80_80_nolimit_pcache", t5.f(document, m6.a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z9, boolean z10, float f10) {
        if (this.P != f10) {
            this.P = f10;
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = uniqueStarGift == null ? null : (TL_stars.starGiftAttributeBackdrop) ea.l(uniqueStarGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            int i7 = stargiftattributebackdrop == null ? -11184811 : stargiftattributebackdrop.pattern_color | (-16777216);
            float f11 = 1.0f - f10;
            ColorMatrixColorFilter colorMatrixColorFilter = f10 <= 0.0f ? null : new ColorMatrixColorFilter(new float[]{f11, 0.0f, 0.0f, 0.0f, Color.red(i7) * f10, 0.0f, f11, 0.0f, 0.0f, Color.green(i7) * f10, 0.0f, 0.0f, f11, 0.0f, Color.blue(i7) * f10, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f10), 0.0f});
            k9 k9Var = this.D;
            k9Var.setColorFilter(colorMatrixColorFilter);
            k9Var.getImageReceiver().u0 = f10 == 0.0f;
            if (f10 > 0.0f) {
                k9Var.getImageReceiver().Q0();
                zg0 B = k9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            k9Var.invalidate();
        }
        if (this.O != z9) {
            this.O = z9;
            if (getUniqueStarGift() != null) {
                String M0 = z9 ? id.M0(2131743104, null) : jg.g.m(r2.num, ',', new StringBuilder("#"));
                z0 z0Var = this.f;
                if (!z10) {
                    z0Var.b(M0, true);
                    return;
                }
                z0Var.getClass();
                z0Var.b = M0;
                z0Var.a.g(10, M0);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.e0;
        z0 z0Var = this.f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    z0Var.setBackdrop(null);
                    z0Var.setVisibility(8);
                    return;
                }
                z0Var.setVisibility(0);
                setRibbonColorKey(m6.zj);
                z0Var.setStrokeColor(0);
                this.o0 = false;
                z0Var.setBackdrop(null);
                z0Var.b(id.a0(null, null, 2131750135, org.telegram.messenger.g0.o0(this.e0.gift.availability_total, 0)), true);
                return;
            }
            z0Var.setVisibility(0);
            if (this.e0.gift.resell_amount == null) {
                setRibbonColorKey(m6.zj);
                z0Var.setStrokeColor(0);
                this.o0 = false;
                z0Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ea.l(this.e0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                z0Var.b(jg.g.m(this.e0.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int i7 = m6.d6;
            h6 h6Var = this.b;
            int w10 = m6.w(m6.w0(i7, h6Var), m6.r1(0.04f, m6.w0(m6.G6, h6Var)));
            setRibbonColorKey(m6.ik);
            z0Var.setStrokeColor(w10);
            this.o0 = true;
            z0Var.setBackdrop(null);
            z0Var.b(id.M0(2131750089, null), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.b0;
        if (starGift2 == null) {
            ug.j jVar = this.a0;
            if (jVar != null) {
                if (jVar.b() <= 0) {
                    z0Var.setVisibility(8);
                    z0Var.setBackdrop(null);
                    z0Var.setStrokeColor(0);
                    this.o0 = false;
                    return;
                }
                z0Var.setVisibility(0);
                z0Var.setBackdrop(null);
                this.n0 = -1;
                z0Var.a(-2535425, -8229377);
                z0Var.setStrokeColor(0);
                this.o0 = false;
                String a02 = id.a0(null, null, 2131749664, Integer.valueOf(this.a0.b()));
                z0Var.b = a02;
                z0Var.a.f(12, a02, true);
                return;
            }
            return;
        }
        if (this.g0 || this.i0) {
            z0Var.setVisibility(0);
            setRibbonColorKey(m6.zj);
            z0Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ea.l(this.b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            z0Var.setStrokeColor(0);
            this.o0 = false;
            z0Var.b(jg.g.m(this.b0.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.f0 && starGift2.availability_resale > 0) {
            z0Var.setVisibility(0);
            setRibbonColorKey(m6.ik);
            z0Var.setStrokeColor(0);
            this.o0 = false;
            z0Var.setBackdrop(null);
            z0Var.b(id.M0(2131750030, null), false);
            return;
        }
        if (this.d0) {
            z0Var.setVisibility(0);
            setRibbonColorKey(m6.zj);
            z0Var.setStrokeColor(0);
            this.o0 = false;
            z0Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ea.l(this.b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            z0Var.b(id.a0(null, null, 2131750135, org.telegram.messenger.g0.o0(this.b0.availability_issued, 0)), true);
            return;
        }
        boolean z9 = starGift2.limited;
        if (z9 && starGift2.availability_remains <= 0) {
            z0Var.setVisibility(0);
            setRibbonColorKey(m6.Aj);
            z0Var.setStrokeColor(0);
            this.o0 = false;
            z0Var.setBackdrop(null);
            z0Var.b(id.M0(2131749976, null), true);
            return;
        }
        if (starGift2.auction) {
            z0Var.setVisibility(0);
            z0Var.setBackdrop(null);
            this.n0 = -1;
            z0Var.a(-2650077, -4227818);
            z0Var.setStrokeColor(0);
            this.o0 = false;
            if (this.b0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                z0Var.b(id.M0(2131750133, null), true);
                return;
            } else {
                z0Var.b(id.M0(2131750134, null), true);
                return;
            }
        }
        if (starGift2.require_premium) {
            z0Var.setVisibility(0);
            z0Var.setBackdrop(null);
            this.n0 = -1;
            z0Var.a(-2650077, -4227818);
            z0Var.setStrokeColor(0);
            this.o0 = false;
            z0Var.b(id.M0(2131750132, null), true);
            return;
        }
        if (!z9) {
            z0Var.setBackdrop(null);
            z0Var.setStrokeColor(0);
            this.o0 = false;
            z0Var.setVisibility(8);
            return;
        }
        z0Var.setVisibility(0);
        setRibbonColorKey(m6.zj);
        z0Var.setStrokeColor(0);
        this.o0 = false;
        z0Var.setBackdrop(null);
        z0Var.b(id.M0(2131750131, null), true);
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
        z0 z0Var;
        w41 w41Var;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        wo woVar;
        k9 k9Var;
        long o4;
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
                        z0Var = this.f;
                        if (z0Var != null) {
                        }
                        w41Var = this.J;
                        if (w41Var != null) {
                        }
                        savedStarGift = this.e0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.e0;
                        if (savedStarGift2 != null) {
                        }
                        woVar = this.m0;
                        if (woVar != null) {
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
                    z0Var = this.f;
                    if (z0Var != null) {
                    }
                    w41Var = this.J;
                    if (w41Var != null) {
                    }
                    savedStarGift = this.e0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.e0;
                    if (savedStarGift2 != null) {
                    }
                    woVar = this.m0;
                    if (woVar != null) {
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
                    z0Var = this.f;
                    if (z0Var != null) {
                    }
                    w41Var = this.J;
                    if (w41Var != null) {
                    }
                    savedStarGift = this.e0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.e0;
                    if (savedStarGift2 != null) {
                    }
                    woVar = this.m0;
                    if (woVar != null) {
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
                z0Var = this.f;
                if (z0Var != null) {
                }
                w41Var = this.J;
                if (w41Var != null) {
                }
                savedStarGift = this.e0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.e0;
                if (savedStarGift2 != null) {
                }
                woVar = this.m0;
                if (woVar != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            TextView textView3 = this.H;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = id.M0(2131750192, null);
                }
                sb2.append(charSequence);
                textView = this.I;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb2.append(", ");
                    sb2.append(textView.getText());
                }
                z0Var = this.f;
                if (z0Var != null && z0Var.getVisibility() == 0) {
                    text = z0Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb2.append(", ");
                        sb2.append(text);
                    }
                }
                w41Var = this.J;
                if (w41Var != null && w41Var.getVisibility() == 0 && (textView2 = this.L) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb2.append(", ");
                    sb2.append(textView2.getText());
                }
                savedStarGift = this.e0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb2.append(", ");
                    sb2.append(id.M0(2131750200, null));
                }
                savedStarGift2 = this.e0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (k9Var = this.n) != null && k9Var.getVisibility() == 0) {
                    o4 = m5.o(this.e0.from_id);
                    if (o4 != 0) {
                        int i7 = this.a;
                        if (o4 > 0) {
                            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(o4));
                            if (a22 != null) {
                                str = t10.p(a22);
                            }
                        } else {
                            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-o4));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb2.append(", ");
                            sb2.append((CharSequence) str);
                        }
                    }
                }
                woVar = this.m0;
                if (woVar != null && woVar.a.q) {
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
            z0Var = this.f;
            if (z0Var != null) {
                text = z0Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            w41Var = this.J;
            if (w41Var != null) {
                sb2.append(", ");
                sb2.append(textView2.getText());
            }
            savedStarGift = this.e0;
            if (savedStarGift != null) {
                sb2.append(", ");
                sb2.append(id.M0(2131750200, null));
            }
            savedStarGift2 = this.e0;
            if (savedStarGift2 != null) {
                o4 = m5.o(this.e0.from_id);
                if (o4 != 0) {
                }
            }
            woVar = this.m0;
            if (woVar != null) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i7) {
        this.D.setLayerNum(i7);
    }

    public void setImageSize(int i7) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i7;
        layoutParams.height = i7;
    }

    public void setRibbonColor(int i7) {
        this.n0 = -1;
        z0 z0Var = this.f;
        z0Var.setColor(i7);
        z0Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i7) {
        z0 z0Var = this.f;
        z0Var.setVisibility(0);
        setRibbonColorKey(m6.zj);
        z0Var.setStrokeColor(0);
        this.o0 = false;
        z0Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ea.l(this.b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        z0Var.b(id.a0(null, null, 2131750135, org.telegram.messenger.g0.o0(i7, 0)), true);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int w02;
        k9 k9Var;
        int w03;
        try {
            boolean q10 = m6.I.q();
            if (q10 != this.u0) {
                this.u0 = q10;
                if (this.s0 != 0 && this.K != null && this.L != null && this.x != null) {
                    a();
                }
                TextView textView = this.M;
                if (textView != null) {
                    textView.setTextColor(q10 ? -1333971 : -2722014);
                }
            }
            z0 z0Var = this.f;
            h6 h6Var = this.b;
            if (z0Var != null) {
                int i7 = this.n0;
                if (i7 >= 0) {
                    b1 b1Var = z0Var.a;
                    ((Paint) b1Var.b).setColor(m6.w0(i7, h6Var));
                    b1Var.invalidateSelf();
                }
                if (this.o0) {
                    z0Var.setStrokeColor(m6.w(m6.w0(m6.d6, h6Var), m6.r1(0.04f, m6.w0(m6.G6, h6Var))));
                }
                z0Var.invalidate();
            }
            if (this.p0 && (k9Var = this.n) != null && (w03 = m6.w0(m6.kk, h6Var)) != this.q0) {
                this.q0 = w03;
                k9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            v0 v0Var = this.e;
            if (v0Var != null) {
                int[] iArr = this.r0;
                if (iArr != null && v0Var.m == iArr && (iArr[0] != (w02 = m6.w0(m6.Aj, h6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    v0Var.n = null;
                }
                v0Var.invalidateSelf();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}

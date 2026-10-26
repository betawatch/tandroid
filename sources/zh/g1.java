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
import bi.ca;
import bi.dd;
import bi.fb;
import bi.yc;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zp;
import org.telegram.ui.Components.zq;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class g1 extends FrameLayout implements p6 {
    public static final int[] v0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final tg.c1 F;
    public final tg.c1 G;
    public final TextView H;
    public final TextView I;
    public final p5 J;
    public final z10 K;
    public final TextView L;
    public final TextView M;
    public fb N;
    public boolean O;
    public float P;
    public q11 Q;
    public q11 R;
    public final Rect S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final h6 W;
    public final int a;
    public tg.k a0;
    public final u6 b;
    public TL_stars.StarGift b0;
    public final eq0 c;
    public boolean c0;
    public final FrameLayout d;
    public boolean d0;
    public final d1 e;
    public TL_stars.SavedStarGift e0;
    public final h1 f;
    public boolean f0;
    public boolean g0;
    public final j9 h;
    public boolean h0;
    public boolean i0;
    public tg.k j0;
    public TLRPC.Document k0;
    public TL_stars.SavedStarGift l0;
    public zp m0;
    public final y9 n;
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
    public final FrameLayout v;
    public final ImageView w;
    public final TextView x;
    public final y9 y;

    public g1(Context context, int i10, u6 u6Var) {
        super(context);
        this.P = -1.0f;
        this.S = new Rect();
        this.W = new h6(this, 0L, 320L, ds.h);
        this.n0 = -1;
        this.u0 = y6.I.q();
        this.a = i10;
        this.b = u6Var;
        gb1.c(this, 0.04f, 1.5f);
        this.c = new eq0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        d1 d1Var = new d1(frameLayout, u6Var, true);
        this.e = d1Var;
        frameLayout.setBackground(d1Var);
        addView(frameLayout, gb1.i(-1, -1, 119));
        h1 h1Var = new h1(context);
        this.f = h1Var;
        addView(h1Var, gb1.h(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        y9 y9Var = new y9(context);
        this.y = y9Var;
        y9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams h = gb1.h(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = h;
        frameLayout.addView(y9Var, h);
        tg.c1 c1Var = new tg.c1(context, 3, u6Var);
        this.F = c1Var;
        c1Var.setImageReceiver(y9Var.getImageReceiver());
        frameLayout.addView(c1Var, gb1.h(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        tg.c1 c1Var2 = new tg.c1(context, 4, u6Var);
        this.G = c1Var2;
        c1Var2.setImageReceiver(y9Var.getImageReceiver());
        frameLayout.addView(c1Var2, gb1.i(44, 44, 17));
        c1Var2.setAlpha(0.0f);
        c1Var2.setScaleX(0.3f);
        c1Var2.setScaleY(0.3f);
        c1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i11 = y6.G6;
        f7.V(textView, i11, u6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, gb1.h(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = k10;
        f7.V(k10, i11, u6Var);
        k10.setGravity(17);
        k10.setTextSize(1, 12.0f);
        frameLayout.addView(k10, gb1.h(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        p5 p5Var = new p5(this, context, 8);
        this.J = p5Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(p5Var, gb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        z10 z10Var = new z10(context);
        this.K = z10Var;
        z10Var.setBackgroundColor(-16776961);
        p5Var.addView(z10Var, gb1.g(0.0f, 0));
        p5Var.addView(textView2, gb1.i(-2, 26, 17));
        z10Var.setBackground(new m1(y6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(y6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, gb1.h(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new j9((u6) null);
        y9 y9Var2 = new y9(context);
        this.n = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        y9Var2.setVisibility(8);
        FrameLayout.LayoutParams h10 = gb1.h(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = h10;
        frameLayout.addView(y9Var2, h10);
        this.s = gb1.h(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.v = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_limit_pin);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, gb1.e(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, gb1.h(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, gb1.h(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, gb1.h(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        h1Var.setImportantForAccessibility(2);
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
        this.f.setColor(y6.w0(i10, this.b));
        this.n0 = i10;
    }

    public final void a() {
        boolean q5 = y6.I.q();
        this.u0 = q5;
        int i10 = this.t0 ? 1090519039 : q5 ? 518759725 : 1088989954;
        int i11 = q5 ? -1333971 : this.s0 == 2 ? -4229632 : -2722014;
        this.K.setBackground(new m1(i10));
        this.L.setTextColor(i11);
        ImageView imageView = this.w;
        imageView.setColorFilter(i11);
        imageView.setBackground(y6.c0(AndroidUtilities.dp(10.0f), i10));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Li));
        hashSet.add(Integer.valueOf(y6.Mi));
        hashSet.add(Integer.valueOf(y6.uj));
        hashSet.add(Integer.valueOf(y6.wj));
        hashSet.add(Integer.valueOf(y6.d6));
    }

    public void b(i80 i80Var, Canvas canvas, float f7, float f10, float f11) {
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f7 / 2.0f, f10 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float dp = uniqueStarGift != null ? AndroidUtilities.dp(63.0f) * f11 : 0.0f;
        d1 d1Var = this.e;
        d1Var.setBounds(0, 0, (int) f7, (int) f10);
        d1Var.b(canvas2, f11);
        d1Var.getPadding(this.S);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        y9 y9Var = this.y;
        float f14 = f10 - dp;
        y9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f14 - lerp) / 2.0f, lerp, lerp);
        y9Var.getImageReceiver().draw(canvas2);
        if (y9Var.getImageReceiver().isLottieRunning()) {
            i80Var.invalidate();
        }
        tg.c1 c1Var = this.F;
        if (c1Var.getVisibility() != 0 || c1Var.getAlpha() <= 0.0f) {
            f12 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate((f7 - c1Var.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(c1Var.getY(), (f14 - c1Var.getMeasuredHeight()) / 2.0f, f11));
            f12 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, c1Var.getWidth(), c1Var.getHeight(), (int) (c1Var.getAlpha() * (1.0f - f11) * 255.0f), 31);
            c1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        FrameLayout frameLayout = this.v;
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + r14.left, AndroidUtilities.dp(2.0f) + r14.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        y9 y9Var2 = this.n;
        if (y9Var2.getVisibility() == 0 && y9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + r14.left, AndroidUtilities.dp(2.0f) + r14.top);
            y9Var2.draw(canvas2);
            canvas2.restore();
        }
        h1 h1Var = this.f;
        if (h1Var.getVisibility() != 0 || h1Var.getAlpha() <= 0.0f) {
            f13 = f12;
        } else {
            canvas2.save();
            canvas2.translate(f7 - AndroidUtilities.dp(f12), AndroidUtilities.dp(2.0f));
            f13 = f12;
            float lerp2 = AndroidUtilities.lerp(f13, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-h1Var.getWidth(), 0.0f);
            h1Var.draw(canvas2);
            canvas2.restore();
        }
        if (uniqueStarGift != null) {
            if (this.Q == null) {
                this.Q = new q11(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.R == null) {
                this.R = new q11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            q11 q11Var = this.Q;
            q11Var.p = f7 - AndroidUtilities.dp(8.0f);
            float f15 = f13 - f11;
            q11Var.c((f7 - this.Q.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.Q.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f15), f11, -1, canvas);
            q11 q11Var2 = this.R;
            q11Var2.p = f7 - AndroidUtilities.dp(8.0f);
            q11Var2.c((f7 - this.R.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.R.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f15), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        p5 p5Var = this.J;
        if (p5Var != null && p5Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(p5Var.getX(), p5Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, p5Var.getWidth(), p5Var.getHeight(), (int) (p5Var.getAlpha() * (f13 - f11) * 255.0f), 31);
            p5Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.w;
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f13 - f11) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z10, boolean z11) {
        if (this.m0 == null) {
            zp zpVar = new zp(getContext(), 21, null);
            this.m0 = zpVar;
            zpVar.b(-1, y6.d6, y6.k7);
            this.m0.setDrawUnchecked(false);
            this.d.addView(this.m0, gb1.h(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
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
        FrameLayout frameLayout = this.v;
        if (z11) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new e1(this, z10, 1)).start();
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
        float e = this.W.e(this.V);
        if (e > 0.0f) {
            this.c.a(canvas, e);
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
        ImageView imageView = this.w;
        if (z11) {
            imageView.animate().translationX(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).translationY(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).setDuration(320L).setInterpolator(ds.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z10 ? AndroidUtilities.dp(6.0f) : 0.0f);
        imageView.setTranslationY(z10 ? AndroidUtilities.dp(6.0f) : 0.0f);
    }

    public final void g(boolean z10, boolean z11) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        tg.c1 c1Var = this.G;
        if (z11) {
            c1Var.setVisibility(0);
            c1Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new e1(this, z10, 0)).start();
        } else {
            c1Var.setVisibility(z10 ? 0 : 8);
            c1Var.setAlpha(z10 ? 1.0f : 0.0f);
            c1Var.setScaleX(z10 ? 1.0f : 0.3f);
            c1Var.setScaleY(z10 ? 1.0f : 0.3f);
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

    public tg.k getPremiumTier() {
        return this.a0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bb  */
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
        fb fbVar = this.N;
        ColorFilter colorFilter = null;
        if (fbVar != null) {
            fbVar.run();
            this.N = null;
        }
        j(starGift, starGift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ca.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        d1 d1Var = this.e;
        d1Var.d(stargiftattributebackdrop);
        d1Var.e((TL_stars.starGiftAttributePattern) ca.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z17 = starGift.auction;
        int[] iArr = v0;
        u6 u6Var = this.b;
        if (!z17 || (((z16 = starGift.sold_out) && !this.c0) || (z12 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z12 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            d1Var.g(iArr);
        } else if (z16) {
            int i10 = y6.Mi;
            int[] iArr2 = {y6.w0(i10, u6Var), y6.w0(i10, u6Var)};
            this.r0 = iArr2;
            d1Var.g(iArr2);
        } else {
            d1Var.g(iArr);
        }
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        y9 y9Var = this.y;
        y9Var.setTranslationY(0.0f);
        this.F.setVisibility(8);
        int i11 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.w;
        imageView.setVisibility(i11);
        int i12 = z14 ? 0 : 8;
        TextView textView = this.x;
        textView.setVisibility(i12);
        textView.setTranslationX(starGift.resale_ton_only ? AndroidUtilities.dp(23.0f) : 0.0f);
        textView.setTranslationY(starGift.resale_ton_only ? AndroidUtilities.dp(1.0f) : 0.0f);
        if (z14) {
            StringBuilder sb2 = new StringBuilder("+");
            int i13 = starGift.craft_chance_permille;
            sb2.append((Object) (i13 <= 0 ? "<0.1%" : hi.k.F0(i13)));
            textView.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 49;
        y9Var.setLayoutParams(layoutParams);
        int i14 = this.a;
        y9 y9Var2 = this.n;
        if (!z13) {
            if ((!z12 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i14).getCurrentTime()) {
                y9Var2.setVisibility(0);
                y9Var2.setLayoutParams(this.s);
                int w02 = y6.w0(y6.wj, u6Var);
                this.q0 = w02;
                y9Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                this.p0 = true;
                y9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i15 = (z14 || z13) ? 0 : 8;
                TextView textView2 = this.L;
                textView2.setVisibility(i15);
                textView2.setTextSize(1, 12.0f);
                z10 z10Var = this.K;
                if (!z10) {
                    textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                    int v = stargiftattributebackdrop != null ? y6.v(stargiftattributebackdrop.center_color | (-16777216), y6.o1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    this.s0 = 0;
                    int dp = AndroidUtilities.dp(13.0f);
                    int v10 = y6.v(v, 822083583);
                    int i16 = v;
                    z10Var.setBackground(y6.j0(dp, dp, dp, dp, i16, v10, v10));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int dp2 = AndroidUtilities.dp(10.0f);
                    int v11 = y6.v(i16, 822083583);
                    imageView.setBackground(y6.j0(dp2, dp2, dp2, dp2, i16, v11, v11));
                } else if (z13) {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int v12 = y6.v(stargiftattributebackdrop.center_color | (-16777216), y6.o1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(dd.P0("XTR " + LocaleController.formatNumber(resellStars, ',')));
                    this.s0 = 0;
                    z10Var.setBackground(new m1(1895825407, v12));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(y6.c0(AndroidUtilities.dp(10.0f), v12));
                    textView.setBackground(y6.c0(AndroidUtilities.dp(9.0f), v12));
                } else {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    if (z12) {
                        long j14 = starGift.availability_resale;
                        if (j14 > 0) {
                            long j15 = starGift.resell_min_stars;
                            if (j14 > 1) {
                                j13 = j15;
                                if (j13 < MessagesController.getInstance(i14).config.starsStarGiftResaleAmountMax.get()) {
                                    j12 = j13;
                                    z15 = true;
                                    if (starGift.auction || starGift.availability_resale != 0) {
                                        StringBuilder sb3 = new StringBuilder("XTR ");
                                        sb3.append(LocaleController.formatNumber(j12, ','));
                                        sb3.append(z15 ? "+" : "");
                                        textView2.setText(dd.W0(false, sb3.toString(), 0.71f, null));
                                    } else {
                                        textView2.setText(LocaleController.getString(starGift.sold_out ? R.string.Gift2AuctionPriceView : R.string.Gift2AuctionPriceJoin));
                                    }
                                    this.s0 = 1;
                                    this.t0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                    a();
                                    textView.setBackground(y6.c0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? y6.v(stargiftattributebackdrop.center_color | (-16777216), y6.o1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                }
                            } else {
                                j13 = j15;
                            }
                            j12 = j13;
                            z15 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb32 = new StringBuilder("XTR ");
                            sb32.append(LocaleController.formatNumber(j12, ','));
                            sb32.append(z15 ? "+" : "");
                            textView2.setText(dd.W0(false, sb32.toString(), 0.71f, null));
                            this.s0 = 1;
                            this.t0 = starGift instanceof TL_stars.TL_starGiftUnique;
                            a();
                            textView.setBackground(y6.c0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? y6.v(stargiftattributebackdrop.center_color | (-16777216), y6.o1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
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
                    sb322.append(LocaleController.formatNumber(j12, ','));
                    sb322.append(z15 ? "+" : "");
                    textView2.setText(dd.W0(false, sb322.toString(), 0.71f, null));
                    this.s0 = 1;
                    this.t0 = starGift instanceof TL_stars.TL_starGiftUnique;
                    a();
                    textView.setBackground(y6.c0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? y6.v(stargiftattributebackdrop.center_color | (-16777216), y6.o1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                p5 p5Var = this.J;
                ((ViewGroup.MarginLayoutParams) p5Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                ((FrameLayout.LayoutParams) p5Var.getLayoutParams()).gravity = 49;
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
        y9Var2.setColorFilter(colorFilter);
        this.p0 = false;
        y9Var2.setVisibility(8);
        if (z14) {
        }
        TextView textView22 = this.L;
        textView22.setVisibility(i15);
        textView22.setTextSize(1, 12.0f);
        z10 z10Var2 = this.K;
        if (!z10) {
        }
        p5 p5Var2 = this.J;
        ((ViewGroup.MarginLayoutParams) p5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        ((FrameLayout.LayoutParams) p5Var2.getLayoutParams()).gravity = 49;
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
        z10 z10Var;
        boolean z13;
        fb fbVar = this.N;
        if (fbVar != null) {
            fbVar.run();
            this.N = null;
        }
        j(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ca.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        d1 d1Var = this.e;
        d1Var.d(stargiftattributebackdrop);
        d1Var.e((TL_stars.starGiftAttributePattern) ca.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        d1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        y9 y9Var = this.y;
        y9Var.setTranslationY(0.0f);
        tg.c1 c1Var = this.F;
        c1Var.H = true;
        c1Var.I = false;
        c1Var.invalidate();
        c1Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(y6.o1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        tg.c1 c1Var2 = this.G;
        c1Var2.H = true;
        c1Var2.I = false;
        c1Var2.invalidate();
        c1Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(y6.o1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i10 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(y6.K(AndroidUtilities.dp(20.0f), y6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            int i11 = y6.Oh;
            u6 u6Var = this.b;
            f7.C(frameLayout, y6.K(dp, y6.w0(i11, u6Var)), f7.N(i11), u6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        y9Var.setLayoutParams(layoutParams);
        if (this.l0 == savedStarGift) {
            c1Var.setVisibility(0);
            c1Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(ds.h).withEndAction(new vi.i0(10, this, savedStarGift)).start();
        } else {
            c1Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            c1Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            c1Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            c1Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z14 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        y9 y9Var2 = this.n;
        y9Var2.setColorFilter(null);
        this.p0 = false;
        y9Var2.setLayoutParams(this.r);
        int i12 = this.a;
        if (z14 && savedStarGift.name_hidden) {
            y9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            y9Var2.setVisibility(0);
            ar a2 = yc.a(44, "anonymous");
            j10 = 0;
            int dp2 = AndroidUtilities.dp(16.0f);
            int dp3 = AndroidUtilities.dp(16.0f);
            a2.e = dp2;
            a2.f = dp3;
            y9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            j9 j9Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    y9Var2.setVisibility(0);
                    j9Var.r(user);
                    y9Var2.f(user, j9Var);
                } else {
                    y9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    y9Var2.setVisibility(0);
                    j9Var.q(chat);
                    y9Var2.f(chat, j9Var);
                } else {
                    y9Var2.setVisibility(8);
                }
            }
        }
        z10 z10Var2 = this.K;
        p5 p5Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop == null || savedStarGift.gift.resell_amount == null) {
            if (z10) {
                textView.setVisibility(8);
                this.E.topMargin = AndroidUtilities.dp(12.0f);
                this.E.bottomMargin = AndroidUtilities.dp(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = this.E;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            if (z14) {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                textView.setTextSize(1, 12.0f);
                textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                z12 = true;
                z10Var = z10Var2;
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j11 = starGift.stars;
                z12 = true;
                z10Var = z10Var2;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift.convert_stars;
                }
                textView.setText(dd.W0(false, org.telegram.messenger.t.i(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z14) {
                this.s0 = 0;
                textView.setTextColor(-1);
                z10Var.setBackground(new m1(1090519039));
                imageView.setBackground(y6.c0(AndroidUtilities.dp(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.s0 = 2;
                this.t0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) p5Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p5Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.E;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            zq[] zqVarArr = new zq[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && DialogObject.getPeerDialogId(starGift2.owner_id) == UserConfig.getInstance(i12).getClientUserId()) {
                z13 = true;
                textView.setText(dd.o1(dd.T0(true, "XTR " + ((Object) dd.I0(savedStarGift.gift.getResellAmount(bg.b.b).o(), 1.0f, ',')), 0.95f, zqVarArr, 0.0f, 1.0f), true));
            } else {
                z13 = true;
                textView.setText(dd.Q0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, zqVarArr));
            }
            zq zqVar = zqVarArr[0];
            if (zqVar != null) {
                zqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = y6.v(stargiftattributebackdrop.center_color | (-16777216), y6.o1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.s0 = 0;
            z10Var2.setBackground(new m1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(y6.c0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) p5Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p5Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
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

    public final void j(TLObject tLObject, TLRPC.Document document) {
        y9 y9Var = this.y;
        if (document == null) {
            y9Var.b();
            this.k0 = null;
        } else {
            if (this.k0 == document) {
                return;
            }
            this.k0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            y9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, y6.a7, 0.3f), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f7) {
        if (this.P != f7) {
            this.P = f7;
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = uniqueStarGift == null ? null : (TL_stars.starGiftAttributeBackdrop) ca.l(uniqueStarGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            int i10 = stargiftattributebackdrop == null ? -11184811 : stargiftattributebackdrop.pattern_color | (-16777216);
            float f10 = 1.0f - f7;
            ColorMatrixColorFilter colorMatrixColorFilter = f7 > 0.0f ? new ColorMatrixColorFilter(new float[]{f10, 0.0f, 0.0f, 0.0f, Color.red(i10) * f7, 0.0f, f10, 0.0f, 0.0f, Color.green(i10) * f7, 0.0f, 0.0f, f10, 0.0f, Color.blue(i10) * f7, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f7), 0.0f}) : null;
            y9 y9Var = this.y;
            y9Var.setColorFilter(colorMatrixColorFilter);
            y9Var.getImageReceiver().setAllowStartLottieAnimation(f7 == 0.0f);
            if (f7 > 0.0f) {
                y9Var.getImageReceiver().stopAnimation();
                xj0 lottieAnimation = y9Var.getImageReceiver().getLottieAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.N(0, false, false);
                }
            }
            y9Var.invalidate();
        }
        if (this.O != z10) {
            this.O = z10;
            if (getUniqueStarGift() != null) {
                String string = z10 ? LocaleController.getString(R.string.WalletGiftOnCard) : org.telegram.messenger.t.i(r15.num, ',', new StringBuilder("#"));
                h1 h1Var = this.f;
                if (!z11) {
                    h1Var.b(string, true);
                    return;
                }
                h1Var.getClass();
                h1Var.b = string;
                h1Var.a.g(10, string);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.e0;
        h1 h1Var = this.f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    h1Var.setBackdrop(null);
                    h1Var.setVisibility(8);
                    return;
                }
                h1Var.setVisibility(0);
                setRibbonColorKey(y6.Li);
                h1Var.setStrokeColor(0);
                this.o0 = false;
                h1Var.setBackdrop(null);
                h1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.e0.gift.availability_total, 0)), true);
                return;
            }
            h1Var.setVisibility(0);
            if (this.e0.gift.resell_amount == null) {
                setRibbonColorKey(y6.Li);
                h1Var.setStrokeColor(0);
                this.o0 = false;
                h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ca.l(this.e0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                h1Var.b(org.telegram.messenger.t.i(this.e0.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int i10 = y6.d6;
            u6 u6Var = this.b;
            int v = y6.v(y6.w0(i10, u6Var), y6.o1(0.04f, y6.w0(y6.G6, u6Var)));
            setRibbonColorKey(y6.uj);
            h1Var.setStrokeColor(v);
            this.o0 = true;
            h1Var.setBackdrop(null);
            h1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.b0;
        if (starGift2 == null) {
            tg.k kVar = this.a0;
            if (kVar != null) {
                if (kVar.b() <= 0) {
                    h1Var.setVisibility(8);
                    h1Var.setBackdrop(null);
                    h1Var.setStrokeColor(0);
                    this.o0 = false;
                    return;
                }
                h1Var.setVisibility(0);
                h1Var.setBackdrop(null);
                this.n0 = -1;
                h1Var.a(-2535425, -8229377);
                h1Var.setStrokeColor(0);
                this.o0 = false;
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.a0.b()));
                h1Var.b = formatString;
                h1Var.a.f(12, formatString, true);
                return;
            }
            return;
        }
        if (this.g0 || this.i0) {
            h1Var.setVisibility(0);
            setRibbonColorKey(y6.Li);
            h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ca.l(this.b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h1Var.setStrokeColor(0);
            this.o0 = false;
            h1Var.b(org.telegram.messenger.t.i(this.b0.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.f0 && starGift2.availability_resale > 0) {
            h1Var.setVisibility(0);
            setRibbonColorKey(y6.uj);
            h1Var.setStrokeColor(0);
            this.o0 = false;
            h1Var.setBackdrop(null);
            h1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
            return;
        }
        if (this.d0) {
            h1Var.setVisibility(0);
            setRibbonColorKey(y6.Li);
            h1Var.setStrokeColor(0);
            this.o0 = false;
            h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ca.l(this.b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.b0.availability_issued, 0)), true);
            return;
        }
        boolean z10 = starGift2.limited;
        if (z10 && starGift2.availability_remains <= 0) {
            h1Var.setVisibility(0);
            setRibbonColorKey(y6.Mi);
            h1Var.setStrokeColor(0);
            this.o0 = false;
            h1Var.setBackdrop(null);
            h1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
            return;
        }
        if (starGift2.auction) {
            h1Var.setVisibility(0);
            h1Var.setBackdrop(null);
            this.n0 = -1;
            h1Var.a(-2650077, -4227818);
            h1Var.setStrokeColor(0);
            this.o0 = false;
            if (this.b0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                h1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                return;
            } else {
                h1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                return;
            }
        }
        if (starGift2.require_premium) {
            h1Var.setVisibility(0);
            h1Var.setBackdrop(null);
            this.n0 = -1;
            h1Var.a(-2650077, -4227818);
            h1Var.setStrokeColor(0);
            this.o0 = false;
            h1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
            return;
        }
        if (!z10) {
            h1Var.setBackdrop(null);
            h1Var.setStrokeColor(0);
            this.o0 = false;
            h1Var.setVisibility(8);
            return;
        }
        h1Var.setVisibility(0);
        setRibbonColorKey(y6.Li);
        h1Var.setStrokeColor(0);
        this.o0 = false;
        h1Var.setBackdrop(null);
        h1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[Catch: Exception -> 0x0161, TRY_ENTER, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[Catch: Exception -> 0x0161, TRY_ENTER, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8 A[Catch: Exception -> 0x0161, TRY_LEAVE, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        TL_stars.StarGift starGift;
        TextView textView;
        h1 h1Var;
        p5 p5Var;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        zp zpVar;
        y9 y9Var;
        long peerDialogId;
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
                        h1Var = this.f;
                        if (h1Var != null) {
                        }
                        p5Var = this.J;
                        if (p5Var != null) {
                        }
                        savedStarGift = this.e0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.e0;
                        if (savedStarGift2 != null) {
                        }
                        zpVar = this.m0;
                        if (zpVar != null) {
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
                    h1Var = this.f;
                    if (h1Var != null) {
                    }
                    p5Var = this.J;
                    if (p5Var != null) {
                    }
                    savedStarGift = this.e0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.e0;
                    if (savedStarGift2 != null) {
                    }
                    zpVar = this.m0;
                    if (zpVar != null) {
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
                    h1Var = this.f;
                    if (h1Var != null) {
                    }
                    p5Var = this.J;
                    if (p5Var != null) {
                    }
                    savedStarGift = this.e0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.e0;
                    if (savedStarGift2 != null) {
                    }
                    zpVar = this.m0;
                    if (zpVar != null) {
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
                h1Var = this.f;
                if (h1Var != null) {
                }
                p5Var = this.J;
                if (p5Var != null) {
                }
                savedStarGift = this.e0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.e0;
                if (savedStarGift2 != null) {
                }
                zpVar = this.m0;
                if (zpVar != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            TextView textView3 = this.H;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = LocaleController.getString(R.string.Gift2Gift);
                }
                sb2.append(charSequence);
                textView = this.I;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb2.append(", ");
                    sb2.append(textView.getText());
                }
                h1Var = this.f;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    text = h1Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb2.append(", ");
                        sb2.append(text);
                    }
                }
                p5Var = this.J;
                if (p5Var != null && p5Var.getVisibility() == 0 && (textView2 = this.L) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb2.append(", ");
                    sb2.append(textView2.getText());
                }
                savedStarGift = this.e0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb2.append(", ");
                    sb2.append(LocaleController.getString(R.string.Gift2FilterHidden));
                }
                savedStarGift2 = this.e0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (y9Var = this.n) != null && y9Var.getVisibility() == 0) {
                    peerDialogId = DialogObject.getPeerDialogId(this.e0.from_id);
                    if (peerDialogId != 0) {
                        int i10 = this.a;
                        if (peerDialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                            if (user != null) {
                                str = UserObject.getUserName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb2.append(", ");
                            sb2.append((CharSequence) str);
                        }
                    }
                }
                zpVar = this.m0;
                if (zpVar != null && zpVar.a.q) {
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
            h1Var = this.f;
            if (h1Var != null) {
                text = h1Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            p5Var = this.J;
            if (p5Var != null) {
                sb2.append(", ");
                sb2.append(textView2.getText());
            }
            savedStarGift = this.e0;
            if (savedStarGift != null) {
                sb2.append(", ");
                sb2.append(LocaleController.getString(R.string.Gift2FilterHidden));
            }
            savedStarGift2 = this.e0;
            if (savedStarGift2 != null) {
                peerDialogId = DialogObject.getPeerDialogId(this.e0.from_id);
                if (peerDialogId != 0) {
                }
            }
            zpVar = this.m0;
            if (zpVar != null) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i10) {
        this.y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        this.n0 = -1;
        h1 h1Var = this.f;
        h1Var.setColor(i10);
        h1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        h1 h1Var = this.f;
        h1Var.setVisibility(0);
        setRibbonColorKey(y6.Li);
        h1Var.setStrokeColor(0);
        this.o0 = false;
        h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ca.l(this.b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        h1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int w02;
        y9 y9Var;
        int w03;
        try {
            boolean q5 = y6.I.q();
            if (q5 != this.u0) {
                this.u0 = q5;
                if (this.s0 != 0 && this.K != null && this.L != null && this.w != null) {
                    a();
                }
                TextView textView = this.M;
                if (textView != null) {
                    textView.setTextColor(q5 ? -1333971 : -2722014);
                }
            }
            h1 h1Var = this.f;
            u6 u6Var = this.b;
            if (h1Var != null) {
                int i10 = this.n0;
                if (i10 >= 0) {
                    j1 j1Var = h1Var.a;
                    ((Paint) j1Var.b).setColor(y6.w0(i10, u6Var));
                    j1Var.invalidateSelf();
                }
                if (this.o0) {
                    h1Var.setStrokeColor(y6.v(y6.w0(y6.d6, u6Var), y6.o1(0.04f, y6.w0(y6.G6, u6Var))));
                }
                h1Var.invalidate();
            }
            if (this.p0 && (y9Var = this.n) != null && (w03 = y6.w0(y6.wj, u6Var)) != this.q0) {
                this.q0 = w03;
                y9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            d1 d1Var = this.e;
            if (d1Var != null) {
                int[] iArr = this.r0;
                if (iArr != null && d1Var.m == iArr && (iArr[0] != (w02 = y6.w0(y6.Mi, u6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    d1Var.n = null;
                }
                d1Var.invalidateSelf();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

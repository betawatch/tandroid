// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ox4 extends FrameLayout implements vlb {
    public static final int[] w0 = {-2781403, -3635939};
    public final bf0 E;
    public FrameLayout.LayoutParams F;
    public final pj8 G;
    public final pj8 H;
    public final TextView I;
    public final TextView J;
    public final yd K;
    public final sb L;
    public final TextView M;
    public final TextView N;
    public gwa O;
    public boolean P;
    public float Q;
    public uib R;
    public uib S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public final ln a0;
    public final ylb b;
    public nw4 b0;
    public final cba c;
    public TL_stars.StarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final lx4 e;
    public boolean e0;
    public final px4 f;
    public TL_stars.SavedStarGift f0;
    public boolean g0;
    public final pc0 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public nw4 k0;
    public TLRPC.Document l0;
    public TL_stars.SavedStarGift m0;
    public final bf0 n;
    public jh2 n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final FrameLayout.LayoutParams r;
    public int r0;
    public final FrameLayout.LayoutParams s;
    public int[] s0;
    public byte t0;
    public boolean u0;
    public boolean v0;
    public final FrameLayout w;
    public final ImageView x;
    public final TextView y;

    public ox4(int i, ylb ylbVar, Context context) {
        super(context);
        this.Q = -1.0f;
        this.T = new Rect();
        this.a0 = new ln(this, 0L, 320L, d53.h);
        this.o0 = -1;
        this.v0 = cmb.I.o();
        this.a = i;
        this.b = ylbVar;
        rve.b(this, 0.04f, 1.5f);
        this.c = new cba(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        lx4 lx4Var = new lx4(frameLayout, ylbVar, true);
        this.e = lx4Var;
        frameLayout.setBackground(lx4Var);
        addView(frameLayout, qoe.e(-1, -1, nm7.D1));
        px4 px4Var = new px4(context);
        this.f = px4Var;
        addView(px4Var, qoe.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.E = bf0Var;
        bf0Var.getImageReceiver().M(0);
        FrameLayout.LayoutParams d = qoe.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(bf0Var, d);
        pj8 pj8Var = new pj8(3, ylbVar, context);
        this.G = pj8Var;
        pj8Var.setImageReceiver(bf0Var.getImageReceiver());
        frameLayout.addView(pj8Var, qoe.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        pj8 pj8Var2 = new pj8(4, ylbVar, context);
        this.H = pj8Var2;
        pj8Var2.setImageReceiver(bf0Var.getImageReceiver());
        frameLayout.addView(pj8Var2, qoe.e(44, 44, 17));
        pj8Var2.setAlpha(0.0f);
        pj8Var2.setScaleX(0.3f);
        pj8Var2.setScaleY(0.3f);
        pj8Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i2 = cmb.F6;
        anb.X(textView, i2, ylbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        TextView l = wi8.l(frameLayout, textView, qoe.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = l;
        anb.X(l, i2, ylbVar);
        l.setGravity(17);
        l.setTextSize(1, 12.0f);
        frameLayout.addView(l, qoe.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        yd ydVar = new yd((byte) 22, context, (Object) this);
        this.K = ydVar;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(gm.o());
        textView2.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(ydVar, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        sb sbVar = new sb(context, (byte) 13);
        this.L = sbVar;
        sbVar.setBackgroundColor(-16776961);
        ydVar.addView(sbVar, qoe.c(0.0f, 0));
        ydVar.addView(textView2, qoe.e(-2, 26, 17));
        sbVar.setBackground(new tx4(cmb.I.o() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(cmb.I.o() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, qoe.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new pc0((ylb) null);
        bf0 bf0Var2 = new bf0(context);
        this.n = bf0Var2;
        bf0Var2.setRoundRadius(gm.L(20.0f));
        bf0Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = qoe.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d2;
        frameLayout.addView(bf0Var2, d2);
        this.s = qoe.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView k = td4.k(context, R.drawable.msg_limit_pin);
        k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        k.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(k, qoe.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, qoe.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.mini_gram_14);
        imageView.setPadding(0, gm.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, qoe.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(gm.o());
        textView4.setPadding(gm.L(5.0f), 0, gm.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, qoe.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        px4Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f0;
        if (savedStarGift == null) {
            return null;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) starGift;
        }
        return null;
    }

    private void setRibbonColorKey(int i) {
        this.f.setColor(cmb.v0(i, this.b));
        this.o0 = i;
    }

    public final void a() {
        boolean o = cmb.I.o();
        this.v0 = o;
        int i = this.u0 ? 1090519039 : o ? 518759725 : 1088989954;
        int i2 = o ? -1333971 : this.t0 == 2 ? -4229632 : -2722014;
        this.L.setBackground(new tx4(i));
        this.M.setTextColor(i2);
        ImageView imageView = this.x;
        imageView.setColorFilter(i2);
        imageView.setBackground(cmb.b0(gm.L(10.0f), i));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Bj));
        hashSet.add(Integer.valueOf(cmb.Cj));
        hashSet.add(Integer.valueOf(cmb.kk));
        hashSet.add(Integer.valueOf(cmb.mk));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public void b(yt5 yt5Var, Canvas canvas, float f, float f2, float f3) {
        float f4;
        yd ydVar;
        float f5;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f6;
        Canvas canvas2 = canvas;
        bf0 bf0Var = this.n;
        bf0 bf0Var2 = this.E;
        lx4 lx4Var = this.e;
        px4 px4Var = this.f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        yd ydVar2 = this.K;
        pj8 pj8Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float L = uniqueStarGift != null ? gm.L(63.0f) * f3 : 0.0f;
        lx4Var.setBounds(0, 0, (int) f, (int) f2);
        lx4Var.b(canvas2, f3);
        lx4Var.getPadding(rect);
        float U1 = gm.U1(f3, gm.L(80.0f), gm.L(120.0f));
        float f7 = f2 - L;
        bf0Var2.getImageReceiver().i0((f - U1) / 2.0f, (f7 - U1) / 2.0f, U1, U1);
        bf0Var2.getImageReceiver().h(canvas2, null);
        p09 y = bf0Var2.getImageReceiver().y();
        if (y != null && y.l0) {
            yt5Var.invalidate();
        }
        if (pj8Var.getVisibility() != 0 || pj8Var.getAlpha() <= 0.0f) {
            f4 = 1.0f;
            ydVar = ydVar2;
            f5 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        } else {
            canvas2.save();
            canvas2.translate((f - pj8Var.getMeasuredWidth()) / 2.0f, gm.R1(pj8Var.getY(), (f7 - pj8Var.getMeasuredHeight()) / 2.0f, f3));
            f4 = 1.0f;
            ydVar = ydVar2;
            f5 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, pj8Var.getWidth(), pj8Var.getHeight(), (int) (pj8Var.getAlpha() * (1.0f - f3) * 255.0f), 31);
            pj8Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f5) {
            canvas2.save();
            canvas2.translate(gm.L(2.0f) + rect.left, gm.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (bf0Var.getVisibility() == 0 && bf0Var.getAlpha() > f5) {
            canvas2.save();
            canvas2.translate(gm.L(2.0f) + rect.left, gm.L(2.0f) + rect.top);
            bf0Var.draw(canvas2);
            canvas2.restore();
        }
        if (px4Var.getVisibility() != 0 || px4Var.getAlpha() <= f5) {
            f6 = f4;
        } else {
            canvas2.save();
            canvas2.translate(f - gm.L(f4), gm.L(2.0f));
            f6 = f4;
            float R1 = gm.R1(f6, 1.25f, f3);
            canvas2.scale(R1, R1);
            canvas2.translate(-px4Var.getWidth(), f5);
            px4Var.draw(canvas2);
            canvas2.restore();
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new uib(tL_starGiftUnique.title, 20.0f, gm.o());
            }
            if (this.S == null) {
                this.S = new uib(jb6.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            uib uibVar = this.R;
            uibVar.p = f - gm.L(8.0f);
            float f8 = f6 - f3;
            uibVar.c((f - this.R.j()) / 2.0f, ((f2 - gm.L(40.0f)) - (this.R.h() / 2.0f)) + (gm.L(50.0f) * f8), f3, -1, canvas);
            uib uibVar2 = this.S;
            uibVar2.p = f - gm.L(8.0f);
            uibVar2.c((f - this.S.j()) / 2.0f, (gm.L(50.0f) * f8) + ((f2 - gm.L(19.0f)) - (this.S.h() / 2.0f)), 0.6f * f3, -1, canvas);
            canvas2 = canvas;
        }
        if (ydVar != null && ydVar.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(ydVar.getX(), ydVar.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, ydVar.getWidth(), ydVar.getHeight(), (int) (ydVar.getAlpha() * (f6 - f3) * 255.0f), 31);
            canvas2 = canvas;
            ydVar.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f6 - f3) * 255.0f), 31);
            canvas2 = canvas;
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z, boolean z2) {
        if (this.n0 == null) {
            jh2 jh2Var = new jh2(21, null, getContext());
            this.n0 = jh2Var;
            jh2Var.b(-1, cmb.c6, cmb.j7);
            this.n0.setDrawUnchecked(false);
            this.d.addView(this.n0, qoe.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.n.setVisibility(8);
        this.n0.a(z, z2);
    }

    public final void d(boolean z, boolean z2) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.U == z) {
            return;
        }
        this.U = z;
        FrameLayout frameLayout = this.w;
        if (z2) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new mx4(this, z, (byte) 1)).start();
        } else {
            frameLayout.setVisibility(z ? 0 : 8);
            frameLayout.setAlpha(z ? 1.0f : 0.0f);
            frameLayout.setScaleX(z ? 1.0f : 0.3f);
            frameLayout.setScaleY(z ? 1.0f : 0.3f);
        }
        g((this.U || !this.W || this.i0 || (savedStarGift = this.f0) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z2);
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float d = this.a0.d(this.W);
        if (d > 0.0f) {
            this.c.a(canvas, d);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z, boolean z2) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.W == z) {
            return;
        }
        this.W = z;
        if (!z2) {
            this.a0.a(z);
        }
        invalidate();
        g((this.U || !z || this.i0 || (savedStarGift = this.f0) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z2);
    }

    public final void f(boolean z, boolean z2) {
        this.e.f(z, z2);
        ImageView imageView = this.x;
        if (z2) {
            imageView.animate().translationX(z ? gm.L(6.0f) : 0.0f).translationY(z ? gm.L(6.0f) : 0.0f).setDuration(320L).setInterpolator(d53.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z ? gm.L(6.0f) : 0.0f);
        imageView.setTranslationY(z ? gm.L(6.0f) : 0.0f);
    }

    public final void g(boolean z, boolean z2) {
        if (this.V == z) {
            return;
        }
        this.V = z;
        pj8 pj8Var = this.H;
        if (z2) {
            pj8Var.setVisibility(0);
            pj8Var.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new mx4(this, z, (byte) 0)).start();
        } else {
            pj8Var.setVisibility(z ? 0 : 8);
            pj8Var.setAlpha(z ? 1.0f : 0.0f);
            pj8Var.setScaleX(z ? 1.0f : 0.3f);
            pj8Var.setScaleY(z ? 1.0f : 0.3f);
        }
    }

    public TL_stars.StarGift getGift() {
        return this.c0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.c0;
        if (starGift != null) {
            return starGift.id;
        }
        return 0L;
    }

    public nw4 getPremiumTier() {
        return this.b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        long j;
        boolean z6;
        TextView textView;
        byte b;
        boolean z7;
        gwa gwaVar = this.O;
        ColorFilter colorFilter = null;
        if (gwaVar != null) {
            gwaVar.run();
            this.O = null;
        }
        j(starGift.getDocument(), starGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        lx4 lx4Var = this.e;
        lx4Var.d(stargiftattributebackdrop);
        lx4Var.e((TL_stars.starGiftAttributePattern) jva.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z8 = starGift.auction;
        int[] iArr = w0;
        ylb ylbVar = this.b;
        if (!z8 || (((z7 = starGift.sold_out) && !this.d0) || (z3 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z3 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            lx4Var.g(iArr);
        } else if (z7) {
            int i = cmb.Cj;
            int[] iArr2 = {cmb.v0(i, ylbVar), cmb.v0(i, ylbVar)};
            this.s0 = iArr2;
            lx4Var.g(iArr2);
        } else {
            lx4Var.g(iArr);
        }
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        bf0 bf0Var = this.E;
        bf0Var.setTranslationY(0.0f);
        this.G.setVisibility(8);
        int i2 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i2);
        int i3 = z5 ? 0 : 8;
        TextView textView2 = this.y;
        textView2.setVisibility(i3);
        textView2.setTranslationX(starGift.resale_ton_only ? gm.L(23.0f) : 0.0f);
        textView2.setTranslationY(starGift.resale_ton_only ? gm.L(1.0f) : 0.0f);
        if (z5) {
            StringBuilder sb = new StringBuilder("+");
            int i4 = starGift.craft_chance_permille;
            sb.append((Object) (i4 <= 0 ? "<0.1%" : bc.J0(i4)));
            textView2.setText(sb.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 49;
        bf0Var.setLayoutParams(layoutParams);
        int i5 = this.a;
        bf0 bf0Var2 = this.n;
        if (!z4) {
            if ((!z3 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i5).getCurrentTime()) {
                bf0Var2.setVisibility(0);
                bf0Var2.setLayoutParams(this.s);
                int v0 = cmb.v0(cmb.mk, ylbVar);
                this.r0 = v0;
                bf0Var2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                this.q0 = true;
                bf0Var2.setImageResource(R.drawable.mini_gift_lock);
                int i6 = (z5 || z4) ? 0 : 8;
                TextView textView3 = this.M;
                textView3.setVisibility(i6);
                textView3.setTextSize(1, 12.0f);
                sb sbVar = this.L;
                if (!z) {
                    textView3.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
                    textView3.setText(jb6.M0(2131749852, null));
                    int v = stargiftattributebackdrop != null ? cmb.v(stargiftattributebackdrop.center_color | (-16777216), cmb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    this.t0 = (byte) 0;
                    int L = gm.L(13.0f);
                    int v2 = cmb.v(v, 822083583);
                    int i7 = v;
                    sbVar.setBackground(cmb.i0(L, L, L, L, i7, v2, v2));
                    textView3.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int L2 = gm.L(10.0f);
                    int v3 = cmb.v(i7, 822083583);
                    imageView.setBackground(cmb.i0(L2, L2, L2, L2, i7, v3, v3));
                } else if (z4) {
                    textView3.setPadding(gm.L(8.0f), 0, gm.L(10.0f), 0);
                    int v4 = cmb.v(stargiftattributebackdrop.center_color | (-16777216), cmb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    if (fs7.m(starGift)) {
                        ok okVar = ok.b;
                        pn2[] pn2VarArr = new pn2[1];
                        b = 0;
                        textView3.setText(nxa.t1(nxa.X0(true, "XTR " + ((Object) nxa.H0(nk.j(starGift.getResellAmount(okVar).b, okVar).q(), 1.0f, ',')), 1.2f, pn2VarArr), true));
                        pn2 pn2Var = pn2VarArr[0];
                        if (pn2Var != null) {
                            float L3 = gm.L(0.5f);
                            pn2Var.r = 0.0f;
                            pn2Var.s = L3;
                        }
                    } else {
                        b = 0;
                        textView3.setText(nxa.T0("XTR ".concat(jb6.E(starGift.getResellStars(), ','))));
                    }
                    this.t0 = b;
                    sbVar.setBackground(new tx4(1895825407, v4));
                    textView3.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(cmb.b0(gm.L(10.0f), v4));
                    textView2.setBackground(cmb.b0(gm.L(9.0f), v4));
                } else {
                    textView3.setPadding(gm.L(8.0f), 0, gm.L(10.0f), 0);
                    if (z3) {
                        long j2 = starGift.availability_resale;
                        if (j2 > 0) {
                            j = starGift.resell_min_stars;
                            if (j2 > 1 && j < oc7.r1(i5).l4.p.f()) {
                                z6 = true;
                                if (starGift.auction) {
                                    textView = textView3;
                                    if (starGift.availability_resale == 0) {
                                        textView.setText(jb6.M0(starGift.sold_out ? 2131750269 : 2131750270, null));
                                        this.t0 = (byte) 1;
                                        this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                        a();
                                        textView2.setBackground(cmb.b0(gm.L(9.0f), stargiftattributebackdrop == null ? cmb.v(stargiftattributebackdrop.center_color | (-16777216), cmb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                    }
                                } else {
                                    textView = textView3;
                                }
                                StringBuilder sb2 = new StringBuilder("XTR ");
                                sb2.append(jb6.E(j, ','));
                                sb2.append(z6 ? "+" : "");
                                textView.setText(nxa.b1(false, sb2.toString(), 0.71f, null));
                                this.t0 = (byte) 1;
                                this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                a();
                                textView2.setBackground(cmb.b0(gm.L(9.0f), stargiftattributebackdrop == null ? cmb.v(stargiftattributebackdrop.center_color | (-16777216), cmb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                            }
                            z6 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb22 = new StringBuilder("XTR ");
                            sb22.append(jb6.E(j, ','));
                            sb22.append(z6 ? "+" : "");
                            textView.setText(nxa.b1(false, sb22.toString(), 0.71f, null));
                            this.t0 = (byte) 1;
                            this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                            a();
                            textView2.setBackground(cmb.b0(gm.L(9.0f), stargiftattributebackdrop == null ? cmb.v(stargiftattributebackdrop.center_color | (-16777216), cmb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    j = ((z2 && starGift.can_upgrade) ? starGift.upgrade_stars : 0L) + starGift.stars;
                    z6 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb222 = new StringBuilder("XTR ");
                    sb222.append(jb6.E(j, ','));
                    sb222.append(z6 ? "+" : "");
                    textView.setText(nxa.b1(false, sb222.toString(), 0.71f, null));
                    this.t0 = (byte) 1;
                    this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                    a();
                    textView2.setBackground(cmb.b0(gm.L(9.0f), stargiftattributebackdrop == null ? cmb.v(stargiftattributebackdrop.center_color | (-16777216), cmb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                yd ydVar = this.K;
                ((ViewGroup.MarginLayoutParams) ydVar.getLayoutParams()).topMargin = gm.L(103.0f);
                ((FrameLayout.LayoutParams) ydVar.getLayoutParams()).gravity = 49;
                this.N.setVisibility(8);
                this.k0 = null;
                this.b0 = null;
                this.c0 = starGift;
                this.e0 = z;
                this.f0 = null;
                this.g0 = z3;
                this.h0 = z4;
                this.i0 = false;
                this.j0 = z5;
                this.R = null;
                this.S = null;
                d(false, false);
                l();
            }
            colorFilter = null;
        }
        bf0Var2.setColorFilter(colorFilter);
        this.q0 = false;
        bf0Var2.setVisibility(8);
        if (z5) {
        }
        TextView textView32 = this.M;
        textView32.setVisibility(i6);
        textView32.setTextSize(1, 12.0f);
        sb sbVar2 = this.L;
        if (!z) {
        }
        yd ydVar2 = this.K;
        ((ViewGroup.MarginLayoutParams) ydVar2.getLayoutParams()).topMargin = gm.L(103.0f);
        ((FrameLayout.LayoutParams) ydVar2.getLayoutParams()).gravity = 49;
        this.N.setVisibility(8);
        this.k0 = null;
        this.b0 = null;
        this.c0 = starGift;
        this.e0 = z;
        this.f0 = null;
        this.g0 = z3;
        this.h0 = z4;
        this.i0 = false;
        this.j0 = z5;
        this.R = null;
        this.S = null;
        d(false, false);
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x041e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0421 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z, boolean z2) {
        long j;
        yd ydVar;
        float f;
        float f2;
        byte b;
        yd ydVar2;
        long j2;
        ok okVar = ok.b;
        bf0 bf0Var = this.E;
        lx4 lx4Var = this.e;
        yd ydVar3 = this.K;
        pc0 pc0Var = this.h;
        ImageView imageView = this.x;
        pj8 pj8Var = this.G;
        bf0 bf0Var2 = this.n;
        TextView textView = this.M;
        gwa gwaVar = this.O;
        if (gwaVar != null) {
            gwaVar.run();
            this.O = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        lx4Var.d(stargiftattributebackdrop);
        lx4Var.e((TL_stars.starGiftAttributePattern) jva.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        lx4Var.g(null);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        bf0Var.setTranslationY(0.0f);
        pj8Var.I = true;
        pj8Var.J = false;
        pj8Var.invalidate();
        pj8Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(cmb.p1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        pj8 pj8Var2 = this.H;
        pj8Var2.I = true;
        pj8Var2.J = false;
        pj8Var2.invalidate();
        this.H.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(cmb.p1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        imageView.setVisibility(savedStarGift.gift.resale_ton_only ? 0 : 8);
        FrameLayout frameLayout = this.w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(cmb.K(gm.L(20.0f), cmb.a(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = gm.L(20.0f);
            int i = cmb.Ei;
            anb.B(frameLayout, cmb.K(L, cmb.v0(i, this.b)), anb.M(i), this.b);
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 17;
        bf0Var.setLayoutParams(layoutParams);
        if (this.m0 == savedStarGift) {
            pj8Var.setVisibility(0);
            pj8Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(d53.h).withEndAction(new ve4(this, savedStarGift, (byte) 16)).start();
        } else {
            pj8Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            pj8Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            pj8Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            pj8Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z3 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        bf0Var2.setColorFilter(null);
        this.q0 = false;
        bf0Var2.setLayoutParams(this.r);
        if (z3 && savedStarGift.name_hidden) {
            bf0Var2.setVisibility(8);
        } else if (savedStarGift.name_hidden) {
            bf0Var2.setVisibility(0);
            sn2 a = ixa.a(44, "anonymous");
            int L2 = gm.L(16.0f);
            int L3 = gm.L(16.0f);
            a.e = L2;
            a.f = L3;
            bf0Var2.setImageDrawable(a);
        } else {
            j = 0;
            long n = pg3.n(savedStarGift.from_id);
            int i2 = this.a;
            if (n > 0) {
                TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(n));
                if (W1 != null) {
                    bf0Var2.setVisibility(0);
                    pc0Var.q(W1);
                    bf0Var2.f(W1, pc0Var);
                } else {
                    bf0Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-n));
                if (L0 != null) {
                    bf0Var2.setVisibility(0);
                    pc0Var.p(L0);
                    bf0Var2.f(L0, pc0Var);
                } else {
                    bf0Var2.setVisibility(8);
                }
            }
            if (stargiftattributebackdrop == null) {
                f = 10.0f;
                TL_stars.StarGift starGift = savedStarGift.gift;
                f2 = 8.0f;
                if (starGift.resell_amount != null && (!fs7.m(starGift) || oc7.r1(this.a).l4.n0.f)) {
                    textView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams2 = this.F;
                    layoutParams2.topMargin = 0;
                    layoutParams2.bottomMargin = 0;
                    textView.setPadding(gm.L(8.0f), 0, gm.L(10.0f), 0);
                    textView.setTextSize(1, 12.0f);
                    pn2[] pn2VarArr = new pn2[1];
                    boolean m = fs7.m(savedStarGift.gift);
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (m) {
                        if (starGift2 == null) {
                            ydVar2 = ydVar3;
                            j2 = j;
                        } else {
                            ydVar2 = ydVar3;
                            j2 = starGift2.getResellAmount(okVar).b;
                        }
                        textView.setText(nxa.t1(nxa.X0(true, "XTR " + ((Object) nxa.H0(nk.j(j2, okVar).q(), 1.0f, ',')), 1.2f, pn2VarArr), true));
                    } else {
                        ydVar2 = ydVar3;
                        if (starGift2.resale_ton_only && pg3.n(starGift2.owner_id) == z8c.h(this.a).e()) {
                            textView.setText(nxa.t1(nxa.X0(true, "XTR " + ((Object) nxa.H0(savedStarGift.gift.getResellAmount(okVar).q(), 1.0f, ',')), 1.2f, pn2VarArr), true));
                        } else {
                            textView.setText(nxa.U0("XTR ".concat(jb6.E(savedStarGift.gift.getResellStars(), ',')), 0.95f, pn2VarArr));
                        }
                    }
                    pn2 pn2Var = pn2VarArr[0];
                    if (pn2Var != null) {
                        float L4 = gm.L(0.5f);
                        pn2Var.r = 0.0f;
                        pn2Var.s = L4;
                    }
                    int v = cmb.v(stargiftattributebackdrop.center_color | (-16777216), cmb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    this.t0 = (byte) 0;
                    this.L.setBackground(new tx4(1895825407, v));
                    textView.setTextColor(-1);
                    imageView.setBackground(cmb.b0(gm.L(10.0f), v));
                    imageView.setColorFilter(-1);
                    ((FrameLayout.LayoutParams) ydVar2.getLayoutParams()).gravity = 49;
                    ((ViewGroup.MarginLayoutParams) ydVar2.getLayoutParams()).topMargin = gm.L(79.0f);
                    this.N.setVisibility(8);
                    this.m0 = savedStarGift;
                    this.k0 = null;
                    TL_stars.SavedStarGift savedStarGift2 = this.f0;
                    this.b0 = null;
                    this.c0 = null;
                    this.e0 = false;
                    this.f0 = savedStarGift;
                    this.g0 = false;
                    this.h0 = false;
                    this.i0 = z2;
                    this.R = null;
                    this.S = null;
                    d(!savedStarGift.pinned_to_top && (!z3 || savedStarGift.name_hidden), savedStarGift2 == savedStarGift);
                    l();
                    return savedStarGift2 == savedStarGift;
                }
                ydVar = ydVar3;
            } else {
                ydVar = ydVar3;
                f = 10.0f;
                f2 = 8.0f;
            }
            if (z) {
                b = 0;
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams3 = this.F;
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            } else {
                textView.setVisibility(8);
                this.F.topMargin = gm.L(12.0f);
                this.F.bottomMargin = gm.L(12.0f);
                b = 0;
            }
            if (z3) {
                textView.setPadding(gm.L(f2), b, gm.L(f), b);
                textView.setTextSize(1, 12.0f);
                TL_stars.StarGift starGift3 = savedStarGift.gift;
                long j3 = starGift3.stars;
                long j4 = savedStarGift.convert_stars;
                if (j4 <= j) {
                    j4 = starGift3.convert_stars;
                }
                b = 0;
                textView.setText(nxa.b1(false, "XTR ".concat(jb6.E(Math.max(j3, j4), ',')), 0.66f, null));
            } else {
                textView.setPadding(gm.L(f2), b, gm.L(f2), b);
                ts2.q(12.0f, 1, 2131749992, textView, null);
            }
            if (z3) {
                this.t0 = (byte) 2;
                this.u0 = false;
                a();
            } else {
                this.t0 = b;
                textView.setTextColor(-1);
                this.L.setBackground(new tx4(1090519039));
                imageView.setBackground(cmb.b0(gm.L(f), 1090519039));
                imageView.setColorFilter(-1);
            }
            ((FrameLayout.LayoutParams) ydVar.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) ydVar.getLayoutParams()).topMargin = gm.L(103.0f);
            this.N.setVisibility(8);
            this.m0 = savedStarGift;
            this.k0 = null;
            TL_stars.SavedStarGift savedStarGift22 = this.f0;
            this.b0 = null;
            this.c0 = null;
            this.e0 = false;
            this.f0 = savedStarGift;
            this.g0 = false;
            this.h0 = false;
            this.i0 = z2;
            this.R = null;
            this.S = null;
            d(!savedStarGift.pinned_to_top && (!z3 || savedStarGift.name_hidden), savedStarGift22 == savedStarGift);
            l();
            if (savedStarGift22 == savedStarGift) {
            }
        }
        j = 0;
        if (stargiftattributebackdrop == null) {
        }
        if (z) {
        }
        if (z3) {
        }
        if (z3) {
        }
        ((FrameLayout.LayoutParams) ydVar.getLayoutParams()).gravity = 49;
        ((ViewGroup.MarginLayoutParams) ydVar.getLayoutParams()).topMargin = gm.L(103.0f);
        this.N.setVisibility(8);
        this.m0 = savedStarGift;
        this.k0 = null;
        TL_stars.SavedStarGift savedStarGift222 = this.f0;
        this.b0 = null;
        this.c0 = null;
        this.e0 = false;
        this.f0 = savedStarGift;
        this.g0 = false;
        this.h0 = false;
        this.i0 = z2;
        this.R = null;
        this.S = null;
        d(!savedStarGift.pinned_to_top && (!z3 || savedStarGift.name_hidden), savedStarGift222 == savedStarGift);
        l();
        if (savedStarGift222 == savedStarGift) {
        }
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        bf0 bf0Var = this.E;
        if (document == null) {
            bf0Var.b();
            this.l0 = null;
        } else {
            if (this.l0 == document) {
                return;
            }
            this.l0 = document;
            TLRPC.PhotoSize w = bc4.w(document.thumbs, gm.L(100.0f), false, null, false);
            bf0Var.j(gn5.b(document), "80_80_nolimit_pcache", gn5.c(w, document), "80_80_nolimit_pcache", eq3.f(document, cmb.Z6, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z, boolean z2, float f) {
        if (this.Q != f) {
            this.Q = f;
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = uniqueStarGift == null ? null : (TL_stars.starGiftAttributeBackdrop) jva.i(uniqueStarGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            int i = stargiftattributebackdrop == null ? -11184811 : stargiftattributebackdrop.pattern_color | (-16777216);
            float f2 = 1.0f - f;
            ColorMatrixColorFilter colorMatrixColorFilter = f <= 0.0f ? null : new ColorMatrixColorFilter(new float[]{f2, 0.0f, 0.0f, 0.0f, Color.red(i) * f, 0.0f, f2, 0.0f, 0.0f, Color.green(i) * f, 0.0f, 0.0f, f2, 0.0f, Color.blue(i) * f, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f), 0.0f});
            bf0 bf0Var = this.E;
            bf0Var.setColorFilter(colorMatrixColorFilter);
            bf0Var.getImageReceiver().v0 = f == 0.0f;
            if (f > 0.0f) {
                bf0Var.getImageReceiver().x0();
                p09 y = bf0Var.getImageReceiver().y();
                if (y != null) {
                    y.I(0, false, false);
                }
            }
            bf0Var.invalidate();
        }
        if (this.P != z) {
            this.P = z;
            if (getUniqueStarGift() != null) {
                String M0 = z ? jb6.M0(2131742786, null) : "#".concat(jb6.E(r2.num, ','));
                px4 px4Var = this.f;
                if (!z2) {
                    px4Var.b(M0, true);
                    return;
                }
                px4Var.getClass();
                px4Var.b = M0;
                px4Var.a.h(10, M0);
            }
        }
    }

    public final void l() {
        ylb ylbVar = this.b;
        px4 px4Var = this.f;
        TL_stars.SavedStarGift savedStarGift = this.f0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    px4Var.setBackdrop(null);
                    px4Var.setVisibility(8);
                    return;
                }
                px4Var.setVisibility(0);
                setRibbonColorKey(cmb.Bj);
                px4Var.setStrokeColor(0);
                this.p0 = false;
                px4Var.setBackdrop(null);
                px4Var.b(jb6.a0(null, null, 2131750068, gm.o0(this.f0.gift.availability_total, 0)), true);
                return;
            }
            px4Var.setVisibility(0);
            TL_stars.StarGift starGift2 = this.f0.gift;
            if (starGift2.resell_amount == null || (fs7.m(starGift2) && !oc7.r1(this.a).l4.n0.f)) {
                setRibbonColorKey(cmb.Bj);
                px4Var.setStrokeColor(0);
                this.p0 = false;
                px4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jva.i(this.f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                px4Var.b("#".concat(jb6.E(this.f0.gift.num, ',')), true);
                return;
            }
            int v = cmb.v(cmb.v0(cmb.c6, ylbVar), cmb.p1(0.04f, cmb.v0(cmb.F6, ylbVar)));
            setRibbonColorKey(cmb.kk);
            px4Var.setStrokeColor(v);
            this.p0 = true;
            px4Var.setBackdrop(null);
            px4Var.b(jb6.M0(2131750022, null), false);
            return;
        }
        TL_stars.StarGift starGift3 = this.c0;
        if (starGift3 == null) {
            nw4 nw4Var = this.b0;
            if (nw4Var != null) {
                if (nw4Var.b() <= 0) {
                    px4Var.setVisibility(8);
                    px4Var.setBackdrop(null);
                    px4Var.setStrokeColor(0);
                    this.p0 = false;
                    return;
                }
                px4Var.setVisibility(0);
                px4Var.setBackdrop(null);
                this.o0 = -1;
                px4Var.a(-2535425, -8229377);
                px4Var.setStrokeColor(0);
                this.p0 = false;
                String a0 = jb6.a0(null, null, 2131749441, Integer.valueOf(this.b0.b()));
                px4Var.b = a0;
                px4Var.a.g(12, a0, true);
                return;
            }
            return;
        }
        if (this.h0 || this.j0) {
            px4Var.setVisibility(0);
            setRibbonColorKey(cmb.Bj);
            px4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jva.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            px4Var.setStrokeColor(0);
            this.p0 = false;
            px4Var.b("#".concat(jb6.E(this.c0.num, ',')), true);
            return;
        }
        if (this.g0 && starGift3.availability_resale > 0) {
            px4Var.setVisibility(0);
            setRibbonColorKey(cmb.kk);
            px4Var.setStrokeColor(0);
            this.p0 = false;
            px4Var.setBackdrop(null);
            px4Var.b(jb6.M0(2131749963, null), false);
            return;
        }
        if (this.e0) {
            px4Var.setVisibility(0);
            setRibbonColorKey(cmb.Bj);
            px4Var.setStrokeColor(0);
            this.p0 = false;
            px4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jva.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            px4Var.b(jb6.a0(null, null, 2131750068, gm.o0(this.c0.availability_issued, 0)), true);
            return;
        }
        boolean z = starGift3.limited;
        if (z && starGift3.availability_remains <= 0) {
            px4Var.setVisibility(0);
            setRibbonColorKey(cmb.Cj);
            px4Var.setStrokeColor(0);
            this.p0 = false;
            px4Var.setBackdrop(null);
            px4Var.b(jb6.M0(2131749909, null), true);
            return;
        }
        if (starGift3.auction) {
            px4Var.setVisibility(0);
            px4Var.setBackdrop(null);
            this.o0 = -1;
            px4Var.a(-2650077, -4227818);
            px4Var.setStrokeColor(0);
            this.p0 = false;
            if (this.c0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                px4Var.b(jb6.M0(2131750066, null), true);
                return;
            } else {
                px4Var.b(jb6.M0(2131750067, null), true);
                return;
            }
        }
        if (starGift3.require_premium) {
            px4Var.setVisibility(0);
            px4Var.setBackdrop(null);
            this.o0 = -1;
            px4Var.a(-2650077, -4227818);
            px4Var.setStrokeColor(0);
            this.p0 = false;
            px4Var.b(jb6.M0(2131750065, null), true);
            return;
        }
        if (!z) {
            px4Var.setBackdrop(null);
            px4Var.setStrokeColor(0);
            this.p0 = false;
            px4Var.setVisibility(8);
            return;
        }
        px4Var.setVisibility(0);
        setRibbonColorKey(cmb.Bj);
        px4Var.setStrokeColor(0);
        this.p0 = false;
        px4Var.setBackdrop(null);
        px4Var.b(jb6.M0(2131750064, null), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[Catch: Exception -> 0x0163, TRY_LEAVE, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        TL_stars.StarGift starGift;
        TextView textView;
        px4 px4Var;
        yd ydVar;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        jh2 jh2Var;
        bf0 bf0Var;
        long n;
        TextView textView2;
        CharSequence text;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (isEnabled()) {
            accessibilityNodeInfo.addAction(16);
        }
        try {
            StringBuilder sb = new StringBuilder();
            String str = null;
            if (this.b0 == null) {
                TL_stars.SavedStarGift savedStarGift3 = this.f0;
                if (savedStarGift3 != null && (starGift = savedStarGift3.gift) != null) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.title)) {
                        charSequence = this.f0.gift.title;
                        if (TextUtils.isEmpty(charSequence)) {
                        }
                        sb.append(charSequence);
                        textView = this.J;
                        if (textView != null) {
                        }
                        px4Var = this.f;
                        if (px4Var != null) {
                        }
                        ydVar = this.K;
                        if (ydVar != null) {
                        }
                        savedStarGift = this.f0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.f0;
                        if (savedStarGift2 != null) {
                        }
                        jh2Var = this.n0;
                        if (jh2Var != null) {
                        }
                        accessibilityNodeInfo.setContentDescription(sb.toString());
                    }
                    charSequence = null;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb.append(charSequence);
                    textView = this.J;
                    if (textView != null) {
                    }
                    px4Var = this.f;
                    if (px4Var != null) {
                    }
                    ydVar = this.K;
                    if (ydVar != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    jh2Var = this.n0;
                    if (jh2Var != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb.toString());
                }
                TL_stars.StarGift starGift2 = this.c0;
                if (starGift2 != null && (starGift2 instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift2.title)) {
                    charSequence = this.c0.title;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb.append(charSequence);
                    textView = this.J;
                    if (textView != null) {
                    }
                    px4Var = this.f;
                    if (px4Var != null) {
                    }
                    ydVar = this.K;
                    if (ydVar != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    jh2Var = this.n0;
                    if (jh2Var != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb.toString());
                }
                charSequence = null;
                if (TextUtils.isEmpty(charSequence)) {
                }
                sb.append(charSequence);
                textView = this.J;
                if (textView != null) {
                }
                px4Var = this.f;
                if (px4Var != null) {
                }
                ydVar = this.K;
                if (ydVar != null) {
                }
                savedStarGift = this.f0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null) {
                }
                jh2Var = this.n0;
                if (jh2Var != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            TextView textView3 = this.I;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = jb6.M0(2131750125, null);
                }
                sb.append(charSequence);
                textView = this.J;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb.append(", ");
                    sb.append(textView.getText());
                }
                px4Var = this.f;
                if (px4Var != null && px4Var.getVisibility() == 0) {
                    text = px4Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb.append(", ");
                        sb.append(text);
                    }
                }
                ydVar = this.K;
                if (ydVar != null && ydVar.getVisibility() == 0 && (textView2 = this.M) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb.append(", ");
                    sb.append(textView2.getText());
                }
                savedStarGift = this.f0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb.append(", ");
                    sb.append(jb6.M0(2131750133, null));
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (bf0Var = this.n) != null && bf0Var.getVisibility() == 0) {
                    n = pg3.n(this.f0.from_id);
                    if (n != 0) {
                        int i = this.a;
                        if (n > 0) {
                            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(n));
                            if (W1 != null) {
                                str = m9c.r(W1);
                            }
                        } else {
                            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-n));
                            if (L0 != null) {
                                str = L0.title;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb.append(", ");
                            sb.append((CharSequence) str);
                        }
                    }
                }
                jh2Var = this.n0;
                if (jh2Var != null && jh2Var.a.q) {
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(true);
                }
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            charSequence = null;
            if (TextUtils.isEmpty(charSequence)) {
            }
            sb.append(charSequence);
            textView = this.J;
            if (textView != null) {
                sb.append(", ");
                sb.append(textView.getText());
            }
            px4Var = this.f;
            if (px4Var != null) {
                text = px4Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            ydVar = this.K;
            if (ydVar != null) {
                sb.append(", ");
                sb.append(textView2.getText());
            }
            savedStarGift = this.f0;
            if (savedStarGift != null) {
                sb.append(", ");
                sb.append(jb6.M0(2131750133, null));
            }
            savedStarGift2 = this.f0;
            if (savedStarGift2 != null) {
                n = pg3.n(this.f0.from_id);
                if (n != 0) {
                }
            }
            jh2Var = this.n0;
            if (jh2Var != null) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i) {
        this.E.setLayerNum(i);
    }

    public void setImageSize(int i) {
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.width = i;
        layoutParams.height = i;
    }

    public void setRibbonColor(int i) {
        this.o0 = -1;
        px4 px4Var = this.f;
        px4Var.setColor(i);
        px4Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i) {
        px4 px4Var = this.f;
        px4Var.setVisibility(0);
        setRibbonColorKey(cmb.Bj);
        px4Var.setStrokeColor(0);
        this.p0 = false;
        px4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jva.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        px4Var.b(jb6.a0(null, null, 2131750068, gm.o0(i, 0)), true);
    }

    @Override // vlb
    public final void updateColors() {
        int v0;
        bf0 bf0Var;
        int v02;
        try {
            boolean o = cmb.I.o();
            if (o != this.v0) {
                this.v0 = o;
                if (this.t0 != 0 && this.L != null && this.M != null && this.x != null) {
                    a();
                }
                TextView textView = this.N;
                if (textView != null) {
                    textView.setTextColor(o ? -1333971 : -2722014);
                }
            }
            px4 px4Var = this.f;
            ylb ylbVar = this.b;
            if (px4Var != null) {
                int i = this.o0;
                if (i >= 0) {
                    rx4 rx4Var = px4Var.a;
                    ((Paint) rx4Var.b).setColor(cmb.v0(i, ylbVar));
                    rx4Var.invalidateSelf();
                }
                if (this.p0) {
                    px4Var.setStrokeColor(cmb.v(cmb.v0(cmb.c6, ylbVar), cmb.p1(0.04f, cmb.v0(cmb.F6, ylbVar))));
                }
                px4Var.invalidate();
            }
            if (this.q0 && (bf0Var = this.n) != null && (v02 = cmb.v0(cmb.mk, ylbVar)) != this.r0) {
                this.r0 = v02;
                bf0Var.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            lx4 lx4Var = this.e;
            if (lx4Var != null) {
                int[] iArr = this.s0;
                if (iArr != null && lx4Var.m == iArr && (iArr[0] != (v0 = cmb.v0(cmb.Cj, ylbVar)) || iArr[1] != v0)) {
                    iArr[1] = v0;
                    iArr[0] = v0;
                    lx4Var.n = null;
                }
                lx4Var.invalidateSelf();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

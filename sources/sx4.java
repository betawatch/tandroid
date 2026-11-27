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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class sx4 extends FrameLayout implements snb {
    public static final int[] w0 = {-2781403, -3635939};
    public final de0 E;
    public FrameLayout.LayoutParams F;
    public final cl8 G;
    public final cl8 H;
    public final TextView I;
    public final TextView J;
    public final zc K;
    public final tb L;
    public final TextView M;
    public final TextView N;
    public gya O;
    public boolean P;
    public float Q;
    public pkb R;
    public pkb S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public final mm a0;
    public final vnb b;
    public pw4 b0;
    public final sca c;
    public TL_stars.StarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final px4 e;
    public boolean e0;
    public final tx4 f;
    public TL_stars.SavedStarGift f0;
    public boolean g0;
    public final rb0 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public pw4 k0;
    public TLRPC.Document l0;
    public TL_stars.SavedStarGift m0;
    public final de0 n;
    public og2 n0;
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

    public sx4(int i, vnb vnbVar, Context context) {
        super(context);
        this.Q = -1.0f;
        this.T = new Rect();
        this.a0 = new mm(this, 0L, 320L, k43.h);
        this.o0 = -1;
        this.v0 = aob.I.o();
        this.a = i;
        this.b = vnbVar;
        iye.b(this, 0.04f, 1.5f);
        this.c = new sca(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        px4 px4Var = new px4(frameLayout, vnbVar, true);
        this.e = px4Var;
        frameLayout.setBackground(px4Var);
        addView(frameLayout, tre.e(-1, -1, jn7.D1));
        tx4 tx4Var = new tx4(context);
        this.f = tx4Var;
        addView(tx4Var, tre.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.E = de0Var;
        de0Var.getImageReceiver().M(0);
        FrameLayout.LayoutParams d = tre.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(de0Var, d);
        cl8 cl8Var = new cl8(3, vnbVar, context);
        this.G = cl8Var;
        cl8Var.setImageReceiver(de0Var.getImageReceiver());
        frameLayout.addView(cl8Var, tre.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        cl8 cl8Var2 = new cl8(4, vnbVar, context);
        this.H = cl8Var2;
        cl8Var2.setImageReceiver(de0Var.getImageReceiver());
        frameLayout.addView(cl8Var2, tre.e(44, 44, 17));
        cl8Var2.setAlpha(0.0f);
        cl8Var2.setScaleX(0.3f);
        cl8Var2.setScaleY(0.3f);
        cl8Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i2 = aob.G6;
        yob.X(textView, i2, vnbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        TextView l = ik8.l(frameLayout, textView, tre.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = l;
        yob.X(l, i2, vnbVar);
        l.setGravity(17);
        l.setTextSize(1, 12.0f);
        frameLayout.addView(l, tre.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        zc zcVar = new zc((byte) 23, context, (Object) this);
        this.K = zcVar;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(hl.o());
        textView2.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(zcVar, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        tb tbVar = new tb(context, (byte) 13);
        this.L = tbVar;
        tbVar.setBackgroundColor(-16776961);
        zcVar.addView(tbVar, tre.c(0.0f, 0));
        zcVar.addView(textView2, tre.e(-2, 26, 17));
        tbVar.setBackground(new xx4(aob.I.o() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(aob.I.o() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, tre.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new rb0((vnb) null);
        de0 de0Var2 = new de0(context);
        this.n = de0Var2;
        de0Var2.setRoundRadius(hl.L(20.0f));
        de0Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = tre.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d2;
        frameLayout.addView(de0Var2, d2);
        this.s = tre.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView k = qd4.k(context, R.drawable.msg_limit_pin);
        k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        k.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(k, tre.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, tre.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.mini_gram_14);
        imageView.setPadding(0, hl.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, tre.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(hl.o());
        textView4.setPadding(hl.L(5.0f), 0, hl.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, tre.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        tx4Var.setImportantForAccessibility(2);
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
        this.f.setColor(aob.v0(i, this.b));
        this.o0 = i;
    }

    public final void a() {
        boolean o = aob.I.o();
        this.v0 = o;
        int i = this.u0 ? 1090519039 : o ? 518759725 : 1088989954;
        int i2 = o ? -1333971 : this.t0 == 2 ? -4229632 : -2722014;
        this.L.setBackground(new xx4(i));
        this.M.setTextColor(i2);
        ImageView imageView = this.x;
        imageView.setColorFilter(i2);
        imageView.setBackground(aob.b0(hl.L(10.0f), i));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Cj));
        hashSet.add(Integer.valueOf(aob.Dj));
        hashSet.add(Integer.valueOf(aob.lk));
        hashSet.add(Integer.valueOf(aob.nk));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public void b(bu5 bu5Var, Canvas canvas, float f, float f2, float f3) {
        float f4;
        zc zcVar;
        float f5;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f6;
        Canvas canvas2 = canvas;
        de0 de0Var = this.n;
        de0 de0Var2 = this.E;
        px4 px4Var = this.e;
        tx4 tx4Var = this.f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        zc zcVar2 = this.K;
        cl8 cl8Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float L = uniqueStarGift != null ? hl.L(63.0f) * f3 : 0.0f;
        px4Var.setBounds(0, 0, (int) f, (int) f2);
        px4Var.b(canvas2, f3);
        px4Var.getPadding(rect);
        float U1 = hl.U1(f3, hl.L(80.0f), hl.L(120.0f));
        float f7 = f2 - L;
        de0Var2.getImageReceiver().i0((f - U1) / 2.0f, (f7 - U1) / 2.0f, U1, U1);
        de0Var2.getImageReceiver().h(canvas2, null);
        b29 y = de0Var2.getImageReceiver().y();
        if (y != null && y.l0) {
            bu5Var.invalidate();
        }
        if (cl8Var.getVisibility() != 0 || cl8Var.getAlpha() <= 0.0f) {
            f4 = 1.0f;
            zcVar = zcVar2;
            f5 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        } else {
            canvas2.save();
            canvas2.translate((f - cl8Var.getMeasuredWidth()) / 2.0f, hl.R1(cl8Var.getY(), (f7 - cl8Var.getMeasuredHeight()) / 2.0f, f3));
            f4 = 1.0f;
            zcVar = zcVar2;
            f5 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, cl8Var.getWidth(), cl8Var.getHeight(), (int) (cl8Var.getAlpha() * (1.0f - f3) * 255.0f), 31);
            cl8Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f5) {
            canvas2.save();
            canvas2.translate(hl.L(2.0f) + rect.left, hl.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (de0Var.getVisibility() == 0 && de0Var.getAlpha() > f5) {
            canvas2.save();
            canvas2.translate(hl.L(2.0f) + rect.left, hl.L(2.0f) + rect.top);
            de0Var.draw(canvas2);
            canvas2.restore();
        }
        if (tx4Var.getVisibility() != 0 || tx4Var.getAlpha() <= f5) {
            f6 = f4;
        } else {
            canvas2.save();
            canvas2.translate(f - hl.L(f4), hl.L(2.0f));
            f6 = f4;
            float R1 = hl.R1(f6, 1.25f, f3);
            canvas2.scale(R1, R1);
            canvas2.translate(-tx4Var.getWidth(), f5);
            tx4Var.draw(canvas2);
            canvas2.restore();
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new pkb(tL_starGiftUnique.title, 20.0f, hl.o());
            }
            if (this.S == null) {
                this.S = new pkb(ob6.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            pkb pkbVar = this.R;
            pkbVar.p = f - hl.L(8.0f);
            float f8 = f6 - f3;
            pkbVar.c((f - this.R.j()) / 2.0f, ((f2 - hl.L(40.0f)) - (this.R.h() / 2.0f)) + (hl.L(50.0f) * f8), f3, -1, canvas);
            pkb pkbVar2 = this.S;
            pkbVar2.p = f - hl.L(8.0f);
            pkbVar2.c((f - this.S.j()) / 2.0f, (hl.L(50.0f) * f8) + ((f2 - hl.L(19.0f)) - (this.S.h() / 2.0f)), 0.6f * f3, -1, canvas);
            canvas2 = canvas;
        }
        if (zcVar != null && zcVar.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(zcVar.getX(), zcVar.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, zcVar.getWidth(), zcVar.getHeight(), (int) (zcVar.getAlpha() * (f6 - f3) * 255.0f), 31);
            canvas2 = canvas;
            zcVar.draw(canvas2);
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
            og2 og2Var = new og2(21, null, getContext());
            this.n0 = og2Var;
            og2Var.b(-1, aob.d6, aob.k7);
            this.n0.setDrawUnchecked(false);
            this.d.addView(this.n0, tre.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
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
            frameLayout.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new qx4(this, z, (byte) 1)).start();
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
            imageView.animate().translationX(z ? hl.L(6.0f) : 0.0f).translationY(z ? hl.L(6.0f) : 0.0f).setDuration(320L).setInterpolator(k43.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z ? hl.L(6.0f) : 0.0f);
        imageView.setTranslationY(z ? hl.L(6.0f) : 0.0f);
    }

    public final void g(boolean z, boolean z2) {
        if (this.V == z) {
            return;
        }
        this.V = z;
        cl8 cl8Var = this.H;
        if (z2) {
            cl8Var.setVisibility(0);
            cl8Var.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new qx4(this, z, (byte) 0)).start();
        } else {
            cl8Var.setVisibility(z ? 0 : 8);
            cl8Var.setAlpha(z ? 1.0f : 0.0f);
            cl8Var.setScaleX(z ? 1.0f : 0.3f);
            cl8Var.setScaleY(z ? 1.0f : 0.3f);
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

    public pw4 getPremiumTier() {
        return this.b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        long j;
        boolean z6;
        TextView textView;
        byte b;
        boolean z7;
        gya gyaVar = this.O;
        ColorFilter colorFilter = null;
        if (gyaVar != null) {
            gyaVar.run();
            this.O = null;
        }
        j(starGift.getDocument(), starGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jxa.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        px4 px4Var = this.e;
        px4Var.d(stargiftattributebackdrop);
        px4Var.e((TL_stars.starGiftAttributePattern) jxa.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z8 = starGift.auction;
        int[] iArr = w0;
        vnb vnbVar = this.b;
        if (!z8 || (((z7 = starGift.sold_out) && !this.d0) || (z3 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (starGift instanceof TL_stars.TL_starGiftUnique) || (z3 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            px4Var.g(iArr);
        } else if (z7) {
            int i = aob.Dj;
            int[] iArr2 = {aob.v0(i, vnbVar), aob.v0(i, vnbVar)};
            this.s0 = iArr2;
            px4Var.g(iArr2);
        } else {
            px4Var.g(iArr);
        }
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        de0 de0Var = this.E;
        de0Var.setTranslationY(0.0f);
        this.G.setVisibility(8);
        int i2 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i2);
        int i3 = z5 ? 0 : 8;
        TextView textView2 = this.y;
        textView2.setVisibility(i3);
        textView2.setTranslationX(starGift.resale_ton_only ? hl.L(23.0f) : 0.0f);
        textView2.setTranslationY(starGift.resale_ton_only ? hl.L(1.0f) : 0.0f);
        if (z5) {
            StringBuilder sb = new StringBuilder("+");
            int i4 = starGift.craft_chance_permille;
            sb.append((Object) (i4 <= 0 ? "<0.1%" : cc.J0(i4)));
            textView2.setText(sb.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 49;
        de0Var.setLayoutParams(layoutParams);
        int i5 = this.a;
        de0 de0Var2 = this.n;
        if (!z4) {
            if ((!z3 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i5).getCurrentTime()) {
                de0Var2.setVisibility(0);
                de0Var2.setLayoutParams(this.s);
                int v0 = aob.v0(aob.nk, vnbVar);
                this.r0 = v0;
                de0Var2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                this.q0 = true;
                de0Var2.setImageResource(R.drawable.mini_gift_lock);
                int i6 = (z5 || z4) ? 0 : 8;
                TextView textView3 = this.M;
                textView3.setVisibility(i6);
                textView3.setTextSize(1, 12.0f);
                tb tbVar = this.L;
                if (!z) {
                    textView3.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
                    textView3.setText(ob6.M0(2131749865, null));
                    int v = stargiftattributebackdrop != null ? aob.v(stargiftattributebackdrop.center_color | (-16777216), aob.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    this.t0 = (byte) 0;
                    int L = hl.L(13.0f);
                    int v2 = aob.v(v, 822083583);
                    int i7 = v;
                    tbVar.setBackground(aob.i0(L, L, L, L, i7, v2, v2));
                    textView3.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int L2 = hl.L(10.0f);
                    int v3 = aob.v(i7, 822083583);
                    imageView.setBackground(aob.i0(L2, L2, L2, L2, i7, v3, v3));
                } else if (z4) {
                    textView3.setPadding(hl.L(8.0f), 0, hl.L(10.0f), 0);
                    int v4 = aob.v(stargiftattributebackdrop.center_color | (-16777216), aob.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    if (it7.n(starGift)) {
                        pj pjVar = pj.b;
                        wm2[] wm2VarArr = new wm2[1];
                        b = 0;
                        textView3.setText(nza.t1(nza.X0(true, "XTR " + ((Object) nza.H0(oj.j(starGift.getResellAmount(pjVar).b, pjVar).q(), 1.0f, ',')), 1.2f, wm2VarArr), true));
                        wm2 wm2Var = wm2VarArr[0];
                        if (wm2Var != null) {
                            float L3 = hl.L(0.5f);
                            wm2Var.r = 0.0f;
                            wm2Var.s = L3;
                        }
                    } else {
                        b = 0;
                        textView3.setText(nza.T0("XTR ".concat(ob6.E(starGift.getResellStars(), ','))));
                    }
                    this.t0 = b;
                    tbVar.setBackground(new xx4(1895825407, v4));
                    textView3.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(aob.b0(hl.L(10.0f), v4));
                    textView2.setBackground(aob.b0(hl.L(9.0f), v4));
                } else {
                    textView3.setPadding(hl.L(8.0f), 0, hl.L(10.0f), 0);
                    if (z3) {
                        long j2 = starGift.availability_resale;
                        if (j2 > 0) {
                            j = starGift.resell_min_stars;
                            if (j2 > 1 && j < uc7.s1(i5).k4.p.f()) {
                                z6 = true;
                                if (starGift.auction) {
                                    textView = textView3;
                                    if (starGift.availability_resale == 0) {
                                        textView.setText(ob6.M0(starGift.sold_out ? 2131750297 : 2131750298, null));
                                        this.t0 = (byte) 1;
                                        this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                        a();
                                        textView2.setBackground(aob.b0(hl.L(9.0f), stargiftattributebackdrop == null ? aob.v(stargiftattributebackdrop.center_color | (-16777216), aob.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                    }
                                } else {
                                    textView = textView3;
                                }
                                StringBuilder sb2 = new StringBuilder("XTR ");
                                sb2.append(ob6.E(j, ','));
                                sb2.append(z6 ? "+" : "");
                                textView.setText(nza.b1(false, sb2.toString(), 0.71f, null));
                                this.t0 = (byte) 1;
                                this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                a();
                                textView2.setBackground(aob.b0(hl.L(9.0f), stargiftattributebackdrop == null ? aob.v(stargiftattributebackdrop.center_color | (-16777216), aob.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                            }
                            z6 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb22 = new StringBuilder("XTR ");
                            sb22.append(ob6.E(j, ','));
                            sb22.append(z6 ? "+" : "");
                            textView.setText(nza.b1(false, sb22.toString(), 0.71f, null));
                            this.t0 = (byte) 1;
                            this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                            a();
                            textView2.setBackground(aob.b0(hl.L(9.0f), stargiftattributebackdrop == null ? aob.v(stargiftattributebackdrop.center_color | (-16777216), aob.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    j = ((z2 && starGift.can_upgrade) ? starGift.upgrade_stars : 0L) + starGift.stars;
                    z6 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb222 = new StringBuilder("XTR ");
                    sb222.append(ob6.E(j, ','));
                    sb222.append(z6 ? "+" : "");
                    textView.setText(nza.b1(false, sb222.toString(), 0.71f, null));
                    this.t0 = (byte) 1;
                    this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                    a();
                    textView2.setBackground(aob.b0(hl.L(9.0f), stargiftattributebackdrop == null ? aob.v(stargiftattributebackdrop.center_color | (-16777216), aob.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                zc zcVar = this.K;
                ((ViewGroup.MarginLayoutParams) zcVar.getLayoutParams()).topMargin = hl.L(103.0f);
                ((FrameLayout.LayoutParams) zcVar.getLayoutParams()).gravity = 49;
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
        de0Var2.setColorFilter(colorFilter);
        this.q0 = false;
        de0Var2.setVisibility(8);
        if (z5) {
        }
        TextView textView32 = this.M;
        textView32.setVisibility(i6);
        textView32.setTextSize(1, 12.0f);
        tb tbVar2 = this.L;
        if (!z) {
        }
        zc zcVar2 = this.K;
        ((ViewGroup.MarginLayoutParams) zcVar2.getLayoutParams()).topMargin = hl.L(103.0f);
        ((FrameLayout.LayoutParams) zcVar2.getLayoutParams()).gravity = 49;
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
        zc zcVar;
        float f;
        float f2;
        byte b;
        zc zcVar2;
        long j2;
        pj pjVar = pj.b;
        de0 de0Var = this.E;
        px4 px4Var = this.e;
        zc zcVar3 = this.K;
        rb0 rb0Var = this.h;
        ImageView imageView = this.x;
        cl8 cl8Var = this.G;
        de0 de0Var2 = this.n;
        TextView textView = this.M;
        gya gyaVar = this.O;
        if (gyaVar != null) {
            gyaVar.run();
            this.O = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jxa.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        px4Var.d(stargiftattributebackdrop);
        px4Var.e((TL_stars.starGiftAttributePattern) jxa.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        px4Var.g(null);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        de0Var.setTranslationY(0.0f);
        cl8Var.I = true;
        cl8Var.J = false;
        cl8Var.invalidate();
        cl8Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(aob.p1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        cl8 cl8Var2 = this.H;
        cl8Var2.I = true;
        cl8Var2.J = false;
        cl8Var2.invalidate();
        this.H.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(aob.p1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        imageView.setVisibility(savedStarGift.gift.resale_ton_only ? 0 : 8);
        FrameLayout frameLayout = this.w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(aob.K(hl.L(20.0f), aob.a(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = hl.L(20.0f);
            int i = aob.Fi;
            yob.B(frameLayout, aob.K(L, aob.v0(i, this.b)), yob.M(i), this.b);
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 17;
        de0Var.setLayoutParams(layoutParams);
        if (this.m0 == savedStarGift) {
            cl8Var.setVisibility(0);
            cl8Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(k43.h).withEndAction(new se4(this, savedStarGift, (byte) 12)).start();
        } else {
            cl8Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            cl8Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            cl8Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            cl8Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z3 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        de0Var2.setColorFilter(null);
        this.q0 = false;
        de0Var2.setLayoutParams(this.r);
        if (z3 && savedStarGift.name_hidden) {
            de0Var2.setVisibility(8);
        } else if (savedStarGift.name_hidden) {
            de0Var2.setVisibility(0);
            zm2 a = iza.a(44, "anonymous");
            int L2 = hl.L(16.0f);
            int L3 = hl.L(16.0f);
            a.e = L2;
            a.f = L3;
            de0Var2.setImageDrawable(a);
        } else {
            j = 0;
            long n = wf3.n(savedStarGift.from_id);
            int i2 = this.a;
            if (n > 0) {
                TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n));
                if (X1 != null) {
                    de0Var2.setVisibility(0);
                    rb0Var.q(X1);
                    de0Var2.f(X1, rb0Var);
                } else {
                    de0Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-n));
                if (M0 != null) {
                    de0Var2.setVisibility(0);
                    rb0Var.p(M0);
                    de0Var2.f(M0, rb0Var);
                } else {
                    de0Var2.setVisibility(8);
                }
            }
            if (stargiftattributebackdrop == null) {
                f = 10.0f;
                TL_stars.StarGift starGift = savedStarGift.gift;
                f2 = 8.0f;
                if (starGift.resell_amount != null && (!it7.n(starGift) || uc7.s1(this.a).k4.v0.f)) {
                    textView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams2 = this.F;
                    layoutParams2.topMargin = 0;
                    layoutParams2.bottomMargin = 0;
                    textView.setPadding(hl.L(8.0f), 0, hl.L(10.0f), 0);
                    textView.setTextSize(1, 12.0f);
                    wm2[] wm2VarArr = new wm2[1];
                    boolean n2 = it7.n(savedStarGift.gift);
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (n2) {
                        if (starGift2 == null) {
                            zcVar2 = zcVar3;
                            j2 = j;
                        } else {
                            zcVar2 = zcVar3;
                            j2 = starGift2.getResellAmount(pjVar).b;
                        }
                        textView.setText(nza.t1(nza.X0(true, "XTR " + ((Object) nza.H0(oj.j(j2, pjVar).q(), 1.0f, ',')), 1.2f, wm2VarArr), true));
                    } else {
                        zcVar2 = zcVar3;
                        if (starGift2.resale_ton_only && wf3.n(starGift2.owner_id) == yac.h(this.a).e()) {
                            textView.setText(nza.t1(nza.X0(true, "XTR " + ((Object) nza.H0(savedStarGift.gift.getResellAmount(pjVar).q(), 1.0f, ',')), 1.2f, wm2VarArr), true));
                        } else {
                            textView.setText(nza.U0("XTR ".concat(ob6.E(savedStarGift.gift.getResellStars(), ',')), 0.95f, wm2VarArr));
                        }
                    }
                    wm2 wm2Var = wm2VarArr[0];
                    if (wm2Var != null) {
                        float L4 = hl.L(0.5f);
                        wm2Var.r = 0.0f;
                        wm2Var.s = L4;
                    }
                    int v = aob.v(stargiftattributebackdrop.center_color | (-16777216), aob.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    this.t0 = (byte) 0;
                    this.L.setBackground(new xx4(1895825407, v));
                    textView.setTextColor(-1);
                    imageView.setBackground(aob.b0(hl.L(10.0f), v));
                    imageView.setColorFilter(-1);
                    ((FrameLayout.LayoutParams) zcVar2.getLayoutParams()).gravity = 49;
                    ((ViewGroup.MarginLayoutParams) zcVar2.getLayoutParams()).topMargin = hl.L(79.0f);
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
                zcVar = zcVar3;
            } else {
                zcVar = zcVar3;
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
                this.F.topMargin = hl.L(12.0f);
                this.F.bottomMargin = hl.L(12.0f);
                b = 0;
            }
            if (z3) {
                textView.setPadding(hl.L(f2), b, hl.L(f), b);
                textView.setTextSize(1, 12.0f);
                TL_stars.StarGift starGift3 = savedStarGift.gift;
                long j3 = starGift3.stars;
                long j4 = savedStarGift.convert_stars;
                if (j4 <= j) {
                    j4 = starGift3.convert_stars;
                }
                b = 0;
                textView.setText(nza.b1(false, "XTR ".concat(ob6.E(Math.max(j3, j4), ',')), 0.66f, null));
            } else {
                textView.setPadding(hl.L(f2), b, hl.L(f2), b);
                bs2.r(12.0f, 1, 2131750017, textView, null);
            }
            if (z3) {
                this.t0 = (byte) 2;
                this.u0 = false;
                a();
            } else {
                this.t0 = b;
                textView.setTextColor(-1);
                this.L.setBackground(new xx4(1090519039));
                imageView.setBackground(aob.b0(hl.L(f), 1090519039));
                imageView.setColorFilter(-1);
            }
            ((FrameLayout.LayoutParams) zcVar.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) zcVar.getLayoutParams()).topMargin = hl.L(103.0f);
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
        ((FrameLayout.LayoutParams) zcVar.getLayoutParams()).gravity = 49;
        ((ViewGroup.MarginLayoutParams) zcVar.getLayoutParams()).topMargin = hl.L(103.0f);
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
        de0 de0Var = this.E;
        if (document == null) {
            de0Var.b();
            this.l0 = null;
        } else {
            if (this.l0 == document) {
                return;
            }
            this.l0 = document;
            TLRPC.PhotoSize w = xb4.w(document.thumbs, hl.L(100.0f), false, null, false);
            de0Var.j(jn5.b(document), "80_80_nolimit_pcache", jn5.c(w, document), "80_80_nolimit_pcache", lp3.f(document, aob.a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z, boolean z2, float f) {
        if (this.Q != f) {
            this.Q = f;
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = uniqueStarGift == null ? null : (TL_stars.starGiftAttributeBackdrop) jxa.i(uniqueStarGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            int i = stargiftattributebackdrop == null ? -11184811 : stargiftattributebackdrop.pattern_color | (-16777216);
            float f2 = 1.0f - f;
            ColorMatrixColorFilter colorMatrixColorFilter = f <= 0.0f ? null : new ColorMatrixColorFilter(new float[]{f2, 0.0f, 0.0f, 0.0f, Color.red(i) * f, 0.0f, f2, 0.0f, 0.0f, Color.green(i) * f, 0.0f, 0.0f, f2, 0.0f, Color.blue(i) * f, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f), 0.0f});
            de0 de0Var = this.E;
            de0Var.setColorFilter(colorMatrixColorFilter);
            de0Var.getImageReceiver().v0 = f == 0.0f;
            if (f > 0.0f) {
                de0Var.getImageReceiver().x0();
                b29 y = de0Var.getImageReceiver().y();
                if (y != null) {
                    y.I(0, false, false);
                }
            }
            de0Var.invalidate();
        }
        if (this.P != z) {
            this.P = z;
            if (getUniqueStarGift() != null) {
                String M0 = z ? ob6.M0(2131742754, null) : "#".concat(ob6.E(r2.num, ','));
                tx4 tx4Var = this.f;
                if (!z2) {
                    tx4Var.b(M0, true);
                    return;
                }
                tx4Var.getClass();
                tx4Var.b = M0;
                tx4Var.a.h(10, M0);
            }
        }
    }

    public final void l() {
        vnb vnbVar = this.b;
        tx4 tx4Var = this.f;
        TL_stars.SavedStarGift savedStarGift = this.f0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    tx4Var.setBackdrop(null);
                    tx4Var.setVisibility(8);
                    return;
                }
                tx4Var.setVisibility(0);
                setRibbonColorKey(aob.Cj);
                tx4Var.setStrokeColor(0);
                this.p0 = false;
                tx4Var.setBackdrop(null);
                tx4Var.b(ob6.a0(null, null, 2131750094, hl.o0(this.f0.gift.availability_total, 0)), true);
                return;
            }
            tx4Var.setVisibility(0);
            TL_stars.StarGift starGift2 = this.f0.gift;
            if (starGift2.resell_amount == null || (it7.n(starGift2) && !uc7.s1(this.a).k4.v0.f)) {
                setRibbonColorKey(aob.Cj);
                tx4Var.setStrokeColor(0);
                this.p0 = false;
                tx4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jxa.i(this.f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                tx4Var.b("#".concat(ob6.E(this.f0.gift.num, ',')), true);
                return;
            }
            int v = aob.v(aob.v0(aob.d6, vnbVar), aob.p1(0.04f, aob.v0(aob.G6, vnbVar)));
            setRibbonColorKey(aob.lk);
            tx4Var.setStrokeColor(v);
            this.p0 = true;
            tx4Var.setBackdrop(null);
            tx4Var.b(ob6.M0(2131750047, null), false);
            return;
        }
        TL_stars.StarGift starGift3 = this.c0;
        if (starGift3 == null) {
            pw4 pw4Var = this.b0;
            if (pw4Var != null) {
                if (pw4Var.b() <= 0) {
                    tx4Var.setVisibility(8);
                    tx4Var.setBackdrop(null);
                    tx4Var.setStrokeColor(0);
                    this.p0 = false;
                    return;
                }
                tx4Var.setVisibility(0);
                tx4Var.setBackdrop(null);
                this.o0 = -1;
                tx4Var.a(-2535425, -8229377);
                tx4Var.setStrokeColor(0);
                this.p0 = false;
                String a0 = ob6.a0(null, null, 2131749453, Integer.valueOf(this.b0.b()));
                tx4Var.b = a0;
                tx4Var.a.g(12, a0, true);
                return;
            }
            return;
        }
        if (this.h0 || this.j0) {
            tx4Var.setVisibility(0);
            setRibbonColorKey(aob.Cj);
            tx4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jxa.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            tx4Var.setStrokeColor(0);
            this.p0 = false;
            tx4Var.b("#".concat(ob6.E(this.c0.num, ',')), true);
            return;
        }
        if (this.g0 && starGift3.availability_resale > 0) {
            tx4Var.setVisibility(0);
            setRibbonColorKey(aob.lk);
            tx4Var.setStrokeColor(0);
            this.p0 = false;
            tx4Var.setBackdrop(null);
            tx4Var.b(ob6.M0(2131749988, null), false);
            return;
        }
        if (this.e0) {
            tx4Var.setVisibility(0);
            setRibbonColorKey(aob.Cj);
            tx4Var.setStrokeColor(0);
            this.p0 = false;
            tx4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jxa.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            tx4Var.b(ob6.a0(null, null, 2131750094, hl.o0(this.c0.availability_issued, 0)), true);
            return;
        }
        boolean z = starGift3.limited;
        if (z && starGift3.availability_remains <= 0) {
            tx4Var.setVisibility(0);
            setRibbonColorKey(aob.Dj);
            tx4Var.setStrokeColor(0);
            this.p0 = false;
            tx4Var.setBackdrop(null);
            tx4Var.b(ob6.M0(2131749922, null), true);
            return;
        }
        if (starGift3.auction) {
            tx4Var.setVisibility(0);
            tx4Var.setBackdrop(null);
            this.o0 = -1;
            tx4Var.a(-2650077, -4227818);
            tx4Var.setStrokeColor(0);
            this.p0 = false;
            if (this.c0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                tx4Var.b(ob6.M0(2131750092, null), true);
                return;
            } else {
                tx4Var.b(ob6.M0(2131750093, null), true);
                return;
            }
        }
        if (starGift3.is_new) {
            tx4Var.setVisibility(0);
            setRibbonColorKey(aob.Cj);
            tx4Var.setStrokeColor(0);
            this.p0 = false;
            tx4Var.setBackdrop(null);
            tx4Var.b(ob6.M0(2131750053, null), true);
            return;
        }
        if (starGift3.require_premium) {
            tx4Var.setVisibility(0);
            tx4Var.setBackdrop(null);
            this.o0 = -1;
            tx4Var.a(-2650077, -4227818);
            tx4Var.setStrokeColor(0);
            this.p0 = false;
            tx4Var.b(ob6.M0(2131750091, null), true);
            return;
        }
        if (!z) {
            tx4Var.setBackdrop(null);
            tx4Var.setStrokeColor(0);
            this.p0 = false;
            tx4Var.setVisibility(8);
            return;
        }
        tx4Var.setVisibility(0);
        setRibbonColorKey(aob.Cj);
        tx4Var.setStrokeColor(0);
        this.p0 = false;
        tx4Var.setBackdrop(null);
        tx4Var.b(ob6.M0(2131750090, null), true);
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
        tx4 tx4Var;
        zc zcVar;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        og2 og2Var;
        de0 de0Var;
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
                        tx4Var = this.f;
                        if (tx4Var != null) {
                        }
                        zcVar = this.K;
                        if (zcVar != null) {
                        }
                        savedStarGift = this.f0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.f0;
                        if (savedStarGift2 != null) {
                        }
                        og2Var = this.n0;
                        if (og2Var != null) {
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
                    tx4Var = this.f;
                    if (tx4Var != null) {
                    }
                    zcVar = this.K;
                    if (zcVar != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    og2Var = this.n0;
                    if (og2Var != null) {
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
                    tx4Var = this.f;
                    if (tx4Var != null) {
                    }
                    zcVar = this.K;
                    if (zcVar != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    og2Var = this.n0;
                    if (og2Var != null) {
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
                tx4Var = this.f;
                if (tx4Var != null) {
                }
                zcVar = this.K;
                if (zcVar != null) {
                }
                savedStarGift = this.f0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null) {
                }
                og2Var = this.n0;
                if (og2Var != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            TextView textView3 = this.I;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = ob6.M0(2131750151, null);
                }
                sb.append(charSequence);
                textView = this.J;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb.append(", ");
                    sb.append(textView.getText());
                }
                tx4Var = this.f;
                if (tx4Var != null && tx4Var.getVisibility() == 0) {
                    text = tx4Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb.append(", ");
                        sb.append(text);
                    }
                }
                zcVar = this.K;
                if (zcVar != null && zcVar.getVisibility() == 0 && (textView2 = this.M) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb.append(", ");
                    sb.append(textView2.getText());
                }
                savedStarGift = this.f0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb.append(", ");
                    sb.append(ob6.M0(2131750159, null));
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (de0Var = this.n) != null && de0Var.getVisibility() == 0) {
                    n = wf3.n(this.f0.from_id);
                    if (n != 0) {
                        int i = this.a;
                        if (n > 0) {
                            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(n));
                            if (X1 != null) {
                                str = lbc.r(X1);
                            }
                        } else {
                            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-n));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb.append(", ");
                            sb.append((CharSequence) str);
                        }
                    }
                }
                og2Var = this.n0;
                if (og2Var != null && og2Var.a.q) {
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
            tx4Var = this.f;
            if (tx4Var != null) {
                text = tx4Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            zcVar = this.K;
            if (zcVar != null) {
                sb.append(", ");
                sb.append(textView2.getText());
            }
            savedStarGift = this.f0;
            if (savedStarGift != null) {
                sb.append(", ");
                sb.append(ob6.M0(2131750159, null));
            }
            savedStarGift2 = this.f0;
            if (savedStarGift2 != null) {
                n = wf3.n(this.f0.from_id);
                if (n != 0) {
                }
            }
            og2Var = this.n0;
            if (og2Var != null) {
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
        tx4 tx4Var = this.f;
        tx4Var.setColor(i);
        tx4Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i) {
        tx4 tx4Var = this.f;
        tx4Var.setVisibility(0);
        setRibbonColorKey(aob.Cj);
        tx4Var.setStrokeColor(0);
        this.p0 = false;
        tx4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jxa.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        tx4Var.b(ob6.a0(null, null, 2131750094, hl.o0(i, 0)), true);
    }

    @Override // snb
    public final void updateColors() {
        int v0;
        de0 de0Var;
        int v02;
        try {
            boolean o = aob.I.o();
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
            tx4 tx4Var = this.f;
            vnb vnbVar = this.b;
            if (tx4Var != null) {
                int i = this.o0;
                if (i >= 0) {
                    vx4 vx4Var = tx4Var.a;
                    ((Paint) vx4Var.b).setColor(aob.v0(i, vnbVar));
                    vx4Var.invalidateSelf();
                }
                if (this.p0) {
                    tx4Var.setStrokeColor(aob.v(aob.v0(aob.d6, vnbVar), aob.p1(0.04f, aob.v0(aob.G6, vnbVar))));
                }
                tx4Var.invalidate();
            }
            if (this.q0 && (de0Var = this.n) != null && (v02 = aob.v0(aob.nk, vnbVar)) != this.r0) {
                this.r0 = v02;
                de0Var.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            px4 px4Var = this.e;
            if (px4Var != null) {
                int[] iArr = this.s0;
                if (iArr != null && px4Var.m == iArr && (iArr[0] != (v0 = aob.v0(aob.Dj, vnbVar)) || iArr[1] != v0)) {
                    iArr[1] = v0;
                    iArr[0] = v0;
                    px4Var.n = null;
                }
                px4Var.invalidateSelf();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

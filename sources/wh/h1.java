package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.ld;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.t50;
import w7.a6;
import w7.c6;
import xh.t7;
import xh.v5;
import xh.z7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class h1 extends FrameLayout {
    public static final int[] l0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final qg.e1 F;
    public final qg.e1 G;
    public final TextView H;
    public final TextView I;
    public final ld J;
    public final t50 K;
    public final TextView L;
    public final TextView M;
    public g11 N;
    public t01 O;
    public t01 P;
    public final Rect Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final d6 U;
    public qg.k V;
    public TL_stars.StarGift W;
    public final int a;
    public boolean a0;
    public final f6 b;
    public boolean b0;
    public final jp0 c;
    public TL_stars.SavedStarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final e1 e;
    public boolean e0;
    public final i1 f;
    public boolean f0;
    public boolean g0;
    public final g9 h;
    public qg.k h0;
    public TLRPC.Document i0;
    public TL_stars.SavedStarGift j0;
    public tp k0;
    public final w9 n;
    public final FrameLayout.LayoutParams r;
    public final FrameLayout.LayoutParams s;
    public final FrameLayout v;
    public final ImageView w;
    public final TextView x;
    public final w9 y;

    public h1(Context context, int i10, f6 f6Var) {
        super(context);
        this.Q = new Rect();
        this.U = new d6(this, 0L, 320L, wr.h);
        this.a = i10;
        this.b = f6Var;
        c6.b(this, 0.04f, 1.5f);
        this.c = new jp0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        e1 e1Var = new e1(frameLayout, f6Var, true);
        this.e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, a6.e(-1, -1, 119));
        i1 i1Var = new i1(context);
        this.f = i1Var;
        addView(i1Var, a6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        w9 w9Var = new w9(context);
        this.y = w9Var;
        w9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams d = a6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = d;
        frameLayout.addView(w9Var, d);
        qg.e1 e1Var2 = new qg.e1(context, 3, f6Var);
        this.F = e1Var2;
        e1Var2.setImageReceiver(w9Var.getImageReceiver());
        frameLayout.addView(e1Var2, a6.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        qg.e1 e1Var3 = new qg.e1(context, 4, f6Var);
        this.G = e1Var3;
        e1Var3.setImageReceiver(w9Var.getImageReceiver());
        frameLayout.addView(e1Var3, a6.e(44, 44, 17));
        e1Var3.setAlpha(0.0f);
        e1Var3.setScaleX(0.3f);
        e1Var3.setScaleY(0.3f);
        e1Var3.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView);
        TextView f7 = r6.f(frameLayout, textView, a6.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = f7;
        f7.setTextColor(j6.v0(i11, f6Var));
        f7.setGravity(17);
        f7.setTextSize(1, 12.0f);
        frameLayout.addView(f7, a6.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        ld ldVar = new ld(this, context, 28);
        this.J = ldVar;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(ldVar, a6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        t50 t50Var = new t50(context);
        this.K = t50Var;
        t50Var.setBackgroundColor(-16776961);
        ldVar.addView(t50Var, a6.c(0.0f, 0));
        ldVar.addView(textView2, a6.e(-2, 26, 17));
        t50Var.setBackground(new m1(j6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(j6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, a6.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new g9((f6) null);
        w9 w9Var2 = new w9(context);
        this.n = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        w9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = a6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d10;
        frameLayout.addView(w9Var2, d10);
        this.s = a6.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
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
        frameLayout2.addView(imageView, a6.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, a6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, a6.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, a6.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        i1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.c0;
        if (savedStarGift == null) {
            return null;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) starGift;
        }
        return null;
    }

    public final void a(u70 u70Var, Canvas canvas, float f7, float f10, float f11) {
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f7 / 2.0f, f10 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float dp = uniqueStarGift != null ? AndroidUtilities.dp(63.0f) * f11 : 0.0f;
        e1 e1Var = this.e;
        e1Var.setBounds(0, 0, (int) f7, (int) f10);
        e1Var.b(canvas2, f11);
        e1Var.getPadding(this.Q);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        w9 w9Var = this.y;
        float f14 = f10 - dp;
        w9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f14 - lerp) / 2.0f, lerp, lerp);
        w9Var.getImageReceiver().draw(canvas2);
        if (w9Var.getImageReceiver().isLottieRunning()) {
            u70Var.invalidate();
        }
        qg.e1 e1Var2 = this.F;
        if (e1Var2.getVisibility() != 0 || e1Var2.getAlpha() <= 0.0f) {
            f12 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate((f7 - e1Var2.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(e1Var2.getY(), (f14 - e1Var2.getMeasuredHeight()) / 2.0f, f11));
            f12 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, e1Var2.getWidth(), e1Var2.getHeight(), (int) (e1Var2.getAlpha() * (1.0f - f11) * 255.0f), 31);
            e1Var2.draw(canvas2);
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
        w9 w9Var2 = this.n;
        if (w9Var2.getVisibility() == 0 && w9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + r14.left, AndroidUtilities.dp(2.0f) + r14.top);
            w9Var2.draw(canvas2);
            canvas2.restore();
        }
        i1 i1Var = this.f;
        if (i1Var.getVisibility() != 0 || i1Var.getAlpha() <= 0.0f) {
            f13 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate(f7 - AndroidUtilities.dp(f12), AndroidUtilities.dp(2.0f));
            f13 = 1.0f;
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-i1Var.getWidth(), 0.0f);
            i1Var.draw(canvas2);
            canvas2.restore();
        }
        if (uniqueStarGift != null) {
            if (this.O == null) {
                this.O = new t01(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.P == null) {
                this.P = new t01(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            t01 t01Var = this.O;
            t01Var.p = f7 - AndroidUtilities.dp(8.0f);
            float f15 = f13 - f11;
            t01Var.c((f7 - this.O.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.O.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f15), f11, -1, canvas);
            t01 t01Var2 = this.P;
            t01Var2.p = f7 - AndroidUtilities.dp(8.0f);
            t01Var2.c((f7 - this.P.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.P.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f15), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        ld ldVar = this.J;
        if (ldVar != null && ldVar.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(ldVar.getX(), ldVar.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, ldVar.getWidth(), ldVar.getHeight(), (int) (ldVar.getAlpha() * (f13 - f11) * 255.0f), 31);
            ldVar.draw(canvas2);
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

    public final void b(boolean z10, boolean z11) {
        if (this.k0 == null) {
            tp tpVar = new tp(getContext(), 21, null);
            this.k0 = tpVar;
            tpVar.b(-1, j6.d6, j6.k7);
            this.k0.setDrawUnchecked(false);
            this.d.addView(this.k0, a6.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.n.setVisibility(8);
        this.k0.a(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.R == z10) {
            return;
        }
        this.R = z10;
        boolean z12 = false;
        FrameLayout frameLayout = this.v;
        if (z11) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new f1(this, z10, 1)).start();
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setScaleX(z10 ? 1.0f : 0.3f);
            frameLayout.setScaleY(z10 ? 1.0f : 0.3f);
        }
        if (!this.R && this.T && !this.f0 && (savedStarGift = this.c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        f(z12, z11);
        j();
    }

    public final void d(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        if (!z11) {
            this.U.a(z10);
        }
        invalidate();
        f((this.R || !z10 || this.f0 || (savedStarGift = this.c0) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float e = this.U.e(this.T);
        if (e > 0.0f) {
            this.c.a(canvas, e);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        ImageView imageView = this.w;
        if (z11) {
            imageView.animate().translationX(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).translationY(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).setDuration(320L).setInterpolator(wr.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z10 ? AndroidUtilities.dp(6.0f) : 0.0f);
        imageView.setTranslationY(z10 ? AndroidUtilities.dp(6.0f) : 0.0f);
    }

    public final void f(boolean z10, boolean z11) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        qg.e1 e1Var = this.G;
        if (z11) {
            e1Var.setVisibility(0);
            e1Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new f1(this, z10, 0)).start();
        } else {
            e1Var.setVisibility(z10 ? 0 : 8);
            e1Var.setAlpha(z10 ? 1.0f : 0.0f);
            e1Var.setScaleX(z10 ? 1.0f : 0.3f);
            e1Var.setScaleY(z10 ? 1.0f : 0.3f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        String str;
        long j3;
        long j10;
        long j11;
        boolean z15;
        boolean z16;
        long j12;
        boolean z17;
        g11 g11Var = this.N;
        ColorFilter colorFilter = null;
        if (g11Var != null) {
            g11Var.run();
            this.N = null;
        }
        i(starGift, starGift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e((TL_stars.starGiftAttributePattern) v5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z18 = starGift.auction;
        int[] iArr = l0;
        f6 f6Var = this.b;
        if (!z18 || (((z17 = starGift.sold_out) && !this.a0) || (z12 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z12 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            e1Var.g(iArr);
        } else if (z17) {
            int i10 = j6.Mi;
            e1Var.g(new int[]{j6.v0(i10, f6Var), j6.v0(i10, f6Var)});
        } else {
            e1Var.g(iArr);
        }
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        w9 w9Var = this.y;
        w9Var.setTranslationY(0.0f);
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
            sb2.append((Object) (i13 <= 0 ? "<0.1%" : di.m.G0(i13)));
            textView.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 49;
        w9Var.setLayoutParams(layoutParams);
        int i14 = this.a;
        w9 w9Var2 = this.n;
        if (!z13) {
            if ((!z12 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i14).getCurrentTime()) {
                w9Var2.setVisibility(0);
                w9Var2.setLayoutParams(this.s);
                w9Var2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.wj, f6Var), PorterDuff.Mode.SRC_IN));
                w9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i15 = (z14 || z13) ? 0 : 8;
                TextView textView2 = this.L;
                textView2.setVisibility(i15);
                textView2.setTextSize(1, 12.0f);
                t50 t50Var = this.K;
                if (!z10) {
                    textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                    int v = stargiftattributebackdrop != null ? j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    int dp = AndroidUtilities.dp(13.0f);
                    int v9 = j6.v(v, 822083583);
                    int i16 = v;
                    t50Var.setBackground(j6.i0(dp, dp, dp, dp, i16, v9, v9));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int dp2 = AndroidUtilities.dp(10.0f);
                    int v10 = j6.v(i16, 822083583);
                    imageView.setBackground(j6.i0(dp2, dp2, dp2, dp2, i16, v10, v10));
                } else if (z13) {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int v11 = j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(z7.Q0("XTR " + LocaleController.formatNumber(resellStars, ',')));
                    t50Var.setBackground(new m1(1895825407, v11));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(j6.b0(AndroidUtilities.dp(10.0f), v11));
                    textView.setBackground(j6.b0(AndroidUtilities.dp(9.0f), v11));
                } else {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    if (z12) {
                        long j13 = starGift.availability_resale;
                        if (j13 > 0) {
                            str = "+";
                            long j14 = starGift.resell_min_stars;
                            if (j13 > 1) {
                                j12 = j14;
                                if (j12 < MessagesController.getInstance(i14).config.starsStarGiftResaleAmountMax.get()) {
                                    j11 = j12;
                                    z15 = true;
                                    if (starGift.auction || starGift.availability_resale != 0) {
                                        StringBuilder sb3 = new StringBuilder("XTR ");
                                        sb3.append(LocaleController.formatNumber(j11, ','));
                                        sb3.append(z15 ? str : "");
                                        textView2.setText(z7.X0(false, sb3.toString(), 0.71f, null));
                                    } else {
                                        textView2.setText(LocaleController.getString(starGift.sold_out ? R.string.Gift2AuctionPriceView : R.string.Gift2AuctionPriceJoin));
                                    }
                                    z16 = starGift instanceof TL_stars.TL_starGiftUnique;
                                    int i17 = 518759725;
                                    t50Var.setBackground(new m1(z16 ? 1090519039 : j6.I.q() ? 518759725 : 1088989954));
                                    textView2.setTextColor(j6.I.q() ? -1333971 : -2722014);
                                    imageView.setColorFilter(j6.I.q() ? -1333971 : -2722014);
                                    int dp3 = AndroidUtilities.dp(10.0f);
                                    if (z16) {
                                        i17 = 1090519039;
                                    } else if (!j6.I.q()) {
                                        i17 = 1088989954;
                                    }
                                    imageView.setBackground(j6.b0(dp3, i17));
                                    textView.setBackground(j6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                }
                            } else {
                                j12 = j14;
                            }
                            j11 = j12;
                            z15 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb32 = new StringBuilder("XTR ");
                            sb32.append(LocaleController.formatNumber(j11, ','));
                            sb32.append(z15 ? str : "");
                            textView2.setText(z7.X0(false, sb32.toString(), 0.71f, null));
                            z16 = starGift instanceof TL_stars.TL_starGiftUnique;
                            int i172 = 518759725;
                            t50Var.setBackground(new m1(z16 ? 1090519039 : j6.I.q() ? 518759725 : 1088989954));
                            textView2.setTextColor(j6.I.q() ? -1333971 : -2722014);
                            imageView.setColorFilter(j6.I.q() ? -1333971 : -2722014);
                            int dp32 = AndroidUtilities.dp(10.0f);
                            if (z16) {
                            }
                            imageView.setBackground(j6.b0(dp32, i172));
                            textView.setBackground(j6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    str = "+";
                    long j15 = starGift.stars;
                    if (z11 && starGift.can_upgrade) {
                        j3 = j15;
                        j10 = starGift.upgrade_stars;
                    } else {
                        j3 = j15;
                        j10 = 0;
                    }
                    j11 = j3 + j10;
                    z15 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb322 = new StringBuilder("XTR ");
                    sb322.append(LocaleController.formatNumber(j11, ','));
                    sb322.append(z15 ? str : "");
                    textView2.setText(z7.X0(false, sb322.toString(), 0.71f, null));
                    z16 = starGift instanceof TL_stars.TL_starGiftUnique;
                    int i1722 = 518759725;
                    t50Var.setBackground(new m1(z16 ? 1090519039 : j6.I.q() ? 518759725 : 1088989954));
                    textView2.setTextColor(j6.I.q() ? -1333971 : -2722014);
                    imageView.setColorFilter(j6.I.q() ? -1333971 : -2722014);
                    int dp322 = AndroidUtilities.dp(10.0f);
                    if (z16) {
                    }
                    imageView.setBackground(j6.b0(dp322, i1722));
                    textView.setBackground(j6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                ld ldVar = this.J;
                ((ViewGroup.MarginLayoutParams) ldVar.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                ((FrameLayout.LayoutParams) ldVar.getLayoutParams()).gravity = 49;
                this.M.setVisibility(8);
                this.h0 = null;
                this.V = null;
                this.W = starGift;
                this.b0 = z10;
                this.c0 = null;
                this.d0 = z12;
                this.e0 = z13;
                this.f0 = false;
                this.g0 = z14;
                this.O = null;
                this.P = null;
                c(false, false);
                j();
            }
            colorFilter = null;
        }
        w9Var2.setColorFilter(colorFilter);
        w9Var2.setVisibility(8);
        if (z14) {
        }
        TextView textView22 = this.L;
        textView22.setVisibility(i15);
        textView22.setTextSize(1, 12.0f);
        t50 t50Var2 = this.K;
        if (!z10) {
        }
        ld ldVar2 = this.J;
        ((ViewGroup.MarginLayoutParams) ldVar2.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        ((FrameLayout.LayoutParams) ldVar2.getLayoutParams()).gravity = 49;
        this.M.setVisibility(8);
        this.h0 = null;
        this.V = null;
        this.W = starGift;
        this.b0 = z10;
        this.c0 = null;
        this.d0 = z12;
        this.e0 = z13;
        this.f0 = false;
        this.g0 = z14;
        this.O = null;
        this.P = null;
        c(false, false);
        j();
    }

    public TL_stars.StarGift getGift() {
        return this.W;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.W;
        if (starGift != null) {
            return starGift.id;
        }
        return 0L;
    }

    public qg.k getPremiumTier() {
        return this.V;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.c0;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        long j3;
        boolean z12;
        boolean z13;
        g11 g11Var = this.N;
        if (g11Var != null) {
            g11Var.run();
            this.N = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e((TL_stars.starGiftAttributePattern) v5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        e1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        w9 w9Var = this.y;
        w9Var.setTranslationY(0.0f);
        qg.e1 e1Var2 = this.F;
        e1Var2.H = true;
        e1Var2.I = false;
        e1Var2.invalidate();
        e1Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(j6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        qg.e1 e1Var3 = this.G;
        e1Var3.H = true;
        e1Var3.I = false;
        e1Var3.invalidate();
        e1Var3.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(j6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i10 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(j6.K(AndroidUtilities.dp(20.0f), j6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(j6.K(AndroidUtilities.dp(20.0f), j6.v0(j6.Oh, this.b)));
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        w9Var.setLayoutParams(layoutParams);
        if (this.j0 == savedStarGift) {
            e1Var2.setVisibility(0);
            e1Var2.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(wr.h).withEndAction(new u2.k0(6, this, savedStarGift)).start();
        } else {
            e1Var2.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            e1Var2.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            e1Var2.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            e1Var2.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z14 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        w9 w9Var2 = this.n;
        w9Var2.setColorFilter(null);
        w9Var2.setLayoutParams(this.r);
        int i11 = this.a;
        if (z14 && savedStarGift.name_hidden) {
            w9Var2.setVisibility(8);
            j3 = 0;
        } else if (savedStarGift.name_hidden) {
            w9Var2.setVisibility(0);
            vq a2 = t7.a(44, "anonymous");
            j3 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            w9Var2.setImageDrawable(a2);
        } else {
            j3 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            g9 g9Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    w9Var2.setVisibility(0);
                    g9Var.r(user);
                    w9Var2.e(user, g9Var);
                } else {
                    w9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    w9Var2.setVisibility(0);
                    g9Var.q(chat);
                    w9Var2.e(chat, g9Var);
                } else {
                    w9Var2.setVisibility(8);
                }
            }
        }
        t50 t50Var = this.K;
        ld ldVar = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop == null || savedStarGift.gift.resell_amount == null) {
            z12 = true;
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
                z13 = z14;
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j10 = starGift.stars;
                z13 = z14;
                long j11 = savedStarGift.convert_stars;
                if (j11 <= j3) {
                    j11 = starGift.convert_stars;
                }
                textView.setText(z7.X0(false, hc.b.l(Math.max(j10, j11), ',', sb2), 0.66f, null));
            }
            textView.setTextColor(z13 ? -1 : j6.I.q() ? -1333971 : -4229632);
            int i12 = 1088989954;
            t50Var.setBackground(new m1(z13 ? 1090519039 : j6.I.q() ? 518759725 : 1088989954));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z13) {
                i12 = 1090519039;
            } else if (j6.I.q()) {
                i12 = 518759725;
            }
            imageView.setBackground(j6.b0(dp3, i12));
            imageView.setColorFilter(z13 ? -1 : j6.I.q() ? -1333971 : -4229632);
            ((FrameLayout.LayoutParams) ldVar.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) ldVar.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.E;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            uq[] uqVarArr = new uq[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && DialogObject.getPeerDialogId(starGift2.owner_id) == UserConfig.getInstance(i11).getClientUserId()) {
                z12 = true;
                textView.setText(z7.U0(true, "XTR " + ((Object) z7.J0(savedStarGift.gift.getResellAmount(yf.b.b).o(), 1.0f, ',')), 0.95f, uqVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(z7.R0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, uqVarArr));
            }
            uq uqVar = uqVarArr[0];
            if (uqVar != null) {
                uqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            t50Var.setBackground(new m1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(j6.b0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) ldVar.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) ldVar.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
            z13 = z14;
        }
        this.M.setVisibility(8);
        this.j0 = savedStarGift;
        this.h0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.c0;
        this.V = null;
        this.W = null;
        this.b0 = false;
        this.c0 = savedStarGift;
        this.d0 = false;
        this.e0 = false;
        this.f0 = z11;
        this.O = null;
        this.P = null;
        c(savedStarGift.pinned_to_top && (!z13 || savedStarGift.name_hidden), savedStarGift2 == savedStarGift);
        j();
        if (savedStarGift2 == savedStarGift) {
            return z12;
        }
        return false;
    }

    public final void i(TLObject tLObject, TLRPC.Document document) {
        w9 w9Var = this.y;
        if (document == null) {
            w9Var.b();
            this.i0 = null;
        } else {
            if (this.i0 == document) {
                return;
            }
            this.i0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            w9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, j6.a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.c0;
        f6 f6Var = this.b;
        i1 i1Var = this.f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    i1Var.setBackdrop(null);
                    i1Var.setVisibility(8);
                    return;
                }
                i1Var.setVisibility(0);
                i1Var.setColor(j6.v0(j6.Li, f6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop(null);
                i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.c0.gift.availability_total, 0)), true);
                return;
            }
            i1Var.setVisibility(0);
            if (this.c0.gift.resell_amount == null) {
                i1Var.setColor(j6.v0(j6.Li, f6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) v5.l(this.c0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                i1Var.b(hc.b.l(this.c0.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int v = j6.v(j6.v0(j6.d6, f6Var), j6.l1(0.04f, j6.v0(j6.G6, f6Var)));
            i1Var.setColor(j6.v0(j6.uj, f6Var));
            i1Var.setStrokeColor(v);
            i1Var.setBackdrop(null);
            i1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.W;
        if (starGift2 == null) {
            qg.k kVar = this.V;
            if (kVar != null) {
                if (kVar.b() <= 0) {
                    i1Var.setVisibility(8);
                    i1Var.setBackdrop(null);
                    i1Var.setStrokeColor(0);
                    return;
                }
                i1Var.setVisibility(0);
                i1Var.setBackdrop(null);
                i1Var.a(-2535425, -8229377);
                i1Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.V.b()));
                i1Var.b = formatString;
                i1Var.a.e(12, formatString, true);
                return;
            }
            return;
        }
        if (this.e0 || this.g0) {
            i1Var.setVisibility(0);
            i1Var.setColor(j6.v0(j6.Li, f6Var));
            i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) v5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
            i1Var.setStrokeColor(0);
            i1Var.b(hc.b.l(this.W.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.d0 && starGift2.availability_resale > 0) {
            i1Var.setVisibility(0);
            i1Var.setColor(j6.v0(j6.uj, f6Var));
            i1Var.setStrokeColor(0);
            i1Var.setBackdrop(null);
            i1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
            return;
        }
        if (this.b0) {
            i1Var.setVisibility(0);
            i1Var.setColor(j6.v0(j6.Li, f6Var));
            i1Var.setStrokeColor(0);
            i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) v5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
            i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.W.availability_issued, 0)), true);
            return;
        }
        boolean z10 = starGift2.limited;
        if (z10 && starGift2.availability_remains <= 0) {
            i1Var.setVisibility(0);
            i1Var.setColor(j6.v0(j6.Mi, f6Var));
            i1Var.setStrokeColor(0);
            i1Var.setBackdrop(null);
            i1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
            return;
        }
        if (starGift2.auction) {
            i1Var.setVisibility(0);
            i1Var.setBackdrop(null);
            i1Var.a(-2650077, -4227818);
            i1Var.setStrokeColor(0);
            if (this.W.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                i1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                return;
            } else {
                i1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                return;
            }
        }
        if (starGift2.require_premium) {
            i1Var.setVisibility(0);
            i1Var.setBackdrop(null);
            i1Var.a(-2650077, -4227818);
            i1Var.setStrokeColor(0);
            i1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
            return;
        }
        if (!z10) {
            i1Var.setBackdrop(null);
            i1Var.setStrokeColor(0);
            i1Var.setVisibility(8);
        } else {
            i1Var.setVisibility(0);
            i1Var.setColor(j6.v0(j6.Li, f6Var));
            i1Var.setStrokeColor(0);
            i1Var.setBackdrop(null);
            i1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
        }
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
        i1 i1Var;
        ld ldVar;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        tp tpVar;
        w9 w9Var;
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
            if (this.V == null) {
                TL_stars.SavedStarGift savedStarGift3 = this.c0;
                if (savedStarGift3 != null && (starGift = savedStarGift3.gift) != null) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.title)) {
                        charSequence = this.c0.gift.title;
                        if (TextUtils.isEmpty(charSequence)) {
                        }
                        sb2.append(charSequence);
                        textView = this.I;
                        if (textView != null) {
                        }
                        i1Var = this.f;
                        if (i1Var != null) {
                        }
                        ldVar = this.J;
                        if (ldVar != null) {
                        }
                        savedStarGift = this.c0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.c0;
                        if (savedStarGift2 != null) {
                        }
                        tpVar = this.k0;
                        if (tpVar != null) {
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
                    i1Var = this.f;
                    if (i1Var != null) {
                    }
                    ldVar = this.J;
                    if (ldVar != null) {
                    }
                    savedStarGift = this.c0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.c0;
                    if (savedStarGift2 != null) {
                    }
                    tpVar = this.k0;
                    if (tpVar != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb2.toString());
                }
                TL_stars.StarGift starGift2 = this.W;
                if (starGift2 != null && (starGift2 instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift2.title)) {
                    charSequence = this.W.title;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb2.append(charSequence);
                    textView = this.I;
                    if (textView != null) {
                    }
                    i1Var = this.f;
                    if (i1Var != null) {
                    }
                    ldVar = this.J;
                    if (ldVar != null) {
                    }
                    savedStarGift = this.c0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.c0;
                    if (savedStarGift2 != null) {
                    }
                    tpVar = this.k0;
                    if (tpVar != null) {
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
                i1Var = this.f;
                if (i1Var != null) {
                }
                ldVar = this.J;
                if (ldVar != null) {
                }
                savedStarGift = this.c0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.c0;
                if (savedStarGift2 != null) {
                }
                tpVar = this.k0;
                if (tpVar != null) {
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
                i1Var = this.f;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    text = i1Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb2.append(", ");
                        sb2.append(text);
                    }
                }
                ldVar = this.J;
                if (ldVar != null && ldVar.getVisibility() == 0 && (textView2 = this.L) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb2.append(", ");
                    sb2.append(textView2.getText());
                }
                savedStarGift = this.c0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb2.append(", ");
                    sb2.append(LocaleController.getString(R.string.Gift2FilterHidden));
                }
                savedStarGift2 = this.c0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (w9Var = this.n) != null && w9Var.getVisibility() == 0) {
                    peerDialogId = DialogObject.getPeerDialogId(this.c0.from_id);
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
                tpVar = this.k0;
                if (tpVar != null && tpVar.a.q) {
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
            i1Var = this.f;
            if (i1Var != null) {
                text = i1Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            ldVar = this.J;
            if (ldVar != null) {
                sb2.append(", ");
                sb2.append(textView2.getText());
            }
            savedStarGift = this.c0;
            if (savedStarGift != null) {
                sb2.append(", ");
                sb2.append(LocaleController.getString(R.string.Gift2FilterHidden));
            }
            savedStarGift2 = this.c0;
            if (savedStarGift2 != null) {
                peerDialogId = DialogObject.getPeerDialogId(this.c0.from_id);
                if (peerDialogId != 0) {
                }
            }
            tpVar = this.k0;
            if (tpVar != null) {
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
        i1 i1Var = this.f;
        i1Var.setColor(i10);
        i1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        i1 i1Var = this.f;
        i1Var.setVisibility(0);
        i1Var.setColor(j6.v0(j6.Li, this.b));
        i1Var.setStrokeColor(0);
        i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) v5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
        i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}

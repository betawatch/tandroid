package yh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v11;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.x50;
import w7.b6;
import w7.z5;
import zh.j7;
import zh.n5;
import zh.p7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public class h1 extends FrameLayout {
    public static final int[] l0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final sg.c1 F;
    public final sg.c1 G;
    public final TextView H;
    public final TextView I;
    public final sg.p0 J;
    public final x50 K;
    public final TextView L;
    public final TextView M;
    public v11 N;
    public i11 O;
    public i11 P;
    public final Rect Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final g6 U;
    public sg.k V;
    public TL_stars.StarGift W;
    public final int a;
    public boolean a0;
    public final c6 b;
    public boolean b0;
    public final zp0 c;
    public TL_stars.SavedStarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final e1 e;
    public boolean e0;
    public final i1 f;
    public boolean f0;
    public boolean g0;
    public final k9 h;
    public sg.k h0;
    public TLRPC.Document i0;
    public TL_stars.SavedStarGift j0;
    public aq k0;
    public final z9 n;
    public final FrameLayout.LayoutParams r;
    public final FrameLayout.LayoutParams s;
    public final FrameLayout v;
    public final ImageView w;
    public final TextView x;
    public final z9 y;

    public h1(Context context, int i10, c6 c6Var) {
        super(context);
        this.Q = new Rect();
        this.U = new g6(this, 0L, 320L, es.h);
        this.a = i10;
        this.b = c6Var;
        b6.b(this, 0.04f, 1.5f);
        this.c = new zp0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        e1 e1Var = new e1(frameLayout, c6Var, true);
        this.e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, z5.e(-1, -1, 119));
        i1 i1Var = new i1(context);
        this.f = i1Var;
        addView(i1Var, z5.a(-2.0f, 0.0f, 2.0f, 1.0f, 0.0f, -2, 53));
        z9 z9Var = new z9(context);
        this.y = z9Var;
        z9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams a2 = z5.a(80.0f, 0.0f, 12.0f, 0.0f, 12.0f, 80, 17);
        this.E = a2;
        frameLayout.addView(z9Var, a2);
        sg.c1 c1Var = new sg.c1(context, 3, c6Var);
        this.F = c1Var;
        c1Var.setImageReceiver(z9Var.getImageReceiver());
        frameLayout.addView(c1Var, z5.a(30.0f, 0.0f, 38.0f, 0.0f, 0.0f, 30, 49));
        sg.c1 c1Var2 = new sg.c1(context, 4, c6Var);
        this.G = c1Var2;
        c1Var2.setImageReceiver(z9Var.getImageReceiver());
        frameLayout.addView(c1Var2, z5.e(44, 44, 17));
        c1Var2.setAlpha(0.0f);
        c1Var2.setScaleX(0.3f);
        c1Var2.setScaleY(0.3f);
        c1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView.setGravity(17);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, z5.a(-2.0f, 0.0f, 89.0f, 0.0f, 0.0f, -1, 48), context);
        this.I = g10;
        g10.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        g10.setGravity(17);
        g10.setTextSize(1, 12.0f);
        frameLayout.addView(g10, z5.a(-2.0f, 0.0f, 107.0f, 0.0f, 0.0f, -1, 48));
        sg.p0 p0Var = new sg.p0(this, context, 3);
        this.J = p0Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(p0Var, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 11.0f, -2, 81));
        x50 x50Var = new x50(context);
        this.K = x50Var;
        x50Var.setBackgroundColor(-16776961);
        p0Var.addView(x50Var, z5.d(0.0f, 0));
        p0Var.addView(textView2, z5.e(-2, 26, 17));
        x50Var.setBackground(new m1(org.telegram.ui.ActionBar.g6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, z5.a(-2.0f, 0.0f, 161.0f, 0.0f, 8.0f, -2, 49));
        this.h = new k9((c6) null);
        z9 z9Var2 = new z9(context);
        this.n = z9Var2;
        z9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        z9Var2.setVisibility(8);
        FrameLayout.LayoutParams a10 = z5.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51);
        this.r = a10;
        frameLayout.addView(z9Var2, a10);
        this.s = z5.a(20.0f, 5.0f, 5.0f, 2.0f, 2.0f, 20, 51);
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
        frameLayout2.addView(imageView, z5.b(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, z5.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, z5.a(20.0f, 3.0f, 3.0f, 3.0f, 3.0f, 20, 51));
        TextView textView4 = new TextView(context);
        this.x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, z5.a(17.0f, 4.0f, 4.0f, 0.0f, 0.0f, -2, 51));
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

    public final void a(j80 j80Var, Canvas canvas, float f7, float f10, float f11) {
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
        z9 z9Var = this.y;
        float f14 = f10 - dp;
        z9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f14 - lerp) / 2.0f, lerp, lerp);
        z9Var.getImageReceiver().draw(canvas2);
        if (z9Var.getImageReceiver().isLottieRunning()) {
            j80Var.invalidate();
        }
        sg.c1 c1Var = this.F;
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
        z9 z9Var2 = this.n;
        if (z9Var2.getVisibility() == 0 && z9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + r14.left, AndroidUtilities.dp(2.0f) + r14.top);
            z9Var2.draw(canvas2);
            canvas2.restore();
        }
        i1 i1Var = this.f;
        if (i1Var.getVisibility() != 0 || i1Var.getAlpha() <= 0.0f) {
            f13 = f12;
        } else {
            canvas2.save();
            canvas2.translate(f7 - AndroidUtilities.dp(f12), AndroidUtilities.dp(2.0f));
            f13 = f12;
            float lerp2 = AndroidUtilities.lerp(f13, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-i1Var.getWidth(), 0.0f);
            i1Var.draw(canvas2);
            canvas2.restore();
        }
        if (uniqueStarGift != null) {
            if (this.O == null) {
                this.O = new i11(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.P == null) {
                this.P = new i11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            i11 i11Var = this.O;
            i11Var.p = f7 - AndroidUtilities.dp(8.0f);
            float f15 = f13 - f11;
            i11Var.c((f7 - this.O.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.O.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f15), f11, -1, canvas);
            i11 i11Var2 = this.P;
            i11Var2.p = f7 - AndroidUtilities.dp(8.0f);
            i11Var2.c((f7 - this.P.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.P.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f15), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        sg.p0 p0Var = this.J;
        if (p0Var != null && p0Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(p0Var.getX(), p0Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, p0Var.getWidth(), p0Var.getHeight(), (int) (p0Var.getAlpha() * (f13 - f11) * 255.0f), 31);
            p0Var.draw(canvas2);
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
            aq aqVar = new aq(getContext(), 21, null);
            this.k0 = aqVar;
            aqVar.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
            this.k0.setDrawUnchecked(false);
            this.d.addView(this.k0, z5.a(24.0f, 4.0f, 4.0f, 4.0f, 4.0f, 24, 51));
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
            imageView.animate().translationX(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).translationY(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).setDuration(320L).setInterpolator(es.h).start();
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
        sg.c1 c1Var = this.G;
        if (z11) {
            c1Var.setVisibility(0);
            c1Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new f1(this, z10, 0)).start();
        } else {
            c1Var.setVisibility(z10 ? 0 : 8);
            c1Var.setAlpha(z10 ? 1.0f : 0.0f);
            c1Var.setScaleX(z10 ? 1.0f : 0.3f);
            c1Var.setScaleY(z10 ? 1.0f : 0.3f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        String str;
        long j10;
        long j11;
        long j12;
        boolean z15;
        boolean z16;
        long j13;
        boolean z17;
        v11 v11Var = this.N;
        ColorFilter colorFilter = null;
        if (v11Var != null) {
            v11Var.run();
            this.N = null;
        }
        i(starGift, starGift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) n5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e((TL_stars.starGiftAttributePattern) n5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z18 = starGift.auction;
        int[] iArr = l0;
        c6 c6Var = this.b;
        if (!z18 || (((z17 = starGift.sold_out) && !this.a0) || (z12 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z12 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            e1Var.g(iArr);
        } else if (z17) {
            int i10 = org.telegram.ui.ActionBar.g6.Mi;
            e1Var.g(new int[]{org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(i10, c6Var)});
        } else {
            e1Var.g(iArr);
        }
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        z9 z9Var = this.y;
        z9Var.setTranslationY(0.0f);
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
            sb2.append((Object) (i13 <= 0 ? "<0.1%" : fi.l.H0(i13)));
            textView.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 49;
        z9Var.setLayoutParams(layoutParams);
        int i14 = this.a;
        z9 z9Var2 = this.n;
        if (!z13) {
            if ((!z12 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i14).getCurrentTime()) {
                z9Var2.setVisibility(0);
                z9Var2.setLayoutParams(this.s);
                z9Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.wj, c6Var), PorterDuff.Mode.SRC_IN));
                z9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i15 = (z14 || z13) ? 0 : 8;
                TextView textView2 = this.L;
                textView2.setVisibility(i15);
                textView2.setTextSize(1, 12.0f);
                x50 x50Var = this.K;
                if (!z10) {
                    textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                    int v = stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    int dp = AndroidUtilities.dp(13.0f);
                    int v10 = org.telegram.ui.ActionBar.g6.v(v, 822083583);
                    int i16 = v;
                    x50Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, i16, v10, v10));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int dp2 = AndroidUtilities.dp(10.0f);
                    int v11 = org.telegram.ui.ActionBar.g6.v(i16, 822083583);
                    imageView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, i16, v11, v11));
                } else if (z13) {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int v12 = org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(p7.R0("XTR " + LocaleController.formatNumber(resellStars, ',')));
                    x50Var.setBackground(new m1(1895825407, v12));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), v12));
                    textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(9.0f), v12));
                } else {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    if (z12) {
                        long j14 = starGift.availability_resale;
                        if (j14 > 0) {
                            str = "+";
                            long j15 = starGift.resell_min_stars;
                            if (j14 > 1) {
                                j13 = j15;
                                if (j13 < MessagesController.getInstance(i14).config.starsStarGiftResaleAmountMax.get()) {
                                    j12 = j13;
                                    z15 = true;
                                    if (starGift.auction || starGift.availability_resale != 0) {
                                        StringBuilder sb3 = new StringBuilder("XTR ");
                                        sb3.append(LocaleController.formatNumber(j12, ','));
                                        sb3.append(z15 ? str : "");
                                        textView2.setText(p7.Y0(false, sb3.toString(), 0.71f, null));
                                    } else {
                                        textView2.setText(LocaleController.getString(starGift.sold_out ? R.string.Gift2AuctionPriceView : R.string.Gift2AuctionPriceJoin));
                                    }
                                    z16 = starGift instanceof TL_stars.TL_starGiftUnique;
                                    int i17 = 518759725;
                                    x50Var.setBackground(new m1(z16 ? 1090519039 : org.telegram.ui.ActionBar.g6.I.q() ? 518759725 : 1088989954));
                                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
                                    imageView.setColorFilter(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
                                    int dp3 = AndroidUtilities.dp(10.0f);
                                    if (z16) {
                                        i17 = 1090519039;
                                    } else if (!org.telegram.ui.ActionBar.g6.I.q()) {
                                        i17 = 1088989954;
                                    }
                                    imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(dp3, i17));
                                    textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
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
                            sb32.append(z15 ? str : "");
                            textView2.setText(p7.Y0(false, sb32.toString(), 0.71f, null));
                            z16 = starGift instanceof TL_stars.TL_starGiftUnique;
                            int i172 = 518759725;
                            x50Var.setBackground(new m1(z16 ? 1090519039 : org.telegram.ui.ActionBar.g6.I.q() ? 518759725 : 1088989954));
                            textView2.setTextColor(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
                            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
                            int dp32 = AndroidUtilities.dp(10.0f);
                            if (z16) {
                            }
                            imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(dp32, i172));
                            textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    str = "+";
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
                    sb322.append(z15 ? str : "");
                    textView2.setText(p7.Y0(false, sb322.toString(), 0.71f, null));
                    z16 = starGift instanceof TL_stars.TL_starGiftUnique;
                    int i1722 = 518759725;
                    x50Var.setBackground(new m1(z16 ? 1090519039 : org.telegram.ui.ActionBar.g6.I.q() ? 518759725 : 1088989954));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
                    imageView.setColorFilter(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
                    int dp322 = AndroidUtilities.dp(10.0f);
                    if (z16) {
                    }
                    imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(dp322, i1722));
                    textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                sg.p0 p0Var = this.J;
                ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                ((FrameLayout.LayoutParams) p0Var.getLayoutParams()).gravity = 49;
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
        z9Var2.setColorFilter(colorFilter);
        z9Var2.setVisibility(8);
        if (z14) {
        }
        TextView textView22 = this.L;
        textView22.setVisibility(i15);
        textView22.setTextSize(1, 12.0f);
        x50 x50Var2 = this.K;
        if (!z10) {
        }
        sg.p0 p0Var2 = this.J;
        ((ViewGroup.MarginLayoutParams) p0Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        ((FrameLayout.LayoutParams) p0Var2.getLayoutParams()).gravity = 49;
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

    public sg.k getPremiumTier() {
        return this.V;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.c0;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        long j10;
        boolean z12;
        boolean z13;
        v11 v11Var = this.N;
        if (v11Var != null) {
            v11Var.run();
            this.N = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e((TL_stars.starGiftAttributePattern) n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        e1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        z9 z9Var = this.y;
        z9Var.setTranslationY(0.0f);
        sg.c1 c1Var = this.F;
        c1Var.H = true;
        c1Var.I = false;
        c1Var.invalidate();
        c1Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        sg.c1 c1Var2 = this.G;
        c1Var2.H = true;
        c1Var2.I = false;
        c1Var2.invalidate();
        c1Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i10 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.b)));
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        z9Var.setLayoutParams(layoutParams);
        if (this.j0 == savedStarGift) {
            c1Var.setVisibility(0);
            c1Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(es.h).withEndAction(new s9.b(26, this, savedStarGift)).start();
        } else {
            c1Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            c1Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            c1Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            c1Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z14 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        z9 z9Var2 = this.n;
        z9Var2.setColorFilter(null);
        z9Var2.setLayoutParams(this.r);
        int i11 = this.a;
        if (z14 && savedStarGift.name_hidden) {
            z9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            z9Var2.setVisibility(0);
            cr a2 = j7.a(44, "anonymous");
            j10 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            z9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            k9 k9Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    z9Var2.setVisibility(0);
                    k9Var.r(user);
                    z9Var2.e(user, k9Var);
                } else {
                    z9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    z9Var2.setVisibility(0);
                    k9Var.q(chat);
                    z9Var2.e(chat, k9Var);
                } else {
                    z9Var2.setVisibility(8);
                }
            }
        }
        x50 x50Var = this.K;
        sg.p0 p0Var = this.J;
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
                long j11 = starGift.stars;
                z13 = z14;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift.convert_stars;
                }
                textView.setText(p7.Y0(false, org.telegram.messenger.g0.h(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            textView.setTextColor(z13 ? -1 : org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -4229632);
            int i12 = 1088989954;
            x50Var.setBackground(new m1(z13 ? 1090519039 : org.telegram.ui.ActionBar.g6.I.q() ? 518759725 : 1088989954));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z13) {
                i12 = 1090519039;
            } else if (org.telegram.ui.ActionBar.g6.I.q()) {
                i12 = 518759725;
            }
            imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(dp3, i12));
            imageView.setColorFilter(z13 ? -1 : org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -4229632);
            ((FrameLayout.LayoutParams) p0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.E;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            br[] brVarArr = new br[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && DialogObject.getPeerDialogId(starGift2.owner_id) == UserConfig.getInstance(i11).getClientUserId()) {
                z12 = true;
                textView.setText(p7.V0(true, "XTR " + ((Object) p7.K0(savedStarGift.gift.getResellAmount(ag.b.b).o(), 1.0f, ',')), 0.95f, brVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(p7.S0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, brVarArr));
            }
            br brVar = brVarArr[0];
            if (brVar != null) {
                brVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            x50Var.setBackground(new m1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) p0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
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
        c((!savedStarGift.pinned_to_top || (z13 && !savedStarGift.name_hidden)) ? false : z12, savedStarGift2 == savedStarGift ? z12 : false);
        j();
        if (savedStarGift2 == savedStarGift) {
            return z12;
        }
        return false;
    }

    public final void i(TLObject tLObject, TLRPC.Document document) {
        z9 z9Var = this.y;
        if (document == null) {
            z9Var.b();
            this.i0 = null;
        } else {
            if (this.i0 == document) {
                return;
            }
            this.i0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            z9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.c0;
        c6 c6Var = this.b;
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
                i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop(null);
                i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.c0.gift.availability_total, 0)), true);
                return;
            }
            i1Var.setVisibility(0);
            if (this.c0.gift.resell_amount == null) {
                i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.c0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                i1Var.b(org.telegram.messenger.g0.h(this.c0.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var), org.telegram.ui.ActionBar.g6.m1(0.04f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var)));
            i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.uj, c6Var));
            i1Var.setStrokeColor(v);
            i1Var.setBackdrop(null);
            i1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.W;
        if (starGift2 == null) {
            sg.k kVar = this.V;
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
                i1Var.a.f(12, formatString, true);
                return;
            }
            return;
        }
        if (this.e0 || this.g0) {
            i1Var.setVisibility(0);
            i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
            i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
            i1Var.setStrokeColor(0);
            i1Var.b(org.telegram.messenger.g0.h(this.W.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.d0 && starGift2.availability_resale > 0) {
            i1Var.setVisibility(0);
            i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.uj, c6Var));
            i1Var.setStrokeColor(0);
            i1Var.setBackdrop(null);
            i1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
            return;
        }
        if (this.b0) {
            i1Var.setVisibility(0);
            i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
            i1Var.setStrokeColor(0);
            i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
            i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.W.availability_issued, 0)), true);
            return;
        }
        boolean z10 = starGift2.limited;
        if (z10 && starGift2.availability_remains <= 0) {
            i1Var.setVisibility(0);
            i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Mi, c6Var));
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
            i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
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
        sg.p0 p0Var;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        aq aqVar;
        z9 z9Var;
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
                        p0Var = this.J;
                        if (p0Var != null) {
                        }
                        savedStarGift = this.c0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.c0;
                        if (savedStarGift2 != null) {
                        }
                        aqVar = this.k0;
                        if (aqVar != null) {
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
                    p0Var = this.J;
                    if (p0Var != null) {
                    }
                    savedStarGift = this.c0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.c0;
                    if (savedStarGift2 != null) {
                    }
                    aqVar = this.k0;
                    if (aqVar != null) {
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
                    p0Var = this.J;
                    if (p0Var != null) {
                    }
                    savedStarGift = this.c0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.c0;
                    if (savedStarGift2 != null) {
                    }
                    aqVar = this.k0;
                    if (aqVar != null) {
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
                p0Var = this.J;
                if (p0Var != null) {
                }
                savedStarGift = this.c0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.c0;
                if (savedStarGift2 != null) {
                }
                aqVar = this.k0;
                if (aqVar != null) {
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
                p0Var = this.J;
                if (p0Var != null && p0Var.getVisibility() == 0 && (textView2 = this.L) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb2.append(", ");
                    sb2.append(textView2.getText());
                }
                savedStarGift = this.c0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb2.append(", ");
                    sb2.append(LocaleController.getString(R.string.Gift2FilterHidden));
                }
                savedStarGift2 = this.c0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (z9Var = this.n) != null && z9Var.getVisibility() == 0) {
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
                aqVar = this.k0;
                if (aqVar != null && aqVar.a.q) {
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
            p0Var = this.J;
            if (p0Var != null) {
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
            aqVar = this.k0;
            if (aqVar != null) {
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
        i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, this.b));
        i1Var.setStrokeColor(0);
        i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
        i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}

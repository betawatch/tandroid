package yg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
import xh.l8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class n0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final p5 D;
    public int E;
    public final br F;
    public final n6 G;
    public final n6 H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public i9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final f6 X;
    public final xc Y;
    public final l8 Z;
    public final TLRPC.ReactionCount a;
    public final hj0 a0;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public boolean e0;
    public int f;
    public ImageReceiver f0;
    public int g;
    public p5 g0;
    public int h;
    public int i;
    public int j;
    public final int k;
    public final boolean m;
    public boolean n;
    public String o;
    public boolean p;
    public boolean q;
    public final TLRPC.Reaction r;
    public final p0 s;
    public boolean u;
    public final String v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean l = true;
    public final Rect t = new Rect();
    public final RectF b0 = new RectF();
    public final RectF c0 = new RectF();
    public final Path d0 = new Path();

    public n0(n0 n0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, f6 f6Var) {
        l8 l8Var;
        hj0 hj0Var;
        hi.s0 s0Var = new hi.s0(this, 10);
        this.V = i10;
        this.W = view;
        this.Y = new xc(view);
        this.X = f6Var;
        this.S = z11;
        if (n0Var != null) {
            this.F = n0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new br(view, false, null);
        }
        if (this.G == null) {
            n6 n6Var = new n6(true, true, true, false);
            this.G = n6Var;
            n6Var.E = true;
            n6Var.k(0.4f, 320L, wr.h);
            n6Var.t(AndroidUtilities.dp(13.0f));
            n6Var.setCallback(s0Var);
            n6Var.u(AndroidUtilities.bold());
            n6Var.G = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            n6 n6Var2 = new n6(false, false, false, true);
            this.H = n6Var2;
            n6Var2.t(AndroidUtilities.dp(12.0f));
            n6Var2.setCallback(s0Var);
            n6Var2.u(AndroidUtilities.bold());
            n6Var2.G = AndroidUtilities.displaySize.x;
            n6Var2.v = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.r = reaction;
        p0 d = p0.d(reaction);
        this.s = d;
        int i11 = reactionCount.count;
        this.w = i11;
        this.p = reactionCount.chosen;
        this.j = i11;
        this.k = reactionCount.chosen_order;
        this.b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else {
            if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                throw new RuntimeException("unsupported");
            }
            this.o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        br brVar = this.F;
        brVar.G = false;
        brVar.a = true;
        if (reaction != null) {
            if (d.a) {
                this.m = true;
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    if (n0Var == null || (hj0Var = n0Var.a0) == null) {
                        this.a0 = new hj0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    } else {
                        this.a0 = hj0Var;
                    }
                    this.C.setImageBitmap(this.a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (n0Var == null || (l8Var = n0Var.Z) == null) {
                    l8Var = new l8(1, SharedConfig.getDevicePerformanceClass() == 2 ? 18 : 8);
                }
                this.Z = l8Var;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, j6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.D = new p5(j(), i10, d.g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = q0.Y;
        if (z11) {
            this.v = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.u = !TextUtils.isEmpty(r1);
        }
        if (this.u) {
            n6 n6Var3 = this.G;
            n6Var3.q(Emoji.replaceEmoji(this.v, n6Var3.a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof pn0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            n6 n6Var4 = this.G;
            if (n6Var4 != null) {
                n6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.w, false);
        }
        br brVar2 = this.F;
        brVar2.I = 2;
        brVar2.z = 3;
    }

    public final void a() {
        this.e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        i9 i9Var = this.T;
        if (i9Var != null) {
            i9Var.g();
        }
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.a(this.W);
        }
    }

    public final void b() {
        this.e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        i9 i9Var = this.T;
        if (i9Var != null) {
            i9Var.h();
        }
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f0;
        if (imageReceiver == null && this.g0 == null) {
            return;
        }
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.f0 = null;
        } else if (this.g0 != null) {
            View view = this.W;
            if (view != null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            this.g0.o(view);
            this.g0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0352  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7, float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
        int i10;
        float f14;
        ImageReceiver imageReceiver;
        n6 n6Var;
        Paint paint;
        boolean z12;
        float f15;
        float f16;
        RectF rectF;
        boolean z13;
        float f17;
        Paint paint2;
        float f18;
        float f19;
        br brVar;
        float f20;
        i9 i9Var;
        float f21;
        float f22;
        int dp;
        int dp2;
        Paint paint3;
        h5 y22;
        p5 p5Var = this.D;
        ImageReceiver imageReceiver2 = p5Var != null ? p5Var.k : this.C;
        boolean z14 = this.b;
        Rect rect = this.t;
        if (z14 && imageReceiver2 != null) {
            imageReceiver2.setAlpha(f12);
            rect.set((int) f7, (int) f10, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            imageReceiver2.setImageCoords(rect);
            imageReceiver2.setRoundRadius(0);
            f(canvas, rect, f12);
            return;
        }
        boolean z15 = this.p;
        View view = this.W;
        boolean z16 = this.m;
        f6 f6Var = this.X;
        if (z15) {
            if (z16) {
                this.J = -1529086;
                this.K = -1;
                this.M = -1;
                this.L = -1529086;
            } else {
                this.J = j6.v0(m() ? j6.Sb : j6.Cj, f6Var);
                this.K = j6.v0(m() ? j6.Gj : j6.Fj, f6Var);
                if (view instanceof w0) {
                    this.M = j6.v0(j6.Ij, f6Var);
                    this.L = j6.v0(j6.Hj, f6Var);
                } else {
                    this.M = j6.v0(m() ? j6.Sb : j6.Cj, f6Var);
                    this.L = j6.v0(m() ? j6.Aa : j6.ra, f6Var);
                }
            }
            i10 = 0;
        } else if (z16) {
            this.K = -1529086;
            this.J = 1088989954;
            this.M = -1;
            i10 = 0;
            this.L = 0;
        } else {
            this.K = j6.v0(m() ? j6.Dj : j6.Ej, f6Var);
            int v02 = j6.v0(m() ? j6.Sb : j6.Cj, f6Var);
            this.J = v02;
            this.J = i0.a.k(v02, (int) (Color.alpha(v02) * 0.156f));
            this.M = j6.v0(j6.ic, f6Var);
            i10 = 0;
            this.L = 0;
        }
        if (this.q) {
            this.J = i10;
            this.L = i10;
        }
        s(f11);
        TextPaint textPaint = q0.Y;
        textPaint.setColor(this.N);
        n6 n6Var2 = this.G;
        if (n6Var2 != null) {
            n6Var2.r(this.N);
        }
        Paint paint4 = q0.V;
        paint4.setColor(this.O);
        boolean z17 = this.S && i() && Color.alpha(this.P) == 0;
        if (f12 != 1.0f) {
            f14 = 1.0f;
            textPaint.setAlpha((int) (textPaint.getAlpha() * f12));
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
        } else {
            f14 = 1.0f;
        }
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(f12);
        }
        n6 n6Var3 = this.H;
        if (f13 > 0.0f) {
            f15 = 0.0f;
            if (this.I != z11) {
                if (z11) {
                    z12 = z16;
                    wr wrVar = wr.k;
                    n6Var3.u = 0.6f;
                    imageReceiver = imageReceiver2;
                    n6Var3.r = 650L;
                    n6Var3.t = 1.6f;
                    n6Var3.s = wrVar;
                    n6Var3.q(AndroidUtilities.formatWholeNumber(this.w, 0), false, true);
                    n6Var = n6Var2;
                    n6Var3.q(LocaleController.formatNumber(this.w, ','), true, true);
                    paint = paint4;
                } else {
                    imageReceiver = imageReceiver2;
                    n6Var = n6Var2;
                    z12 = z16;
                    wr wrVar2 = wr.h;
                    n6Var3.u = 0.6f;
                    paint = paint4;
                    n6Var3.r = 320L;
                    n6Var3.t = 1.6f;
                    n6Var3.s = wrVar2;
                    n6Var3.q(AndroidUtilities.formatWholeNumber(this.w, 0), true, true);
                }
                this.I = z11;
            } else {
                imageReceiver = imageReceiver2;
                n6Var = n6Var2;
                paint = paint4;
                z12 = z16;
            }
        } else {
            imageReceiver = imageReceiver2;
            n6Var = n6Var2;
            paint = paint4;
            z12 = z16;
            f15 = 0.0f;
        }
        float a2 = this.Y.a(0.1f);
        int i11 = this.A;
        if (f13 > 0.0f && !this.S && n6Var3 != null && this.T == null) {
            i11 = (int) (n6Var3.d() + AndroidUtilities.dp(p5Var != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(8.0f));
            n6Var3.r(this.N);
        } else if (f11 != f14) {
            f16 = 8.0f;
            if (this.c == 3) {
                i11 = (int) e2.z(1.0f, f11, this.f, i11 * f11);
            }
            rectF = AndroidUtilities.rectTmp;
            float f23 = i11;
            rectF.set(f7, f10, f7 + f23, this.B + f10);
            if (a2 == 1.0f) {
                canvas.save();
                canvas.scale(a2, a2, (f23 / 2.0f) + f7, (this.B / 2.0f) + f10);
                z13 = true;
            } else {
                z13 = false;
            }
            f17 = this.B / 2.0f;
            if (k() > f15 || this.q) {
                paint2 = paint;
                f18 = 2.0f;
            } else {
                Paint T0 = j6.T0("paintChatActionBackground", f6Var);
                Paint T02 = j6.T0("paintChatActionBackgroundDarken", f6Var);
                f18 = 2.0f;
                int alpha = T0.getAlpha();
                paint2 = paint;
                int alpha2 = T02.getAlpha();
                T0.setAlpha((int) (alpha * f12 * k()));
                T02.setAlpha((int) (alpha2 * f12 * k()));
                h(canvas, rectF, f17, T0);
                if (f6Var == null ? j6.a1() : f6Var.m0()) {
                    h(canvas, rectF, f17, T02);
                }
                T0.setAlpha(alpha);
                T02.setAlpha(alpha2);
            }
            if (z10 && k() < 1.0f && (view instanceof t1) && (y22 = ((t1) view).y2(false)) != null && !this.S) {
                canvas.drawRoundRect(rectF, f17, f17, y22.c);
            }
            if (z17) {
                rectF.right += AndroidUtilities.dp(4.0f);
                canvas.saveLayerAlpha(rectF, 255, 31);
                rectF.right -= AndroidUtilities.dp(4.0f);
            }
            if (this.Z != null) {
                LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
            }
            h(canvas, rectF, f17, paint2);
            if (this.S && i()) {
                if (z17) {
                    paint3 = q0.W;
                    paint3.setColor(this.P);
                    paint3.setAlpha((int) (paint3.getAlpha() * f12));
                } else {
                    paint3 = q0.X;
                }
                canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint3);
            }
            if (z17) {
                canvas.restore();
            }
            if (imageReceiver != null) {
                if (z12) {
                    dp = AndroidUtilities.dp(22.0f);
                    dp2 = AndroidUtilities.dp(4.0f);
                } else if (p5Var != null) {
                    dp = AndroidUtilities.dp(24.0f);
                    dp2 = AndroidUtilities.dp(6.0f);
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                    dp2 = AndroidUtilities.dp(f16);
                    imageReceiver.setRoundRadius(0);
                }
                int i12 = (int) ((this.B - dp) / f18);
                if (this.S) {
                    dp2 -= AndroidUtilities.dp(f18);
                }
                int i13 = ((int) f7) + dp2;
                int i14 = ((int) f10) + i12;
                rect.set(i13, i14, i13 + dp, dp + i14);
                f(canvas, rect, f12);
            }
            if (n6Var != null || n6Var.g() <= f15) {
                f19 = 0.0f;
            } else {
                canvas.save();
                if (!this.u || i()) {
                    f22 = this.u ? 9 : 8;
                } else {
                    f22 = 10.0f;
                }
                canvas.translate(AndroidUtilities.dp(f22) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f18), f10);
                n6 n6Var4 = n6Var;
                n6Var4.setBounds(0, 0, this.A, this.B);
                n6Var4.draw(canvas);
                n6Var4.w = (int) (f12 * 255.0f);
                canvas.restore();
                f19 = n6Var4.d() + (n6Var4.g() * AndroidUtilities.dp(4.0f));
            }
            if (f13 > 0.0f || this.S || n6Var3 == null || this.T != null) {
                brVar = this.F;
                if (brVar != null && e()) {
                    canvas.save();
                    if (this.u || i()) {
                        f20 = this.u ? 9 : 8;
                    } else {
                        f20 = 10.0f;
                    }
                    canvas.translate(AndroidUtilities.dp(f20) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(p5Var == null ? 2.0f : 5.0f) + f19 + (!z12 ? -AndroidUtilities.dp(1.0f) : 0), f10);
                    brVar.a(canvas);
                    canvas.restore();
                }
            } else {
                canvas.save();
                if (!this.u || i()) {
                    f21 = this.u ? 9 : 8;
                } else {
                    f21 = 10.0f;
                }
                canvas.translate(AndroidUtilities.dp(f21) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(p5Var == null ? 2.0f : 5.0f), f10 - AndroidUtilities.dp(1.0f));
                n6Var3.setBounds(0, 0, this.A, this.B);
                n6Var3.draw(canvas);
                n6Var3.w = (int) (255.0f * f12);
                canvas.restore();
            }
            if (!this.S && this.T != null) {
                canvas.save();
                canvas.translate(f7 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f18), f10);
                i9Var = this.T;
                i9Var.u = f12;
                if (i9Var.w && i9Var.e != f11) {
                    i9Var.e = f11;
                    if (f11 == 1.0f) {
                        i9Var.n();
                        i9Var.w = false;
                    }
                }
                this.T.i(canvas);
                canvas.restore();
            }
            if (z13) {
                return;
            }
            canvas.restore();
            return;
        }
        f16 = 8.0f;
        rectF = AndroidUtilities.rectTmp;
        float f232 = i11;
        rectF.set(f7, f10, f7 + f232, this.B + f10);
        if (a2 == 1.0f) {
        }
        f17 = this.B / 2.0f;
        if (k() > f15) {
        }
        paint2 = paint;
        f18 = 2.0f;
        if (z10) {
            canvas.drawRoundRect(rectF, f17, f17, y22.c);
        }
        if (z17) {
        }
        if (this.Z != null) {
        }
        h(canvas, rectF, f17, paint2);
        if (this.S) {
            if (z17) {
            }
            canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint3);
        }
        if (z17) {
        }
        if (imageReceiver != null) {
        }
        if (n6Var != null) {
        }
        f19 = 0.0f;
        if (f13 > 0.0f) {
        }
        brVar = this.F;
        if (brVar != null) {
            canvas.save();
            if (this.u) {
            }
            f20 = this.u ? 9 : 8;
            canvas.translate(AndroidUtilities.dp(f20) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(p5Var == null ? 2.0f : 5.0f) + f19 + (!z12 ? -AndroidUtilities.dp(1.0f) : 0), f10);
            brVar.a(canvas);
            canvas.restore();
        }
        if (!this.S) {
            canvas.save();
            canvas.translate(f7 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f18), f10);
            i9Var = this.T;
            i9Var.u = f12;
            if (i9Var.w) {
                i9Var.e = f11;
                if (f11 == 1.0f) {
                }
            }
            this.T.i(canvas);
            canvas.restore();
        }
        if (z13) {
        }
    }

    public boolean e() {
        int i10 = this.w;
        return ((i10 == 0 || (this.S && !this.u && i10 == 1)) && this.F.l == 1.0f) ? false : true;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        boolean z10;
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        p5 p5Var2 = this.D;
        if (p5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            p5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (!this.l || (!this.m && this.j <= 1 && n() && this.Q)) {
            imageReceiver.setAlpha(0.0f);
            imageReceiver.draw(canvas);
            this.n = false;
            return;
        }
        ImageReceiver l4 = l();
        if (l4 != null) {
            z10 = l4.getLottieAnimation() == null || !l4.getLottieAnimation().u();
            if (f7 != 1.0f) {
                l4.setAlpha(f7);
                if (f7 <= 0.0f) {
                    l4.onDetachedFromWindow();
                    o();
                }
            } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().l0) {
                float alpha = l4.getAlpha() - 0.08f;
                if (alpha <= 0.0f) {
                    l4.onDetachedFromWindow();
                    o();
                } else {
                    l4.setAlpha(alpha);
                }
                this.W.invalidate();
                z10 = true;
            }
            l4.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
            l4.draw(canvas);
        } else {
            z10 = true;
        }
        if (z10) {
            imageReceiver.draw(canvas);
        }
        this.n = true;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        l8 l8Var = this.Z;
        if (l8Var == null) {
            return false;
        }
        RectF rectF = l8Var.c;
        if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || !LiteMode.isEnabled(131072)) {
            return false;
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(f7, f10, this.A + f7, this.B + f10);
        float f11 = this.B / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        l8Var.g(rectF);
        boolean d = l8Var.d();
        l8Var.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
        if (this.Q) {
            Path path = this.d0;
            path.rewind();
            path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            l8Var.a(canvas, this.K);
            canvas.restore();
        }
        return d;
    }

    public final void h(Canvas canvas, RectF rectF, float f7, Paint paint) {
        if (!this.S) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        RectF rectF2 = this.b0;
        float f10 = rectF2.left;
        float f11 = rectF.left;
        Path path = this.d0;
        if (f10 != f11 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
            rectF2.set(rectF);
            q0.h(rectF2, this.c0, path);
        }
        canvas.drawPath(path, paint);
    }

    public boolean i() {
        return true;
    }

    public int j() {
        return this.S ? 18 : 3;
    }

    public float k() {
        return 0.0f;
    }

    public ImageReceiver l() {
        return null;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public final void p(ArrayList arrayList) {
        this.U = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, q0.c0);
            if (this.T == null) {
                i9 i9Var = new i9(this.W, false);
                this.T = i9Var;
                i9Var.v = 250L;
                wr wrVar = ii.n.V;
                i9Var.s = AndroidUtilities.dp(20.0f);
                this.T.p = AndroidUtilities.dp(100.0f);
                i9 i9Var2 = this.T;
                i9Var2.o = this.B;
                i9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.e0) {
                this.T.g();
            }
            for (int i10 = 0; i10 < arrayList.size() && i10 != 3; i10++) {
                this.T.l(i10, (TLObject) arrayList.get(i10), this.V);
            }
            this.T.b(false, true);
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            hj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            c6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            hj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            c6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        this.N = i0.a.d(f7, this.i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f7, this.g, i0.a.d(k(), this.J, this.L));
        this.O = d;
        this.P = i0.a.d(f7, this.h, AndroidUtilities.computePerceivedBrightness(d) > 0.8f ? 0 : 1526726655);
    }

    public void o() {
    }
}

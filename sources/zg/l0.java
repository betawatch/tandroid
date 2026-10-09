package zg;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.s5;
import yh.b8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class l0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final s5 D;
    public int E;
    public final lr F;
    public final q6 G;
    public final q6 H;
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
    public l9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final e6 X;
    public final bd Y;
    public final b8 Z;
    public final TLRPC.ReactionCount a;
    public final ck0 a0;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public boolean e0;
    public int f;
    public ImageReceiver f0;
    public int g;
    public s5 g0;
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
    public final n0 s;
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

    public l0(l0 l0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, e6 e6Var) {
        b8 b8Var;
        ck0 ck0Var;
        i.f fVar = new i.f(this, 10);
        this.V = i10;
        this.W = view;
        this.Y = new bd(view);
        this.X = e6Var;
        this.S = z11;
        if (l0Var != null) {
            this.F = l0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new lr(view, false, null);
        }
        if (this.G == null) {
            q6 q6Var = new q6(true, true, true);
            this.G = q6Var;
            q6Var.K = true;
            q6Var.n(0.4f, 320L, hs.h);
            q6Var.w(AndroidUtilities.dp(13.0f));
            q6Var.setCallback(fVar);
            q6Var.x(AndroidUtilities.bold());
            q6Var.M = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            q6 q6Var2 = new q6(false, false, false, true, false);
            this.H = q6Var2;
            q6Var2.w(AndroidUtilities.dp(12.0f));
            q6Var2.setCallback(fVar);
            q6Var2.x(AndroidUtilities.bold());
            q6Var2.M = AndroidUtilities.displaySize.x;
            q6Var2.A = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.r = reaction;
        n0 d = n0.d(reaction);
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
        lr lrVar = this.F;
        lrVar.G = false;
        lrVar.a = true;
        if (reaction != null) {
            if (d.a) {
                this.m = true;
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    if (l0Var == null || (ck0Var = l0Var.a0) == null) {
                        this.a0 = new ck0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    } else {
                        this.a0 = ck0Var;
                    }
                    this.C.setImageBitmap(this.a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (l0Var == null || (b8Var = l0Var.Z) == null) {
                    b8Var = new b8(1, SharedConfig.getDevicePerformanceClass() == 2 ? 18 : 8);
                }
                this.Z = b8Var;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, i6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.D = new s5(j(), i10, d.g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = o0.Y;
        if (z11) {
            this.v = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.u = !TextUtils.isEmpty(r1);
        }
        if (this.u) {
            q6 q6Var3 = this.G;
            q6Var3.t(Emoji.replaceEmoji(this.v, q6Var3.a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof lo0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            q6 q6Var4 = this.G;
            if (q6Var4 != null) {
                q6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.w, false);
        }
        lr lrVar2 = this.F;
        lrVar2.I = 2;
        lrVar2.z = 3;
    }

    public final void a() {
        this.e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        l9 l9Var = this.T;
        if (l9Var != null) {
            l9Var.g();
        }
        s5 s5Var = this.D;
        if (s5Var != null) {
            s5Var.a(this.W);
        }
    }

    public final void b() {
        this.e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        l9 l9Var = this.T;
        if (l9Var != null) {
            l9Var.h();
        }
        s5 s5Var = this.D;
        if (s5Var != null) {
            s5Var.o(this.W);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7, float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
        int i10;
        float f14;
        int i11;
        q6 q6Var;
        boolean z12;
        Paint paint;
        float a2;
        float f15;
        RectF rectF;
        float f16;
        boolean z13;
        float f17;
        boolean z14;
        Paint paint2;
        float f18;
        lr lrVar;
        float f19;
        l9 l9Var;
        float f20;
        float f21;
        int dp;
        int dp2;
        Paint paint3;
        f5 y22;
        s5 s5Var = this.D;
        ImageReceiver imageReceiver = s5Var != null ? s5Var.k : this.C;
        boolean z15 = this.b;
        Rect rect = this.t;
        if (z15 && imageReceiver != null) {
            imageReceiver.setAlpha(f12);
            rect.set((int) f7, (int) f10, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            imageReceiver.setImageCoords(rect);
            imageReceiver.setRoundRadius(0);
            f(canvas, rect, f12);
            return;
        }
        boolean z16 = this.p;
        View view = this.W;
        boolean z17 = this.m;
        e6 e6Var = this.X;
        if (z16) {
            if (z17) {
                this.J = -1529086;
                this.K = -1;
                this.M = -1;
                this.L = -1529086;
            } else {
                this.J = i6.w0(m() ? i6.Sb : i6.Cj, e6Var);
                this.K = i6.w0(m() ? i6.Gj : i6.Fj, e6Var);
                if (view instanceof w0) {
                    this.M = i6.w0(i6.Ij, e6Var);
                    this.L = i6.w0(i6.Hj, e6Var);
                } else {
                    this.M = i6.w0(m() ? i6.Sb : i6.Cj, e6Var);
                    this.L = i6.w0(m() ? i6.Aa : i6.ra, e6Var);
                }
            }
            i10 = 0;
        } else if (z17) {
            this.K = -1529086;
            this.J = 1088989954;
            this.M = -1;
            i10 = 0;
            this.L = 0;
        } else {
            this.K = i6.w0(m() ? i6.Dj : i6.Ej, e6Var);
            int w02 = i6.w0(m() ? i6.Sb : i6.Cj, e6Var);
            this.J = w02;
            this.J = i0.a.k(w02, (int) (Color.alpha(w02) * 0.156f));
            this.M = i6.w0(i6.ic, e6Var);
            i10 = 0;
            this.L = 0;
        }
        if (this.q) {
            this.J = i10;
            this.L = i10;
        }
        s(f11);
        TextPaint textPaint = o0.Y;
        textPaint.setColor(this.N);
        q6 q6Var2 = this.G;
        if (q6Var2 != null) {
            q6Var2.u(this.N);
        }
        Paint paint4 = o0.V;
        paint4.setColor(this.O);
        boolean z18 = this.S && i() && Color.alpha(this.P) == 0;
        if (f12 != 1.0f) {
            f14 = 1.0f;
            textPaint.setAlpha((int) (textPaint.getAlpha() * f12));
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
        } else {
            f14 = 1.0f;
        }
        if (imageReceiver != null) {
            imageReceiver.setAlpha(f12);
        }
        int i12 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        q6 q6Var3 = this.H;
        if (i12 <= 0) {
            i11 = i12;
            q6Var = q6Var2;
            z12 = z17;
        } else if (this.I != z11) {
            if (z11) {
                q6Var3.m(0.6f, 650L, 1.6f, hs.k);
                i11 = i12;
                q6Var3 = q6Var3;
                z12 = z17;
                q6Var = q6Var2;
                q6Var3.t(AndroidUtilities.formatWholeNumber(this.w, 0), false, true);
                paint = paint4;
                q6Var3.t(LocaleController.formatNumber(this.w, ','), true, true);
            } else {
                i11 = i12;
                q6Var = q6Var2;
                z12 = z17;
                q6Var3 = q6Var3;
                paint = paint4;
                q6Var3.m(0.6f, 320L, 1.6f, hs.h);
                q6Var3.t(AndroidUtilities.formatWholeNumber(this.w, 0), true, true);
            }
            this.I = z11;
            a2 = this.Y.a(0.1f);
            int i13 = this.A;
            if (i11 <= 0 && !this.S && q6Var3 != null && this.T == null) {
                i13 = (int) (q6Var3.c() + AndroidUtilities.dp(s5Var != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(8.0f));
                q6Var3.u(this.N);
            } else if (f11 != f14) {
                f15 = 6.0f;
                if (this.c == 3) {
                    i13 = (int) e2.y(f14, f11, this.f, i13 * f11);
                }
                rectF = AndroidUtilities.rectTmp;
                float f22 = i13;
                rectF.set(f7, f10, f7 + f22, this.B + f10);
                if (a2 != 1.0f) {
                    canvas.save();
                    f16 = 2.0f;
                    canvas.scale(a2, a2, (f22 / 2.0f) + f7, (this.B / 2.0f) + f10);
                    z13 = true;
                } else {
                    f16 = 2.0f;
                    z13 = false;
                }
                f17 = this.B / f16;
                if (k() > 0.0f || this.q) {
                    z14 = z13;
                    paint2 = paint;
                } else {
                    Paint U0 = i6.U0("paintChatActionBackground", e6Var);
                    z14 = z13;
                    Paint U02 = i6.U0("paintChatActionBackgroundDarken", e6Var);
                    int alpha = U0.getAlpha();
                    paint2 = paint;
                    int alpha2 = U02.getAlpha();
                    U0.setAlpha((int) (alpha * f12 * k()));
                    U02.setAlpha((int) (alpha2 * f12 * k()));
                    h(canvas, rectF, f17, U0);
                    if (e6Var == null ? i6.b1() : e6Var.k0()) {
                        h(canvas, rectF, f17, U02);
                    }
                    U0.setAlpha(alpha);
                    U02.setAlpha(alpha2);
                }
                if (z10 && k() < 1.0f && (view instanceof u1) && (y22 = ((u1) view).y2(false)) != null && !this.S) {
                    canvas.drawRoundRect(rectF, f17, f17, y22.c);
                }
                if (z18) {
                    rectF.right += AndroidUtilities.dp(4.0f);
                    canvas.saveLayerAlpha(rectF, 255, 31);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                if (this.Z != null) {
                    LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                }
                h(canvas, rectF, f17, paint2);
                if (this.S && i()) {
                    if (z18) {
                        paint3 = o0.W;
                        paint3.setColor(this.P);
                        paint3.setAlpha((int) (paint3.getAlpha() * f12));
                    } else {
                        paint3 = o0.X;
                    }
                    canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint3);
                }
                if (z18) {
                    canvas.restore();
                }
                if (imageReceiver != null) {
                    if (z12) {
                        dp = AndroidUtilities.dp(22.0f);
                        dp2 = AndroidUtilities.dp(4.0f);
                    } else if (s5Var != null) {
                        dp = AndroidUtilities.dp(24.0f);
                        dp2 = AndroidUtilities.dp(f15);
                        imageReceiver.setRoundRadius(AndroidUtilities.dp(f15));
                    } else {
                        dp = AndroidUtilities.dp(20.0f);
                        dp2 = AndroidUtilities.dp(8.0f);
                        imageReceiver.setRoundRadius(0);
                    }
                    int i14 = (int) ((this.B - dp) / f16);
                    if (this.S) {
                        dp2 -= AndroidUtilities.dp(f16);
                    }
                    int i15 = ((int) f7) + dp2;
                    int i16 = ((int) f10) + i14;
                    rect.set(i15, i16, i15 + dp, dp + i16);
                    f(canvas, rect, f12);
                }
                if (q6Var != null || q6Var.i() <= 0.0f) {
                    f18 = 0.0f;
                } else {
                    canvas.save();
                    if (!this.u || i()) {
                        f21 = this.u ? 9 : 8;
                    } else {
                        f21 = 10.0f;
                    }
                    canvas.translate(AndroidUtilities.dp(f21) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f16), f10);
                    q6 q6Var4 = q6Var;
                    q6Var4.setBounds(0, 0, this.A, this.B);
                    q6Var4.draw(canvas);
                    q6Var4.B = (int) (f12 * 255.0f);
                    canvas.restore();
                    f18 = q6Var4.c() + (q6Var4.i() * AndroidUtilities.dp(4.0f));
                }
                if (i11 > 0 || this.S || q6Var3 == null || this.T != null) {
                    lrVar = this.F;
                    if (lrVar != null && e()) {
                        canvas.save();
                        if (this.u || i()) {
                            f19 = this.u ? 9 : 8;
                        } else {
                            f19 = 10.0f;
                        }
                        canvas.translate(AndroidUtilities.dp(f19) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(s5Var == null ? f16 : 5.0f) + f18 + (!z12 ? -AndroidUtilities.dp(1.0f) : 0), f10);
                        lrVar.a(canvas);
                        canvas.restore();
                    }
                } else {
                    canvas.save();
                    if (!this.u || i()) {
                        f20 = this.u ? 9 : 8;
                    } else {
                        f20 = 10.0f;
                    }
                    canvas.translate(AndroidUtilities.dp(f20) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(s5Var == null ? f16 : 5.0f), f10 - AndroidUtilities.dp(1.0f));
                    q6Var3.setBounds(0, 0, this.A, this.B);
                    q6Var3.draw(canvas);
                    q6Var3.B = (int) (255.0f * f12);
                    canvas.restore();
                }
                if (!this.S && this.T != null) {
                    canvas.save();
                    canvas.translate(f7 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f16), f10);
                    l9Var = this.T;
                    l9Var.u = f12;
                    if (l9Var.w && l9Var.e != f11) {
                        l9Var.e = f11;
                        if (f11 == 1.0f) {
                            l9Var.n();
                            l9Var.w = false;
                        }
                    }
                    this.T.i(canvas);
                    canvas.restore();
                }
                if (z14) {
                    canvas.restore();
                    return;
                }
                return;
            }
            f15 = 6.0f;
            rectF = AndroidUtilities.rectTmp;
            float f222 = i13;
            rectF.set(f7, f10, f7 + f222, this.B + f10);
            if (a2 != 1.0f) {
            }
            f17 = this.B / f16;
            if (k() > 0.0f) {
            }
            z14 = z13;
            paint2 = paint;
            if (z10) {
                canvas.drawRoundRect(rectF, f17, f17, y22.c);
            }
            if (z18) {
            }
            if (this.Z != null) {
            }
            h(canvas, rectF, f17, paint2);
            if (this.S) {
                if (z18) {
                }
                canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint3);
            }
            if (z18) {
            }
            if (imageReceiver != null) {
            }
            if (q6Var != null) {
            }
            f18 = 0.0f;
            if (i11 > 0) {
            }
            lrVar = this.F;
            if (lrVar != null) {
                canvas.save();
                if (this.u) {
                }
                f19 = this.u ? 9 : 8;
                canvas.translate(AndroidUtilities.dp(f19) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(s5Var == null ? f16 : 5.0f) + f18 + (!z12 ? -AndroidUtilities.dp(1.0f) : 0), f10);
                lrVar.a(canvas);
                canvas.restore();
            }
            if (!this.S) {
                canvas.save();
                canvas.translate(f7 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f16), f10);
                l9Var = this.T;
                l9Var.u = f12;
                if (l9Var.w) {
                    l9Var.e = f11;
                    if (f11 == 1.0f) {
                    }
                }
                this.T.i(canvas);
                canvas.restore();
            }
            if (z14) {
            }
        } else {
            i11 = i12;
            q6Var = q6Var2;
            z12 = z17;
            q6Var3 = q6Var3;
        }
        paint = paint4;
        a2 = this.Y.a(0.1f);
        int i132 = this.A;
        if (i11 <= 0) {
        }
        if (f11 != f14) {
        }
        f15 = 6.0f;
        rectF = AndroidUtilities.rectTmp;
        float f2222 = i132;
        rectF.set(f7, f10, f7 + f2222, this.B + f10);
        if (a2 != 1.0f) {
        }
        f17 = this.B / f16;
        if (k() > 0.0f) {
        }
        z14 = z13;
        paint2 = paint;
        if (z10) {
        }
        if (z18) {
        }
        if (this.Z != null) {
        }
        h(canvas, rectF, f17, paint2);
        if (this.S) {
        }
        if (z18) {
        }
        if (imageReceiver != null) {
        }
        if (q6Var != null) {
        }
        f18 = 0.0f;
        if (i11 > 0) {
        }
        lrVar = this.F;
        if (lrVar != null) {
        }
        if (!this.S) {
        }
        if (z14) {
        }
    }

    public boolean e() {
        int i10 = this.w;
        return ((i10 == 0 || (this.S && !this.u && i10 == 1)) && this.F.l == 1.0f) ? false : true;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        boolean z10;
        s5 s5Var = this.D;
        if (s5Var == null || (imageReceiver = s5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        s5 s5Var2 = this.D;
        if (s5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            s5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
            } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().k0) {
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
        b8 b8Var = this.Z;
        if (b8Var == null) {
            return false;
        }
        RectF rectF = b8Var.c;
        if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || !LiteMode.isEnabled(131072)) {
            return false;
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(f7, f10, this.A + f7, this.B + f10);
        float f11 = this.B / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        b8Var.g(rectF);
        boolean d = b8Var.d();
        b8Var.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
        if (this.Q) {
            Path path = this.d0;
            path.rewind();
            path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            b8Var.a(canvas, this.K);
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
            o0.h(rectF2, this.c0, path);
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
            Collections.sort(arrayList, o0.c0);
            if (this.T == null) {
                l9 l9Var = new l9(this.W, false);
                this.T = l9Var;
                l9Var.v = 250L;
                hs hsVar = ji.n.V;
                l9Var.s = AndroidUtilities.dp(20.0f);
                this.T.p = AndroidUtilities.dp(100.0f);
                l9 l9Var2 = this.T;
                l9Var2.o = this.B;
                l9Var2.j(AndroidUtilities.dp(22.0f));
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
        s5 s5Var = this.D;
        if (s5Var == null || (imageReceiver = s5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            ck0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            f6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        s5 s5Var = this.D;
        if (s5Var == null || (imageReceiver = s5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            ck0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            f6 animation = imageReceiver.getAnimation();
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

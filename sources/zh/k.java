package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bi.vd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.xc;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class k extends FrameLayout {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final x5 O;
    public float P;
    public float Q;
    public lj0 R;
    public e S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a;
    public final org.telegram.ui.Components.d6 a0;
    public int b;
    public final /* synthetic */ nx b0;
    public boolean c;
    public boolean d;
    public org.telegram.ui.web.a1 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final g9 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final g9 v;
    public boolean w;
    public final FrameLayout x;
    public org.telegram.ui.ActionBar.l5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nx nxVar, Context context) {
        super(context);
        this.b0 = nxVar;
        this.n = new g9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.v = new g9((org.telegram.ui.ActionBar.f6) null);
        this.w = true;
        x5 x5Var = new x5(null, true);
        this.O = x5Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.a0 = new org.telegram.ui.Components.d6(this, 0L, 350L, wr.h);
        x5Var.o = nxVar.b == 1;
        x5Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.a6.c(-2.0f, -1));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipInParent(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z10);
        }
        if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
            return;
        }
        ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z10);
    }

    public final void b() {
        int textColor;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.y = l5Var;
        l5Var.setTypeface(AndroidUtilities.bold());
        this.y.setGravity(17);
        this.y.setTextSize(11);
        org.telegram.ui.ActionBar.l5 l5Var2 = this.y;
        textColor = this.b0.getTextColor();
        l5Var2.setTextColor(textColor);
        NotificationCenter.listenEmojiLoading(this.y);
        this.y.setMaxLines(1);
        this.x.addView(this.y, w7.a6.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        nx nxVar = this.b0;
        int i10 = nxVar.b;
        Paint paint = nxVar.G;
        i5 i5Var = nxVar.s;
        Paint paint2 = nxVar.H;
        Drawable drawable = nxVar.c;
        if (this.F && !i5Var.I(this.E) && Utilities.isNullOrEmpty(i5Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(f11, nxVar.f(org.telegram.ui.ActionBar.j6.hl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f11, nxVar.f(org.telegram.ui.ActionBar.j6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f11, nxVar.f(org.telegram.ui.ActionBar.j6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            int f12 = nxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8);
            if (f12 != nxVar.e) {
                nxVar.e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f7, float f10, float f11, boolean z10) {
        float f12 = this.J;
        nx nxVar = this.b0;
        if (f12 != f7 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            nxVar.h.invalidate();
        }
        float clamp = this.N ? 0.0f : 1.0f - Utilities.clamp(nxVar.N / nxVar.B0, 1.0f, 0.0f);
        this.Q = clamp;
        float f13 = clamp * this.P;
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(f13);
        frameLayout.setVisibility(f13 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v14 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ImageReceiver imageReceiver;
        float f10;
        Canvas canvas2;
        float f11;
        int i10;
        float f12;
        x5 x5Var;
        float size;
        boolean z10;
        float f13;
        float f14;
        boolean z11;
        int textColor;
        float f15;
        boolean z12;
        ImageReceiver imageReceiver2;
        ?? r13;
        boolean[] zArr;
        lj0 lj0Var;
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        float dp3 = AndroidUtilities.dp(8.0f);
        nx nxVar = this.b0;
        int i11 = nxVar.b;
        i5 i5Var = nxVar.s;
        Paint paint = nxVar.H;
        float clamp = Utilities.clamp(nxVar.n0 / 0.5f, 1.0f, 0.0f) * dp3;
        if (this.V) {
            clamp += Utilities.clamp((nxVar.n0 - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
        }
        float lerp = AndroidUtilities.lerp(dp + clamp, dp2, this.J);
        float f16 = lerp / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f16;
        float lerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.J);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp2) / 2.0f, this.J);
        float clamp2 = Utilities.clamp(this.J / 0.5f, 1.0f, 0.0f);
        x5 x5Var2 = this.O;
        x5Var2.a = true;
        RectF rectF = x5Var2.F;
        if (!x5Var2.p) {
            x5Var2.e = 1.0f - nxVar.d0;
        }
        float f17 = lerp3 + lerp;
        rectF.set(lerp2, lerp3, lerp2 + lerp, f17);
        x5Var2.G = AndroidUtilities.dpf2(1.33f) * this.J;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.setRoundRadius((int) f16);
        float f18 = lerp2 + f16;
        this.L = f18;
        float f19 = lerp3 + f16;
        this.M = f19;
        if (i11 == 0) {
            f7 = f16;
            paint.setColor(nxVar.f(org.telegram.ui.ActionBar.j6.s8));
        } else {
            f7 = f16;
            paint.setColor(nxVar.f(org.telegram.ui.ActionBar.j6.M8));
        }
        if (this.J != 0.0f) {
            imageReceiver = imageReceiver3;
            f10 = lerp2;
            canvas.drawCircle(this.L, this.M, AndroidUtilities.dpf2(1.5f) + f7, paint);
        } else {
            imageReceiver = imageReceiver3;
            f10 = lerp2;
        }
        canvas.save();
        float f20 = this.L;
        float f21 = this.M;
        float f22 = this.T;
        canvas.scale(f22, f22, f20, f21);
        if (this.R == null) {
            this.R = nxVar.n;
        }
        ArrayList arrayList = (ArrayList) i5Var.c.f(this.E);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.W && (lj0Var = this.R) != null && lj0Var.f < 0.98f)) {
            canvas2 = canvas;
            f11 = f10;
            i10 = 0;
            f12 = f17;
            x5Var = x5Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            if (z13) {
                float f23 = 0.0f;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    f23 += ((h5) arrayList.get(i12)).h;
                }
                size = (i5Var.d + f23) / (arrayList.size() + r4);
                z10 = ((h5) hc.b.i(1, arrayList)).G;
                nxVar.m0 = z10;
            } else {
                z10 = nxVar.m0;
                size = 1.0f;
            }
            invalidate();
            if (this.R == null) {
                lj0 lj0Var2 = nxVar.n;
                if (lj0Var2 != null) {
                    this.R = lj0Var2;
                } else {
                    lj0 lj0Var3 = new lj0(this);
                    this.R = lj0Var3;
                    nxVar.n = lj0Var3;
                    lj0Var3.d(null, true, false);
                }
            }
            if (this.w) {
                canvas2.save();
                canvas2.scale(x5Var.b(), x5Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.setImageCoords(rectF);
                imageReceiver4.draw(canvas2);
                canvas2.restore();
            }
            this.R.q = 0;
            Paint o9 = z10 ? a6.o(imageReceiver4) : a6.t(imageReceiver4, true);
            o9.setAlpha(255);
            lj0 lj0Var4 = this.R;
            lj0Var4.t = o9;
            lj0Var4.f((int) (imageReceiver4.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver4.getImageY2() + AndroidUtilities.dp(3.0f)));
            this.R.e(Utilities.clamp(size, 1.0f, 0.0f), this.W);
            if (imageReceiver4.getVisible()) {
                this.R.a(canvas2);
            }
            this.W = true;
            invalidate();
        } else {
            float e = this.a0.e(this.G);
            if (this.w) {
                if (this.W) {
                    x5Var2.p = true;
                    x5Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new qg.o(this, 15));
                    ofFloat.addListener(new yg.b(this, 4));
                    f14 = clamp2;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    f14 = clamp2;
                }
                float f24 = e * x5Var2.e;
                x5Var2.b = !this.W;
                if (!this.c && nxVar.n0 <= 0.0f) {
                    if (AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), wr.g.getInterpolation(this.J)) < (AndroidUtilities.dpf2(3.5f) + f7) * 2.0f) {
                        f15 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        x5Var2.f = f15;
                        x5Var2.l = this.c;
                        x5Var2.m = this.d;
                        x5Var2.u = 1.0f - f24;
                        z12 = this.F;
                        if (z12 && this.H) {
                            x5Var2.s = this.I;
                        } else {
                            x5Var2.s = 0L;
                        }
                        if (z12) {
                            imageReceiver2 = imageReceiver;
                            f11 = f10;
                            r13 = 0;
                            f12 = f17;
                            zArr = null;
                            x5Var = x5Var2;
                            long j3 = this.E;
                            canvas2 = canvas;
                            a6.i(j3, canvas2, imageReceiver2, i5Var.I(j3), x5Var);
                        } else {
                            x5Var = x5Var2;
                            imageReceiver2 = imageReceiver;
                            f11 = f10;
                            r13 = 0;
                            f12 = f17;
                            zArr = null;
                            canvas2 = canvas;
                            a6.i(this.E, canvas2, imageReceiver2, i5Var.H(), x5Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f24 > 0.0f) {
                            if (a6.d == null) {
                                x20 x20Var = new x20();
                                a6.d = x20Var;
                                x20Var.a = true;
                                x20Var.b = true;
                                int w02 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.xj, r13);
                                int w03 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.q7, r13);
                                a6.d.d(i0.a.d(0.25f, w02, w03), w03, r13, r13);
                                a6.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                                a6.d.c.setStyle(Paint.Style.STROKE);
                                a6.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            a6.d.b(imageReceiver5.getImageX(), imageReceiver5.getImageY(), imageReceiver5.getImageX2(), imageReceiver5.getImageY2());
                            Paint paint2 = a6.d.c;
                            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                            paint2.setAlpha((int) (255.0f * f24));
                            canvas2.drawCircle(f18, f19, x5Var.b() * (f7 + AndroidUtilities.dp(4.0f)), paint2);
                        }
                        e = f24;
                        z11 = r13;
                    }
                }
                f15 = 0.0f;
                x5Var2.f = f15;
                x5Var2.l = this.c;
                x5Var2.m = this.d;
                x5Var2.u = 1.0f - f24;
                z12 = this.F;
                if (z12) {
                }
                x5Var2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f24 > 0.0f) {
                }
                e = f24;
                z11 = r13;
            } else {
                canvas2 = canvas;
                x5Var = x5Var2;
                f14 = clamp2;
                f11 = f10;
                z11 = 0;
                f12 = f17;
            }
            this.W = z11;
            i10 = z11;
            if (this.w) {
                canvas2.save();
                float f25 = 1.0f - f14;
                canvas2.scale(f25, f25, this.L + AndroidUtilities.dp(16.0f), this.M + AndroidUtilities.dp(16.0f));
                c(canvas2, this.L, this.M, 1.0f);
                float f26 = this.L;
                float f27 = this.M;
                if (e > 0.0f) {
                    float dp4 = f26 + AndroidUtilities.dp(17.0f);
                    float dp5 = f27 + AndroidUtilities.dp(17.0f);
                    Paint paint3 = nxVar.G;
                    paint3.setColor(org.telegram.ui.ActionBar.j6.l1(e, nxVar.f(org.telegram.ui.ActionBar.j6.q7)));
                    if (i11 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, nxVar.f(org.telegram.ui.ActionBar.j6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, nxVar.f(org.telegram.ui.ActionBar.j6.M8)));
                    }
                    float interpolation = wr.k.getInterpolation(e) * AndroidUtilities.dp(9.0f);
                    canvas2.drawCircle(dp4, dp5, AndroidUtilities.dp(2.0f) + interpolation, paint);
                    canvas2.drawCircle(dp4, dp5, interpolation, paint3);
                    textColor = nxVar.getTextColor();
                    paint3.setColor(org.telegram.ui.ActionBar.j6.l1(e, textColor));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp4 - AndroidUtilities.dp(1.0f), dp5 - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + dp4, AndroidUtilities.dpf2(1.6f) + dp5);
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                    rectF2.set(dp4 - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + dp5, dp4 + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(4.6f) + dp5);
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                }
                canvas2.restore();
                i10 = z11;
            }
        }
        canvas2.restore();
        if (!this.H || this.K <= 0.0f) {
            f13 = f11;
        } else {
            ImageReceiver imageReceiver6 = this.s;
            f13 = f11;
            imageReceiver6.setImageCoords(f13, lerp3, lerp, lerp);
            imageReceiver6.setAlpha(this.K);
            imageReceiver6.draw(canvas2);
        }
        float dp6 = ((1.0f - this.J) * AndroidUtilities.dp(7.0f)) + f12;
        FrameLayout frameLayout = this.x;
        frameLayout.setTranslationY(dp6);
        frameLayout.setTranslationX(f13 - measuredWidth);
        if (!this.N) {
            if (this.F) {
                this.P = 1.0f;
            } else {
                this.P = x5Var.n == 2 ? 0.7f : 1.0f;
            }
            float f28 = this.Q * this.P;
            frameLayout.setAlpha(f28);
            int i13 = i10;
            if (f28 <= 0.0f) {
                i13 = 4;
            }
            frameLayout.setVisibility(i13);
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp2) / 2.0f, this.b0.c0) + (AndroidUtilities.lerp(dp, dp2, this.J) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            nx nxVar = this.b0;
            g gVar = nxVar.r;
            if (parent == gVar) {
                gVar.invalidate();
            } else {
                nxVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.onAttachedToWindow();
        this.s.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.onDetachedFromWindow();
        this.s.onDetachedFromWindow();
        this.O.g();
        org.telegram.ui.web.a1 a1Var = this.e;
        if (a1Var != null) {
            a1Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.N ? AndroidUtilities.dp(70.0f) : this.b0.M, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j3) {
        TLRPC.Chat chat;
        int i10 = this.b0.f;
        if (this.I != j3) {
            this.I = j3;
            boolean z10 = j3 != -1;
            this.H = z10;
            ImageReceiver imageReceiver = this.s;
            if (!z10) {
                imageReceiver.clearImage();
                return;
            }
            if (j3 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                this.f = user;
                this.h = null;
                chat = user;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                this.h = chat2;
                this.f = null;
                chat = chat2;
            }
            if (chat != null) {
                g9 g9Var = this.v;
                g9Var.j(i10, chat);
                imageReceiver.setForUserOrChat(chat, g9Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDialogId(long j3) {
        TLRPC.Chat chat;
        h5 h5Var;
        nx nxVar = this.b0;
        int i10 = nxVar.f;
        i5 i5Var = nxVar.s;
        long j10 = this.E;
        int i11 = 1;
        boolean z10 = j10 == j3;
        if (!z10 && this.e != null) {
            i5Var.e0(j10, false);
            this.e.a();
            this.e = null;
        }
        this.E = j3;
        this.F = j3 == UserConfig.getInstance(i10).getClientUserId();
        this.G = i5Var.N(j3);
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.f = user;
            this.h = null;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.h = chat2;
            this.f = null;
            chat = chat2;
        }
        ImageReceiver imageReceiver = this.r;
        if (chat == null) {
            this.y.l("", false);
            imageReceiver.clearImage();
            return;
        }
        g9 g9Var = this.n;
        g9Var.j(i10, chat);
        imageReceiver.setForUserOrChat(chat, g9Var);
        if (this.N) {
            return;
        }
        this.y.i(null);
        if (i5Var.N(j3)) {
            this.y.setTextSize(10);
            this.y.l(LocaleController.getString(R.string.FailedStory), false);
            this.U = false;
            return;
        }
        if (!Utilities.isNullOrEmpty(i5Var.E(j3))) {
            this.y.setTextSize(10);
            a6.a(this.y);
            this.U = true;
            return;
        }
        HashMap hashMap = (HashMap) i5Var.e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                h5Var = (h5) values.iterator().next();
                if (h5Var == null) {
                    this.y.setTextSize(10);
                    a6.a(this.y);
                    this.U = true;
                    return;
                }
                if (this.F) {
                    if (z10 && this.U && !this.N) {
                        org.telegram.ui.ActionBar.l5 l5Var = this.y;
                        b();
                        ValueAnimator valueAnimator = nxVar.j0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            nxVar.j0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        nxVar.j0 = ofFloat;
                        ofFloat.addUpdateListener(new b3(i11, this, l5Var));
                        nxVar.j0.addListener(new vv0(22, (Object) this, (Object) l5Var));
                        nxVar.j0.setDuration(150L);
                        this.y.setAlpha(0.0f);
                        this.y.setTranslationY(AndroidUtilities.dp(5.0f));
                        nxVar.k0 = new vd(this, i11);
                    }
                    AndroidUtilities.runOnUIThread(nxVar.k0, 500L);
                    this.U = false;
                    this.y.setTextSize(10);
                    this.y.l(LocaleController.getString(R.string.MyStory), false);
                    return;
                }
                if (this.f == null) {
                    this.y.setTextSize(11);
                    this.y.l(Emoji.replaceEmoji(this.h.title, this.y.getPaint().getFontMetricsInt(), false), false);
                    this.y.i(null);
                    return;
                }
                this.y.setTextSize(11);
                String str = this.f.first_name;
                String trim = str != null ? str.trim() : "";
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                if (!this.f.verified) {
                    this.y.l(Emoji.replaceEmoji(trim, this.y.getPaint().getFontMetricsInt(), false), false);
                    this.y.i(null);
                    return;
                }
                if (this.S == null) {
                    Drawable mutate = nxVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = nxVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    e eVar = new e(nxVar, mutate, mutate2, mutate, mutate2);
                    eVar.w = true;
                    this.S = eVar;
                }
                this.y.l(Emoji.replaceEmoji(trim, this.y.getPaint().getFontMetricsInt(), false), false);
                this.y.i(this.S);
                return;
            }
        }
        h5Var = null;
        if (h5Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        x5 x5Var = this.O;
        if (z10 && x5Var.H == null) {
            x5Var.H = new xc(this, 1.5f, 5.0f);
        }
        xc xcVar = x5Var.H;
        if (xcVar != null) {
            xcVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            nx nxVar = this.b0;
            g gVar = nxVar.r;
            if (parent == gVar) {
                gVar.invalidate();
            }
            nxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}

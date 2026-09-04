package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.fh0;
import sg.d1;
import w7.p;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements fh0, d {
    public static final RectF V = new RectF();
    public TLRPC.TL_attachMenuBot E;
    public final TextPaint F;
    public boolean G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public boolean Q;
    public int R;
    public float S;
    public TextPaint T;
    public i9 U;
    public final TextView a;
    public final aj0 b;
    public x9 c;
    public f6 d;
    public final Paint e;
    public final p6 f;
    public final le.b h;
    public final le.b n;
    public final le.b r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public a y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new le.b(0, this, ke.a.a, 320L, false);
        pr prVar = pr.h;
        this.n = new le.b(1, this, prVar, 380L, false);
        this.r = new le.b(2, this, prVar, 380L, false);
        this.S = 1.0f;
        aj0 aj0Var = new aj0(context);
        this.b = aj0Var;
        addView(aj0Var, x5.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        aj0Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, x5.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        p6 p6Var = new p6(false, false, false, false);
        this.f = p6Var;
        p6Var.u(AndroidUtilities.bold());
        p6Var.setCallback(this);
        p6Var.b = 17;
        p6Var.r(-1);
        p6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, f6 f6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = f6Var;
        bVar.y = aVar;
        bVar.a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.b.setLayoutParams(x5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = j6.v0(j6.cl, f6Var);
        bVar.s = j6.v0(j6.al, f6Var);
        bVar.v = j6.v0(j6.bl, f6Var);
        bVar.f();
        return bVar;
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, e eVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    public final void a(boolean z10) {
        TLRPC.Document document;
        boolean z11 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.E;
        boolean z12 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, z11);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.E);
                z12 = false;
            }
            if (animatedAttachMenuBotIcon == null || (document = animatedAttachMenuBotIcon.icon) == null) {
                this.c.b();
            } else if (this.P != document.id) {
                this.c.l(ImageLocation.getForDocument(document), "24_24_lastframe", ImageLocation.getForDocument(document), "24_24_lastframe", z12 ? null : DocumentObject.getSvgThumb(document, j6.a7, 1.0f), this.E);
                this.P = document.id;
            }
            f();
            return;
        }
        a aVar = this.y;
        if (aVar == null) {
            return;
        }
        int i10 = aVar.b;
        int i11 = aVar.a;
        int i12 = aVar.c;
        aj0 aj0Var = this.b;
        if (i12 != -1) {
            aj0Var.setImageResource(i12);
            f();
            return;
        }
        int i13 = z11 ? i11 : i10;
        if (aVar.d != -1) {
            boolean z13 = this.N != z11;
            if (this.O != i13) {
                this.O = i13;
                aj0Var.f(i13, 24, 24, null);
                z13 = true;
            }
            if (z13) {
                xi0 animatedDrawable = aj0Var.getAnimatedDrawable();
                if (animatedDrawable == null) {
                    return;
                }
                if (z11) {
                    animatedDrawable.N(this.y.d);
                    if (animatedDrawable.b0 >= this.y.e - 2) {
                        animatedDrawable.L(0, false, false);
                    }
                    int i14 = animatedDrawable.b0;
                    int i15 = this.y.d;
                    if (i14 <= i15) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.K(i15);
                    }
                } else {
                    int i16 = animatedDrawable.b0;
                    a aVar2 = this.y;
                    if (i16 >= aVar2.d - 1) {
                        animatedDrawable.N(aVar2.e - 1);
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.N(0);
                        animatedDrawable.K(0);
                    }
                }
            }
            this.N = z11;
            return;
        }
        if (i11 != i10) {
            if (this.O != i13) {
                this.O = i13;
                aj0Var.f(i13, 24, 24, null);
                aj0Var.getAnimatedDrawable().h = false;
                if (!z10) {
                    aj0Var.getAnimatedDrawable().Q(0.99f, true);
                    return;
                } else {
                    aj0Var.getAnimatedDrawable().K(0);
                    aj0Var.d();
                    return;
                }
            }
            return;
        }
        if (aj0Var.getAnimatedDrawable() == null) {
            aj0Var.f(this.y.a, 24, 24, null);
        }
        xi0 animatedDrawable2 = aj0Var.getAnimatedDrawable();
        if (animatedDrawable2 == null) {
            return;
        }
        int[] iArr = animatedDrawable2.e;
        if (this.N != z11) {
            this.N = z11;
            if (z11) {
                animatedDrawable2.h = false;
                animatedDrawable2.K(0);
                animatedDrawable2.N(iArr[0]);
            } else {
                animatedDrawable2.h = true;
                animatedDrawable2.K(iArr[0]);
                animatedDrawable2.N(0);
            }
            aj0Var.d();
        }
    }

    public final float c() {
        float measureText = this.F.measureText(this.a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), p.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f.q(str, z11, true);
        this.n.a(!TextUtils.isEmpty(str), z11);
        this.r.a(z10, z11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = this.G ? this.H : getWidth();
        float f7 = this.I ? this.J : this.h.e;
        RectF rectF = V;
        Paint paint = this.e;
        if (f7 > 0.0f && !this.K) {
            paint.setColor(j6.l1(ke.a.a.getInterpolation(f7) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = p.a(this.S, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        float f10 = (this.x ? 1.0f : this.n.e) * this.S;
        boolean z10 = f10 > 0.0f;
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (f10 > 0.0f) {
            canvas.save();
            float dpf2 = AndroidUtilities.dpf2(1.33f);
            float dpf22 = AndroidUtilities.dpf2(11.0f) + (width / 2.0f);
            float dpf23 = AndroidUtilities.dpf2(10.0f);
            float dpf24 = AndroidUtilities.dpf2(16.0f);
            p6 p6Var = this.f;
            float max = Math.max(dpf24, p6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f11 = max / 2.0f;
            float f12 = dpf24 / 2.0f;
            rectF.set((dpf22 - f11) - dpf2, (dpf23 - f12) - dpf2, f11 + dpf22 + dpf2, f12 + dpf23 + dpf2);
            canvas.scale(f10, f10, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, j6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.x) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                d1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, d1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.L.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.r.e, j6.w0(null, j6.hl, false), j6.w0(null, j6.r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                p6Var.m(rectF);
                p6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z10) {
            canvas.restore();
        }
    }

    public final void e(boolean z10, boolean z11) {
        this.h.a(z10, z11);
        a(z11);
        this.a.setTypeface(z10 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_EXTRA_BOLD) : AndroidUtilities.bold());
    }

    public final void f() {
        int i10 = this.w;
        int i11 = this.s;
        le.b bVar = this.h;
        int d = i0.a.d(bVar.e, i10, i11);
        int d10 = i0.a.d(bVar.e, this.w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        x9 x9Var = this.c;
        if (x9Var != null && this.M) {
            x9Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(d10);
    }

    public x9 getBackupImageView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.Q) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) c()) + this.R, TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.G) {
            float measuredWidth = (this.H - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        aj0 aj0Var = this.b;
        aj0Var.setScaleX(f7);
        aj0Var.setScaleY(f7);
        x9 x9Var = this.c;
        if (x9Var != null) {
            x9Var.setScaleX(f7);
            this.c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.y = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float dp = AndroidUtilities.dp(f7);
        TextView textView = this.a;
        if (textView.getTextSize() != dp) {
            textView.setTextSize(1, f7);
            this.F.setTextSize(dp);
        }
    }

    public void setVisualWidth(float f7) {
        this.G = true;
        if (this.H != f7) {
            this.H = f7;
            float measuredWidth = (f7 - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}

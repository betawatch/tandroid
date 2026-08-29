package zg;

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
import cg.s1;
import i7.f6;
import i7.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.og0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements og0, vd.b {
    public static final RectF R = new RectF();
    public TLRPC.TL_attachMenuBot A;
    public final TextPaint B;
    public boolean C;
    public float D;
    public boolean E;
    public float F;
    public boolean G;
    public Drawable H;
    public boolean I;
    public boolean J;
    public int K;
    public long L;
    public boolean M;
    public int N;
    public float O;
    public TextPaint P;
    public e9 Q;
    public final TextView a;
    public final aj0 b;
    public t9 c;
    public c6 d;
    public final Paint e;
    public final n6 f;
    public final vd.a h;
    public final vd.a n;
    public final vd.a r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public a y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new vd.a(0, this, ud.a.a, 320L, false);
        jr jrVar = jr.h;
        this.n = new vd.a(1, this, jrVar, 380L, false);
        this.r = new vd.a(2, this, jrVar, 380L, false);
        this.O = 1.0f;
        aj0 aj0Var = new aj0(context);
        this.b = aj0Var;
        addView(aj0Var, f6.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        aj0Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.B = new TextPaint(textView.getPaint());
        addView(textView, f6.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        n6 n6Var = new n6(false, false, false, false);
        this.f = n6Var;
        n6Var.u(AndroidUtilities.bold());
        n6Var.setCallback(this);
        n6Var.b = 17;
        n6Var.r(-1);
        n6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, c6 c6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = c6Var;
        bVar.y = aVar;
        bVar.a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.b.setLayoutParams(f6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = g6.v0(g6.cl, c6Var);
        bVar.s = g6.v0(g6.al, c6Var);
        bVar.v = g6.v0(g6.bl, c6Var);
        bVar.f();
        return bVar;
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    public final void a(boolean z10) {
        TLRPC.Document document;
        boolean z11 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.A;
        boolean z12 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, z11);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.A);
                z12 = false;
            }
            if (animatedAttachMenuBotIcon == null || (document = animatedAttachMenuBotIcon.icon) == null) {
                this.c.b();
            } else if (this.L != document.id) {
                this.c.l(ImageLocation.getForDocument(document), "24_24_lastframe", ImageLocation.getForDocument(document), "24_24_lastframe", z12 ? null : DocumentObject.getSvgThumb(document, g6.a7, 1.0f), this.A);
                this.L = document.id;
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
            boolean z13 = this.J != z11;
            if (this.K != i13) {
                this.K = i13;
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
                    if (animatedDrawable.X >= this.y.e - 2) {
                        animatedDrawable.L(0, false, false);
                    }
                    int i14 = animatedDrawable.X;
                    int i15 = this.y.d;
                    if (i14 <= i15) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.K(i15);
                    }
                } else {
                    int i16 = animatedDrawable.X;
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
            this.J = z11;
            return;
        }
        if (i11 != i10) {
            if (this.K != i13) {
                this.K = i13;
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
        if (this.J != z11) {
            this.J = z11;
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
        float measureText = this.B.measureText(this.a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), w.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f.q(str, z11, true);
        this.n.a(!TextUtils.isEmpty(str), z11);
        this.r.a(z10, z11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = this.C ? this.D : getWidth();
        float f9 = this.E ? this.F : this.h.e;
        RectF rectF = R;
        Paint paint = this.e;
        if (f9 > 0.0f && !this.G) {
            paint.setColor(g6.l1(ud.a.a.getInterpolation(f9) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = w.a(this.O, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f9);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        float f10 = (this.x ? 1.0f : this.n.e) * this.O;
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
            n6 n6Var = this.f;
            float max = Math.max(dpf24, n6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f11 = max / 2.0f;
            float f12 = dpf24 / 2.0f;
            rectF.set((dpf22 - f11) - dpf2, (dpf23 - f12) - dpf2, f11 + dpf22 + dpf2, f12 + dpf23 + dpf2);
            canvas.scale(f10, f10, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, g6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.x) {
                if (this.H == null) {
                    this.H = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                s1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, s1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.H.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.H.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.r.e, g6.w0(null, g6.hl, false), g6.w0(null, g6.r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                n6Var.m(rectF);
                n6Var.draw(canvas);
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
        vd.a aVar = this.h;
        int d = i0.a.d(aVar.e, i10, i11);
        int d10 = i0.a.d(aVar.e, this.w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        t9 t9Var = this.c;
        if (t9Var != null && this.I) {
            t9Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(d10);
    }

    public t9 getBackupImageView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.M) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) c()) + this.N, TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.C) {
            float measuredWidth = (this.D - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.N = i10;
        this.M = true;
    }

    public void setAttachScale(float f9) {
        TextView textView = this.a;
        textView.setScaleX(f9);
        textView.setScaleY(f9);
        aj0 aj0Var = this.b;
        aj0Var.setScaleX(f9);
        aj0Var.setScaleY(f9);
        t9 t9Var = this.c;
        if (t9Var != null) {
            t9Var.setScaleX(f9);
            this.c.setScaleY(f9);
        }
        this.O = f9;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.y = aVar;
        this.A = null;
        this.K = 0;
        this.L = 0L;
        this.b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextSizeDp(float f9) {
        float dp = AndroidUtilities.dp(f9);
        TextView textView = this.a;
        if (textView.getTextSize() != dp) {
            textView.setTextSize(1, f9);
            this.B.setTextSize(dp);
        }
    }

    public void setVisualWidth(float f9) {
        this.C = true;
        if (this.D != f9) {
            this.D = f9;
            float measuredWidth = (f9 - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}

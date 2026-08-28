package wg;

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
import g7.e6;
import g7.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.og0;
import zf.a1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements og0, td.b {
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
    public z8 Q;
    public final TextView a;
    public final pi0 b;
    public o9 c;
    public b6 d;
    public final Paint e;
    public final i6 f;
    public final td.a h;
    public final td.a n;
    public final td.a r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public a y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new td.a(0, this, sd.a.a, 320L, false);
        gr grVar = gr.h;
        this.n = new td.a(1, this, grVar, 380L, false);
        this.r = new td.a(2, this, grVar, 380L, false);
        this.O = 1.0f;
        pi0 pi0Var = new pi0(context);
        this.b = pi0Var;
        addView(pi0Var, e6.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        pi0Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.B = new TextPaint(textView.getPaint());
        addView(textView, e6.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        i6 i6Var = new i6(false, false, false, false);
        this.f = i6Var;
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(this);
        i6Var.b = 17;
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, b6 b6Var, a aVar, int i9) {
        b bVar = new b(context);
        bVar.d = b6Var;
        bVar.y = aVar;
        bVar.a.setText(LocaleController.getString(i9));
        bVar.a(false);
        bVar.b.setLayoutParams(e6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = f6.v0(f6.cl, b6Var);
        bVar.s = f6.v0(f6.al, b6Var);
        bVar.v = f6.v0(f6.bl, b6Var);
        bVar.f();
        return bVar;
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
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
                this.c.l(ImageLocation.getForDocument(document), "24_24_lastframe", ImageLocation.getForDocument(document), "24_24_lastframe", z12 ? null : DocumentObject.getSvgThumb(document, f6.a7, 1.0f), this.A);
                this.L = document.id;
            }
            f();
            return;
        }
        a aVar = this.y;
        if (aVar == null) {
            return;
        }
        int i9 = aVar.b;
        int i10 = aVar.a;
        int i11 = aVar.c;
        pi0 pi0Var = this.b;
        if (i11 != -1) {
            pi0Var.setImageResource(i11);
            f();
            return;
        }
        int i12 = z11 ? i10 : i9;
        if (aVar.d != -1) {
            boolean z13 = this.J != z11;
            if (this.K != i12) {
                this.K = i12;
                pi0Var.f(i12, 24, 24, null);
                z13 = true;
            }
            if (z13) {
                mi0 animatedDrawable = pi0Var.getAnimatedDrawable();
                if (animatedDrawable == null) {
                    return;
                }
                if (z11) {
                    animatedDrawable.N(this.y.d);
                    if (animatedDrawable.X >= this.y.e - 2) {
                        animatedDrawable.L(0, false, false);
                    }
                    int i13 = animatedDrawable.X;
                    int i14 = this.y.d;
                    if (i13 <= i14) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.K(i14);
                    }
                } else {
                    int i15 = animatedDrawable.X;
                    a aVar2 = this.y;
                    if (i15 >= aVar2.d - 1) {
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
        if (i10 != i9) {
            if (this.K != i12) {
                this.K = i12;
                pi0Var.f(i12, 24, 24, null);
                pi0Var.getAnimatedDrawable().h = false;
                if (!z10) {
                    pi0Var.getAnimatedDrawable().Q(0.99f, true);
                    return;
                } else {
                    pi0Var.getAnimatedDrawable().K(0);
                    pi0Var.d();
                    return;
                }
            }
            return;
        }
        if (pi0Var.getAnimatedDrawable() == null) {
            pi0Var.f(this.y.a, 24, 24, null);
        }
        mi0 animatedDrawable2 = pi0Var.getAnimatedDrawable();
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
            pi0Var.d();
        }
    }

    public final float c() {
        float measureText = this.B.measureText(this.a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), n.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f.q(str, z11, true);
        this.n.a(!TextUtils.isEmpty(str), z11);
        this.r.a(z10, z11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = this.C ? this.D : getWidth();
        float f10 = this.E ? this.F : this.h.e;
        RectF rectF = R;
        Paint paint = this.e;
        if (f10 > 0.0f && !this.G) {
            paint.setColor(f6.l1(sd.a.a.getInterpolation(f10) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = n.a(this.O, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        float f11 = (this.x ? 1.0f : this.n.e) * this.O;
        boolean z10 = f11 > 0.0f;
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (f11 > 0.0f) {
            canvas.save();
            float dpf2 = AndroidUtilities.dpf2(1.33f);
            float dpf22 = AndroidUtilities.dpf2(11.0f) + (width / 2.0f);
            float dpf23 = AndroidUtilities.dpf2(10.0f);
            float dpf24 = AndroidUtilities.dpf2(16.0f);
            i6 i6Var = this.f;
            float max = Math.max(dpf24, i6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f12 = max / 2.0f;
            float f13 = dpf24 / 2.0f;
            rectF.set((dpf22 - f12) - dpf2, (dpf23 - f13) - dpf2, f12 + dpf22 + dpf2, f13 + dpf23 + dpf2);
            canvas.scale(f11, f11, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, f6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.x) {
                if (this.H == null) {
                    this.H = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                a1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, a1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.H.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.H.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.r.e, f6.w0(null, f6.hl, false), f6.w0(null, f6.r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                i6Var.m(rectF);
                i6Var.draw(canvas);
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
        int i9 = this.w;
        int i10 = this.s;
        td.a aVar = this.h;
        int d = i0.a.d(aVar.e, i9, i10);
        int d9 = i0.a.d(aVar.e, this.w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        o9 o9Var = this.c;
        if (o9Var != null && this.I) {
            o9Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(d9);
    }

    public o9 getBackupImageView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.M) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) c()) + this.N, TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i9, i10);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (this.C) {
            float measuredWidth = (this.D - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i9) {
        this.N = i9;
        this.M = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        pi0 pi0Var = this.b;
        pi0Var.setScaleX(f10);
        pi0Var.setScaleY(f10);
        o9 o9Var = this.c;
        if (o9Var != null) {
            o9Var.setScaleX(f10);
            this.c.setScaleY(f10);
        }
        this.O = f10;
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

    public void setTextSizeDp(float f10) {
        float dp = AndroidUtilities.dp(f10);
        TextView textView = this.a;
        if (textView.getTextSize() != dp) {
            textView.setTextSize(1, f10);
            this.B.setTextSize(dp);
        }
    }

    public void setVisualWidth(float f10) {
        this.C = true;
        if (this.D != f10) {
            this.D = f10;
            float measuredWidth = (f10 - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}

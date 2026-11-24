// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v94 extends FrameLayout implements vlb {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public float I;
    public final ylb J;
    public boolean K;
    public int L;
    public int M;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final mu8 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int x;
    public final Paint y;

    public v94(int i, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.x = z8c.t0;
        this.y = new Paint(1);
        this.a = z2;
        this.J = ylbVar;
        TextView textView = new TextView(context);
        this.b = textView;
        td4.x(textView, cmb.Jf, ylbVar, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z ? qoe.i(-2.0f, -2.0f, 8388659, i, 8.0f, 40.0f, 0.0f) : qoe.d(-2, -2.0f, 51, i, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.X(textView2, cmb.Nf, ylbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z ? qoe.i(-2.0f, -2.0f, 8388659, i, 30.0f, 100.0f, 0.0f) : qoe.d(-2, -2.0f, 51, i, 30.0f, 100.0f, 0.0f));
        if (z2) {
            mu8 mu8Var = new mu8(context);
            this.d = mu8Var;
            anb.X(mu8Var, cmb.Ii, ylbVar);
            mu8Var.setText(jb6.M0(2131754483, null));
            addView(mu8Var, z ? qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : qoe.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            td4.x(textView3, cmb.Hi, ylbVar, 1, 14.0f);
            textView3.setText(jb6.M0(2131744544, null));
            addView(textView3, z ? qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : qoe.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, bnb bnbVar) {
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Di));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Ei));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Gi));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.p6));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Nf));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.Ji));
    }

    public final void b(boolean z, boolean z2) {
        if (this.a) {
            this.d.a(z, z2);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z, boolean z2, int i, int i2, boolean z3) {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (this.f != stickerSetCovered) {
            this.I = z ? 1.0f : 0.0f;
            invalidate();
        }
        this.f = stickerSetCovered;
        this.E = i;
        this.F = i2;
        TextView textView = this.b;
        if (i2 == 0) {
            textView.setText(stickerSetCovered.set.title);
        } else if (i2 != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f.set.title);
            try {
                do4 do4Var = new do4(cmb.p6, this.J);
                int i3 = this.E;
                spannableStringBuilder.setSpan(do4Var, i3, this.F + i3, 33);
            } catch (Exception unused) {
            }
            textView.setText(spannableStringBuilder);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z4 = stickerSet.emojis;
        int i4 = stickerSet.count;
        TextView textView2 = this.c;
        if (z4) {
            textView2.setText(jb6.G(i4, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(jb6.G(i4, "Stickers", new Object[0]));
        }
        this.w = z;
        if (this.a) {
            boolean z5 = this.s;
            mu8 mu8Var = this.d;
            if (!z5) {
                mu8Var.setVisibility(8);
                return;
            }
            mu8Var.setVisibility(0);
            boolean z6 = z3 || hs6.d0(this.x).D0(stickerSetCovered.set.id, true);
            this.r = z6;
            TextView textView3 = this.e;
            if (!z2) {
                if (z6) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    mu8Var.setVisibility(4);
                    mu8Var.setAlpha(0.0f);
                    mu8Var.setScaleX(0.0f);
                    mu8Var.setScaleY(0.0f);
                    return;
                }
                mu8Var.setVisibility(0);
                mu8Var.setAlpha(1.0f);
                mu8Var.setScaleX(1.0f);
                mu8Var.setScaleY(1.0f);
                textView3.setVisibility(4);
                textView3.setAlpha(0.0f);
                textView3.setScaleX(0.0f);
                textView3.setScaleY(0.0f);
                return;
            }
            if (z6) {
                textView3.setVisibility(0);
            } else {
                mu8Var.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.h = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.h;
            float[] fArr = {this.r ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr);
            float[] fArr2 = {this.r ? 1.0f : 0.0f};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr2);
            float[] fArr3 = {this.r ? 1.0f : 0.0f};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(mu8Var, (Property<mu8, Float>) property, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(mu8Var, (Property<mu8, Float>) property2, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(mu8Var, (Property<mu8, Float>) property3, this.r ? 0.0f : 1.0f));
            this.h.addListener(new t94(this));
            this.h.setInterpolator(new OvershootInterpolator(1.02f));
            this.h.start();
        }
    }

    public final void d(int i, CharSequence charSequence) {
        this.G = charSequence;
        this.H = i;
        ylb ylbVar = this.J;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G);
            try {
                spannableStringBuilder.setSpan(new u94(cmb.p6, ylbVar), 0, this.H, 33);
                spannableStringBuilder.setSpan(new u94(cmb.Nf, ylbVar), this.H, this.G.length(), 33);
            } catch (Exception unused) {
            }
            this.c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z = this.w;
        float f = this.I;
        ylb ylbVar = this.J;
        if (!z) {
            if (f != 0.0f) {
                if (f != 0.0f) {
                    float f2 = f - 0.16f;
                    this.I = f2;
                    if (f2 < 0.0f) {
                        this.I = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            if (this.n) {
                return;
            }
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, cmb.U0("paintDivider", ylbVar));
            return;
        }
        if (f != 1.0f) {
            float f3 = f + 0.16f;
            this.I = f3;
            if (f3 > 1.0f) {
                this.I = 1.0f;
            } else {
                invalidate();
            }
        }
        int v0 = cmb.v0(cmb.Ji, ylbVar);
        Paint paint = this.y;
        paint.setColor(v0);
        canvas.drawCircle(gm.L(12.0f) + this.b.getRight(), gm.L(20.0f), gm.L(4.0f) * this.I, paint);
        if (this.n) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), TLObject.FLAG_30));
        if (this.a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = wi8.g(measuredWidth, measuredWidth2, 2, gm.L(14.0f));
            } else {
                layoutParams.rightMargin = gm.L(14.0f);
            }
            measureChildWithMargins(this.b, i, measuredWidth, i2, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.a) {
            this.s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z) {
        this.n = z;
    }

    @Override // vlb
    public final void updateColors() {
        mu8 mu8Var;
        if (this.a && (mu8Var = this.d) != null) {
            int i = cmb.Di;
            ylb ylbVar = this.J;
            mu8Var.setProgressColor(cmb.v0(i, ylbVar));
            int v0 = cmb.v0(cmb.Ei, ylbVar);
            int v02 = cmb.v0(cmb.Gi, ylbVar);
            if (!this.K || this.L != v0 || this.M != v02) {
                this.K = true;
                this.L = v0;
                this.M = v02;
                mu8Var.setBackground(ulb.e(v0, 14.0f));
            }
            mu8Var.invalidate();
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}

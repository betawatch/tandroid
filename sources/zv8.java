// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zv8 extends FrameLayout implements vlb {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public fda d;
    public Drawable e;
    public final jh2 f;
    public boolean h;
    public boolean n;
    public int r;
    public final /* synthetic */ ProxyListActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv8(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        this.s = proxyListActivity;
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-2, -2.0f, (z ? 5 : 3) | 48, z ? 56 : 21, 10.0f, z ? 21 : 56, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(gm.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = jb6.a0;
        addView(textView2, qoe.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 56 : 21, 35.0f, z2 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        anb.s(imageView, cmb.z6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(jb6.M0(2131751272, null));
        addView(imageView, qoe.d(48, 48.0f, (jb6.a0 ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new wk8(this, (byte) 6));
        jh2 jh2Var = new jh2(21, null, context);
        this.f = jh2Var;
        jh2Var.b(cmb.h7, cmb.f7, cmb.j7);
        jh2Var.setDrawBackgroundAsArc(14);
        jh2Var.setVisibility(8);
        addView(jh2Var, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        if (this.n == z && z2) {
            return;
        }
        this.n = z;
        float L = jb6.a0 ? -gm.L(32.0f) : gm.L(32.0f);
        float f = 0.0f;
        float f2 = 1.0f;
        if (z2) {
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(200L);
            duration.setInterpolator(d53.f);
            duration.addUpdateListener(new go1(this, L, (byte) 6));
            duration.addListener(new jf4((byte) 27, this, z));
            duration.start();
            return;
        }
        if (!z) {
            L = 0.0f;
        }
        this.a.setTranslationX(L);
        this.b.setTranslationX(L);
        ImageView imageView = this.c;
        imageView.setTranslationX(L);
        boolean z3 = jb6.a0;
        int L2 = gm.L(32.0f);
        if (!z3) {
            L2 = -L2;
        }
        jh2 jh2Var = this.f;
        jh2Var.setTranslationX(L2 + L);
        imageView.setVisibility(z ? 8 : 0);
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        jh2Var.setVisibility(z ? 0 : 8);
        jh2Var.setAlpha(1.0f);
        jh2Var.setScaleX(1.0f);
        jh2Var.setScaleY(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i;
        Drawable drawable;
        fda fdaVar = gda.x1;
        fda fdaVar2 = this.d;
        TextView textView = this.b;
        if (fdaVar == fdaVar2) {
            ProxyListActivity proxyListActivity = this.s;
            if (proxyListActivity.d) {
                int i2 = proxyListActivity.c;
                if (i2 == 3 || i2 == 5) {
                    i = cmb.r6;
                    if (fdaVar2.b != 0) {
                        textView.setText(jb6.M0(2131751749, null) + ", " + jb6.a0("Ping", null, 2131746969, Long.valueOf(this.d.b)));
                    } else {
                        textView.setText(jb6.M0(2131751749, null));
                    }
                    fda fdaVar3 = this.d;
                    if (!fdaVar3.c && !fdaVar3.d) {
                        fdaVar3.e = 0L;
                    }
                } else {
                    i = cmb.y6;
                    textView.setText(jb6.M0(2131751746, null));
                }
                this.r = cmb.w0(null, i, false);
                textView.setTag(Integer.valueOf(i));
                textView.setTextColor(this.r);
                drawable = this.e;
                if (drawable == null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (fdaVar2.c) {
            textView.setText(jb6.M0(2131752078, null));
            i = cmb.y6;
        } else if (fdaVar2.d) {
            if (fdaVar2.b != 0) {
                textView.setText(jb6.M0(2131753726, null) + ", " + jb6.a0("Ping", null, 2131746969, Long.valueOf(this.d.b)));
            } else {
                textView.setText(jb6.M0(2131753726, null));
            }
            i = cmb.v6;
        } else {
            textView.setText(jb6.M0(2131743600, null));
            i = cmb.o7;
        }
        this.r = cmb.w0(null, i, false);
        textView.setTag(Integer.valueOf(i));
        textView.setTextColor(this.r);
        drawable = this.e;
        if (drawable == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(jb6.a0 ? 0.0f : gm.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(20.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), wi8.E(64.0f, 1, TLObject.FLAG_30));
    }

    public void setChecked(boolean z) {
        TextView textView = this.b;
        if (!z) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable drawable = this.e;
        if (drawable == null) {
            drawable = getResources().getDrawable(R.drawable.proxy_check).mutate();
            this.e = drawable;
        }
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
        }
        boolean z2 = jb6.a0;
        Drawable drawable2 = this.e;
        if (z2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setProxy(fda fdaVar) {
        String str;
        bw8 bw8Var = fdaVar.a;
        if (bw8Var.a == 3) {
            str = b10.j(new StringBuilder(), bw8Var.b, " (WEB)");
        } else {
            str = bw8Var.b + ":" + fdaVar.a.c;
        }
        this.a.setText(str);
        this.d = fdaVar;
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // vlb
    public final void updateColors() {
        int w0;
        TextView textView = this.b;
        if (textView != null) {
            try {
                if (!(textView.getTag() instanceof Integer) || (w0 = cmb.w0(null, ((Integer) textView.getTag()).intValue(), false)) == this.r) {
                    return;
                }
                this.r = w0;
                textView.setTextColor(w0);
                Drawable drawable = this.e;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}

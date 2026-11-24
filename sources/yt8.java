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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yt8 extends FrameLayout implements tjb {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public fba d;
    public Drawable e;
    public final wf2 f;
    public boolean h;
    public boolean n;
    public int r;
    public final /* synthetic */ ProxyListActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt8(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        this.s = proxyListActivity;
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.F6, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        boolean z = k96.a0;
        addView(textView, nme.d(-2, -2.0f, (z ? 5 : 3) | 48, z ? 56 : 21, 10.0f, z ? 21 : 56, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(k96.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(gl.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = k96.a0;
        addView(textView2, nme.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 56 : 21, 35.0f, z2 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        zkb.s(imageView, bkb.z6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(k96.M0(2131751323, null));
        addView(imageView, nme.d(48, 48.0f, (k96.a0 ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new ik8(this, r7));
        wf2 wf2Var = new wf2(21, null, context);
        this.f = wf2Var;
        wf2Var.b(bkb.h7, bkb.f7, bkb.j7);
        wf2Var.setDrawBackgroundAsArc(14);
        wf2Var.setVisibility(8);
        addView(wf2Var, nme.d(24, 24.0f, (k96.a0 ? (byte) 5 : (byte) 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        if (this.n == z && z2) {
            return;
        }
        this.n = z;
        float L = k96.a0 ? -gl.L(32.0f) : gl.L(32.0f);
        float f = 0.0f;
        float f2 = 1.0f;
        if (z2) {
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(200L);
            duration.setInterpolator(s33.f);
            duration.addUpdateListener(new rm1(this, L, (byte) 6));
            duration.addListener(new id4((byte) 27, this, z));
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
        boolean z3 = k96.a0;
        int L2 = gl.L(32.0f);
        if (!z3) {
            L2 = -L2;
        }
        wf2 wf2Var = this.f;
        wf2Var.setTranslationX(L2 + L);
        imageView.setVisibility(z ? 8 : 0);
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        wf2Var.setVisibility(z ? 0 : 8);
        wf2Var.setAlpha(1.0f);
        wf2Var.setScaleX(1.0f);
        wf2Var.setScaleY(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i;
        Drawable drawable;
        fba fbaVar = gba.x1;
        fba fbaVar2 = this.d;
        TextView textView = this.b;
        if (fbaVar == fbaVar2) {
            ProxyListActivity proxyListActivity = this.s;
            if (proxyListActivity.d) {
                int i2 = proxyListActivity.c;
                if (i2 == 3 || i2 == 5) {
                    i = bkb.r6;
                    if (fbaVar2.b != 0) {
                        textView.setText(k96.M0(2131751800, null) + ", " + k96.a0("Ping", null, 2131747043, Long.valueOf(this.d.b)));
                    } else {
                        textView.setText(k96.M0(2131751800, null));
                    }
                    fba fbaVar3 = this.d;
                    if (!fbaVar3.c && !fbaVar3.d) {
                        fbaVar3.e = 0L;
                    }
                } else {
                    i = bkb.y6;
                    textView.setText(k96.M0(2131751797, null));
                }
                this.r = bkb.w0(null, i, false);
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
        if (fbaVar2.c) {
            textView.setText(k96.M0(2131752129, null));
            i = bkb.y6;
        } else if (fbaVar2.d) {
            if (fbaVar2.b != 0) {
                textView.setText(k96.M0(2131753758, null) + ", " + k96.a0("Ping", null, 2131747043, Long.valueOf(this.d.b)));
            } else {
                textView.setText(k96.M0(2131753758, null));
            }
            i = bkb.v6;
        } else {
            textView.setText(k96.M0(2131743674, null));
            i = bkb.o7;
        }
        this.r = bkb.w0(null, i, false);
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
        canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), ug8.E(64.0f, 1, TLObject.FLAG_30));
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
        boolean z2 = k96.a0;
        Drawable drawable2 = this.e;
        if (z2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setProxy(fba fbaVar) {
        String str;
        au8 au8Var = fbaVar.a;
        if (au8Var.a == 3) {
            str = b00.j(new StringBuilder(), au8Var.b, " (WEB)");
        } else {
            str = au8Var.b + ":" + fbaVar.a.c;
        }
        this.a.setText(str);
        this.d = fbaVar;
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // tjb
    public final void updateColors() {
        int w0;
        TextView textView = this.b;
        if (textView != null) {
            try {
                if (!(textView.getTag() instanceof Integer) || (w0 = bkb.w0(null, ((Integer) textView.getTag()).intValue(), false)) == this.r) {
                    return;
                }
                this.r = w0;
                textView.setTextColor(w0);
                Drawable drawable = this.e;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}

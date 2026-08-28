package yf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k0 extends LinearLayout {
    public final TextView a;
    public final vg.c b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final /* synthetic */ l0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, Context context) {
        super(context);
        this.r = l0Var;
        setOrientation(0);
        int i9 = f6.i6;
        mg.a aVar = l0Var.M1;
        setBackground(f6.f0(f6.v0(i9, aVar), 2, -1));
        vg.c cVar = new vg.c(this, context);
        this.b = cVar;
        addView(cVar, e6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i10 = f6.E8;
        imageView2.setColorFilter(f6.v0(i10, aVar));
        cVar.addView(this.c, e6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(f6.v0(i10, aVar));
        this.d.setVisibility(8);
        cVar.addView(this.d, e6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(f6.v0(i10, aVar));
        textView.setTextSize(1, 16.0f);
        addView(textView, e6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.h7, aVar), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, e6.n(50, -1));
    }

    public final void a(int i9, boolean z10, boolean z11) {
        if (!z11) {
            this.c.setImageResource(i9);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
            a(i9, false, false);
            return;
        }
        this.f = z10;
        this.d.setImageResource(i9);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new hg.y(12, this, z10));
        this.h.addListener(new te1(this, 10));
        this.h.setInterpolator(gr.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        l0 l0Var = this.r;
        org.telegram.ui.ActionBar.o1 o1Var = l0Var.N1;
        if (o1Var != null && o1Var.isShowing()) {
            l0Var.N1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i9) {
        a(i9, true, false);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.n.setVisibility(z10 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}

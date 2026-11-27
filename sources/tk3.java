// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tk3 extends LinearLayout {
    public float a;
    public Runnable b;
    public pt2 c;
    public boolean d;
    public ValueAnimator e;
    public final e29 f;
    public final TextView h;
    public final wmb n;
    public int r;
    public int s;
    public final int w;

    public tk3(Context context) {
        super(context);
        this.r = -1;
        this.w = yac.t0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new b02((byte) 6));
        e29 e29Var = new e29(context);
        this.f = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(e29Var, tre.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        e29Var.setOnClickListener(new mh3(this, (byte) 2));
        TextView textView = new TextView(context);
        this.h = textView;
        qd4.w(textView, aob.m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, tre.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        wmb wmbVar = new wmb(context);
        this.n = wmbVar;
        wmbVar.setFactory(new qk3(context, (byte) 0));
        wmbVar.setInAnimation(context, R.anim.alpha_in);
        wmbVar.setOutAnimation(context, R.anim.alpha_out);
        addView(wmbVar, tre.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z) {
            String M0 = ob6.M0(2131747960, null);
            if (hl.O1() && !hl.N1()) {
                M0 = M0.replace('\n', ' ');
            }
            this.n.a(M0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(dt3.d);
        this.e.addUpdateListener(new rk3(this, (byte) 0));
        this.e.addListener(new sk3(this, (byte) 1));
        this.e.start();
    }

    public final void b() {
        int i;
        int i2 = 0;
        if ((getParent() instanceof View) && (((i = this.r) == 2 || i == 3 || i == 4) && ((View) getParent()).getPaddingTop() != 0)) {
            i2 = 0 - (getTop() / 2);
        }
        int i3 = this.r;
        if (i3 == 0 || i3 == 1) {
            i2 -= (int) ((1.0f - this.a) * (a.getCurrentActionBarHeight() / 2.0f));
        }
        float f = i2;
        this.f.setTranslationY(f);
        this.h.setTranslationY(f);
        this.n.setTranslationY(f);
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        int i3 = this.r;
        if (i3 == 0 || i3 == 1) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = View.MeasureSpec.getSize(i2);
            }
            if (size == 0) {
                size = (hl.q.y - a.getCurrentActionBarHeight()) - hl.m;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((hl.L(320.0f) - size) * this.a) + size), TLObject.FLAG_30));
            return;
        }
        if (i3 != 2 && i3 != 3 && i3 != 4) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(166.0f), TLObject.FLAG_30));
            return;
        }
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size2 = view2.getMeasuredHeight();
            if (view2.getPaddingTop() != 0) {
                size2 -= hl.m;
            }
        } else {
            size2 = View.MeasureSpec.getSize(i2);
        }
        if (size2 == 0) {
            size2 = (hl.q.y - a.getCurrentActionBarHeight()) - hl.m;
        }
        if (getParent() instanceof sl0) {
            size2 -= ((sl0) getParent()).f3;
        }
        ArrayList arrayList = uc7.s1(this.w).s;
        if (!arrayList.isEmpty()) {
            size2 = ik8.B(50.0f, (arrayList.size() + (arrayList.size() * hl.L(72.0f))) - 1, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(pt2 pt2Var) {
        this.c = pt2Var;
    }
}

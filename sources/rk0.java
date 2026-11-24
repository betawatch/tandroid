// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rk0 extends FrameLayout implements gk7, tjb {
    public boolean E;
    public int F;
    public int G;
    public TextView a;
    public TextView b;
    public yc c;
    public yc d;
    public ty8 e;
    public ScrollView f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate n;
    public String r;
    public int s;
    public int w;
    public GradientDrawable x;
    public GradientDrawable y;

    public final void a(boolean z) {
        yc ycVar = this.d;
        TextView textView = this.b;
        yc ycVar2 = this.c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        byte b = 5;
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z) {
            ycVar2.setVisibility(0);
            ycVar.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(ycVar2, (Property<yc, Float>) property3, 1.0f), ObjectAnimator.ofFloat(ycVar2, (Property<yc, Float>) property2, 1.0f), ObjectAnimator.ofFloat(ycVar2, (Property<yc, Float>) property, 1.0f));
        } else {
            textView.setVisibility(0);
            ycVar.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(ycVar2, (Property<yc, Float>) property3, 0.1f), ObjectAnimator.ofFloat(ycVar2, (Property<yc, Float>) property2, 0.1f), ObjectAnimator.ofFloat(ycVar2, (Property<yc, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f));
        }
        this.h.addListener(new y7(b, this, z));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.X1) {
            String str = (String) objArr[0];
            String str2 = this.r;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            a(false);
            a.a.u((Activity) getContext(), this.n.document);
            return;
        }
        if (i == kk7.Y1) {
            String str3 = (String) objArr[0];
            String str4 = this.r;
            if (str4 == null || !str4.equals(str3)) {
                return;
            }
            a(false);
            return;
        }
        if (i == kk7.W1) {
            String str5 = (String) objArr[0];
            String str6 = this.r;
            if (str6 == null || !str6.equals(str5)) {
                return;
            }
            this.e.e(true, Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.x;
        ScrollView scrollView = this.f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), gl.L(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.y;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - gl.L(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            kk7.f(this.s).n(this, kk7.X1);
            kk7.f(this.s).n(this, kk7.Y1);
            kk7.f(this.s).n(this, kk7.W1);
        }
    }

    @Override // tjb
    public final void updateColors() {
        GradientDrawable gradientDrawable = this.y;
        GradientDrawable gradientDrawable2 = this.x;
        try {
            int w0 = bkb.w0(null, bkb.c6, false);
            if (!this.E || w0 != this.F) {
                this.F = w0;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setColors(new int[]{w0, 0});
                }
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(new int[]{w0, 0});
                }
            }
            int w02 = bkb.w0(null, bkb.r8, false);
            ScrollView scrollView = this.f;
            if (scrollView != null && (!this.E || w02 != this.G)) {
                this.G = w02;
                gl.u3(scrollView, w02);
            }
            this.E = true;
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}

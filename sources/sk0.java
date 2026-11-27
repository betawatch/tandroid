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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sk0 extends FrameLayout implements fn7, snb {
    public boolean E;
    public int F;
    public int G;
    public TextView a;
    public TextView b;
    public zc c;
    public zc d;
    public g29 e;
    public ScrollView f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate n;
    public String r;
    public int s;
    public int w;
    public GradientDrawable x;
    public GradientDrawable y;

    public final void a(boolean z) {
        zc zcVar = this.d;
        TextView textView = this.b;
        zc zcVar2 = this.c;
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
            zcVar2.setVisibility(0);
            zcVar.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(zcVar2, (Property<zc, Float>) property3, 1.0f), ObjectAnimator.ofFloat(zcVar2, (Property<zc, Float>) property2, 1.0f), ObjectAnimator.ofFloat(zcVar2, (Property<zc, Float>) property, 1.0f));
        } else {
            textView.setVisibility(0);
            zcVar.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(zcVar2, (Property<zc, Float>) property3, 0.1f), ObjectAnimator.ofFloat(zcVar2, (Property<zc, Float>) property2, 0.1f), ObjectAnimator.ofFloat(zcVar2, (Property<zc, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f));
        }
        this.h.addListener(new z7(b, this, z));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.Y1) {
            String str = (String) objArr[0];
            String str2 = this.r;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            a(false);
            a.a.u((Activity) getContext(), this.n.document);
            return;
        }
        if (i == jn7.Z1) {
            String str3 = (String) objArr[0];
            String str4 = this.r;
            if (str4 == null || !str4.equals(str3)) {
                return;
            }
            a(false);
            return;
        }
        if (i == jn7.X1) {
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
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), hl.L(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.y;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - hl.L(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            jn7.f(this.s).n(this, jn7.Y1);
            jn7.f(this.s).n(this, jn7.Z1);
            jn7.f(this.s).n(this, jn7.X1);
        }
    }

    @Override // snb
    public final void updateColors() {
        GradientDrawable gradientDrawable = this.y;
        GradientDrawable gradientDrawable2 = this.x;
        try {
            int w0 = aob.w0(null, aob.d6, false);
            if (!this.E || w0 != this.F) {
                this.F = w0;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setColors(new int[]{w0, 0});
                }
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(new int[]{w0, 0});
                }
            }
            int w02 = aob.w0(null, aob.s8, false);
            ScrollView scrollView = this.f;
            if (scrollView != null && (!this.E || w02 != this.G)) {
                this.G = w02;
                hl.u3(scrollView, w02);
            }
            this.E = true;
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}

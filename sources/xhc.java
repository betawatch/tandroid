// default package

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xhc extends FrameLayout {
    public TextView[] a;
    public TextView b;
    public FrameLayout c;
    public bic d;
    public CharSequence e;
    public boolean f;
    public ValueAnimator h;
    public boolean n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(gl.L(15.0f));
        view2.setAlpha(0.0f);
        this.f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new vhc(view2, view, (byte) 0));
        this.h.addListener(new ga2((Object) this, (Object) view, (Object) view2, (Object) runnable, (byte) 5));
        this.h.setDuration(250L).setInterpolator(s33.f);
        this.h.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(String str, boolean z, boolean z2) {
        View view = this.d;
        TextView[] textViewArr = this.a;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new s0(textViewArr), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            str = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z2 = false;
        }
        if (!z2) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f = false;
            textViewArr[0].setText(str);
            textViewArr[0].setVisibility(0);
            textViewArr[1].setVisibility(8);
            view.setVisibility(8);
            return;
        }
        if (this.f) {
            this.e = str;
            return;
        }
        if (this.n) {
            textViewArr[0].setText(str);
            a(view, textViewArr[0], null);
        } else {
            if (textViewArr[0].getText().equals(str)) {
                return;
            }
            textViewArr[1].setText(str);
            a(textViewArr[0], textViewArr[1], new kbc(this, (byte) 15));
        }
    }

    public final void c(boolean z) {
        FrameLayout frameLayout = this.c;
        if (!z) {
            if (frameLayout.getVisibility() == 8) {
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(s33.f).setListener(new whc(this, (byte) 1)).setDuration(300L).start();
        } else if (frameLayout.getVisibility() != 0) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(0.0f);
            frameLayout.setScaleY(0.6f);
            frameLayout.setScaleX(0.6f);
            frameLayout.animate().setListener(null).cancel();
            ug8.t(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), s33.k, 300L);
        }
    }

    public final void d(boolean z, boolean z2) {
        TextView textView = this.b;
        if (!z2) {
            textView.animate().setListener(null).cancel();
            textView.setVisibility(z ? 0 : 8);
        } else {
            if (!z) {
                textView.animate().alpha(0.0f).setListener(new whc(this, (byte) 0)).setDuration(150L).start();
                return;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    public final void e(boolean z) {
        bic bicVar = this.d;
        TextView[] textViewArr = this.a;
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z = false;
        }
        if (this.n) {
            return;
        }
        bicVar.a();
        if (z) {
            if (this.f) {
                this.e = "timer";
                return;
            } else {
                this.n = true;
                a(textViewArr[0], bicVar, null);
                return;
            }
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = true;
        this.f = false;
        textViewArr[0].setVisibility(8);
        textViewArr[1].setVisibility(8);
        bicVar.setVisibility(0);
    }

    public void setSignalBarCount(int i) {
        this.d.setSignalBarCount(i);
    }
}

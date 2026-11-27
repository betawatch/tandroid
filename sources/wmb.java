// default package

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class wmb extends ViewSwitcher {
    public final void a(CharSequence charSequence, boolean z, boolean z2) {
        if (z2 || !TextUtils.equals(charSequence, getCurrentView().getText())) {
            if (!z) {
                getCurrentView().setText(charSequence);
            } else {
                getNextView().setText(charSequence);
                showNext();
            }
        }
    }

    @Override // android.widget.ViewSwitcher, android.widget.ViewAnimator, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof TextView) {
            super.addView(view, i, layoutParams);
        } else {
            iy8.d();
        }
    }

    @Override // android.widget.ViewAnimator
    public TextView getCurrentView() {
        return (TextView) super.getCurrentView();
    }

    @Override // android.widget.ViewSwitcher
    public TextView getNextView() {
        return (TextView) super.getNextView();
    }

    public void setText(CharSequence charSequence) {
        a(charSequence, true, false);
    }
}

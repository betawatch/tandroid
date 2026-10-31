package th;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ i5 d;

    public g5(i5 i5Var, TextView textView, View view, TextView textView2) {
        this.d = i5Var;
        this.a = textView;
        this.b = view;
        this.c = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.a;
        textView.getLocationOnScreen(iArr);
        int L = org.telegram.messenger.i0.L(24.0f) + iArr[1];
        int measuredHeight = this.b.getMeasuredHeight();
        i5 i5Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(w7.b6.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(w7.b6.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            i5Var.requestLayout();
        }
        i5Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

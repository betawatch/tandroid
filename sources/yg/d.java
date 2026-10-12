package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class d extends FrameLayout {
    public final c6 a;
    public final TextView b;

    public d(Context context, c6 c6Var) {
        super(context);
        this.a = c6Var;
        setBackgroundColor(g6.w0(g6.e7, c6Var));
        TextView textView = new TextView(getContext());
        this.b = textView;
        k3.m(14.0f, 1, textView);
        textView.setTextColor(g6.w0(g6.f7, c6Var));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, a6.a(-1.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(g6.w0(i10, this.a));
    }
}

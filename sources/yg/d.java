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
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        addView(textView, z5.a(-1.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
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

package qg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d extends FrameLayout {
    public final p6 a;
    public final TextView b;

    public d(Context context, p6 p6Var) {
        super(context);
        this.a = p6Var;
        a7.i(t6.e7, this, p6Var);
        TextView textView = new TextView(getContext());
        this.b = textView;
        sc.e.t(textView, 1, 14.0f);
        a7.V(textView, t6.f7, p6Var);
        textView.setGravity((dd.X ? 5 : 3) | 16);
        addView(textView, b6.d(-1, -1.0f, (dd.X ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        a7.V(this.b, i10, this.a);
    }
}

package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d extends FrameLayout {
    public final u6 a;
    public final TextView b;

    public d(Context context, u6 u6Var) {
        super(context);
        this.a = u6Var;
        f7.i(y6.e7, this, u6Var);
        TextView textView = new TextView(getContext());
        this.b = textView;
        ic.a.o(14.0f, 1, textView);
        f7.V(textView, y6.f7, u6Var);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, kb1.h(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        f7.V(this.b, i10, this.a);
    }
}

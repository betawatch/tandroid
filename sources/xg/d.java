package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d extends FrameLayout {
    public final e6 a;
    public final TextView b;

    public d(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        setBackgroundColor(i6.v0(i6.e7, e6Var));
        TextView textView = new TextView(getContext());
        this.b = textView;
        e2.l(14.0f, 1, textView);
        textView.setTextColor(i6.v0(i6.f7, e6Var));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, x5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i6.v0(i10, this.a));
    }
}

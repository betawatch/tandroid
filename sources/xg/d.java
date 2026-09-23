package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d extends FrameLayout {
    public final d6 a;
    public final TextView b;

    public d(Context context, d6 d6Var) {
        super(context);
        this.a = d6Var;
        setBackgroundColor(h6.v0(h6.e7, d6Var));
        TextView textView = new TextView(getContext());
        this.b = textView;
        e2.l(14.0f, 1, textView);
        textView.setTextColor(h6.v0(h6.f7, d6Var));
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
        this.b.setTextColor(h6.v0(i10, this.a));
    }
}

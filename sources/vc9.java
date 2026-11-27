// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vc9 extends LinearLayout {
    public final TextView a;

    public vc9(Context context, vnb vnbVar) {
        super(context);
        setOrientation(1);
        de0 de0Var = new de0(context);
        de0Var.setImageDrawable(new b29(R.raw.utyan_empty, hl.L(130.0f), hl.L(130.0f)));
        addView(de0Var, tre.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.A6, vnbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, tre.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = hl.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
    }

    public void set(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}

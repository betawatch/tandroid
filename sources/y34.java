// default package

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class y34 extends LinearLayout {
    public final xt3 a;
    public final TextView b;
    public x34 c;

    public y34(Context context, vnb vnbVar) {
        super(context);
        setOrientation(0);
        xt3 xt3Var = new xt3(context, vnbVar);
        this.a = xt3Var;
        xt3Var.setLines(1);
        xt3Var.setSingleLine(true);
        InputFilter[] inputFilterArr = {new w34(this)};
        xt3Var.setInputType(TLObject.FLAG_14);
        xt3Var.setFilters(inputFilterArr);
        xt3Var.setTextSize(1, 16.0f);
        yob.X(xt3Var, aob.Le, vnbVar);
        yob.G(xt3Var, aob.Yc, vnbVar);
        yob.C(xt3Var, aob.lg, vnbVar);
        int i = aob.Me;
        yob.l(xt3Var, 34, i, vnbVar);
        yob.D(xt3Var, i, vnbVar);
        yob.l(xt3Var, 30, aob.Ne, vnbVar);
        yob.l(xt3Var, 36, aob.mg, vnbVar);
        xt3Var.setBackground(null);
        xt3Var.setHint(ob6.M0(2131753470, null));
        xt3Var.addTextChangedListener(new c7(this, (byte) 22));
        xt3Var.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.j5, vnbVar);
        if (!ob6.a0) {
            addView(textView, tre.t(-2, -2, 16, 20, 0, 0, 0));
            addView(xt3Var, tre.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t = tre.t(-1, -2, 16, 20, 0, 36, 0);
            t.weight = 1.0f;
            addView(xt3Var, t);
            addView(textView, tre.t(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
    }

    public void setAfterTextChangedListener(x34 x34Var) {
        this.c = x34Var;
    }

    public void setCount(int i) {
        this.b.setText(String.valueOf(i));
    }
}

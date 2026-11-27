// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x2a extends FrameLayout {
    public final vnb a;
    public final TextView b;

    public x2a(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        yob.h(aob.e7, vnbVar, this);
        TextView textView = new TextView(getContext());
        this.b = textView;
        bs2.t(textView, 1, 14.0f);
        yob.X(textView, aob.f7, vnbVar);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        addView(textView, tre.d(-1, -1.0f, (ob6.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i) {
        yob.X(this.b, i, this.a);
    }
}

// default package

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zjb extends FrameLayout {
    public final TextView a;
    public final TextView b;

    public zjb(Context context) {
        super(context);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.a = textView;
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        addView(textView, qoe.d(-2, -1.0f, (jb6.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(gm.o());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((jb6.a0 ? 3 : 5) | 16);
        addView(textView2, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        if (str2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(4);
        }
        if (z) {
            int i = cmb.F6;
            setTag(Integer.valueOf(i));
            anb.X(textView, i, null);
            anb.X(textView2, i, null);
            textView.setTypeface(gm.o());
            textView2.setTypeface(gm.o());
        } else {
            int i2 = cmb.y6;
            setTag(Integer.valueOf(i2));
            anb.X(textView, i2, null);
            anb.X(textView2, i2, null);
            Typeface typeface = Typeface.DEFAULT;
            textView.setTypeface(typeface);
            textView2.setTypeface(typeface);
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(40.0f));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gm.L(34.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        TextView textView = this.b;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.a.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - textView.getMeasuredWidth()) - gm.L(8.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        this.b.setTextColor(i);
    }
}

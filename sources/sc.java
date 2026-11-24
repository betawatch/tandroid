// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sc extends ViewGroup {
    public final TextView a;
    public final TextView b;
    public final /* synthetic */ tc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(tc tcVar, Context context) {
        super(context);
        this.c = tcVar;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setSingleLine();
        textView2.setGravity(16);
        addView(textView2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L = gm.L(10.0f);
        int L2 = gm.L(6.83f);
        int i5 = i4 - i2;
        int i6 = i3 - i;
        boolean z2 = jb6.a0;
        TextView textView = this.a;
        int measuredWidth = textView.getMeasuredWidth();
        int i7 = z2 ? (i6 - L) - measuredWidth : L;
        int measuredHeight = textView.getMeasuredHeight();
        int i8 = (i5 - measuredHeight) / 2;
        textView.layout(i7, i8, textView.getMeasuredWidth() + i7, measuredHeight + i8);
        int i9 = measuredWidth + L2 + L;
        TextView textView2 = this.b;
        if (textView2.getVisibility() != 8) {
            int measuredWidth2 = textView2.getMeasuredWidth();
            if (z2) {
                i9 = (i6 - i9) - measuredWidth2;
            }
            int measuredHeight2 = textView2.getMeasuredHeight();
            int i10 = (i5 - measuredHeight2) / 2;
            textView2.layout(i9, i10, textView2.getMeasuredWidth() + i9, measuredHeight2 + i10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int L = gm.L(10.0f);
        int L2 = gm.L(6.83f);
        int i3 = L << 1;
        int min = Math.min(this.c.e, View.MeasureSpec.getSize(i)) - i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        TextView textView = this.b;
        if (textView.getVisibility() != 8) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, min), TLObject.FLAG_31), makeMeasureSpec);
            min -= textView.getMeasuredWidth() + L2;
            i3 += textView.getMeasuredWidth() + L2;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(48.0f), min), TLObject.FLAG_31);
        TextView textView2 = this.a;
        textView2.measure(makeMeasureSpec2, makeMeasureSpec);
        setMeasuredDimension(textView2.getMeasuredWidth() + i3, size);
    }
}

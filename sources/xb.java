// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xb extends TextView {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                canvas.drawCircle(hl.L(3.5f), hl.L(11.5f), hl.L(2.5f), getPaint());
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        switch (this.a) {
            case 1:
                return Button.class.getName();
            case 2:
                return Button.class.getName();
            case 3:
                return Button.class.getName();
            case 4:
                return Button.class.getName();
            case 5:
                return Button.class.getName();
            case 6:
                return Button.class.getName();
            case 7:
                return Button.class.getName();
            case 8:
                return Button.class.getName();
            case 9:
                return Button.class.getName();
            case 10:
            case 11:
            default:
                return super.getAccessibilityClassName();
            case 12:
                return Button.class.getName();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 11:
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, o.t1);
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        switch (this.a) {
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), hl.L(220.0f)), View.MeasureSpec.getMode(i)), i2);
                break;
            case 15:
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout = getLayout();
                    int i4 = 0;
                    while (i3 < layout.getLineCount()) {
                        i4 = Math.max(i4, (int) Math.ceil(layout.getLineWidth(i3)));
                        i3++;
                    }
                    i = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i4, TLObject.FLAG_30);
                }
                super.onMeasure(i, i2);
                break;
            case 16:
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout2 = getLayout();
                    int i5 = 0;
                    while (i3 < layout2.getLineCount()) {
                        i5 = Math.max(i5, (int) Math.ceil(layout2.getLineWidth(i3)));
                        i3++;
                    }
                    i = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i5, TLObject.FLAG_30);
                }
                super.onMeasure(i, i2);
                break;
            case 17:
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout3 = getLayout();
                    int i6 = 0;
                    while (i3 < layout3.getLineCount()) {
                        i6 = Math.max(i6, (int) Math.ceil(layout3.getLineWidth(i3)));
                        i3++;
                    }
                    i = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i6, TLObject.FLAG_30);
                }
                super.onMeasure(i, i2);
                break;
            case 18:
                super.onMeasure(i, i2);
                try {
                    Layout layout4 = getLayout();
                    if (layout4.getLineCount() > 1) {
                        for (int lineCount = layout4.getLineCount() - 1; lineCount >= 0; lineCount--) {
                            i3 = Math.max(i3, Math.round(layout4.getPaint().measureText(getText(), layout4.getLineStart(lineCount), layout4.getLineEnd(lineCount))));
                        }
                        super.onMeasure(Math.min(i3 + getPaddingLeft() + getPaddingRight(), getMeasuredWidth()) | TLObject.FLAG_30, getMeasuredHeight() | TLObject.FLAG_30);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - hl.L(8.0f)) / 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), TLObject.FLAG_30));
                break;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - hl.L(8.0f)) / 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), TLObject.FLAG_30));
                break;
            case 21:
            case 26:
            default:
                super.onMeasure(i, i2);
                break;
            case 22:
                super.onMeasure(i, i2);
                break;
            case 23:
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                    i = ik8.f(52.0f, View.MeasureSpec.getSize(i), TLObject.FLAG_31);
                }
                super.onMeasure(i, i2);
                break;
            case 24:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_31));
                break;
            case 25:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), hl.L(100.0f)), TLObject.FLAG_31));
                break;
            case 27:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_31));
                break;
            case 28:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_31));
                break;
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 10:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 13:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 21:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 26:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }
}

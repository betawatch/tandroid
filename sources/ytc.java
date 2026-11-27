// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ytc extends EditTextBoldCursor {
    public final mm N1;
    public final mm O1;
    public float P1;
    public float Q1;
    public final /* synthetic */ duc R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytc(duc ducVar, Context context) {
        super(context);
        this.R1 = ducVar;
        this.N1 = new mm(180L, this, k43.h);
        this.O1 = new mm(320L, this, duc.T);
        this.P1 = 1.0f;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(hl.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.P1) + f);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.P1) + f);
        int i = bounds.left;
        int width = bounds.width();
        if (this.Q1 > 0.0f) {
            float f2 = i;
            i = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f2) * this.Q1) + f2);
        }
        gradientDrawable.setBounds(i, round, width + i, round2);
        gradientDrawable.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float lineLeft;
        int size;
        Editable text = getText();
        int max = Math.max(TextUtils.indexOf((CharSequence) text, '.'), TextUtils.indexOf((CharSequence) text, ','));
        int i = 0;
        this.P1 = this.N1.e(false, (max < 0 || getSelectionStart() <= max) ? 1.0f : 0.6363636f);
        this.Q1 = this.O1.d(length() == 0);
        super.onDraw(canvas);
        duc ducVar = this.R1;
        if (ducVar.J >= 1.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float textSize = paint.getTextSize();
        float compoundPaddingLeft = getCompoundPaddingLeft();
        if (length() != 0) {
            if (getLayout() != null) {
                lineLeft = getLayout().getLineLeft(0);
            }
            float f = compoundPaddingLeft;
            int baseline = getBaseline();
            ArrayList arrayList = ducVar.M;
            size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                buc bucVar = (buc) obj;
                paint.setTextSize(bucVar.b ? (28.0f * textSize) / 44.0f : textSize);
                bucVar.c.b(canvas, paint, bucVar.a, f, baseline);
            }
            paint.setTextSize(textSize);
        }
        lineLeft = getScrollX() + ducVar.O;
        compoundPaddingLeft += lineLeft;
        float f2 = compoundPaddingLeft;
        int baseline2 = getBaseline();
        ArrayList arrayList2 = ducVar.M;
        size = arrayList2.size();
        while (i < size) {
        }
        paint.setTextSize(textSize);
    }

    @Override // cu3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (i != i2) {
            this.R1.b();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.R1.b();
            this.O1.a(length() == 0);
        }
        return super.onTouchEvent(motionEvent);
    }
}

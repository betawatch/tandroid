// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yi1 extends FrameLayout {
    public final wjb a;
    public final fm b;
    public final TextView c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f;

    public yi1(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        LinearLayout j = de9.j(context, 1);
        addView(j, nme.d(-1, -2.0f, kk7.D1, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        j.addView(textView, nme.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        zkb.X(textView2, bkb.x6, wjbVar);
        j.addView(textView2, nme.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        fm fmVar = new fm(context);
        this.b = fmVar;
        fmVar.setTypeface(gl.o());
        fmVar.setTextSize(1, 13.0f);
        addView(fmVar, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f) {
            wjb wjbVar = this.a;
            Paint d = wjbVar != null ? wjbVar.d("paintDivider") : bkb.j0;
            if (d != null) {
                canvas.drawLine(k96.a0 ? 0.0f : gl.L(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(17.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }
}

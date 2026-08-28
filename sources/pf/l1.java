package pf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final z8 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final dp e;
    public final Path f;
    public final Paint h;
    public final b6 n;
    public final int[] r;
    public boolean s;

    public l1(Context context, b6 b6Var) {
        super(context);
        this.a = new z8((b6) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = b6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(f6.v0(f6.G6, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        addView(textView, e6.d(-1, -2.0f, 7, z10 ? 40.0f : 78.0f, 10.33f, z10 ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        ll.n(f6.z6, b6Var, textView2, 1, 15.0f);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, e6.d(-1, -2.0f, 7, z11 ? 40.0f : 78.0f, 32.0f, z11 ? 78.0f : 40.0f, 0.0f));
        dp dpVar = new dp(getContext(), 21, b6Var);
        this.e = dpVar;
        dpVar.b(-1, f6.d6, f6.k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(3);
        addView(dpVar, e6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(65.0f) : AndroidUtilities.dp(9.0f);
        float dp = AndroidUtilities.dp(11.33f);
        float dp2 = AndroidUtilities.dp(56.0f);
        float dp3 = AndroidUtilities.dp(56.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(measuredWidth, dp, dp2, dp3);
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint T0 = f6.T0("paintDivider", this.n);
            if (T0 == null) {
                T0 = f6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 78.0f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(f6.l1(0.85f, f6.v0(f6.z6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float dpf2 = LocaleController.isRTL ? AndroidUtilities.dpf2(29.66f) : getMeasuredWidth() - AndroidUtilities.dpf2(24.33f);
        path.moveTo(dpf2, measuredHeight - AndroidUtilities.dpf2(5.66f));
        path.lineTo((AndroidUtilities.dpf2(5.33f) * (LocaleController.isRTL ? -1 : 1)) + dpf2, measuredHeight);
        path.lineTo(dpf2, AndroidUtilities.dpf2(5.66f) + measuredHeight);
    }
}

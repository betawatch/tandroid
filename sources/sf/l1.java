package sf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.hp;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final e9 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final hp e;
    public final Path f;
    public final Paint h;
    public final c6 n;
    public final int[] r;
    public boolean s;

    public l1(Context context, c6 c6Var) {
        super(context);
        this.a = new e9((c6) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = c6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(g6.v0(g6.G6, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        addView(textView, f6.d(-1, -2.0f, 7, z10 ? 40.0f : 78.0f, 10.33f, z10 ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        org.telegram.ui.b.m(g6.z6, c6Var, textView2, 1, 15.0f);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, f6.d(-1, -2.0f, 7, z11 ? 40.0f : 78.0f, 32.0f, z11 ? 78.0f : 40.0f, 0.0f));
        hp hpVar = new hp(getContext(), 21, c6Var);
        this.e = hpVar;
        hpVar.b(-1, g6.d6, g6.k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(3);
        addView(hpVar, f6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
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
            Paint T0 = g6.T0("paintDivider", this.n);
            if (T0 == null) {
                T0 = g6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 78.0f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(g6.l1(0.85f, g6.v0(g6.z6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float dpf2 = LocaleController.isRTL ? AndroidUtilities.dpf2(29.66f) : getMeasuredWidth() - AndroidUtilities.dpf2(24.33f);
        path.moveTo(dpf2, measuredHeight - AndroidUtilities.dpf2(5.66f));
        path.lineTo((AndroidUtilities.dpf2(5.33f) * (LocaleController.isRTL ? -1 : 1)) + dpf2, measuredHeight);
        path.lineTo(dpf2, AndroidUtilities.dpf2(5.66f) + measuredHeight);
    }
}

package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t0 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final KeyEvent.Callback c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(y0 y0Var, Context context, a1 a1Var) {
        super(context);
        this.c = y0Var;
        this.b = a1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ((a1) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                a1 a1Var = (a1) this.b;
                a1Var.f.setAlpha(((y0) this.c).K);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, wh.D(2.0f, ((y0) this.c).s, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    public t0(Context context, u6 u6Var) {
        super(context);
        LinearLayout d = wh.d(context, 1);
        s6 s6Var = new s6(context, false, false, false);
        this.b = s6Var;
        int i10 = y6.G6;
        f7.Z(s6Var, i10, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(17.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        d.addView(s6Var, kb1.u(-2, 23, 1));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 11.0f);
        f7.V(textView, i10, u6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        d.addView(textView, kb1.u(-2, -2, 1));
        addView(d, kb1.i(-2, -2, 17));
    }
}

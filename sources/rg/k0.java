package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.q6;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final KeyEvent.Callback c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(sg.y0 y0Var, Context context, sg.a1 a1Var) {
        super(context);
        this.c = y0Var;
        this.b = a1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                ((sg.a1) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                sg.a1 a1Var = (sg.a1) this.b;
                a1Var.f.setAlpha(((sg.y0) this.c).K);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                l0 l0Var = (l0) this.c;
                if (l0Var.h == null || (!((z10 = l0Var.f) && view == l0Var.d) && (z10 || view != l0Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? l0Var.e : 1.0f - l0Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                super.onMeasure(i10, kk.C(2.0f, ((sg.y0) this.c).s, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    public k0(Context context, d6 d6Var) {
        super(context);
        LinearLayout e = kk.e(context, 1);
        q6 q6Var = new q6(context, false, false, false);
        this.b = q6Var;
        int i10 = h6.G6;
        q6Var.setTextColor(h6.w0(i10, d6Var));
        q6Var.setTextSize(AndroidUtilities.dp(17.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        e.addView(q6Var, z5.q(-2, 23, 1));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(h6.w0(i10, d6Var));
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        e.addView(textView, z5.q(-2, -2, 1));
        addView(e, z5.e(-2, -2, 17));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, Context context) {
        super(context);
        this.c = l0Var;
        this.b = new Path();
    }
}

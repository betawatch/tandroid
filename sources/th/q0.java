package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.op0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class q0 extends FrameLayout implements org.telegram.ui.ActionBar.x5, j9 {
    public final c6 a;
    public final op0 b;
    public final AnimatedArrowDrawable c;
    public final d1 d;
    public final Paint e;
    public a f;
    public x2 h;
    public boolean n;

    public q0(Context context, c6 c6Var) {
        super(context);
        this.e = new Paint();
        this.a = c6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(g6.v0(g6.Dk, c6Var));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new hg.a(this, 10));
        op0 op0Var = new op0(this, context, 12);
        this.b = op0Var;
        op0Var.setOnClickListener(new mh.n(this, 27));
        addView(op0Var, f6.e(53, -1, 51));
        d1 d1Var = new d1(context, c6Var);
        this.d = d1Var;
        d1Var.setAllowNewlines(false);
        d1Var.setTextSize(1, SharedConfig.fontSize);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        d1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        d1Var.setListener(new n0(this));
        d1Var.setDelegate(new sf.f1(this, 4));
        addView(d1Var, f6.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x2 x2Var = this.h;
        k9 textSelectionHelper = x2Var != null ? x2Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            if (this.d.getLayout() != null) {
                canvas.save();
                canvas.translate(r1.getPaddingLeft() + r1.getLeft(), r1.getPaddingTop() + r1.getTop());
                textSelectionHelper.a0(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        this.d.t();
        int i10 = g6.Dk;
        c6 c6Var = this.a;
        int v02 = g6.v0(i10, c6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(g6.v0(g6.Fk, c6Var));
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var = this.d;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new o0(this, layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop()));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public d1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar = this.f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        canvas.drawRect(0.0f, r0 - 1, getMeasuredWidth(), getMeasuredHeight(), this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }
}

package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.yi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q0 extends FrameLayout implements org.telegram.ui.ActionBar.w5, m9 {
    public final b6 a;
    public final yi0 b;
    public final AnimatedArrowDrawable c;
    public final d1 d;
    public final Paint e;
    public a f;
    public w2 h;
    public boolean n;

    public q0(Context context, b6 b6Var) {
        super(context);
        this.e = new Paint();
        this.a = b6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(f6.v0(f6.Dk, b6Var));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new eg.a(this, 10));
        yi0 yi0Var = new yi0(this, context, 11);
        this.b = yi0Var;
        yi0Var.setOnClickListener(new x8(this, 21));
        addView(yi0Var, e6.e(53, -1, 51));
        d1 d1Var = new d1(context, b6Var);
        this.d = d1Var;
        d1Var.setAllowNewlines(false);
        d1Var.setTextSize(1, SharedConfig.fontSize);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        d1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        d1Var.setListener(new n0(this));
        d1Var.setDelegate(new kh.p(this, 21));
        addView(d1Var, e6.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        this.d.t();
        int i9 = f6.Dk;
        b6 b6Var = this.a;
        int v02 = f6.v0(i9, b6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(f6.v0(f6.Fk, b6Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        w2 w2Var = this.h;
        n9 textSelectionHelper = w2Var != null ? w2Var.a.getTextSelectionHelper() : null;
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

    @Override // org.telegram.ui.Cells.m9
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }
}

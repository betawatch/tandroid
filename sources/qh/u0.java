package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g7.w6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u0 extends y implements org.telegram.ui.ActionBar.w5, m9 {
    public final b6 n;
    public final Paint r;
    public final Paint s;
    public l2 v;
    public boolean w;

    public u0(Context context, b6 b6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = b6Var;
        setWillNotDraw(false);
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = f6.vk;
        b6 b6Var = this.n;
        this.r.setColor(f6.v0(i9, b6Var));
        this.s.setColor(f6.v0(f6.uf, b6Var));
    }

    @Override // qh.y
    public final void f(int i9) {
        invalidate();
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i9 = this.w ? 0 : this.c;
        int h = (h() - i9) / 4;
        arrayList.add(w6.a((i9 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.a;
    }

    public final int h() {
        return getMeasuredWidth() - (this.w ? this.c : 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        n9 textSelectionHelper;
        int i9 = this.w ? 0 : this.c;
        int h = (h() - i9) / 4;
        int i10 = i9 + h;
        int h10 = h() - h;
        l2 l2Var = this.v;
        if (l2Var != null && (textSelectionHelper = l2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i10 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i10, dp, h10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i10, dp2, h10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(12.0f));
    }
}

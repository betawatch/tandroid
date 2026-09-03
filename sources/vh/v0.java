package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import k7.j8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class v0 extends z implements org.telegram.ui.ActionBar.a6, k9 {
    public final f6 n;
    public final Paint r;
    public final Paint s;
    public n2 v;
    public boolean w;

    public v0(Context context, f6 f6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = f6Var;
        setWillNotDraw(false);
        e();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = j6.vk;
        f6 f6Var = this.n;
        this.r.setColor(j6.v0(i10, f6Var));
        this.s.setColor(j6.v0(j6.uf, f6Var));
    }

    @Override // vh.z
    public final void f(int i10) {
        invalidate();
    }

    @Override // org.telegram.ui.Cells.k9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10 = this.w ? 0 : this.c;
        int h = (h() - i10) / 4;
        arrayList.add(j8.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
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
        l9 textSelectionHelper;
        int i10 = this.w ? 0 : this.c;
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h9 = h() - h;
        n2 n2Var = this.v;
        if (n2Var != null && (textSelectionHelper = n2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h9, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h9, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h9, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}

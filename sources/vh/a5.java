package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.x9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class a5 extends y implements a6, l9 {
    public final f6 n;
    public final d1 r;
    public y4 s;
    public final ArrayList v;
    public boolean w;

    public a5(Context context, f6 f6Var) {
        super(context);
        this.v = new ArrayList();
        this.n = f6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d1 d1Var = new d1(context, f6Var);
        this.r = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(8388659);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        d1Var.setTextColorKey(j6.Oh);
        d1Var.setAccentHint(true);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        d1Var.setListener(new ph.j5(this, 16));
        d1Var.setDelegate(new rh.e(this, 14));
        addView(d1Var, b6.e(-1, -2, 51));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y4 y4Var = this.s;
        m9 textSelectionHelper = y4Var != null ? ((x2) y4Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                x9 x9Var = (x9) arrayList.get(i10);
                canvas.save();
                canvas.translate(x9Var.getX(), x9Var.getY());
                textSelectionHelper.a0(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        d1 d1Var = this.r;
        d1Var.t();
        int i10 = j6.Oh;
        f6 f6Var = this.n;
        d1Var.setTextColor(j6.v0(i10, f6Var));
        d1Var.setHintTextColor(j6.l1(0.5f, j6.v0(i10, f6Var)));
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var = this.r;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new x4(layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop(), 0));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.a;
    }

    public final void h() {
        a aVar;
        y4 y4Var = this.s;
        if (y4Var == null || (aVar = this.a) == null) {
            return;
        }
        long j10 = aVar.t;
        TL_iv.RichText f10 = x5.f(this.r.getText());
        r3 r3Var = ((x2) y4Var).a;
        if (f10 == null || (f10 instanceof TL_iv.textEmpty)) {
            r3Var.j3.remove(Long.valueOf(j10));
        } else {
            r3Var.j3.put(Long.valueOf(j10), f10);
        }
    }
}

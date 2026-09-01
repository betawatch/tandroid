package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class a5 extends z implements b6, l9 {
    public final g6 n;
    public final e1 r;
    public y4 s;
    public final ArrayList v;
    public boolean w;

    public a5(Context context, g6 g6Var) {
        super(context);
        this.v = new ArrayList();
        this.n = g6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e1 e1Var = new e1(context, g6Var);
        this.r = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        e1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        e1Var.setTextColorKey(k6.Oh);
        e1Var.setAccentHint(true);
        e1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        e1Var.setListener(new ai(this, 22));
        e1Var.setDelegate(new sf.g(this, 18));
        addView(e1Var, c6.e(-1, -2, 51));
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        e1 e1Var = this.r;
        e1Var.t();
        int i10 = k6.Oh;
        g6 g6Var = this.n;
        e1Var.setTextColor(k6.v0(i10, g6Var));
        e1Var.setHintTextColor(k6.l1(0.5f, k6.v0(i10, g6Var)));
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e1 e1Var = this.r;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new x4(layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop(), 0));
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

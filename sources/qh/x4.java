package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.y9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x4 extends y implements org.telegram.ui.ActionBar.w5, m9 {
    public final b6 n;
    public final d1 r;
    public v4 s;
    public final ArrayList v;
    public boolean w;

    public x4(Context context, b6 b6Var) {
        super(context);
        this.v = new ArrayList();
        this.n = b6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d1 d1Var = new d1(context, b6Var);
        this.r = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(8388659);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        d1Var.setTextColorKey(f6.Oh);
        d1Var.setAccentHint(true);
        d1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        d1Var.setListener(new n2.p(this, 18));
        d1Var.setDelegate(new kh.p(this, 26));
        addView(d1Var, e6.e(-1, -2, 51));
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        d1 d1Var = this.r;
        d1Var.t();
        int i9 = f6.Oh;
        b6 b6Var = this.n;
        d1Var.setTextColor(f6.v0(i9, b6Var));
        d1Var.setHintTextColor(f6.l1(0.5f, f6.v0(i9, b6Var)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        v4 v4Var = this.s;
        n9 textSelectionHelper = v4Var != null ? ((u2) v4Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                y9 y9Var = (y9) arrayList.get(i9);
                canvas.save();
                canvas.translate(y9Var.getX(), y9Var.getY());
                textSelectionHelper.a0(canvas, this, i9);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var = this.r;
        Layout layout = d1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new u4(layout, d1Var.getPaddingLeft() + d1Var.getLeft(), d1Var.getPaddingTop() + d1Var.getTop(), 0));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.a;
    }

    public final void h() {
        a aVar;
        v4 v4Var = this.s;
        if (v4Var == null || (aVar = this.a) == null) {
            return;
        }
        long j10 = aVar.t;
        TL_iv.RichText f10 = u5.f(this.r.getText());
        o3 o3Var = ((u2) v4Var).a;
        if (f10 == null || (f10 instanceof TL_iv.textEmpty)) {
            o3Var.i3.remove(Long.valueOf(j10));
        } else {
            o3Var.i3.put(Long.valueOf(j10), f10);
        }
    }
}

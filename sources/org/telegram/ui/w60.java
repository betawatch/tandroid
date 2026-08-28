package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w60 extends LinearLayout {
    public final org.telegram.ui.Components.mt a;
    public boolean b;
    public int c;
    public x20 d;
    public String e;
    public final v60 f;
    public final /* synthetic */ z60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(z60 z60Var, Context context) {
        super(context);
        this.h = z60Var;
        this.f = new v60(this);
        TextView g10 = org.telegram.messenger.l0.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.mt mtVar = new org.telegram.ui.Components.mt(context, null);
        this.a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        mtVar.setInputType(16384);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ud, false));
        mtVar.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hc, false));
        mtVar.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.uf, false));
        int i9 = org.telegram.ui.ActionBar.f6.Vd;
        mtVar.setHintColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        mtVar.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        mtVar.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Wd, false));
        mtVar.setHandlesColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.vf, false));
        mtVar.setBackground(null);
        mtVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, g7.e6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, g7.e6.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }
}

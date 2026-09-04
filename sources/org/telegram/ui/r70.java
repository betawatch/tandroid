package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class r70 extends LinearLayout {
    public final org.telegram.ui.Components.zt a;
    public boolean b;
    public int c;
    public yt d;
    public String e;
    public final q70 f;
    public final /* synthetic */ u70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70(u70 u70Var, Context context) {
        super(context);
        this.h = u70Var;
        this.f = new q70(this);
        TextView g10 = org.telegram.messenger.w1.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.zt ztVar = new org.telegram.ui.Components.zt(context, null);
        this.a = ztVar;
        ztVar.setLines(1);
        ztVar.setSingleLine(true);
        ztVar.setInputType(16384);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        ztVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hc, false));
        ztVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        ztVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ztVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ztVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        ztVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vf, false));
        ztVar.setBackground(null);
        ztVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ztVar, w7.x5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }
}

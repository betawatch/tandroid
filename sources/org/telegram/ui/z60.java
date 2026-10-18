package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class z60 extends LinearLayout {
    public final org.telegram.ui.Components.iu a;
    public boolean b;
    public int c;
    public nt d;
    public String e;
    public final y60 f;
    public final /* synthetic */ c70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(c70 c70Var, Context context) {
        super(context);
        this.h = c70Var;
        this.f = new y60(this);
        TextView f7 = org.telegram.messenger.g0.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.iu iuVar = new org.telegram.ui.Components.iu(context, null);
        this.a = iuVar;
        iuVar.setLines(1);
        iuVar.setSingleLine(true);
        iuVar.setInputType(16384);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        iuVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hc, false));
        iuVar.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        iuVar.setHintColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        iuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        iuVar.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        iuVar.setHandlesColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.vf, false));
        iuVar.setBackground(null);
        iuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(iuVar, w7.z5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.k0);
        }
    }
}

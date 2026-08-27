package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z60 extends LinearLayout {
    public final org.telegram.ui.Components.lt a;
    public boolean b;
    public int c;
    public a30 d;
    public String e;
    public final y60 f;
    public final /* synthetic */ c70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(c70 c70Var, Context context) {
        super(context);
        this.h = c70Var;
        this.f = new y60(this);
        TextView h = org.telegram.messenger.y1.h(context, 1, 16.0f);
        h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        h.setText("t.me/addemoji/");
        org.telegram.ui.Components.lt ltVar = new org.telegram.ui.Components.lt(context, null);
        this.a = ltVar;
        ltVar.setLines(1);
        ltVar.setSingleLine(true);
        ltVar.setInputType(16384);
        ltVar.setTextSize(1, 16.0f);
        ltVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ud, false));
        ltVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hc, false));
        ltVar.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.uf, false));
        int i10 = org.telegram.ui.ActionBar.g6.Vd;
        ltVar.setHintColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ltVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ltVar.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wd, false));
        ltVar.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.vf, false));
        ltVar.setBackground(null);
        ltVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(h, h7.z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ltVar, h7.z5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
        }
    }
}

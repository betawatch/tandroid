package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x70 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final org.telegram.ui.Components.y80 P;
    public final org.telegram.ui.ActionBar.g1 Q;
    public final org.telegram.ui.ActionBar.g1 R;
    public final org.telegram.ui.ActionBar.g1 S;
    public final ArrayList T;
    public final org.telegram.ui.Components.g00 U;
    public int V;
    public final CacheByChatsController W;
    public v70 a0;
    public ArrayList b0;
    public final org.telegram.ui.ActionBar.o2 c0;
    public final FrameLayout d0;

    public x70(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.c0 = o2Var;
        this.W = o2Var.getMessagesController().getCacheByChatsController();
        setFitItems(true);
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1d, LocaleController.formatPluralString("Days", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.g1 c6 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_2d, LocaleController.formatPluralString("Days", 2, new Object[0]), false, null);
        this.S = c6;
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1w, LocaleController.formatPluralString("Weeks", 1, new Object[0]), false, null);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_autodelete_1m, LocaleController.formatPluralString("Months", 1, new Object[0]), false, null);
        this.R = c11;
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_cancel, LocaleController.getString(R.string.AutoDeleteMediaNever), false, null);
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        this.Q = c13;
        int i10 = org.telegram.ui.ActionBar.g6.p7;
        c13.c(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        arrayList.add(new w70(c3, CacheByChatsController.KEEP_MEDIA_ONE_DAY));
        arrayList.add(new w70(c6, CacheByChatsController.KEEP_MEDIA_TWO_DAY));
        arrayList.add(new w70(c10, CacheByChatsController.KEEP_MEDIA_ONE_WEEK));
        arrayList.add(new w70(c11, CacheByChatsController.KEEP_MEDIA_ONE_MONTH));
        arrayList.add(new w70(c12, CacheByChatsController.KEEP_MEDIA_FOREVER));
        arrayList.add(new w70(c13, CacheByChatsController.KEEP_MEDIA_DELETE));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H8, false));
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.g6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.b7, null)));
        frameLayout.addView(view, i7.f6.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, i7.f6.n(-1, 8));
        org.telegram.ui.Components.g00 g00Var = new org.telegram.ui.Components.g00(this, context);
        this.U = g00Var;
        a(g00Var, i7.f6.n(-1, 48));
        g00Var.setOnClickListener(new t70(0, this, o2Var));
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            ((w70) this.T.get(i11)).a.setOnClickListener(new jh.y0(this, ((w70) this.T.get(i11)).b, 17));
        }
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, null);
        this.P = y80Var;
        y80Var.setTag(R.id.fit_width_tag, 1);
        y80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        y80Var.setTextSize(1, 13.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        y80Var.setMovementMethod(LinkMovementMethod.getInstance());
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        y80Var.setText(LocaleController.getString(R.string.KeepMediaPopupDescription));
        a(y80Var, i7.f6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void f() {
        if (this.b0 != null) {
            ((org.telegram.ui.Components.h9) this.U.d).setTranslationX((3 - Math.min(3, this.b0.size())) * AndroidUtilities.dp(12.0f));
        }
    }

    public final void g(boolean z10) {
        this.V = -1;
        this.d0.setVisibility(0);
        this.Q.setVisibility(z10 ? 8 : 0);
        this.P.setVisibility(0);
        this.U.setVisibility(8);
    }

    public void setCallback(v70 v70Var) {
        this.a0 = v70Var;
    }
}

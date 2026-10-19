package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class r4 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.im0 a;
    public q4 b;

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.a = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new s4.b0());
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.im0 im0Var2 = this.a;
        q4 q4Var = new q4(context);
        this.b = q4Var;
        im0Var2.setAdapter(q4Var);
        this.a.setOnItemClickListener(new i(this, 2));
        frameLayout.addView(this.a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}

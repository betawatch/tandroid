package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vy extends org.telegram.ui.ActionBar.o2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public sy e;
    public bg.y0 f;

    public final void T() {
        if (!this.d || getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
            if (o2Var instanceof dy) {
                yw ywVar = ((dy) o2Var).B3;
                if (ywVar.c()) {
                    ywVar.a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 16));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        sy syVar = new sy(this, new a5(this, 13), new wt(this, 6), null);
        this.e = syVar;
        syVar.p1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, this.resourceProvider));
        frameLayout.addView(this.e, g7.e6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }
}

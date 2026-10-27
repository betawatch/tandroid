package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wy extends org.telegram.ui.ActionBar.r2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public ty e;
    public bi.m5 f;

    public final void V() {
        if (!this.d || getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.r2 r2Var : getParentLayout().getFragmentStack()) {
            if (r2Var instanceof ey) {
                vw vwVar = ((ey) r2Var).G3;
                if (vwVar.c()) {
                    vwVar.a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 26));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ty tyVar = new ty(this, new e5(this, 13), new st(this, 8), null);
        this.e = tyVar;
        tyVar.u1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qy extends org.telegram.ui.ActionBar.k2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public boolean e;
    public ny f;
    public jo h;

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 20));
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131744006, null));
        FrameLayout frameLayout = new FrameLayout(context);
        ny nyVar = new ny(this, new z4(this, 13), new tt(this, 8), null, 0);
        this.f = nyVar;
        nyVar.r1();
        this.f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().L0(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}

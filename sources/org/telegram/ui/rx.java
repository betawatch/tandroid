package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rx extends org.telegram.ui.ActionBar.h2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public boolean e;
    public bi.g7 f;
    public fi.b0 h;

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 2));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131743744, null));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.g7 g7Var = new bi.g7(this, new a5(this, 13), new zr(this, 9), null, 7);
        this.f = g7Var;
        g7Var.r1();
        this.f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().O0(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}

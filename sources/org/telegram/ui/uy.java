package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class uy extends org.telegram.ui.ActionBar.n2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public ry e;
    public ai.r5 f;

    public final void U() {
        if (!this.d || getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
            if (n2Var instanceof cy) {
                ww wwVar = ((cy) n2Var).G3;
                if (wwVar.c()) {
                    wwVar.a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 24));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ry ryVar = new ry(this, new g5(this, 13), new ut(this, 6), null);
        this.e = ryVar;
        ryVar.p1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.z5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ long c;

    public /* synthetic */ re(long j10, fo foVar) {
        this.a = 7;
        this.c = j10;
        this.b = foVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.c, r1, true, this.b.classGuid);
                break;
            case 1:
                this.b.getMessagesController().loadFullChat(this.c, 0, true);
                break;
            case 2:
                fo foVar = this.b;
                LongSparseIntArray longSparseIntArray = foVar.M5;
                long j10 = this.c;
                longSparseIntArray.put(j10, 0);
                org.telegram.ui.Components.y31 y31Var = foVar.R1;
                if (y31Var != null) {
                    y31Var.setAllTopicsHidden(false);
                }
                if (j10 == foVar.d4) {
                    foVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                fo foVar2 = this.b;
                foVar2.getClass();
                foVar2.presentFragment(fo.W9(this.c));
                break;
            case 4:
                fo foVar3 = this.b;
                foVar3.getClass();
                foVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 5:
                fo foVar4 = this.b;
                org.telegram.ui.Components.sc v = org.telegram.ui.Components.zc.v(foVar4.getParentActivity(), foVar4, null, 1, this.c, 1, foVar4.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), foVar4.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 6:
                org.telegram.ui.Components.zc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(t8.b.e(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ re(fo foVar, long j10, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = j10;
    }
}

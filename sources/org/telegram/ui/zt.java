package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zt(Object obj, Object obj2, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        switch (this.a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                Long l10 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((yt) this.d);
                dataSettingsActivity.S = dataSettingsActivity.S || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.U = l10.longValue();
                dataSettingsActivity.T = false;
                if (dataSettingsActivity.a != null && (i9 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.m0(i9);
                    break;
                }
                break;
            case 1:
                dx dxVar = (dx) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) this.d).q(150L);
                dy dyVar = dxVar.b;
                Boolean bool = dyVar.C.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    dyVar.getMessagesController().addUserToChat(this.b, dyVar.getMessagesController().getUser(Long.valueOf(dyVar.D)), 0, null, dyVar, false, runnable, new bf(8, runnable));
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                ProfileActivity.j0((ProfileActivity) this.c, (Context) this.d, this.b, (TL_payments.connectedBotStarRef) obj);
                break;
        }
    }
}

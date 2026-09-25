package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ui1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p81(22, (vi1) this.b, (int[]) this.c));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new jr0((qg.n2) this.b, tLObject, (qg.l2) this.c, tL_error, 25));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cn0(tLObject, (MessagesController) this.b, (tg.x0) this.c, 28));
                break;
            case 3:
                MessagesController messagesController = (MessagesController) this.b;
                bt btVar = (bt) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1(24, btVar, arrayList));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.r((org.telegram.ui.Components.zr0) this.b, tL_error, (org.telegram.ui.ActionBar.m2) this.c, 4));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.r((xh.v3) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 7));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.r((yh.g) this.b, tLObject, (Context) this.c, 8));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.j1((yh.x3) this.b, tLObject, (tg.r) this.c, tL_error, 0));
                break;
            case 8:
                yh.x3.f1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.c, (yh.x3) this.b);
                break;
            case 9:
                yh.x3.V0((yh.x3) this.b, (org.telegram.ui.ActionBar.a2) this.c, tLObject, tL_error);
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.r((yh.s5) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 17));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tg.r((yh.s5) this.b, tLObject, (Runnable) this.c, 18));
                break;
        }
    }
}

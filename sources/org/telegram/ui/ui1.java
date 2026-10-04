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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                AndroidUtilities.runOnUIThread(new g91(20, (vi1) this.b, (int[]) this.c));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new zr0((qg.n2) this.b, tLObject, (qg.l2) this.c, tL_error, 24));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(tLObject, (MessagesController) this.b, (tg.x0) this.c, 29));
                break;
            case 3:
                MessagesController messagesController = (MessagesController) this.b;
                ft ftVar = (ft) this.c;
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(25, ftVar, arrayList));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.q((org.telegram.ui.Components.fs0) this.b, tL_error, (org.telegram.ui.ActionBar.n2) this.c));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.q((xh.v3) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 8));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.q((yh.g) this.b, tLObject, (Context) this.c, 9));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.j1((yh.x3) this.b, tLObject, (tg.q) this.c, tL_error, 0));
                break;
            case 8:
                yh.x3.f1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.c, (yh.x3) this.b);
                break;
            case 9:
                yh.x3.V0((yh.x3) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, tL_error);
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.q((yh.t5) this.b, tLObject, tL_error, (Utilities.Callback) this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tg.q((yh.t5) this.b, tLObject, (Runnable) this.c, 19));
                break;
        }
    }
}

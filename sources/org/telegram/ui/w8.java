package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ w8(int i10, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, org.telegram.ui.Components.c90 c90Var, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = 0;
        this.b = i10;
        this.c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f = c90Var;
        this.g = g3Var;
        this.h = f6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.c90 c90Var = (org.telegram.ui.Components.c90) obj3;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.b;
                if (z10) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new ci.kd(strArr, frameLayout, c90Var, g3Var, f6Var, 1));
                break;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform == null) {
                    AndroidUtilities.runOnUIThread(new xq(externalActionActivity, c2Var, tL_error, 5));
                    break;
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new w8(externalActionActivity, c2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    break;
                }
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.y5((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.c2) obj5, tLObject, this.b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb((hg0) obj6, tLObject, tL_error, (c5.k) obj5, this.b, (c5.o) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                break;
        }
    }

    public /* synthetic */ w8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = tLObject;
        this.g = str;
        this.h = obj3;
    }
}

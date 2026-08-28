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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ t8(int i9, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.l80 l80Var, String[] strArr) {
        this.a = 0;
        this.b = i9;
        this.c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f = l80Var;
        this.g = f3Var;
        this.h = b6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i9) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) obj3;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i10 = this.b;
                if (z10) {
                    MessagesController.getInstance(i10).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new bg.h0(strArr, frameLayout, l80Var, f3Var, b6Var, 4));
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
                    AndroidUtilities.runOnUIThread(new jq(externalActionActivity, c2Var, tL_error, 5));
                    break;
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.b;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new t8(externalActionActivity, c2Var, i11, authorizationform, getauthorizationform, str, str2, 2));
                    break;
                }
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.x5((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.c2) obj5, tLObject, this.b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                break;
            default:
                AndroidUtilities.runOnUIThread(new gh.u6((of0) obj6, tLObject, tL_error, (n2.i) obj5, this.b, (n2.l) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj, 5));
                break;
        }
    }

    public /* synthetic */ t8(KeyEvent.Callback callback, Object obj, int i9, Object obj2, TLObject tLObject, String str, Object obj3, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.b = i9;
        this.e = obj2;
        this.f = tLObject;
        this.g = str;
        this.h = obj3;
    }
}

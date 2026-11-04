package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ly d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ u60(LaunchActivity launchActivity, ly lyVar, int i3, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.a = 0;
        this.b = launchActivity;
        this.d = lyVar;
        this.c = i3;
        this.i = authorizationform;
        this.e = getauthorizationform;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.i;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new ci.p8(this.b, this.d, tLObject, this.c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                break;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.E1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.b;
                ly lyVar = this.d;
                if (authorizationform == null) {
                    org.telegram.messenger.g0.h3(new pp(launchActivity, lyVar, tL_error, 15));
                    break;
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new u60(launchActivity, lyVar, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    break;
                }
            default:
                String str6 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new ci.p8(this.b, tLObject, (int[]) obj5, this.c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 1));
                break;
        }
    }

    public /* synthetic */ u60(LaunchActivity launchActivity, int[] iArr, int i3, ly lyVar, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.i = iArr;
        this.c = i3;
        this.d = lyVar;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}

package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;
    public final /* synthetic */ f70 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ z70(LaunchActivity launchActivity, f70 f70Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.a = 0;
        this.b = launchActivity;
        this.d = f70Var;
        this.c = i10;
        this.i = authorizationform;
        this.e = getauthorizationform;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new t70(this.b, this.d, tLObject, this.c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj));
                break;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.D1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.b;
                f70 f70Var = this.d;
                if (authorizationform == null) {
                    org.telegram.messenger.i0.g3(new qq(launchActivity, f70Var, tL_error, 15));
                    break;
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new z70(launchActivity, f70Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    break;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new t70(this.b, tLObject, (int[]) obj5, this.c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj));
                break;
        }
    }

    public /* synthetic */ z70(LaunchActivity launchActivity, int[] iArr, int i10, f70 f70Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.b = launchActivity;
        this.i = iArr;
        this.c = i10;
        this.d = f70Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}

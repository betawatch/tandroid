package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u80 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;
    public final /* synthetic */ g00 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ u80(LaunchActivity launchActivity, g00 g00Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.a = 0;
        this.b = launchActivity;
        this.d = g00Var;
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
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new lh.s6(this.b, this.d, tLObject, this.c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                break;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.y1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.b;
                g00 g00Var = this.d;
                if (authorizationform == null) {
                    AndroidUtilities.runOnUIThread(new rq(launchActivity, g00Var, tL_error, 14));
                    break;
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new u80(launchActivity, g00Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    break;
                }
            default:
                Pattern pattern3 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new lh.s6(this.b, tLObject, (int[]) obj5, this.c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 4));
                break;
        }
    }

    public /* synthetic */ u80(LaunchActivity launchActivity, int[] iArr, int i10, g00 g00Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.b = launchActivity;
        this.i = iArr;
        this.c = i10;
        this.d = g00Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}

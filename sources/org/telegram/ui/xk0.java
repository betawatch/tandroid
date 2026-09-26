package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xk0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = serializable;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.e;
        Serializable serializable = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                ((org.telegram.ui.ActionBar.a2) obj5).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.e3 e3Var2 = cl0.a;
                    if (e3Var2 != null) {
                        e3Var2.dismiss();
                        cl0.a = null;
                    }
                    cl0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, d6Var)), R.raw.error).j();
                    break;
                } else {
                    cl0.a = e3Var;
                    e3Var.show();
                    break;
                }
            case 1:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj5;
                ai.da daVar = (ai.da) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.d6 d6Var2 = b1Var.e;
                if (updates == null) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.xc(b1Var, d6Var2).c0("UNKNOWN_BUTTON", false);
                        b1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.b1.B(str2, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.xc(b1Var, d6Var2).d0(tL_error, false);
                        b1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.b1.B(str2, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(b1Var.M).processUpdates(updates, false);
                    b1Var.y(daVar, "requested_chat_sent", org.telegram.ui.web.b1.B(str2, "req_id"));
                    long j3 = b1Var.U.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.e0 e0Var = new org.telegram.ui.web.e0(b1Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(e0Var);
                    }
                    org.telegram.ui.web.g0 g0Var = b1Var.c;
                    if (g0Var != null) {
                        g0Var.b();
                        break;
                    }
                }
                break;
            default:
                yh.x3.c0((yh.x3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}

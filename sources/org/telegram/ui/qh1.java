package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hi.l((UserInfoActivity) this.b, tL_error, (TLObject) this.c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f, (ArrayList) this.g));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hi.l(tL_error, (sg.v) this.b, tLObject, (List) this.c, (c5.h) this.d, (sg.v) this.e, (org.telegram.ui.ActionBar.p2) this.f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.g, 3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hi.l(tL_error, (Utilities.Callback) this.b, tLObject, (List) this.c, (c5.h) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.p2) this.f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.g, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new hi.l(tLObject, (c5.o) this.b, (c5.h) this.c, (bi.k6) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f, (List) this.g, tL_error, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new hi.l(tLObject, (c5.o) this.b, (c5.h) this.c, (org.telegram.ui.Components.n80) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f, (List) this.g, tL_error, 6));
                break;
        }
    }
}

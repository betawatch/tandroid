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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ sh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
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
                AndroidUtilities.runOnUIThread(new ji.k((UserInfoActivity) this.b, tL_error, (TLObject) this.c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f, (ArrayList) this.g));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ji.k(tL_error, (ug.v) this.b, tLObject, (List) this.c, (c5.i) this.d, (ug.v) this.e, (org.telegram.ui.ActionBar.m2) this.f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.g, 7));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ji.k(tL_error, (Utilities.Callback) this.b, tLObject, (List) this.c, (c5.i) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.m2) this.f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.g, 8));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ji.k(tLObject, (c5.p) this.b, (c5.i) this.c, (rh.s) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f, (List) this.g, tL_error, 9));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ji.k(tLObject, (c5.p) this.b, (c5.i) this.c, (org.telegram.ui.Components.d90) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f, (List) this.g, tL_error, 10));
                break;
        }
    }
}

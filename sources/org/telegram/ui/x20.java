package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x20 implements RequestDelegate {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ x20(int i10, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.u uVar, dh.v vVar) {
        this.b = i10;
        this.e = d2Var;
        this.f = context;
        this.d = j10;
        this.g = f6Var;
        this.h = uVar;
        this.c = vVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                String str = (String) obj;
                c60.v((c60) obj5, this.d, (HashSet) obj4, (AtomicInteger) obj3, this.b, (ChatObject.Call) obj2, str, tLObject, tL_error);
                break;
            case 1:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new m90((LaunchActivity) obj5, tLObject, this.b, (String) obj, (String) obj4, (TLRPC.User) obj3, (String) obj2, this.d));
                break;
            case 2:
                Activity activity = (Activity) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new v21(xnVar, activity, f6Var, messageObject, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new uh(xnVar, this.b, messageObject), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new v21(xnVar, activity, f6Var, messageObject, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new lf.g0(tLObject, activity, f6Var, this.d, bArr, xnVar, messageObject));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new m90(tLObject, this.b, (org.telegram.ui.ActionBar.d2) obj5, (Context) obj4, this.d, (org.telegram.ui.ActionBar.f6) obj3, (org.telegram.ui.web.u) obj2, (dh.v) obj));
                break;
        }
    }

    public /* synthetic */ x20(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, long j10, byte[] bArr, xn xnVar, MessageObject messageObject, int i10) {
        this.e = activity;
        this.f = f6Var;
        this.d = j10;
        this.g = bArr;
        this.h = xnVar;
        this.c = messageObject;
        this.b = i10;
    }

    public /* synthetic */ x20(c60 c60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.e = c60Var;
        this.d = j10;
        this.f = hashSet;
        this.g = atomicInteger;
        this.b = i10;
        this.h = call;
        this.c = str;
    }

    public /* synthetic */ x20(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.b = i10;
        this.c = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.d = j10;
    }
}

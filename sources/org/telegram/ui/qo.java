package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qo(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 4;
        int i13 = 7;
        int i14 = 13;
        int i15 = 11;
        int i16 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                wo woVar = (wo) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = woVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    woVar.getMessagesStorage().updateUserInfo(woVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new oo(woVar, i11));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new wh(i15, (wp) obj2, (org.telegram.ui.ActionBar.c2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5(obj2, (Object) tL_error, tLObject, obj, 12));
                break;
            case 3:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) obj2;
                NotificationCenter.getInstance(k5Var.e).doOnIdle(new org.telegram.ui.Components.j5(k5Var, (ArrayList) obj, tLObject, i16));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((org.telegram.ui.Components.h8) obj2, (org.telegram.ui.ActionBar.c2) obj, tLObject, i13));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oh(i11, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oh(3, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((org.telegram.ui.Components.kp) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, i14));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ny(i12, (org.telegram.ui.Components.c10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5(obj2, (Object) tL_error, tLObject, obj, 22));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5(obj2, (Object) tL_error, tLObject, obj, 24));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((org.telegram.ui.Components.v80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((org.telegram.ui.Components.qg0) obj2, (org.telegram.ui.Components.pg0) obj, tLObject, 26));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ny((org.telegram.ui.Components.iq0) obj2, tLObject, (Context) obj));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.wx0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((ts0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.g01) obj2, (org.telegram.ui.ActionBar.c2) obj, tLObject, tL_error, 4));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.w31) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new xq((iz) obj2, tLObject, (MessageObject) obj, i12));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new mw(i13, (c00) obj2, (org.telegram.ui.ActionBar.c2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new mw(i15, (h10) obj2, (org.telegram.ui.ActionBar.c2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new xq((a10) obj2, tL_error, (z00) obj, 8));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new mw(i14, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((r50) obj2, tL_error, tLObject, (String) obj, 10));
                break;
            case 24:
                r70 r70Var = (r70) obj2;
                if (Objects.equals(r70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new mw(21, r70Var, tLObject));
                    break;
                }
                break;
            case 25:
                f80 f80Var = (f80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new xq(f80Var, (TLRPC.TL_langPackString) langPackString, str, i15));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new xq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 17));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((org.telegram.ui.ActionBar.c2) obj2, tLObject, (h) obj, tL_error, 14));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new xq((hc0) obj2, tLObject, (String) obj, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xq((ec0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
        }
    }
}

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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                AndroidUtilities.runOnUIThread(new uh(i15, (wp) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(obj2, (Object) tL_error, tLObject, obj, 12));
                break;
            case 3:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) obj2;
                NotificationCenter.getInstance(k5Var.e).doOnIdle(new org.telegram.ui.Components.j5(k5Var, (ArrayList) obj, tLObject, i16));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.h8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, i13));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oh(i11, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oh(3, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.kp) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, i14));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ny(i12, (org.telegram.ui.Components.c10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(obj2, (Object) tL_error, tLObject, obj, 22));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(obj2, (Object) tL_error, tLObject, obj, 24));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.Components.v80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.pg0) obj2, (org.telegram.ui.Components.og0) obj, tLObject, 26));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ny((org.telegram.ui.Components.hq0) obj2, tLObject, (Context) obj));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.vx0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((rs0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.f01) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 4));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.v31) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new xq((gz) obj2, tLObject, (MessageObject) obj, i12));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new kw(i13, (a00) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new kw(i15, (f10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new xq((y00) obj2, tL_error, (x00) obj, 8));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new kw(i14, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((p50) obj2, tL_error, tLObject, (String) obj, 10));
                break;
            case 24:
                p70 p70Var = (p70) obj2;
                if (Objects.equals(p70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new kw(21, p70Var, tLObject));
                    break;
                }
                break;
            case 25:
                d80 d80Var = (d80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new xq(d80Var, (TLRPC.TL_langPackString) langPackString, str, i15));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new xq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, 17));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 14));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new xq((fc0) obj2, tLObject, (String) obj, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xq((cc0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
        }
    }
}

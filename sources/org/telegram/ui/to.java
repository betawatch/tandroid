package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ to(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 18;
        int i12 = 2;
        int i13 = 8;
        int i14 = 17;
        int i15 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                zo zoVar = (zo) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = zoVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    zoVar.getMessagesStorage().updateUserInfo(zoVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new ro(zoVar, i12));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new jd(25, (aq) obj2, (org.telegram.ui.ActionBar.a2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new p6((tq) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, 10));
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj2;
                NotificationCenter.getInstance(o5Var.e).doOnIdle(new org.telegram.ui.Components.n5(o5Var, (ArrayList) obj, tLObject, i15));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.Components.m8) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, 12));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new vp(i14, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new vp(i11, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.Components.xp) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vm(22, (org.telegram.ui.Components.o10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.o10) obj2, tL_error, tLObject, (Utilities.Callback) obj, 20));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.e40) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 22));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.w90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 24));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ze0((org.telegram.ui.Components.qh0) obj2, (org.telegram.ui.Components.ph0) obj, tLObject, i12));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g90((org.telegram.ui.Components.ir0) obj2, tLObject, (Context) obj, i14));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((org.telegram.ui.Components.uy0) obj2, tL_error, tLObject, (MediaDataController) obj, 0));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(obj2, (Object) tL_error, (Object) tLObject, obj, 1));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((KeyEvent.Callback) obj2, obj, tLObject, tL_error, 2));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(obj2, (Object) tL_error, (Object) tLObject, obj, 4));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new br((kz) obj2, tLObject, (MessageObject) obj, 4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n51(24, (f00) obj2, (org.telegram.ui.ActionBar.a2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n51(28, (k10) obj2, (org.telegram.ui.ActionBar.a2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new br((d10) obj2, tL_error, (c10) obj, i13));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new d20(i15, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((u50) obj2, tL_error, tLObject, (String) obj, 8));
                break;
            case 24:
                u70 u70Var = (u70) obj2;
                if (Objects.equals(u70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new d20(i13, u70Var, tLObject));
                    break;
                }
                break;
            case 25:
                h80 h80Var = (h80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new br(h80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new br((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, i14));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(obj2, tLObject, obj, tL_error, 12));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new br((ic0) obj2, tLObject, (String) obj, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new br((fc0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
        }
    }
}

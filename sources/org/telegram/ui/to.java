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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        int i11 = 5;
        int i12 = 0;
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
                AndroidUtilities.runOnUIThread(new ro(zoVar, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rp(i12, (aq) obj2, (org.telegram.ui.ActionBar.a2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new p6((tq) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, 11));
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj2;
                NotificationCenter.getInstance(o5Var.e).doOnIdle(new org.telegram.ui.Components.n5(o5Var, (ArrayList) obj, tLObject, i12));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new n2.h((org.telegram.ui.Components.m8) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, 15));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new rp(22, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new rp(23, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new n2.h((org.telegram.ui.Components.xp) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, 21));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sk(27, (org.telegram.ui.Components.o10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.o10) obj2, tL_error, tLObject, (Utilities.Callback) obj, 21));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.e40) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 23));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.w90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 25));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v70((org.telegram.ui.Components.qh0) obj2, (org.telegram.ui.Components.ph0) obj, tLObject, i11));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.f60((org.telegram.ui.Components.jr0) obj2, tLObject, (Context) obj));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((org.telegram.ui.Components.ty0) obj2, tL_error, tLObject, (MediaDataController) obj, 1));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((ys0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 2));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((org.telegram.ui.Components.g11) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, tL_error, 3));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((org.telegram.ui.Components.x41) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 5));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new br((kz) obj2, tLObject, (MessageObject) obj, 4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k31(29, (f00) obj2, (org.telegram.ui.ActionBar.a2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new o00(3, (l10) obj2, (org.telegram.ui.ActionBar.a2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new br((e10) obj2, tL_error, (d10) obj, 8));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new o00(i11, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((u50) obj2, tL_error, tLObject, (String) obj, 9));
                break;
            case 24:
                u70 u70Var = (u70) obj2;
                if (Objects.equals(u70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new o00(13, u70Var, tLObject));
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
                AndroidUtilities.runOnUIThread(new br((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, 17));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((org.telegram.ui.ActionBar.a2) obj2, tLObject, (h) obj, tL_error, 13));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new br((jc0) obj2, tLObject, (String) obj, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new br((gc0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
        }
    }
}

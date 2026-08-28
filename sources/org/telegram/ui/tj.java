package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tj extends org.telegram.ui.Components.w90 {
    public boolean R;
    public final /* synthetic */ qn S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(qn qnVar, Context context, long j10, long j11, qn qnVar2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, j10, j11, qnVar2, b6Var);
        this.S = qnVar;
        this.R = true;
    }

    @Override // org.telegram.ui.Components.w90
    public final boolean a() {
        qn qnVar = this.S;
        return qnVar.N.getVisibility() != 0 || qnVar.j3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.w90
    public final void j() {
        this.S.sc();
    }

    @Override // org.telegram.ui.Components.w90
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        qn qnVar = this.S;
        if (qnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            qnVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        pl plVar = qnVar.Ea;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.gu.I(qnVar, null, plVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, qnVar.x9());
    }

    @Override // org.telegram.ui.Components.w90
    public final void l(boolean z10) {
        String string;
        qn qnVar = this.S;
        ak akVar = qnVar.U;
        if (akVar != null) {
            of.f1 adapter = getAdapter();
            TLRPC.User user = adapter.s0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.m0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            akVar.setCaption(string);
            org.telegram.ui.Components.ne neVar = qnVar.U.K1;
            if (neVar == null) {
                return;
            }
            if (!z10) {
                neVar.e = false;
                return;
            }
            neVar.e = true;
            neVar.b = System.currentTimeMillis();
            neVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.w90
    public final void m() {
        qn qnVar = this.S;
        if (qnVar.V4 && ((getAdapter().N == null || qnVar.W4 || qnVar.X4) && qnVar.h != null && getAdapter().N != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.aa);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                qnVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        qnVar.sc();
    }

    @Override // org.telegram.ui.Components.w90
    public final void n(boolean z10) {
        if (this.R != z10) {
            qn qnVar = this.S;
            AndroidUtilities.updateViewShow(qnVar.Z0, !qnVar.isInPreviewMode() && z10, false, true);
            this.R = z10;
        }
    }
}

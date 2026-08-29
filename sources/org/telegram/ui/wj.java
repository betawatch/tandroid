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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wj extends org.telegram.ui.Components.ka0 {
    public boolean R;
    public final /* synthetic */ tn S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(tn tnVar, Context context, long j10, long j11, tn tnVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j10, j11, tnVar2, c6Var);
        this.S = tnVar;
        this.R = true;
    }

    @Override // org.telegram.ui.Components.ka0
    public final boolean a() {
        tn tnVar = this.S;
        return tnVar.N.getVisibility() != 0 || tnVar.j3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ka0
    public final void j() {
        this.S.sc();
    }

    @Override // org.telegram.ui.Components.ka0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        tn tnVar = this.S;
        if (tnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            tnVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        sl slVar = tnVar.Ea;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.mu.I(tnVar, null, slVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, tnVar.x9());
    }

    @Override // org.telegram.ui.Components.ka0
    public final void l(boolean z10) {
        String string;
        tn tnVar = this.S;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            rf.v0 adapter = getAdapter();
            TLRPC.User user = adapter.s0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.m0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            dkVar.setCaption(string);
            org.telegram.ui.Components.qe qeVar = tnVar.U.K1;
            if (qeVar == null) {
                return;
            }
            if (!z10) {
                qeVar.e = false;
                return;
            }
            qeVar.e = true;
            qeVar.b = System.currentTimeMillis();
            qeVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.ka0
    public final void m() {
        tn tnVar = this.S;
        if (tnVar.V4 && ((getAdapter().N == null || tnVar.W4 || tnVar.X4) && tnVar.h != null && getAdapter().N != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.aa);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                tnVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        tnVar.sc();
    }

    @Override // org.telegram.ui.Components.ka0
    public final void n(boolean z10) {
        if (this.R != z10) {
            tn tnVar = this.S;
            AndroidUtilities.updateViewShow(tnVar.Z0, !tnVar.isInPreviewMode() && z10, false, true);
            this.R = z10;
        }
    }
}

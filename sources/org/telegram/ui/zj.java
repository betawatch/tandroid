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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class zj extends org.telegram.ui.Components.ib0 {
    public boolean V;
    public final /* synthetic */ sn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(sn snVar, Context context, long j10, long j11, sn snVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j10, j11, snVar2, d6Var);
        this.W = snVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.ib0
    public final boolean a() {
        sn snVar = this.W;
        return snVar.R.getVisibility() != 0 || snVar.n3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ib0
    public final void j() {
        this.W.wc();
    }

    @Override // org.telegram.ui.Components.ib0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        sn snVar = this.W;
        if (snVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            snVar.Ba(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        di diVar = snVar.Ja;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.cv.J(snVar, null, diVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, snVar.C9());
    }

    @Override // org.telegram.ui.Components.ib0
    public final void l(boolean z10) {
        String string;
        sn snVar = this.W;
        hk hkVar = snVar.Y;
        if (hkVar != null) {
            hg.j1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            hkVar.setCaption(string);
            org.telegram.ui.Components.we weVar = snVar.Y.P1;
            if (weVar == null) {
                return;
            }
            if (!z10) {
                weVar.e = false;
                return;
            }
            weVar.e = true;
            weVar.b = System.currentTimeMillis();
            weVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.ib0
    public final void m() {
        sn snVar = this.W;
        if (snVar.Z4 && ((getAdapter().R == null || snVar.a5 || snVar.b5) && snVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                snVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        snVar.wc();
    }

    @Override // org.telegram.ui.Components.ib0
    public final void n(boolean z10) {
        if (this.V != z10) {
            sn snVar = this.W;
            AndroidUtilities.updateViewShow(snVar.d1, !snVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}

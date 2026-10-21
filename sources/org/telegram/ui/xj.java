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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class xj extends org.telegram.ui.Components.ib0 {
    public boolean V;
    public final /* synthetic */ qn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(qn qnVar, Context context, long j10, long j11, qn qnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j10, j11, qnVar2, d6Var);
        this.W = qnVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.ib0
    public final boolean a() {
        qn qnVar = this.W;
        return qnVar.R.getVisibility() != 0 || qnVar.n3;
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
        this.W.xc();
    }

    @Override // org.telegram.ui.Components.ib0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        qn qnVar = this.W;
        if (qnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            qnVar.Ba(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        bi biVar = qnVar.Ja;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.cv.J(qnVar, null, biVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, qnVar.C9());
    }

    @Override // org.telegram.ui.Components.ib0
    public final void l(boolean z10) {
        String string;
        qn qnVar = this.W;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            hg.j1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            fkVar.setCaption(string);
            org.telegram.ui.Components.we weVar = qnVar.Y.P1;
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
        qn qnVar = this.W;
        if (qnVar.Z4 && ((getAdapter().R == null || qnVar.a5 || qnVar.b5) && qnVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                qnVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        qnVar.xc();
    }

    @Override // org.telegram.ui.Components.ib0
    public final void n(boolean z10) {
        if (this.V != z10) {
            qn qnVar = this.W;
            AndroidUtilities.updateViewShow(qnVar.d1, !qnVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}

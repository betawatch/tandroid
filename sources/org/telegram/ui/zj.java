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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zj extends org.telegram.ui.Components.gb0 {
    public boolean V;
    public final /* synthetic */ un W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(un unVar, Context context, long j10, long j11, un unVar2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, j10, j11, unVar2, u6Var);
        this.W = unVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.gb0
    public final boolean a() {
        un unVar = this.W;
        return unVar.R.getVisibility() != 0 || unVar.z3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.gb0
    public final void j() {
        this.W.Fc();
    }

    @Override // org.telegram.ui.Components.gb0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        un unVar = this.W;
        if (unVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            unVar.Ga(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        ci ciVar = unVar.Va;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.dv.I(unVar, null, ciVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, unVar.F9());
    }

    @Override // org.telegram.ui.Components.gb0
    public final void l(boolean z10) {
        String string;
        un unVar = this.W;
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            ig.j1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            hkVar.setCaption(string);
            org.telegram.ui.Components.we weVar = unVar.Y.P1;
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

    @Override // org.telegram.ui.Components.gb0
    public final void m() {
        un unVar = this.W;
        if (unVar.l5 && ((getAdapter().R == null || unVar.m5 || unVar.n5) && unVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.qa);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                unVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        unVar.Fc();
    }

    @Override // org.telegram.ui.Components.gb0
    public final void n(boolean z10) {
        if (this.V != z10) {
            un unVar = this.W;
            AndroidUtilities.updateViewShow(unVar.p1, !unVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}

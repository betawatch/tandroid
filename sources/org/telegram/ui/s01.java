package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class s01 extends ClickableSpan {
    public final /* synthetic */ TLRPC.TL_username a;
    public final /* synthetic */ String b;
    public final /* synthetic */ z01 c;

    public s01(z01 z01Var, TLRPC.TL_username tL_username, String str) {
        this.c = z01Var;
        this.a = tL_username;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.c.e;
        TLRPC.TL_username tL_username = this.a;
        if (!tL_username.editable) {
            if (profileActivity.i5 == this) {
                return;
            }
            profileActivity.M4(this);
            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
            TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
            tL_inputCollectibleUsername.username = tL_username.username;
            tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
            profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new dc0(18, this, tL_username)), profileActivity.getClassGuid());
            return;
        }
        profileActivity.M4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.b;
        TLRPC.Chat chat = profileActivity.E2;
        if (chat == null || !chat.noforwards) {
            AndroidUtilities.addToClipboard(str);
            profileActivity.M.j(56, 0L, null);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}

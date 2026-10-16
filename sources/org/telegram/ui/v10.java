package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v10 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ w10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(w10 w10Var, Context context) {
        super(context, 1, null);
        this.l0 = w10Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        w10 w10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? w10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        b20 b20Var = w10Var.v;
        String str = b20Var.Q;
        long j10 = b20Var.E;
        long j11 = b20Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, b20Var.y);
        b20 b20Var2 = w10Var.v;
        playlistGlobalSearchParams.endReached = b20Var2.N;
        playlistGlobalSearchParams.nextSearchRate = b20Var2.v;
        playlistGlobalSearchParams.totalCount = b20Var2.O;
        playlistGlobalSearchParams.folderId = b20Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(w10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}

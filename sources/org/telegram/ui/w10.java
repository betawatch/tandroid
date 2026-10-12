package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class w10 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ x10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(x10 x10Var, Context context) {
        super(context, 1, null);
        this.l0 = x10Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        x10 x10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? x10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        c20 c20Var = x10Var.v;
        String str = c20Var.Q;
        long j10 = c20Var.E;
        long j11 = c20Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, c20Var.y);
        c20 c20Var2 = x10Var.v;
        playlistGlobalSearchParams.endReached = c20Var2.N;
        playlistGlobalSearchParams.nextSearchRate = c20Var2.v;
        playlistGlobalSearchParams.totalCount = c20Var2.O;
        playlistGlobalSearchParams.folderId = c20Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(x10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}

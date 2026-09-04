package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class r10 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ s10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(s10 s10Var, Context context) {
        super(context, 1, null);
        this.l0 = s10Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        s10 s10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? s10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        x10 x10Var = s10Var.v;
        String str = x10Var.Q;
        long j3 = x10Var.E;
        long j10 = x10Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, x10Var.y);
        x10 x10Var2 = s10Var.v;
        playlistGlobalSearchParams.endReached = x10Var2.N;
        playlistGlobalSearchParams.nextSearchRate = x10Var2.v;
        playlistGlobalSearchParams.totalCount = x10Var2.O;
        playlistGlobalSearchParams.folderId = x10Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(s10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}

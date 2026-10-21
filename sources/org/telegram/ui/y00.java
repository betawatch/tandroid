package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class y00 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ z00 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y00(z00 z00Var, Context context) {
        super(context, 1, null);
        this.l0 = z00Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        z00 z00Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? z00Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        e10 e10Var = z00Var.v;
        String str = e10Var.Q;
        long j10 = e10Var.E;
        long j11 = e10Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, e10Var.y);
        e10 e10Var2 = z00Var.v;
        playlistGlobalSearchParams.endReached = e10Var2.N;
        playlistGlobalSearchParams.nextSearchRate = e10Var2.v;
        playlistGlobalSearchParams.totalCount = e10Var2.O;
        playlistGlobalSearchParams.folderId = e10Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(z00Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}

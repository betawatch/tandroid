package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t10 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ u10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t10(u10 u10Var, Context context) {
        super(context, 1, null);
        this.l0 = u10Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        u10 u10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? u10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        z10 z10Var = u10Var.v;
        String str = z10Var.Q;
        long j3 = z10Var.E;
        long j10 = z10Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, z10Var.y);
        z10 z10Var2 = u10Var.v;
        playlistGlobalSearchParams.endReached = z10Var2.N;
        playlistGlobalSearchParams.nextSearchRate = z10Var2.v;
        playlistGlobalSearchParams.totalCount = z10Var2.O;
        playlistGlobalSearchParams.folderId = z10Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(u10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}

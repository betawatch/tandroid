package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z00 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ a10 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z00(a10 a10Var, Context context) {
        super(context, 1, null);
        this.h0 = a10Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        a10 a10Var = this.h0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? a10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        f10 f10Var = a10Var.v;
        String str = f10Var.M;
        long j10 = f10Var.A;
        long j11 = f10Var.D;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, f10Var.y);
        f10 f10Var2 = a10Var.v;
        playlistGlobalSearchParams.endReached = f10Var2.J;
        playlistGlobalSearchParams.nextSearchRate = f10Var2.v;
        playlistGlobalSearchParams.totalCount = f10Var2.K;
        playlistGlobalSearchParams.folderId = f10Var2.F ? 1 : 0;
        return MediaController.getInstance().setPlaylist(a10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}

package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class sz0 extends ProfileStoriesView {
    public final /* synthetic */ Context t0;
    public final /* synthetic */ ProfileActivity u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(ProfileActivity profileActivity, Context context, int i10, long j3, boolean z10, j0 j0Var, pz0 pz0Var, org.telegram.ui.ActionBar.e6 e6Var, Context context2) {
        super(context, i10, j3, z10, j0Var, pz0Var, e6Var);
        this.u0 = profileActivity;
        this.t0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(a6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.u0;
        long a2 = profileActivity.a();
        ai.l9 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.t0;
        if (I || storiesController.K(a2) || storiesController.N(a2)) {
            profileActivity.getOrCreateStoryViewer().D(context, a2, iVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.v2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.e1 != profileActivity.getUserConfig().clientUserId) {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.v2.stories, iVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.u2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.K3();
        } else {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.u2.stories, iVar);
        }
    }
}

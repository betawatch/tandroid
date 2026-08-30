package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zy0 extends ProfileStoriesView {
    public final /* synthetic */ Context q0;
    public final /* synthetic */ ProfileActivity r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z4, l0 l0Var, wy0 wy0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context2) {
        super(context, i10, j10, z4, l0Var, wy0Var, f6Var);
        this.r0 = profileActivity;
        this.q0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(a3.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.r0;
        long a2 = profileActivity.a();
        nh.t6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.q0;
        if (I || storiesController.K(a2) || storiesController.N(a2)) {
            profileActivity.getOrCreateStoryViewer().D(context, a2, cVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.s2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.b1 != profileActivity.getUserConfig().clientUserId) {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.s2.stories, cVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.r2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.K3();
        } else {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.r2.stories, cVar);
        }
    }
}

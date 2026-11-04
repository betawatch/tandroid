package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tu0 extends ProfileStoriesView {
    public final /* synthetic */ Context u0;
    public final /* synthetic */ ProfileActivity v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(ProfileActivity profileActivity, Context context, int i3, long j10, boolean z10, l0 l0Var, qu0 qu0Var, org.telegram.ui.ActionBar.e6 e6Var, Context context2) {
        super(context, i3, j10, z10, l0Var, qu0Var, e6Var);
        this.v0 = profileActivity;
        this.u0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(c6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.v0;
        long a10 = profileActivity.a();
        ei.z6 P1 = profileActivity.getMessagesController().P1();
        boolean K = P1.K(a10);
        Context context = this.u0;
        if (K || P1.M(a10) || P1.Q(a10)) {
            profileActivity.getOrCreateStoryViewer().R(context, a10, iVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.v2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.e1 != profileActivity.getUserConfig().n) {
            profileActivity.getOrCreateStoryViewer().S(context, profileActivity.v2.stories, iVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.u2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.a4();
        } else {
            profileActivity.getOrCreateStoryViewer().S(context, profileActivity.u2.stories, iVar);
        }
    }
}

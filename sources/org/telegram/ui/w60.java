package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w60 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ h60 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ w60(LaunchActivity launchActivity, h60 h60Var, Long l10, int i7) {
        this.a = i7;
        this.b = launchActivity;
        this.c = h60Var;
        this.d = l10;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7 = this.a;
        Long l10 = this.d;
        h60 h60Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    h60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q != null) {
                            storyItem.dialogId = l10.longValue();
                            fi.f9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                            createOverlayStoryViewer.B();
                            createOverlayStoryViewer.L(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.lc Y = org.telegram.ui.Components.lc.Y();
                        if (Y != null) {
                            org.telegram.messenger.f3.n(null, 2131744363, Y, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.lc Y2 = org.telegram.ui.Components.lc.Y();
                    if (Y2 != null) {
                        org.telegram.messenger.f3.n(null, 2131744363, Y2, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
            default:
                String str2 = LaunchActivity.C1;
                try {
                    h60Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q2 != null) {
                            storyItem.dialogId = l10.longValue();
                            fi.f9 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.B();
                            createOverlayStoryViewer2.L(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.lc Y3 = org.telegram.ui.Components.lc.Y();
                        if (Y3 != null) {
                            org.telegram.messenger.f3.n(null, 2131744363, Y3, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.lc Y4 = org.telegram.ui.Components.lc.Y();
                    if (Y4 != null) {
                        org.telegram.messenger.f3.n(null, 2131744363, Y4, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
        }
    }
}

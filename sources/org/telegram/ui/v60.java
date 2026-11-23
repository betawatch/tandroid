package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ i50 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ v60(LaunchActivity launchActivity, i50 i50Var, Long l10, int i7) {
        this.a = i7;
        this.b = launchActivity;
        this.c = i50Var;
        this.d = l10;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        Long l10 = this.d;
        i50 i50Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    i50Var.run();
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
                        org.telegram.ui.Components.kc Y = org.telegram.ui.Components.kc.Y();
                        if (Y != null) {
                            org.telegram.messenger.f3.n(null, 2131744362, Y, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.kc Y2 = org.telegram.ui.Components.kc.Y();
                    if (Y2 != null) {
                        org.telegram.messenger.f3.n(null, 2131744362, Y2, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
            default:
                String str2 = LaunchActivity.C1;
                try {
                    i50Var.run();
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
                        org.telegram.ui.Components.kc Y3 = org.telegram.ui.Components.kc.Y();
                        if (Y3 != null) {
                            org.telegram.messenger.f3.n(null, 2131744362, Y3, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.kc Y4 = org.telegram.ui.Components.kc.Y();
                    if (Y4 != null) {
                        org.telegram.messenger.f3.n(null, 2131744362, Y4, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ g50 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ t60(LaunchActivity launchActivity, g50 g50Var, Long l10, int i7) {
        this.a = i7;
        this.b = launchActivity;
        this.c = g50Var;
        this.d = l10;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        Long l10 = this.d;
        g50 g50Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q != null) {
                            storyItem.dialogId = l10.longValue();
                            fi.i9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                            createOverlayStoryViewer.B();
                            createOverlayStoryViewer.L(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.cc X = org.telegram.ui.Components.cc.X();
                        if (X != null) {
                            org.telegram.messenger.k5.n(null, 2131744606, X, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.cc X2 = org.telegram.ui.Components.cc.X();
                    if (X2 != null) {
                        org.telegram.messenger.k5.n(null, 2131744606, X2, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
            default:
                String str2 = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q2 != null) {
                            storyItem.dialogId = l10.longValue();
                            fi.i9 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.B();
                            createOverlayStoryViewer2.L(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.cc X3 = org.telegram.ui.Components.cc.X();
                        if (X3 != null) {
                            org.telegram.messenger.k5.n(null, 2131744606, X3, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.cc X4 = org.telegram.ui.Components.cc.X();
                    if (X4 != null) {
                        org.telegram.messenger.k5.n(null, 2131744606, X4, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
        }
    }
}

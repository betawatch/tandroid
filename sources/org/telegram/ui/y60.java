package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y60 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ f10 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ y60(LaunchActivity launchActivity, f10 f10Var, Long l10, int i7) {
        this.a = i7;
        this.b = launchActivity;
        this.c = f10Var;
        this.d = l10;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        Long l10 = this.d;
        f10 f10Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                try {
                    f10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q != null) {
                            storyItem.dialogId = l10.longValue();
                            di.q9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                            createOverlayStoryViewer.B();
                            createOverlayStoryViewer.L(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.gc X = org.telegram.ui.Components.gc.X();
                        if (X != null) {
                            org.telegram.messenger.k5.o(null, 2131744606, X, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.gc X2 = org.telegram.ui.Components.gc.X();
                    if (X2 != null) {
                        org.telegram.messenger.k5.o(null, 2131744606, X2, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
            default:
                String str2 = LaunchActivity.B1;
                try {
                    f10Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q2 != null) {
                            storyItem.dialogId = l10.longValue();
                            di.q9 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.B();
                            createOverlayStoryViewer2.L(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.gc X3 = org.telegram.ui.Components.gc.X();
                        if (X3 != null) {
                            org.telegram.messenger.k5.o(null, 2131744606, X3, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.gc X4 = org.telegram.ui.Components.gc.X();
                    if (X4 != null) {
                        org.telegram.messenger.k5.o(null, 2131744606, X4, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
        }
    }
}

package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u70 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ f70 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ u70(LaunchActivity launchActivity, f70 f70Var, Long l4, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = f70Var;
        this.d = l4;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        Long l4 = this.d;
        f70 f70Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q != null) {
                            storyItem.dialogId = l4.longValue();
                            th.o7 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                            createOverlayStoryViewer.J();
                            createOverlayStoryViewer.U(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.cc X = org.telegram.ui.Components.cc.X();
                        if (X != null) {
                            org.telegram.messenger.m5.n(null, 2131744625, X, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.cc X2 = org.telegram.ui.Components.cc.X();
                    if (X2 != null) {
                        org.telegram.messenger.m5.n(null, 2131744625, X2, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q2 != null) {
                            storyItem.dialogId = l4.longValue();
                            th.o7 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.J();
                            createOverlayStoryViewer2.U(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.cc X3 = org.telegram.ui.Components.cc.X();
                        if (X3 != null) {
                            org.telegram.messenger.m5.n(null, 2131744625, X3, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.cc X4 = org.telegram.ui.Components.cc.X();
                    if (X4 != null) {
                        org.telegram.messenger.m5.n(null, 2131744625, X4, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
        }
    }
}

package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class va0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ oa0 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ va0(LaunchActivity launchActivity, oa0 oa0Var, Long l4, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = oa0Var;
        this.d = l4;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        org.telegram.ui.Components.vc X;
        int i10;
        int i11;
        org.telegram.ui.Components.vc X2;
        int i12;
        int i13;
        int i14 = this.a;
        Long l4 = this.d;
        oa0 oa0Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    oa0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R != null) {
                            storyItem.dialogId = l4.longValue();
                            ai.jc createOverlayStoryViewer = R.createOverlayStoryViewer();
                            createOverlayStoryViewer.v();
                            createOverlayStoryViewer.F(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        X = org.telegram.ui.Components.vc.X();
                        if (X != null) {
                            i10 = R.raw.story_bomb1;
                            i11 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    X = org.telegram.ui.Components.vc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    }
                }
                org.telegram.messenger.w1.o(i11, X, i10, 36);
                break;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    oa0Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R2 != null) {
                            storyItem.dialogId = l4.longValue();
                            ai.jc createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.v();
                            createOverlayStoryViewer2.F(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        X2 = org.telegram.ui.Components.vc.X();
                        if (X2 != null) {
                            i12 = R.raw.story_bomb1;
                            i13 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    X2 = org.telegram.ui.Components.vc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    }
                }
                org.telegram.messenger.w1.o(i13, X2, i12, 36);
                break;
        }
    }
}

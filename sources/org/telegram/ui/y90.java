package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y90 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ x20 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ y90(LaunchActivity launchActivity, x20 x20Var, Long l10, int i9) {
        this.a = i9;
        this.b = launchActivity;
        this.c = x20Var;
        this.d = l10;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        org.telegram.ui.Components.oc X;
        int i9;
        int i10;
        org.telegram.ui.Components.oc X2;
        int i11;
        int i12;
        int i13 = this.a;
        Long l10 = this.d;
        x20 x20Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i13) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                try {
                    x20Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R != null) {
                            storyItem.dialogId = l10.longValue();
                            ih.m9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                            createOverlayStoryViewer.v();
                            createOverlayStoryViewer.F(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        X = org.telegram.ui.Components.oc.X();
                        if (X != null) {
                            i9 = R.raw.story_bomb1;
                            i10 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    X = org.telegram.ui.Components.oc.X();
                    if (X != null) {
                        i9 = R.raw.story_bomb2;
                        i10 = R.string.StoryNotFound;
                    }
                }
                org.telegram.messenger.l0.p(i10, X, i9, 36);
                break;
            default:
                Pattern pattern2 = LaunchActivity.x1;
                try {
                    x20Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R2 != null) {
                            storyItem.dialogId = l10.longValue();
                            ih.m9 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.v();
                            createOverlayStoryViewer2.F(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        X2 = org.telegram.ui.Components.oc.X();
                        if (X2 != null) {
                            i11 = R.raw.story_bomb1;
                            i12 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    X2 = org.telegram.ui.Components.oc.X();
                    if (X2 != null) {
                        i11 = R.raw.story_bomb2;
                        i12 = R.string.StoryNotFound;
                    }
                }
                org.telegram.messenger.l0.p(i12, X2, i11, 36);
                break;
        }
    }
}

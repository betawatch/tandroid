package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t80 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ kz c;
    public final /* synthetic */ Long d;

    public /* synthetic */ t80(LaunchActivity launchActivity, kz kzVar, Long l4, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = kzVar;
        this.d = l4;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        org.telegram.ui.Components.wc Y;
        int i10;
        int i11;
        org.telegram.ui.Components.wc Y2;
        int i12;
        int i13;
        int i14 = this.a;
        Long l4 = this.d;
        kz kzVar = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R != null) {
                            storyItem.dialogId = l4.longValue();
                            di.y9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                            createOverlayStoryViewer.w();
                            createOverlayStoryViewer.G(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        Y = org.telegram.ui.Components.wc.Y();
                        if (Y != null) {
                            i10 = R.raw.story_bomb1;
                            i11 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    Y = org.telegram.ui.Components.wc.Y();
                    if (Y != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    }
                }
                org.telegram.messenger.t.q(i11, Y, i10, 36);
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    kzVar.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R2 != null) {
                            storyItem.dialogId = l4.longValue();
                            di.y9 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.w();
                            createOverlayStoryViewer2.G(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        Y2 = org.telegram.ui.Components.wc.Y();
                        if (Y2 != null) {
                            i12 = R.raw.story_bomb1;
                            i13 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    Y2 = org.telegram.ui.Components.wc.Y();
                    if (Y2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    }
                }
                org.telegram.messenger.t.q(i13, Y2, i12, 36);
                break;
        }
    }
}

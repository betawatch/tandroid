package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r80 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ sz c;
    public final /* synthetic */ Long d;

    public /* synthetic */ r80(LaunchActivity launchActivity, sz szVar, Long l4, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = szVar;
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
        sz szVar = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    szVar.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R != null) {
                            storyItem.dialogId = l4.longValue();
                            di.y9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                            createOverlayStoryViewer.v();
                            createOverlayStoryViewer.F(launchActivity, storyItem, null);
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
                    szVar.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R2 != null) {
                            storyItem.dialogId = l4.longValue();
                            di.y9 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.v();
                            createOverlayStoryViewer2.F(launchActivity, storyItem, null);
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

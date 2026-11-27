// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wz5 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ tg5 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ wz5(LaunchActivity launchActivity, tg5 tg5Var, Long l, byte b) {
        this.a = b;
        this.b = launchActivity;
        this.c = tg5Var;
        this.d = l;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        Long l = this.d;
        tg5 tg5Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    tg5Var.run();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                e Q = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q != null) {
                            storyItem.dialogId = l.longValue();
                            lcb createOverlayStoryViewer = Q.createOverlayStoryViewer();
                            createOverlayStoryViewer.y();
                            createOverlayStoryViewer.J(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        d31 Y = d31.Y();
                        if (Y != null) {
                            bs2.v(null, 2131744260, Y, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    d31 Y2 = d31.Y();
                    if (Y2 != null) {
                        bs2.v(null, 2131744260, Y2, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
            default:
                String str2 = LaunchActivity.C1;
                try {
                    tg5Var.run();
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                e Q2 = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q2 != null) {
                            storyItem.dialogId = l.longValue();
                            lcb createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.y();
                            createOverlayStoryViewer2.J(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        d31 Y3 = d31.Y();
                        if (Y3 != null) {
                            bs2.v(null, 2131744260, Y3, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    d31 Y4 = d31.Y();
                    if (Y4 != null) {
                        bs2.v(null, 2131744260, Y4, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
        }
    }
}

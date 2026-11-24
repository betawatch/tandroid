// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vx5 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ kz5 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ vx5(LaunchActivity launchActivity, kz5 kz5Var, Long l, byte b) {
        this.a = b;
        this.b = launchActivity;
        this.c = kz5Var;
        this.d = l;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        Long l = this.d;
        kz5 kz5Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    kz5Var.run();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                d Q = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q != null) {
                            storyItem.dialogId = l.longValue();
                            m8b createOverlayStoryViewer = Q.createOverlayStoryViewer();
                            createOverlayStoryViewer.y();
                            createOverlayStoryViewer.J(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        u21 Y = u21.Y();
                        if (Y != null) {
                            ir2.v(null, 2131744366, Y, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    u21 Y2 = u21.Y();
                    if (Y2 != null) {
                        ir2.v(null, 2131744366, Y2, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
            default:
                String str2 = LaunchActivity.C1;
                try {
                    kz5Var.run();
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                d Q2 = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q2 != null) {
                            storyItem.dialogId = l.longValue();
                            m8b createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.y();
                            createOverlayStoryViewer2.J(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        u21 Y3 = u21.Y();
                        if (Y3 != null) {
                            ir2.v(null, 2131744366, Y3, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    u21 Y4 = u21.Y();
                    if (Y4 != null) {
                        ir2.v(null, 2131744366, Y4, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
        }
    }
}

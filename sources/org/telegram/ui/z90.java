package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z90 implements d5.d {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ x20 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ int d;

    public /* synthetic */ z90(LaunchActivity launchActivity, x20 x20Var, Long l10, int i9) {
        this.a = launchActivity;
        this.b = x20Var;
        this.c = l10;
        this.d = i9;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        x20 x20Var = this.b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.x1;
        try {
            x20Var.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.oc X = org.telegram.ui.Components.oc.X();
            if (X != null) {
                org.telegram.messenger.l0.p(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        Long l10 = this.c;
        long longValue = l10.longValue();
        LaunchActivity launchActivity = this.a;
        if (longValue > 0) {
            bundle.putLong("user_id", l10.longValue());
            bundle.putBoolean("my_profile", l10.longValue() == UserConfig.getInstance(launchActivity.K).getClientUserId());
        } else {
            bundle.putLong("chat_id", -l10.longValue());
        }
        bundle.putInt("open_story_album_id", this.d);
        launchActivity.p0(new ProfileActivity(bundle, null));
    }
}

package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wa0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                oa0 oa0Var = (oa0) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    oa0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum != null) {
                    Bundle bundle = new Bundle();
                    if (l4.longValue() > 0) {
                        bundle.putLong("user_id", l4.longValue());
                        bundle.putBoolean("my_profile", l4.longValue() == UserConfig.getInstance(launchActivity.O).getClientUserId());
                    } else {
                        bundle.putLong("chat_id", -l4.longValue());
                    }
                    bundle.putInt("open_story_album_id", this.b);
                    launchActivity.p0(new ProfileActivity(bundle, null));
                    break;
                } else {
                    org.telegram.ui.Components.vc X = org.telegram.ui.Components.vc.X();
                    if (X != null) {
                        org.telegram.messenger.w1.o(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
            default:
                a5.a aVar = (a5.a) obj4;
                ((u2.k0) obj).h(aVar.b, (u2.f0) aVar.c, (u2.t) obj3, (u2.b0) obj2, this.b);
                break;
        }
    }
}

package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public class d8 {
    public static long g;
    public final i5 a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final k5 f = new k5(this, 10);

    public d8(int i10, long j3, i5 i5Var) {
        this.b = i10;
        this.a = i5Var;
        this.c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.a.y(this.c);
        if (y3 == null || y3.stories == null) {
            return;
        }
        int i10 = 0;
        while (i10 < y3.stories.size()) {
            i10 = com.google.android.gms.internal.vision.e2.d(y3.stories.get(i10).id, i10, 1, arrayList);
        }
    }

    public final void b(boolean z10) {
        if (this.e == z10) {
            return;
        }
        if (z10) {
            this.e = true;
            c();
        } else {
            this.e = false;
            AndroidUtilities.cancelRunOnUIThread(this.f);
            ConnectionsManager.getInstance(this.b).cancelRequest(this.d, false);
            this.d = 0;
        }
    }

    public final void c() {
        if (this.e) {
            long currentTimeMillis = 10000 - (System.currentTimeMillis() - g);
            if (currentTimeMillis > 0) {
                k5 k5Var = this.f;
                AndroidUtilities.cancelRunOnUIThread(k5Var);
                AndroidUtilities.runOnUIThread(k5Var, currentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.id);
                if (!tL_stories_getStoriesViews.id.isEmpty()) {
                    int i10 = this.b;
                    tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.c);
                    this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new wh.s3(11, this, tL_stories_getStoriesViews));
                    return;
                }
            }
            this.d = 0;
            this.e = false;
        }
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.c;
            i5 i5Var = this.a;
            TL_stories.PeerStories y3 = i5Var.y(j3);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                v5 v5Var = i5Var.k;
                v5Var.b.getStorageQueue().postRunnable(new t5(v5Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}

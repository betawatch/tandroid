package th;

import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class x7 {
    public static long g;
    public final e5 a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final sg.v f = new sg.v(this, 24);

    public x7(int i10, long j10, e5 e5Var) {
        this.b = i10;
        this.a = e5Var;
        this.c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.a.y(this.c);
        if (y3 == null || y3.stories == null) {
            return;
        }
        int i10 = 0;
        while (i10 < y3.stories.size()) {
            i10 = c3.i0.j(y3.stories.get(i10).id, i10, 1, arrayList);
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
            org.telegram.messenger.i0.r(this.f);
            ConnectionsManager.getInstance(this.b).cancelRequest(this.d, false);
            this.d = 0;
        }
    }

    public final void c() {
        if (this.e) {
            long currentTimeMillis = 10000 - (System.currentTimeMillis() - g);
            if (currentTimeMillis > 0) {
                sg.v vVar = this.f;
                org.telegram.messenger.i0.r(vVar);
                org.telegram.messenger.i0.h3(vVar, currentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.id);
                if (!tL_stories_getStoriesViews.id.isEmpty()) {
                    int i10 = this.b;
                    tL_stories_getStoriesViews.peer = vp.r1(i10).i1(this.c);
                    this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new rh.h5(5, this, tL_stories_getStoriesViews));
                    return;
                }
            }
            this.d = 0;
            this.e = false;
        }
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.c;
            e5 e5Var = this.a;
            TL_stories.PeerStories y3 = e5Var.y(j10);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                r5 r5Var = e5Var.k;
                r5Var.b.a.c(new q5(r5Var, y3, 0));
                return true;
            }
        }
        return false;
    }
}

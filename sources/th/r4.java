package th;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r4 extends x4 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public r4(int i10, String str, String str2) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override // th.x4
    public final jj f(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (jj) arrayList.get(i10);
    }

    @Override // th.x4
    public final int g() {
        return this.J;
    }

    @Override // th.x4
    public final ArrayList h() {
        return this.F;
    }

    @Override // th.x4
    public final int i() {
        return this.i.size();
    }

    @Override // th.x4
    public final boolean k() {
        return this.G;
    }

    @Override // th.x4
    public final boolean l() {
        return false;
    }

    @Override // th.x4
    public final boolean q(int i10, List list, boolean z10) {
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i10;
        String str = this.C;
        if (str != null) {
            tL_stories_searchPosts.flags |= 1;
            tL_stories_searchPosts.hashtag = str;
        }
        TL_stories.MediaArea mediaArea = this.E;
        if (mediaArea != null) {
            tL_stories_searchPosts.flags |= 2;
            tL_stories_searchPosts.area = mediaArea;
        }
        this.G = true;
        String str2 = this.D;
        boolean isEmpty = TextUtils.isEmpty(str2);
        TLObject tLObject = null;
        int i11 = this.c;
        if (!isEmpty) {
            TLObject e22 = vp.r1(i11).e2(str2);
            if (e22 == null) {
                vp.r1(i11).c2().a(str2, null, new org.telegram.ui.Components.jj(this, z10, i10, list));
                return true;
            }
            tLObject = e22;
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = vp.j1(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_searchPosts, new ag.c(this, 20));
        return true;
    }

    @Override // th.x4
    public final boolean r(int i10) {
        return false;
    }

    public r4(int i10, TL_stories.MediaArea mediaArea) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }

    @Override // th.x4
    public final void j() {
    }

    @Override // th.x4
    public final void s() {
    }

    @Override // th.x4
    public final void x() {
    }
}

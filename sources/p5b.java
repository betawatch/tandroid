// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class p5b extends u5b {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public p5b(int i, String str, String str2) {
        super(i, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override // u5b
    public final r47 f(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i < arrayList.size()) {
            return (r47) arrayList.get(i);
        }
        return null;
    }

    @Override // u5b
    public final int g() {
        return this.J;
    }

    @Override // u5b
    public final ArrayList h() {
        return this.F;
    }

    @Override // u5b
    public final int i() {
        return this.i.size();
    }

    @Override // u5b
    public final boolean k() {
        return this.G;
    }

    @Override // u5b
    public final boolean l() {
        return false;
    }

    @Override // u5b
    public final boolean q(int i, List list, boolean z) {
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i;
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
        int i2 = this.c;
        if (!isEmpty) {
            TLObject c2 = uc7.s1(i2).c2(str2);
            if (c2 == null) {
                uc7.s1(i2).a2().a(str2, null, new g32(this, z, i, list));
                return true;
            }
            tLObject = c2;
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = uc7.k1(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_searchPosts, new yp9(this, (byte) 10));
        return true;
    }

    @Override // u5b
    public final boolean r(int i) {
        return false;
    }

    public p5b(int i, TL_stories.MediaArea mediaArea) {
        super(i, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }

    @Override // u5b
    public final void j() {
    }

    @Override // u5b
    public final void s() {
    }

    @Override // u5b
    public final void x() {
    }
}

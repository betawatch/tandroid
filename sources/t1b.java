// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t1b extends y1b {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public t1b(int i, String str, String str2) {
        super(i, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override // y1b
    public final k27 f(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i < arrayList.size()) {
            return (k27) arrayList.get(i);
        }
        return null;
    }

    @Override // y1b
    public final int g() {
        return this.J;
    }

    @Override // y1b
    public final ArrayList h() {
        return this.F;
    }

    @Override // y1b
    public final int i() {
        return this.i.size();
    }

    @Override // y1b
    public final boolean k() {
        return this.G;
    }

    @Override // y1b
    public final boolean l() {
        return false;
    }

    @Override // y1b
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
            TLObject a2 = na7.q1(i2).a2(str2);
            if (a2 == null) {
                na7.q1(i2).Y1().a(str2, null, new p22(this, z, i, list));
                return true;
            }
            tLObject = a2;
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = na7.i1(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_searchPosts, new wx9(this, (byte) 9));
        return true;
    }

    @Override // y1b
    public final boolean r(int i) {
        return false;
    }

    @Override // y1b
    public final void j() {
    }

    @Override // y1b
    public final void s() {
    }

    @Override // y1b
    public final void x() {
    }

    public t1b(int i, TL_stories.MediaArea mediaArea) {
        super(i, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }
}

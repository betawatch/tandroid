// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class w5b extends u5b {
    public final ArrayList C;

    public w5b(int i, ArrayList arrayList) {
        super(i, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i;
        ArrayList arrayList2 = this.i;
        arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = arrayList.size();
            i = this.c;
            if (i2 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                r47 r47Var = new r47(i, storyItem);
                r47Var.r0(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(r47Var);
                i3++;
            }
            i2++;
        }
        if (i3 > 0) {
            jn7.f(i).k(jn7.A5, this);
        }
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
        return this.i.size();
    }

    @Override // u5b
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override // u5b
    public final int i() {
        return this.i.size();
    }

    @Override // u5b
    public final boolean k() {
        return false;
    }

    @Override // u5b
    public final boolean l() {
        return false;
    }

    @Override // u5b
    public final boolean q(int i, List list, boolean z) {
        return false;
    }

    @Override // u5b
    public final boolean r(int i) {
        return false;
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

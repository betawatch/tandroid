package th;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z4 extends x4 {
    public final ArrayList C;

    public z4(int i10, ArrayList arrayList) {
        super(i10, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = this.i;
        arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            i10 = this.c;
            if (i11 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                jj jjVar = new jj(i10, storyItem);
                jjVar.r0(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(jjVar);
                i12++;
            }
            i11++;
        }
        if (i12 > 0) {
            zs.f(i10).k(zs.x5, this);
        }
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
        return this.i.size();
    }

    @Override // th.x4
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override // th.x4
    public final int i() {
        return this.i.size();
    }

    @Override // th.x4
    public final boolean k() {
        return false;
    }

    @Override // th.x4
    public final boolean l() {
        return false;
    }

    @Override // th.x4
    public final boolean q(int i10, List list, boolean z10) {
        return false;
    }

    @Override // th.x4
    public final boolean r(int i10) {
        return false;
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

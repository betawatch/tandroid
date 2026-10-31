package th;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q4 extends x4 {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public q4(int i10, long j10, String str, j4 j4Var) {
        super(i10, j10, 4, -1, j4Var);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = 0;
        this.E = str;
    }

    @Override // th.x4
    public final void C(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
        int i10 = this.c;
        reorderpreviewmedias.bot = vp.r1(i10).n1(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            jj f7 = f(num.intValue());
            if (f7 != null) {
                reorderpreviewmedias.order.add(vp.W4(f7.l.media));
                arrayList2.add(f7);
                arrayList3.add(num);
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(reorderpreviewmedias, null);
        ArrayList arrayList4 = this.H;
        if (arrayList4.isEmpty()) {
            arrayList4.add(new ArrayList());
        }
        ((ArrayList) arrayList4.get(0)).clear();
        ((ArrayList) arrayList4.get(0)).addAll(arrayList3);
        ArrayList arrayList5 = this.i;
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
    }

    public final void F(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            jj jjVar = (jj) arrayList2.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (vp.t0(jjVar.l.media, (TLRPC.MessageMedia) arrayList.get(i11))) {
                    arrayList2.remove(i10);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && jjVar.f1() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(jjVar.f1());
                    }
                    i10--;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
        int i12 = this.c;
        deletepreviewmedia.bot = vp.r1(i12).n1(this.d);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            deletepreviewmedia.media.add(vp.W4((TLRPC.MessageMedia) arrayList.get(i13)));
        }
        ConnectionsManager.getInstance(i12).sendRequest(deletepreviewmedia, null);
        u4 u4Var = this.q;
        org.telegram.messenger.i0.r(u4Var);
        org.telegram.messenger.i0.g3(u4Var);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        jj jjVar;
        int f12;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i10 = 0;
        while (true) {
            arrayList = this.i;
            if (i10 >= arrayList.size()) {
                jjVar = null;
                i10 = 0;
                break;
            }
            jjVar = (jj) arrayList.get(i10);
            if (inputMedia != null && (storyItem = jjVar.l) != null && (messageMedia = storyItem.media) != null) {
                if (!(inputMedia instanceof TLRPC.TL_inputMediaPhoto)) {
                    if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && (document = messageMedia.document) != null && document.id == ((TLRPC.TL_inputMediaDocument) inputMedia).id.id) {
                        break;
                    }
                } else {
                    TLRPC.Photo photo = messageMedia.photo;
                    if (photo != null && photo.id == ((TLRPC.TL_inputMediaPhoto) inputMedia).id.id) {
                        break;
                    }
                }
            }
            i10++;
        }
        ArrayList arrayList2 = this.H;
        if (jjVar != null) {
            arrayList.remove(jjVar);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i10 > 0 && i10 < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i10);
            }
        }
        p4 p4Var = new p4(this, this.d, botpreviewmedia);
        jj jjVar2 = new jj(this.c, p4Var);
        TLRPC.Message message = jjVar2.k;
        if (jjVar == null) {
            f12 = this.I;
            this.I = f12 + 1;
        } else {
            f12 = jjVar.f1();
        }
        message.id = f12;
        p4Var.id = f12;
        jjVar2.j = this;
        jjVar2.r0(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i10, Integer.valueOf(jjVar2.f1()));
        arrayList.add(i10, jjVar2);
        u4 u4Var = this.q;
        org.telegram.messenger.i0.r(u4Var);
        org.telegram.messenger.i0.g3(u4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (this.C || this.D) {
            return false;
        }
        long j10 = this.d;
        String str = this.E;
        int i10 = this.c;
        if (str != null) {
            TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
            getpreviewinfo.bot = vp.r1(i10).n1(j10);
            getpreviewinfo.lang_code = str;
            getpreviewmedias = getpreviewinfo;
        } else {
            TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
            getpreviewmedias2.bot = vp.r1(i10).n1(j10);
            getpreviewmedias = getpreviewmedias2;
        }
        this.C = true;
        this.F = ConnectionsManager.getInstance(i10).sendRequest(getpreviewmedias, new rh.h5(3, this, runnable));
        return true;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        p4 p4Var = new p4(this, this.d, botpreviewmedia);
        jj jjVar = new jj(this.c, p4Var);
        TLRPC.Message message = jjVar.k;
        int i10 = this.I;
        this.I = i10 + 1;
        message.id = i10;
        p4Var.id = i10;
        jjVar.j = this;
        jjVar.r0(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(jjVar.f1()));
        this.i.add(0, jjVar);
        u4 u4Var = this.q;
        org.telegram.messenger.i0.r(u4Var);
        org.telegram.messenger.i0.g3(u4Var);
    }

    @Override // th.x4
    public final jj f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i11 >= arrayList.size()) {
                return null;
            }
            if (((jj) arrayList.get(i11)).f1() == i10) {
                return (jj) arrayList.get(i11);
            }
            i11++;
        }
    }

    @Override // th.x4
    public final int g() {
        return this.i.size();
    }

    @Override // th.x4
    public final ArrayList h() {
        return this.H;
    }

    @Override // th.x4
    public final int i() {
        return this.i.size();
    }

    @Override // th.x4
    public final boolean k() {
        return this.C;
    }

    @Override // th.x4
    public final boolean l() {
        return false;
    }

    @Override // th.x4
    public final boolean q(int i10, List list, boolean z10) {
        return H(null);
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

package th;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.at;
import org.telegram.messenger.bx;
import org.telegram.messenger.ff;
import org.telegram.messenger.qz;
import org.telegram.messenger.rz;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.mg;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x1 implements ai {
    public final /* synthetic */ z2 a;

    public x1(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.Components.ai
    public final void C(mg mgVar) {
        at.f(this.a.l2).d(mgVar);
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean D() {
        return this.a.L0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // org.telegram.ui.Components.ai
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.c accountInstance;
        boolean z14;
        ?? r12;
        String str;
        z2 z2Var = this.a;
        if (!z2Var.s0.m0 || (storyItem = z2Var.x1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || z2Var.r2.a2.getSelectedPhotos().isEmpty())) {
            ag.v vVar = z2Var.r2;
            if (vVar != null) {
                vVar.M(i10);
                return;
            }
            return;
        }
        boolean z15 = true;
        if (i10 != 8) {
            z2Var.r2.a(true);
        }
        HashMap<Object, Object> selectedPhotos = z2Var.r2.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = z2Var.r2.a2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ?? r72 = 0;
        int i13 = 0;
        while (i13 < Math.ceil(selectedPhotos.size() / 10.0f)) {
            int i14 = i13 * 10;
            int min = Math.min(10, selectedPhotos.size() - i14);
            ?? arrayList = new ArrayList();
            for (int i15 = r72; i15 < min; i15++) {
                int i16 = i14 + i15;
                if (i16 < selectedPhotosOrder.size()) {
                    ff ffVar = (ff) selectedPhotos.get(selectedPhotosOrder.get(i16));
                    qz qzVar = new qz();
                    boolean z16 = ffVar.b;
                    if (z16 || (str = ffVar.h) == null) {
                        String str2 = ffVar.I;
                        if (str2 != null) {
                            qzVar.c = str2;
                        }
                    } else {
                        qzVar.c = str;
                    }
                    qzVar.e = ffVar.c;
                    qzVar.f = ffVar.g;
                    qzVar.o = z16;
                    CharSequence charSequence = ffVar.a;
                    qzVar.d = charSequence != null ? charSequence.toString() : null;
                    qzVar.i = ffVar.n;
                    qzVar.j = ffVar.r;
                    qzVar.h = ffVar.x;
                    qzVar.k = ffVar.s;
                    qzVar.r = ffVar.L;
                    qzVar.t = rz.h(ffVar.a);
                    qzVar.u = ffVar.M;
                    arrayList.add(qzVar);
                    ffVar.e();
                }
            }
            boolean z17 = i13 == 0 ? ((qz) arrayList.get(r72)).t : r72;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = z2Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            int i17 = r72;
            long j12 = z2Var.k1;
            if (i10 == 4 || z13) {
                z14 = 4;
                r12 = 1;
            } else {
                z14 = 4;
                r12 = i17;
            }
            rz.X(accountInstance, arrayList, j12, null, null, storyItem, null, r12, z10, null, null, z11, i11, i12, z17, null, null, 0L, false, 0L, z2Var.K1.getSendMonoForumPeerId(), z2Var.K1.getSendMessageSuggestionParams(), null, false);
            i13++;
            z15 = true;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            r72 = i17;
        }
        boolean z18 = z15;
        boolean z19 = r72;
        z2Var.K1.setFieldText("");
        z2Var.i0(j11 <= 0 ? z18 : z19);
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        org.telegram.messenger.c accountInstance;
        z2 z2Var = this.a;
        TL_stories.StoryItem storyItem = z2Var.x1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = z2Var.getAccountInstance();
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        long j12 = z2Var.k1;
        org.telegram.messenger.r5 r5Var = rz.I;
        new Thread(new bx(null, arrayList, j12, accountInstance, charSequence2, false, null, null, null, null, z10, i10, i11, storyItem, null, j10, z11, j11, null)).start();
        z2Var.i0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.ai
    public final void j0() {
        this.a.K1.K();
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void v0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void N() {
    }
}

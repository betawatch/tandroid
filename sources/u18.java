// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u18 implements v02 {
    public final /* synthetic */ y28 a;

    public u18(y28 y28Var) {
        this.a = y28Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        TL_stories.StoryItem storyItem;
        j5 accountInstance;
        boolean z5;
        String str;
        y28 y28Var = this.a;
        if (!y28Var.z0.n0 || (storyItem = y28Var.E1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i != 8 && i != 7 && (i != 4 || y28Var.y2.d2.getSelectedPhotos().isEmpty())) {
            x31 x31Var = y28Var.y2;
            if (x31Var != null) {
                x31Var.J(i);
                return;
            }
            return;
        }
        boolean z6 = true;
        if (i != 8) {
            y28Var.y2.a(true);
        }
        HashMap<Object, Object> selectedPhotos = y28Var.y2.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = y28Var.y2.d2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ?? r6 = 0;
        int i4 = 0;
        while (i4 < Math.ceil(selectedPhotos.size() / 10.0f)) {
            int i5 = i4 * 10;
            int min = Math.min(10, selectedPhotos.size() - i5);
            ?? arrayList = new ArrayList();
            for (int i6 = r6; i6 < min; i6++) {
                int i7 = i5 + i6;
                if (i7 < selectedPhotosOrder.size()) {
                    jm6 jm6Var = (jm6) selectedPhotos.get(selectedPhotosOrder.get(i7));
                    y3a y3aVar = new y3a();
                    boolean z7 = jm6Var.b;
                    if (z7 || (str = jm6Var.h) == null) {
                        String str2 = jm6Var.I;
                        if (str2 != null) {
                            y3aVar.c = str2;
                        }
                    } else {
                        y3aVar.c = str;
                    }
                    y3aVar.e = jm6Var.c;
                    y3aVar.f = jm6Var.g;
                    y3aVar.o = z7;
                    CharSequence charSequence = jm6Var.a;
                    y3aVar.d = charSequence != null ? charSequence.toString() : null;
                    y3aVar.i = jm6Var.n;
                    y3aVar.j = jm6Var.r;
                    y3aVar.h = jm6Var.x;
                    y3aVar.k = jm6Var.s;
                    y3aVar.r = jm6Var.L;
                    y3aVar.t = z3a.h(jm6Var.a);
                    y3aVar.u = jm6Var.M;
                    arrayList.add(y3aVar);
                    jm6Var.e();
                }
            }
            boolean z8 = i4 == 0 ? ((y3a) arrayList.get(r6)).t : r6;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = y28Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            boolean z9 = r6;
            long j3 = y28Var.r1;
            if (i == 4 || z4) {
                z5 = z9;
                z9 = true;
            } else {
                z5 = z9;
            }
            z3a.W(accountInstance, arrayList, j3, null, null, storyItem, null, z9, z, null, null, z2, i2, i3, z8, null, null, 0L, false, 0L, y28Var.R1.getSendMonoForumPeerId(), y28Var.R1.getSendMessageSuggestionParams(), null, false);
            i4++;
            z6 = true;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            r6 = z5;
        }
        boolean z10 = z6;
        boolean z11 = r6;
        y28Var.R1.setFieldText("");
        y28Var.a0(j2 <= 0 ? z10 : z11);
    }

    @Override // v02
    public final void I0() {
        this.a.R1.S();
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        j5 accountInstance;
        y28 y28Var = this.a;
        TL_stories.StoryItem storyItem = y28Var.E1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = y28Var.getAccountInstance();
        Editable editable2 = editable != null ? editable : null;
        long j3 = y28Var.r1;
        co3 co3Var = z3a.J;
        new Thread(new p1a(null, arrayList, j3, accountInstance, editable2, false, null, null, null, null, z, i, i2, storyItem, null, j, z2, j2, null)).start();
        y28Var.a0(j2 <= 0);
    }

    @Override // v02
    public final boolean V1() {
        return false;
    }

    @Override // v02
    public final boolean g0() {
        return this.a.G0();
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        kk7.f(this.a.s2).d(vq0Var);
    }

    @Override // v02
    public final void z0() {
    }

    @Override // v02
    public final void P0(Object obj) {
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
    }
}

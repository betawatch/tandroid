// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x38 implements g22 {
    public final /* synthetic */ a58 a;

    public x38(a58 a58Var) {
        this.a = a58Var;
    }

    @Override // g22
    public final boolean B() {
        return this.a.G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // g22
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        TL_stories.StoryItem storyItem;
        j5 accountInstance;
        boolean z5;
        String str;
        a58 a58Var = this.a;
        if (!a58Var.z0.n0 || (storyItem = a58Var.E1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i != 8 && i != 7 && (i != 4 || a58Var.y2.d2.getSelectedPhotos().isEmpty())) {
            e51 e51Var = a58Var.y2;
            if (e51Var != null) {
                e51Var.I(i);
                return;
            }
            return;
        }
        boolean z6 = true;
        if (i != 8) {
            a58Var.y2.a(true);
        }
        HashMap<Object, Object> selectedPhotos = a58Var.y2.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = a58Var.y2.d2.getSelectedPhotosOrder();
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
                    jo6 jo6Var = (jo6) selectedPhotos.get(selectedPhotosOrder.get(i7));
                    z5a z5aVar = new z5a();
                    boolean z7 = jo6Var.b;
                    if (z7 || (str = jo6Var.h) == null) {
                        String str2 = jo6Var.I;
                        if (str2 != null) {
                            z5aVar.c = str2;
                        }
                    } else {
                        z5aVar.c = str;
                    }
                    z5aVar.e = jo6Var.c;
                    z5aVar.f = jo6Var.g;
                    z5aVar.o = z7;
                    CharSequence charSequence = jo6Var.a;
                    z5aVar.d = charSequence != null ? charSequence.toString() : null;
                    z5aVar.i = jo6Var.n;
                    z5aVar.j = jo6Var.r;
                    z5aVar.h = jo6Var.x;
                    z5aVar.k = jo6Var.s;
                    z5aVar.r = jo6Var.L;
                    z5aVar.t = a6a.h(jo6Var.a);
                    z5aVar.u = jo6Var.M;
                    arrayList.add(z5aVar);
                    jo6Var.e();
                }
            }
            boolean z8 = i4 == 0 ? ((z5a) arrayList.get(r6)).t : r6;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = a58Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            boolean z9 = r6;
            long j3 = a58Var.r1;
            if (i == 4 || z4) {
                z5 = z9;
                z9 = true;
            } else {
                z5 = z9;
            }
            a6a.W(accountInstance, arrayList, j3, null, null, storyItem, null, z9, z, null, null, z2, i2, i3, z8, null, null, 0L, false, 0L, a58Var.R1.getSendMonoForumPeerId(), a58Var.R1.getSendMessageSuggestionParams(), null, false);
            i4++;
            z6 = true;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            r6 = z5;
        }
        boolean z10 = z6;
        boolean z11 = r6;
        a58Var.R1.setFieldText("");
        a58Var.a0(j2 <= 0 ? z10 : z11);
    }

    @Override // g22
    public final boolean K0() {
        return false;
    }

    @Override // g22
    public final void a1(vr0 vr0Var) {
        nm7.f(this.a.s2).d(vr0Var);
    }

    @Override // g22
    public final void b0() {
        this.a.R1.R();
    }

    @Override // g22
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        j5 accountInstance;
        a58 a58Var = this.a;
        TL_stories.StoryItem storyItem = a58Var.E1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = a58Var.getAccountInstance();
        Editable editable2 = editable != null ? editable : null;
        long j3 = a58Var.r1;
        mp3 mp3Var = a6a.J;
        new Thread(new r3a(null, arrayList, j3, accountInstance, editable2, false, null, null, null, null, z, i, i2, storyItem, null, j, z2, j2, null)).start();
        a58Var.a0(j2 <= 0);
    }

    @Override // g22
    public final void I() {
    }

    @Override // g22
    public final void f0(Object obj) {
    }

    @Override // g22
    public final void z0(TLRPC.User user) {
    }
}

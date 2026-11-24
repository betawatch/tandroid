// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x12 implements u78 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ i22 d;

    public x12(i22 i22Var, HashMap hashMap, ArrayList arrayList) {
        this.d = i22Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // u78
    public final boolean c() {
        return true;
    }

    @Override // u78
    public final void k(int i, boolean z, boolean z2) {
        if (z) {
            return;
        }
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.a) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i2 >= arrayList2.size()) {
                ((yv1) this.d.Z1).v6(i, arrayList, z2);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i2));
            z5a z5aVar = new z5a();
            arrayList.add(z5aVar);
            no6 no6Var = (no6) obj;
            String str = no6Var.h;
            if (str != null) {
                z5aVar.c = str;
            } else {
                z5aVar.l = no6Var;
            }
            z5aVar.e = no6Var.c;
            z5aVar.k = no6Var.s;
            CharSequence charSequence = no6Var.I;
            z5aVar.d = charSequence != null ? charSequence.toString() : null;
            z5aVar.i = no6Var.n;
            z5aVar.j = no6Var.r;
            z5aVar.h = no6Var.x;
            TLRPC.BotInlineResult botInlineResult = no6Var.N;
            if (botInlineResult != null && no6Var.H) {
                z5aVar.m = botInlineResult;
                z5aVar.n = no6Var.O;
            }
            System.currentTimeMillis();
            i2++;
        }
    }

    @Override // u78
    public final void e() {
    }

    @Override // u78
    public final void i(Editable editable) {
    }

    @Override // u78
    public final void j() {
    }
}

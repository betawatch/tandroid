// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class x02 implements k32 {
    public final /* synthetic */ n12 a;

    public x02(n12 n12Var) {
        this.a = n12Var;
    }

    @Override // k32
    public final void S() {
        this.a.l1(true);
    }

    @Override // k32
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        n12 n12Var = this.a;
        k32 k32Var = n12Var.R1;
        if (k32Var != null) {
            k32Var.k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
            return;
        }
        Object obj = n12Var.Z1;
        if (obj instanceof k32) {
            ((k32) obj).k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
            return;
        }
        if (obj instanceof b18) {
            b18 b18Var = (b18) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                q7a q7aVar = new q7a();
                q7aVar.c = (String) arrayList.get(i2);
                arrayList4.add(q7aVar);
            }
            b18Var.J1(arrayList4);
        }
    }

    @Override // k32
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        n12 n12Var = this.a;
        k32 k32Var = n12Var.R1;
        if (k32Var != null) {
            k32Var.m(arrayList, z, i, j);
            return;
        }
        e eVar = n12Var.Z1;
        if (eVar instanceof zu1) {
            ((zu1) eVar).m(arrayList, z, i, j);
        } else if (eVar instanceof b18) {
            ((b18) eVar).J1(arrayList);
        }
    }

    @Override // k32
    public final void z() {
        n12 n12Var = this.a;
        k32 k32Var = n12Var.R1;
        if (k32Var != null) {
            k32Var.z();
            return;
        }
        Object obj = n12Var.Z1;
        if (obj instanceof k32) {
            ((k32) obj).z();
            return;
        }
        if (obj instanceof b18) {
            b18 b18Var = (b18) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                b18Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}

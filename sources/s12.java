// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s12 implements f42 {
    public final /* synthetic */ i22 a;

    public s12(i22 i22Var) {
        this.a = i22Var;
    }

    @Override // f42
    public final void S() {
        this.a.k1(true);
    }

    @Override // f42
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        i22 i22Var = this.a;
        f42 f42Var = i22Var.R1;
        if (f42Var != null) {
            f42Var.k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
            return;
        }
        Object obj = i22Var.Z1;
        if (obj instanceof f42) {
            ((f42) obj).k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
            return;
        }
        if (obj instanceof xz7) {
            xz7 xz7Var = (xz7) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                z5a z5aVar = new z5a();
                z5aVar.c = (String) arrayList.get(i2);
                arrayList4.add(z5aVar);
            }
            xz7Var.J1(arrayList4);
        }
    }

    @Override // f42
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        i22 i22Var = this.a;
        f42 f42Var = i22Var.R1;
        if (f42Var != null) {
            f42Var.m(arrayList, z, i, j);
            return;
        }
        d dVar = i22Var.Z1;
        if (dVar instanceof yv1) {
            ((yv1) dVar).m(arrayList, z, i, j);
        } else if (dVar instanceof xz7) {
            ((xz7) dVar).J1(arrayList);
        }
    }

    @Override // f42
    public final void y() {
        i22 i22Var = this.a;
        f42 f42Var = i22Var.R1;
        if (f42Var != null) {
            f42Var.y();
            return;
        }
        Object obj = i22Var.Z1;
        if (obj instanceof f42) {
            ((f42) obj).y();
            return;
        }
        if (obj instanceof xz7) {
            xz7 xz7Var = (xz7) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                xz7Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}

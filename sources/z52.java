// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z52 implements t22 {
    public final /* synthetic */ p8c a;
    public final /* synthetic */ x31 b;
    public final /* synthetic */ d c;

    public z52(x31 x31Var, p8c p8cVar, d dVar) {
        this.a = p8cVar;
        this.b = x31Var;
        this.c = dVar;
    }

    @Override // t22
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.a(new od8((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // t22
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        if (!arrayList.isEmpty()) {
            this.a.a(new pd8((y3a) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // t22
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // t22
    public final void S() {
    }
}

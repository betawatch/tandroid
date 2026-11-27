// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p62 implements k32 {
    public final /* synthetic */ pcc a;
    public final /* synthetic */ f41 b;
    public final /* synthetic */ e c;

    public p62(f41 f41Var, pcc pccVar, e eVar) {
        this.a = pccVar;
        this.b = f41Var;
        this.c = eVar;
    }

    @Override // k32
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.a(new ch8((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // k32
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        if (!arrayList.isEmpty()) {
            this.a.a(new dh8((q7a) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override // k32
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // k32
    public final void S() {
    }
}

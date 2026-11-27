// default package

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q55 implements fd, ncc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r55 b;

    public /* synthetic */ q55(r55 r55Var, byte b) {
        this.a = b;
        this.b = r55Var;
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b8c b8cVar = (b8c) obj;
        r55 r55Var = this.b;
        if (r55Var.c.h(b8cVar)) {
            return;
        }
        int i = b8cVar.d;
        if (i == 2 || b8cVar.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", r55Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            r55Var.presentFragment(new zu1(bundle));
            return;
        }
        if (i == 1) {
            r55Var.r = !r55Var.r;
            r55Var.b.g3.O(true);
            r55Var.Y(true);
        } else {
            if (i == 3) {
                u41 u41Var = r55Var.c;
                r55Var.s = true;
                u41Var.h = true;
                r55Var.b.g3.O(true);
                r55Var.Y(true);
                return;
            }
            if (i == 4) {
                u41 u41Var2 = r55Var.c;
                r55Var.s = false;
                u41Var2.h = false;
                r55Var.b.g3.O(true);
                r55Var.Y(true);
            }
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        r55 r55Var = this.b;
        switch (b) {
            case 0:
                r55Var.b0();
                break;
            default:
                r55Var.finishFragment();
                break;
        }
    }
}

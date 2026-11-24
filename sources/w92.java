// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w92 extends n39 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public v92 f;
    public final /* synthetic */ x92 h;

    public w92(x92 x92Var, Context context) {
        this.h = x92Var;
        this.c = context;
    }

    @Override // w39
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f != 1;
    }

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        x92 x92Var = this.h;
        if (x92Var.O) {
            this.d = arrayList;
            this.e = arrayList2;
            if (x92Var.b.getAdapter() == x92Var.e) {
                x92Var.d.c();
            }
            super.f();
        }
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.f();
        } else {
            co3 co3Var = Utilities.g;
            v92 v92Var = new v92(this, str, (byte) 0);
            this.f = v92Var;
            co3Var.d(v92Var, 300L);
        }
    }

    @Override // w39
    public final int b() {
        return this.d.size();
    }

    @Override // w39
    public final int d(int i) {
        return 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i);
        String K = hc2.K(chat, false);
        CharSequence charSequence = (CharSequence) this.e.get(i);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        gh6 gh6Var = (gh6) s49Var.a;
        gh6Var.setTag(Integer.valueOf(i));
        gh6Var.c(chat, charSequence, charSequence2, false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        gh6 gh6Var = new gh6(this.c, 6, 2, false, null);
        zkb.h(bkb.c6, null, gh6Var);
        return new y29(gh6Var);
    }
}

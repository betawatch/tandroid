// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wu4 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new wu4());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        kz9 kz9Var = (kz9) view;
        kz9Var.setUser((TLRPC.User) c4cVar.H);
        CharSequence charSequence = c4cVar.n;
        if (charSequence != null) {
            kz9Var.setSubtitle(charSequence);
            kz9Var.setSubtitleColorKey(bkb.q5);
        }
        kz9Var.setOptions(c4cVar.E);
        kz9Var.setDivider(z);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        kz9 kz9Var = new kz9(context, false, false, wjbVar, false);
        kz9Var.setCellBackgroundVisible(false);
        return kz9Var;
    }
}

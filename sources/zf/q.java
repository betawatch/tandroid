package zf;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.i5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.lx;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements x, jk0 {
    public final /* synthetic */ z a;

    public /* synthetic */ q(z zVar) {
        this.a = zVar;
    }

    @Override // zf.x
    public void a(a0.h hVar, ArrayList arrayList) {
        z zVar = this.a;
        int i10 = zVar.s0;
        zVar.t0 = arrayList;
        zVar.x0 = hVar;
        for (int i11 = 0; i11 < zVar.t0.size(); i11++) {
            y yVar = (y) zVar.t0.get(i11);
            TLObject tLObject = yVar.a;
            if (tLObject instanceof TLRPC.User) {
                wp.r1(i10).U3((TLRPC.User) yVar.a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                wp.r1(i10).N3((TLRPC.Chat) yVar.a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                wp.r1(i10).R3((TLRPC.EncryptedChat) yVar.a, true);
            }
        }
        zVar.G(null);
        zVar.f();
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        TLRPC.User Z1;
        lx lxVar = this.a.U;
        if (lxVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            zx zxVar = lxVar.a;
            if (zxVar.getParentActivity() != null && (Z1 = zxVar.getMessagesController().Z1(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zxVar.getParentActivity());
                String L0 = dd.L0(2131752234, null);
                x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.W2(dd.a0("ChatHintsDeleteAlert", null, 2131752235, i5.m(0, Z1.first_name, Z1.last_name)));
                alertDialog$Builder.k(dd.L0(2131744873, null), new m4.x0(lxVar, longValue, 7));
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                zxVar.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    a7.V(textView, t6.q7, zxVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}

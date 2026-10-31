package xh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.n00;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.z60;
import org.telegram.ui.px0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 c;
    public final /* synthetic */ p6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ TL_payments.connectedBotStarRef h;
    public final /* synthetic */ Object n;

    public /* synthetic */ s2(int i10, org.telegram.ui.ActionBar.z2 z2Var, p6 p6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.b = i10;
        this.c = z2Var;
        this.d = p6Var;
        this.n = linearLayout;
        this.e = j10;
        this.f = context;
        this.h = connectedbotstarref;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j10;
        switch (this.a) {
            case 0:
                px0 px0Var = (px0) this.n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (!connectedbotstarref.revoked) {
                    px0Var.run();
                    break;
                } else {
                    int i10 = this.b;
                    TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(connectedbotstarref.bot_id));
                    if (Z1 != null) {
                        vp.r1(i10).U2(Z1, 0, true, new q2(this.c, this.f, i10, this.e, this.d, 0));
                        break;
                    }
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.n;
                int i11 = this.b;
                rh.r g10 = rh.r.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, d20.i(i11).f());
                org.telegram.ui.ActionBar.z2 z2Var = this.c;
                ViewGroup viewGroup = z2Var.b;
                p6 p6Var = this.d;
                z60 F = z60.F(viewGroup, p6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (w3.V(chat)) {
                                j10 = -chat.id;
                            }
                        }
                        i12 = i13;
                    }
                    F.g(tLObject, j10 == this.e, new n00(i11, j10, this.f, this.h, z2Var, p6Var));
                    i12 = i13;
                }
                F.t = false;
                F.s = 0;
                F.V(5);
                F.a0(org.telegram.messenger.i0.L(24.0f), 0.0f);
                F.Z();
                break;
        }
    }

    public /* synthetic */ s2(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.z2 z2Var, Context context, long j10, p6 p6Var, px0 px0Var) {
        this.h = connectedbotstarref;
        this.b = i10;
        this.c = z2Var;
        this.f = context;
        this.e = j10;
        this.d = p6Var;
        this.n = px0Var;
    }
}

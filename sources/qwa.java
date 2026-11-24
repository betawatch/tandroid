// default package

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qwa implements e39, x74 {
    public final /* synthetic */ uxa a;

    public /* synthetic */ qwa(uxa uxaVar) {
        this.a = uxaVar;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        final uxa uxaVar = this.a;
        hd[] hdVarArr = uxaVar.h0;
        ywa ywaVar = uxaVar.X;
        int i2 = ywaVar.J;
        final byte b = 0;
        final byte b2 = 1;
        if (i < i2 || i > ywaVar.K) {
            int i3 = ywaVar.V;
            if (i >= i3 && i <= ywaVar.W) {
                ((nxa) uxaVar.R.get(i - i3)).c(uxaVar.a, uxaVar, hdVarArr, true);
                return true;
            }
            int i4 = ywaVar.S;
            if (i >= i4 && i <= ywaVar.T) {
                ((nxa) uxaVar.P.get(i - i4)).c(uxaVar.a, uxaVar, hdVarArr, true);
                return true;
            }
            int i5 = ywaVar.Y;
            if (i >= i5 && i <= ywaVar.Z) {
                ((nxa) uxaVar.Q.get(i - i5)).c(uxaVar.a, uxaVar, hdVarArr, true);
                return true;
            }
        } else {
            final k27 k27Var = ((rxa) uxaVar.z0.get(i - i2)).b;
            if (!k27Var.w4()) {
                cs5 I = cs5.I(uxaVar, view);
                I.b(R.drawable.msg_stats, k96.M0(2131743307, null), new Runnable() { // from class: pwa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        k27 k27Var2 = k27Var;
                        uxa uxaVar2 = uxaVar;
                        switch (b3) {
                            case 0:
                                uxaVar2.presentFragment(new s47(k27Var2));
                                break;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", uxaVar2.b);
                                bundle.putInt("message_id", k27Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                uxaVar2.presentFragment(new mu1(bundle), false);
                                break;
                        }
                    }
                }, false);
                I.b(R.drawable.msg_msgbubble3, k96.M0(2131743308, null), new Runnable() { // from class: pwa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        k27 k27Var2 = k27Var;
                        uxa uxaVar2 = uxaVar;
                        switch (b3) {
                            case 0:
                                uxaVar2.presentFragment(new s47(k27Var2));
                                break;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", uxaVar2.b);
                                bundle.putInt("message_id", k27Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                uxaVar2.presentFragment(new mu1(bundle), false);
                                break;
                        }
                    }
                }, false);
                I.X(uxaVar.T.V0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.a.s0();
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}

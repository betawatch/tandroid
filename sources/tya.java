// default package

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tya implements h59, g94 {
    public final /* synthetic */ xza a;

    public /* synthetic */ tya(xza xzaVar) {
        this.a = xzaVar;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.a.t0();
    }

    @Override // h59
    public final boolean g(int i, View view) {
        final xza xzaVar = this.a;
        he[] heVarArr = xzaVar.h0;
        bza bzaVar = xzaVar.X;
        int i2 = bzaVar.J;
        final byte b = 0;
        final byte b2 = 1;
        if (i < i2 || i > bzaVar.K) {
            int i3 = bzaVar.V;
            if (i >= i3 && i <= bzaVar.W) {
                ((qza) xzaVar.R.get(i - i3)).c(xzaVar.a, xzaVar, heVarArr, true);
                return true;
            }
            int i4 = bzaVar.S;
            if (i >= i4 && i <= bzaVar.T) {
                ((qza) xzaVar.P.get(i - i4)).c(xzaVar.a, xzaVar, heVarArr, true);
                return true;
            }
            int i5 = bzaVar.Y;
            if (i >= i5 && i <= bzaVar.Z) {
                ((qza) xzaVar.Q.get(i - i5)).c(xzaVar.a, xzaVar, heVarArr, true);
                return true;
            }
        } else {
            final k47 k47Var = ((uza) xzaVar.z0.get(i - i2)).b;
            if (!k47Var.w4()) {
                bu5 I = bu5.I(xzaVar, view);
                I.b(R.drawable.msg_stats, jb6.M0(2131743233, null), new Runnable() { // from class: sya
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        k47 k47Var2 = k47Var;
                        xza xzaVar2 = xzaVar;
                        switch (b3) {
                            case 0:
                                xzaVar2.presentFragment(new t67(k47Var2));
                                break;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xzaVar2.b);
                                bundle.putInt("message_id", k47Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                xzaVar2.presentFragment(new yv1(bundle), false);
                                break;
                        }
                    }
                }, false);
                I.b(R.drawable.msg_msgbubble3, jb6.M0(2131743234, null), new Runnable() { // from class: sya
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        k47 k47Var2 = k47Var;
                        xza xzaVar2 = xzaVar;
                        switch (b3) {
                            case 0:
                                xzaVar2.presentFragment(new t67(k47Var2));
                                break;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xzaVar2.b);
                                bundle.putInt("message_id", k47Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                xzaVar2.presentFragment(new yv1(bundle), false);
                                break;
                        }
                    }
                }, false);
                I.X(xzaVar.T.V0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}

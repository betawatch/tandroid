// default package

import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class q97 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jm7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ q97(jm7 jm7Var, Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, Object obj5, byte b) {
        this.a = b;
        this.d = jm7Var;
        this.e = obj;
        this.f = obj2;
        this.h = obj3;
        this.n = obj4;
        this.b = z;
        this.c = z2;
        this.r = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.r;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) jm7Var;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                d dVar = (d) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.InputUser inputUser = (TLRPC.InputUser) obj;
                if (((ac7) obj5) == null) {
                    ik.c0(oc7Var.currentAccount, tL_error, dVar, tLObject, Boolean.valueOf(z2 && !z));
                }
                if (z2 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    oc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                    break;
                }
                break;
            default:
                yv1 yv1Var = (yv1) jm7Var;
                String str = (String) obj5;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                k47 k47Var = (k47) obj3;
                rc2 rc2Var = (rc2) obj2;
                tv0 tv0Var = (tv0) obj;
                if (!str.startsWith("video?")) {
                    if (z2 && !z) {
                        tv0Var.run();
                        yv1Var.getParentActivity();
                        l11.p(str);
                        break;
                    } else {
                        yv1Var.Y9(k47Var, false, false);
                        tv0Var.run();
                        yv1Var.oa(characterStyle, str, false, rc2Var, k47Var);
                        break;
                    }
                } else {
                    yv1Var.m6(characterStyle, false, k47Var, rc2Var);
                    break;
                }
        }
    }
}

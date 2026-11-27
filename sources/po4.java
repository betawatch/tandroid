// default package

import android.os.Bundle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class po4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tzb b;

    public /* synthetic */ po4(tzb tzbVar, byte b) {
        this.a = b;
        this.b = tzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tzb tzbVar = this.b;
        switch (b) {
            case 0:
                if (tzbVar.getParentLayout() != null) {
                    tzbVar.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tzbVar.a);
                    zu1 zu1Var = new zu1(bundle);
                    zu1Var.Ga = true;
                    tzbVar.presentFragment(zu1Var);
                    break;
                }
                break;
            case 1:
                tzbVar.y0();
                tzbVar.C0();
                break;
            case 2:
                tzbVar.y0();
                break;
            case 3:
                tzbVar.S0(true);
                break;
            case 4:
                tzbVar.B0 = null;
                tzbVar.Z0(true, false);
                break;
            case 5:
                tzbVar.finishPreviewFragment();
                break;
            default:
                tzbVar.O.postOnAnimation(new po4(tzbVar, (byte) 2));
                break;
        }
    }
}

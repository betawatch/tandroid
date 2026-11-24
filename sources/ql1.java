// default package

import android.content.Context;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ql1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ql1(mu1 mu1Var, int i, int i2, CharacterStyle characterStyle, gb2 gb2Var) {
        this.d = mu1Var;
        this.b = i;
        this.c = i2;
        this.e = characterStyle;
        this.f = gb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.f;
        byte b2 = this.c;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj3;
                mu1Var.ac = i;
                mu1Var.bc = b2;
                mu1Var.cc = (CharacterStyle) obj2;
                ((gb2) obj).invalidate();
                break;
            default:
                kmc kmcVar = (kmc) obj;
                gl.d3(new wbc((mmc) obj3, new jmc(((Context) obj2).getApplicationContext(), i, b2, kmcVar), kmcVar, (byte) 12));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ql1(mmc mmcVar, Context context, int i, int i2, kmc kmcVar) {
        this.d = mmcVar;
        this.e = context;
        this.b = i;
        this.c = i2;
        this.f = kmcVar;
    }
}

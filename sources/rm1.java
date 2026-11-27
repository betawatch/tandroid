// default package

import android.content.Context;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rm1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rm1(zu1 zu1Var, int i, int i2, CharacterStyle characterStyle, wb2 wb2Var) {
        this.d = zu1Var;
        this.b = i;
        this.c = i2;
        this.e = characterStyle;
        this.f = wb2Var;
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
                zu1 zu1Var = (zu1) obj3;
                zu1Var.lc = i;
                zu1Var.mc = b2;
                zu1Var.nc = (CharacterStyle) obj2;
                ((wb2) obj).invalidate();
                break;
            default:
                xqc xqcVar = (xqc) obj;
                hl.c3(new b6c((zqc) obj3, new wqc(((Context) obj2).getApplicationContext(), i, b2, xqcVar), xqcVar, (byte) 22));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rm1(zqc zqcVar, Context context, int i, int i2, xqc xqcVar) {
        this.d = zqcVar;
        this.e = context;
        this.b = i;
        this.c = i2;
        this.f = xqcVar;
    }
}

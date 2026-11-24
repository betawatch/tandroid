// default package

import java.util.HashMap;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pl3 implements wl3 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ xl3 c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ ul3 e;

    public /* synthetic */ pl3(boolean[] zArr, xl3 xl3Var, syb sybVar, float[] fArr) {
        this.b = zArr;
        this.c = xl3Var;
        this.e = sybVar;
        this.d = fArr;
    }

    @Override // wl3
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                n3b n3bVar = (n3b) this.e;
                float[] fArr = this.d;
                xl3 xl3Var = this.c;
                vl3[] vl3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (!z) {
                        n3bVar.a(null, null, true);
                        break;
                    } else {
                        new Thread(new hn1(fArr, xl3Var, n3bVar, zArr, (byte) 13), "DictationAsrFile").start();
                        break;
                    }
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                xl3 xl3Var2 = this.c;
                syb sybVar = (syb) this.e;
                float[] fArr2 = this.d;
                vl3[] vl3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    if (!z) {
                        vl3 vl3Var = (vl3) xl3Var2.b;
                        if (vl3Var != null && vl3Var.f == 0 && !DictationAsr.y(vl3Var) && !zm3.b()) {
                            HashMap hashMap = uyb.S;
                            Integer num = sybVar.a;
                            hashMap.remove(num);
                            uyb.R.remove(num);
                            uyb.o(sybVar.b);
                            break;
                        } else {
                            sybVar.a(null, null, true);
                            break;
                        }
                    } else {
                        new Thread(new ol3(fArr2, xl3Var2, sybVar, zArr2), "DictationAsrFile").start();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pl3(boolean[] zArr, n3b n3bVar, float[] fArr, xl3 xl3Var) {
        this.b = zArr;
        this.e = n3bVar;
        this.d = fArr;
        this.c = xl3Var;
    }
}

// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ym3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ t0c c;

    public /* synthetic */ ym3(boolean[] zArr, t0c t0cVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = t0cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                t0c t0cVar = this.c;
                gn3[] gn3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    t0cVar.a(null, null, true);
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                t0c t0cVar2 = this.c;
                gn3[] gn3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    t0cVar2.a(null, null, true);
                    break;
                }
                break;
        }
    }
}

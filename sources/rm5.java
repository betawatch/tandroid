// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rm5 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rm5(int i, String str, boolean z) {
        this.c = i;
        this.b = str;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        int i = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                jn7.f(i).k(jn7.V1, str, Boolean.valueOf(z));
                break;
            default:
                h0d h0dVar = (h0d) k0d.a.get(str);
                if (h0dVar != null && h0dVar.v != null) {
                    if (!k0d.g.contains(h0dVar)) {
                        h0dVar.M = i;
                        h0dVar.N = z;
                        ArrayList arrayList = k0d.f;
                        arrayList.remove(h0dVar);
                        arrayList.add(h0dVar);
                        k0d.o();
                        break;
                    } else {
                        h0dVar.M = i;
                        h0dVar.v.m(i);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ rm5(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }
}

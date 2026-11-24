// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xx8 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ qac c;
    public final /* synthetic */ d d;

    public /* synthetic */ xx8(String str, qac qacVar, d dVar) {
        this.b = str;
        this.c = qacVar;
        this.d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d dVar = this.d;
        qac qacVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                zx8.p(dVar, 0, new xx8(str, qacVar, dVar));
                break;
            default:
                if (str == null) {
                    c41.b0(dVar).N(jb6.M0(2131745595, null), jb6.M0(2131751042, null)).j();
                    break;
                } else {
                    qacVar.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ xx8(d dVar, String str, qac qacVar) {
        this.d = dVar;
        this.b = str;
        this.c = qacVar;
    }
}

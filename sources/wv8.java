// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wv8 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ p8c c;
    public final /* synthetic */ d d;

    public /* synthetic */ wv8(String str, p8c p8cVar, d dVar) {
        this.b = str;
        this.c = p8cVar;
        this.d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d dVar = this.d;
        p8c p8cVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                yv8.p(dVar, 0, new wv8(str, p8cVar, dVar));
                break;
            default:
                if (str == null) {
                    u21.b0(dVar).N(k96.M0(2131745669, null), k96.M0(2131751093, null)).j();
                    break;
                } else {
                    p8cVar.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ wv8(d dVar, String str, p8c p8cVar) {
        this.d = dVar;
        this.b = str;
        this.c = p8cVar;
    }
}

package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0(String str, Utilities.Callback callback) {
        this.c = str;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.b, f.c((String) this.c, AndroidUtilities.dp(240.0f), ic.c.c, 0.75f, null)));
                break;
            default:
                this.b.run((e) this.c);
                break;
        }
    }

    public /* synthetic */ t0(Utilities.Callback callback, e eVar) {
        this.b = callback;
        this.c = eVar;
    }
}

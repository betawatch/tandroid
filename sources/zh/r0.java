package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r0(String str, Utilities.Callback callback) {
        this.c = str;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0(this.b, h.a(AndroidUtilities.dp(240.0f), (String) this.c)));
                break;
            default:
                this.b.run((g) this.c);
                break;
        }
    }

    public /* synthetic */ r0(Utilities.Callback callback, g gVar) {
        this.b = callback;
        this.c = gVar;
    }
}

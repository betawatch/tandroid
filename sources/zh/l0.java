package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(String str, Utilities.Callback callback) {
        this.c = str;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l0(this.b, f.b(AndroidUtilities.dp(240.0f), (String) this.c)));
                break;
            default:
                this.b.run((e) this.c);
                break;
        }
    }

    public /* synthetic */ l0(Utilities.Callback callback, e eVar) {
        this.b = callback;
        this.c = eVar;
    }
}

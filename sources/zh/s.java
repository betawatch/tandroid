package zh;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class s implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final org.telegram.ui.Wallet.x d;
    public boolean e;
    public boolean f;
    public boolean h;

    public s(int i10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, org.telegram.ui.Wallet.x xVar) {
        this.a = i10;
        this.b = document;
        this.c = i11;
        this.d = xVar;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        if (!FileLoader.getInstance(i10).getPathToAttach(document, true).exists()) {
            FileLoader.getInstance(i10).loadFile(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (this.e || this.f || !FileLoader.getInstance(this.a).getPathToAttach(this.b, true).exists()) {
            return;
        }
        this.f = true;
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileLoaded);
        Utilities.globalQueue.postRunnable(new uf.c(21, this, FileLoader.getInstance(this.a).getPathToAttach(this.b, true)));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            a();
        }
    }
}

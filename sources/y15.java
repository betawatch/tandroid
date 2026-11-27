// default package

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class y15 {
    public final int a;
    public final long c;
    public final int d;
    public final WeakReference f;
    public String g;
    public boolean h;
    public final long e = System.currentTimeMillis();
    public final String b = Long.toHexString(Utilities.b.nextLong());

    public y15(int i, long j, e eVar) {
        this.a = i;
        this.c = j;
        this.d = ConnectionsManager.getInstance(i).getCurrentTime();
        this.f = new WeakReference(eVar);
    }
}

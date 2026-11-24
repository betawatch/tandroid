// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class qf0 implements o63 {
    private u63 dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<vyb> listeners = new ArrayList<>(1);

    public qf0(boolean z) {
        this.isNetwork = z;
    }

    @Override // o63
    public final void addTransferListener(vyb vybVar) {
        vybVar.getClass();
        if (this.listeners.contains(vybVar)) {
            return;
        }
        this.listeners.add(vybVar);
        this.listenerCount++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if ((r0.h & 8) != 8) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bytesTransferred(int i) {
        u63 u63Var = this.dataSpec;
        String str = g8c.a;
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            vyb vybVar = this.listeners.get(i2);
            boolean z = this.isNetwork;
            s93 s93Var = (s93) vybVar;
            synchronized (s93Var) {
                if (z) {
                    if (u63Var != null) {
                    }
                    s93Var.i += i;
                }
            }
        }
    }

    @Override // o63
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        u63 u63Var = this.dataSpec;
        String str = g8c.a;
        for (int i = 0; i < this.listenerCount; i++) {
            ((s93) this.listeners.get(i)).g(u63Var, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(u63 u63Var) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).getClass();
        }
    }

    public final void transferStarted(u63 u63Var) {
        this.dataSpec = u63Var;
        for (int i = 0; i < this.listenerCount; i++) {
            ((s93) this.listeners.get(i)).h(u63Var, this.isNetwork);
        }
    }
}

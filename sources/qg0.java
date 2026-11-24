// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qg0 implements a83 {
    private g83 dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<w0c> listeners = new ArrayList<>(1);

    public qg0(boolean z) {
        this.isNetwork = z;
    }

    @Override // a83
    public final void addTransferListener(w0c w0cVar) {
        w0cVar.getClass();
        if (this.listeners.contains(w0cVar)) {
            return;
        }
        this.listeners.add(w0cVar);
        this.listenerCount++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if ((r0.h & 8) != 8) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bytesTransferred(int i) {
        g83 g83Var = this.dataSpec;
        String str = hac.a;
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            w0c w0cVar = this.listeners.get(i2);
            boolean z = this.isNetwork;
            eb3 eb3Var = (eb3) w0cVar;
            synchronized (eb3Var) {
                if (z) {
                    if (g83Var != null) {
                    }
                    eb3Var.i += i;
                }
            }
        }
    }

    @Override // a83
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        g83 g83Var = this.dataSpec;
        String str = hac.a;
        for (int i = 0; i < this.listenerCount; i++) {
            ((eb3) this.listeners.get(i)).g(g83Var, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(g83 g83Var) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).getClass();
        }
    }

    public final void transferStarted(g83 g83Var) {
        this.dataSpec = g83Var;
        for (int i = 0; i < this.listenerCount; i++) {
            ((eb3) this.listeners.get(i)).h(g83Var, this.isNetwork);
        }
    }
}

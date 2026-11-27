// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class sf0 implements h73 {
    private n73 dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<v2c> listeners = new ArrayList<>(1);

    public sf0(boolean z) {
        this.isNetwork = z;
    }

    @Override // h73
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
        if (this.listeners.contains(v2cVar)) {
            return;
        }
        this.listeners.add(v2cVar);
        this.listenerCount++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if ((r0.h & 8) != 8) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bytesTransferred(int i) {
        n73 n73Var = this.dataSpec;
        String str = gcc.a;
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            v2c v2cVar = this.listeners.get(i2);
            boolean z = this.isNetwork;
            la3 la3Var = (la3) v2cVar;
            synchronized (la3Var) {
                if (z) {
                    if (n73Var != null) {
                    }
                    la3Var.i += i;
                }
            }
        }
    }

    @Override // h73
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        n73 n73Var = this.dataSpec;
        String str = gcc.a;
        for (int i = 0; i < this.listenerCount; i++) {
            ((la3) this.listeners.get(i)).g(n73Var, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(n73 n73Var) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).getClass();
        }
    }

    public final void transferStarted(n73 n73Var) {
        this.dataSpec = n73Var;
        for (int i = 0; i < this.listenerCount; i++) {
            ((la3) this.listeners.get(i)).h(n73Var, this.isNetwork);
        }
    }
}

package org.webrtc;

import org.webrtc.Camera1Session;
import org.webrtc.TextureBufferImpl;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Camera1Session.2) obj2).lambda$onPreviewFrame$1((byte[]) obj);
                break;
            case 1:
                ((Camera1Session.2) obj2).lambda$onPreviewFrame$0((byte[]) obj);
                break;
            default:
                ((TextureBufferImpl) obj2).lambda$new$0((TextureBufferImpl.RefCountMonitor) obj);
                break;
        }
    }
}

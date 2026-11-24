// default package

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ ys5(ByteBuffer byteBuffer, byte b) {
        this.a = b;
        this.b = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (b) {
            case 0:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
        }
    }
}

// default package

import java.nio.charset.Charset;
import org.webrtc.JniCommon;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class uy2 implements NativeLifecycleLock.NativeDisposer, y2c, b86 {
    public final /* synthetic */ byte a;

    @Override // y2c
    public final Object apply(Object obj) {
        p83.b.getClass();
        return e03.a.O((c03) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeDisposer
    public final void dispose(long j) {
        JniCommon.nativeReleaseRef(j);
    }

    @Override // b86
    public final void invoke(Object obj) {
        vj vjVar = (vj) obj;
        switch (this.a) {
            case 15:
                vjVar.getClass();
                break;
            case 16:
                vjVar.getClass();
                break;
            case 17:
                vjVar.getClass();
                break;
            case 18:
                vjVar.getClass();
                break;
            case 19:
                vjVar.getClass();
                break;
            case 20:
                vjVar.getClass();
                break;
            case 21:
                vjVar.getClass();
                break;
            case 22:
                vjVar.getClass();
                break;
            case 23:
                vjVar.getClass();
                break;
            case 24:
                vjVar.getClass();
                break;
            case 25:
                vjVar.getClass();
                break;
            case 26:
                vjVar.getClass();
                break;
            case 27:
                vjVar.getClass();
                break;
            case 28:
                vjVar.getClass();
                break;
            default:
                vjVar.getClass();
                break;
        }
    }

    public /* synthetic */ uy2(uj ujVar, int i, byte b) {
        this.a = b;
    }

    public /* synthetic */ uy2(byte b) {
        this.a = b;
    }

    public /* synthetic */ uy2(uj ujVar, String str, long j, long j2) {
        this.a = (byte) 21;
    }
}
